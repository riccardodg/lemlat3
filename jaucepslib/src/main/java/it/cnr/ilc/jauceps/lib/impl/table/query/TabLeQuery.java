/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl.table.query;


import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabLeDefinition.TAB_LE_NAME;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabLeDefinition.tabLE_CODLE;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabLeDefinition.tabLE_LEMMA;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabLeDefinition.tabLE_LESid;
import it.cnr.ilc.jauceps.lib.headers.table.query.ATabLeQuery;
import it.cnr.ilc.jauceps.lib.impl.Vars;
import it.cnr.ilc.jauceps.lib.impl.table.TabLE;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *  <P>
 * PORTING</P>
 * <p>
 * porting of porting of query_table_TABLE_alpha.c</p>
 *  @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabLeQuery extends ATabLeQuery{
    static final String CLASS_NAME = TabLeQuery.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

    private Statement statement = null;
    private ResultSet resultSet = null;
    private List<TabLE> tabs = new ArrayList<>();

    Vars vars = new Vars();
    private final boolean sqlDebug = vars.isSqlDebug();
    private final boolean flowDebug = vars.isFlowDebug();
    private final boolean deepFlowDebug = vars.isDeepFlowDebug();

    /**
     * Constructor
     * @param conn the connection to use
     */
    public TabLeQuery(Connection conn) {
        super(conn);
    }

    @Override
    public List<TabLE> getLEset(String str) {
        String routine = CLASS_NAME + "/getLEset";
        String logmess = "";
        String selectRec = "", sel = "";

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabLeQuery.java", routine);
            log.debug(logmess);
        }

        sel = "SELECT %s, %s, %s FROM %s WHERE %s=\'%s\'";

        selectRec = String.format(sel,
                tabLE_LESid, tabLE_CODLE, tabLE_LEMMA, TAB_LE_NAME, tabLE_LEMMA, str);

        if (sqlDebug) {
            logmess = String.format("SQL Executing %s in TabLeQuery.java with query: %s", routine, selectRec);
            log.debug(logmess);
        }
        try {
            statement = getConn().createStatement();
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery(selectRec);
            tabs = loopOverRS(resultSet);

        } catch (Exception e) {
            logmess = String.format("FATAL SQL Error in %s. Message from DB: %s. Query: %s", routine, e.getMessage(), selectRec);
            log.fatal(logmess);
            System.exit(-1);
        }

        if (sqlDebug) {
            logmess = String.format("LQS Executing %s in TabLeQuery.java with  query: %s", routine, selectRec);
            log.debug(logmess);
        }
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in TabLeQuery.java", routine);
            log.debug(logmess);
        }
        return tabs;
    }

    /**
     * This function creates N @see TabLE classes
     *
     * @param rs the resultset to loop over
     * @return
     * @throws SQLException
     */
    private List<TabLE> loopOverRS(ResultSet rs) throws SQLException {
        List<TabLE> tabs = new ArrayList<>();
        String LE_LESid = "";
        String LE_CODLE = "";
        String LE_LEMMA = "";
        while (rs.next()) {
            LE_LESid = rs.getString(tabLE_LESid);
            LE_CODLE = rs.getString(tabLE_CODLE);
            LE_LEMMA = rs.getString(tabLE_LEMMA);
            tabs.add(new TabLE(LE_LESid, LE_CODLE, LE_LEMMA));
        }
        return tabs;
    }
    
}
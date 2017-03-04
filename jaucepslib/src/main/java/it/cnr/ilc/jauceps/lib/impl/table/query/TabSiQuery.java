/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl.table.query;

import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSiDefinition.C_COD_SI;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSiDefinition.SEG_SI;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSiDefinition.TAB_SI_NAME;
import it.cnr.ilc.jauceps.lib.headers.table.query.ATabSiQuery;
import it.cnr.ilc.jauceps.lib.impl.Vars;
import it.cnr.ilc.jauceps.lib.impl.table.TabSI;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * <P>
 * PORTING</P>
 * <p>
 * porting of porting of query_table_TABSI_alpha.c</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabSiQuery extends ATabSiQuery{
    
    static final String CLASS_NAME = TabSiQuery.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

    private Statement statement = null;
    private ResultSet resultSet = null;
    private List<TabSI> tabs = new ArrayList<>();

    Vars vars = new Vars();
    private final boolean sqlDebug = vars.isSqlDebug();
    private final boolean flowDebug = vars.isFlowDebug();
    private final boolean deepFlowDebug = vars.isDeepFlowDebug();

    /**
     * Constructor 
     * @param conn the connection to use
     */
    public TabSiQuery(Connection conn) {
        super(conn);
    }

    @Override
    public List<TabSI> getSIset(String str) {
        String routine = CLASS_NAME + "/getSIset";
        String logmess = "";
        String selectRec = "", sel = "";

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabSiQuery.java", routine);
            log.debug(logmess);
        }

        sel = "SELECT  %s, %s "
                + " FROM %s WHERE %s=LEFT(\'%s\',LENGTH(%s)) "
                + " ORDER BY LENGTH(%s)";
        selectRec = String.format(sel,
                SEG_SI, C_COD_SI, TAB_SI_NAME, SEG_SI, str, SEG_SI, SEG_SI);

        if (sqlDebug) {
            logmess = String.format("SQL Executing %s in TabSiQuery.java with query: %s", routine, selectRec);
            log.debug(logmess);
        }
        try {
            statement = getConn().createStatement();
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery(selectRec);
            tabs = loopOverRS(resultSet);
           
        } catch (Exception e) {
            logmess = String.format("FATAL SQL Error in %s. Message from DB: %s. Qyery: %s", routine, e.getMessage(), selectRec);
            log.fatal(logmess);
            System.exit(-1);
        }

        if (sqlDebug) {
            logmess = String.format("LQS Executing %s in TabSiQuery.java with  query: %s", routine, selectRec);
            log.debug(logmess);
        }
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabSiQuery.java", routine);
            log.debug(logmess);
        }
        return tabs;

    }

    /**
     * This function creates N @see TabSI classes
     *
     * @param rs the resultset to loop over
     * @return
     * @throws SQLException
     */
    private List<TabSI> loopOverRS(ResultSet rs) throws SQLException {
        List<TabSI> tabs = new ArrayList<>();
        String SI = "";
        String SI_cod = "";
        while (rs.next()) {
            SI = rs.getString(SEG_SI);
            SI_cod = rs.getString(C_COD_SI);
            tabs.add(new TabSI(SI, SI_cod));
        }
        return tabs;
    }

    
}
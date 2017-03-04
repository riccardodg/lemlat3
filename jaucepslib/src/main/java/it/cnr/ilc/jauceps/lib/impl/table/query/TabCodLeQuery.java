/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl.table.query;

import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabCodLEDefinition.C04C;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabCodLEDefinition.C05C;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabCodLEDefinition.C06C;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabCodLEDefinition.C07C;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabCodLEDefinition.C08C;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabCodLEDefinition.C09C;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabCodLEDefinition.C10C;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabCodLEDefinition.CODle;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabCodLEDefinition.TAB_CODLE_NAME;
import it.cnr.ilc.jauceps.lib.headers.table.query.ATabCodLEQuery;
import it.cnr.ilc.jauceps.lib.impl.Vars;
import it.cnr.ilc.jauceps.lib.impl.table.TabCodLE;
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
 * porting of query_table_TABLE_alpha.c</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabCodLeQuery extends ATabCodLEQuery {

    /**
     * Constructor
     *
     * @param conn the connection to use
     */
    public TabCodLeQuery(Connection conn) {
        super(conn);
    }

    static final String CLASS_NAME = TabCodLeQuery.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

    private Statement statement = null;
    private ResultSet resultSet = null;
    private List<TabCodLE> tabs = new ArrayList<>();

    Vars vars = new Vars();
    private final boolean sqlDebug = vars.isSqlDebug();
    private final boolean flowDebug = vars.isFlowDebug();
    private final boolean deepFlowDebug = vars.isDeepFlowDebug();

    @Override
    public List<TabCodLE> getCodLEset(String str) {
        String routine = CLASS_NAME + "/getCodLEset";
        String logmess = "";
        String selectRec = "", sel = "";

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabLeQuery.java", routine);
            log.debug(logmess);
        }

        sel = "SELECT  %s as C04C ,%s as C05C,%s as C06C,"
                + "%s as C07C,%s as C08C,%s as C09C,%s as C10C, "
                + "CONCAT(%s,%s,%s,%s,%s,%s,%s) as codes FROM %s WHERE (%s=\'%s\') ";

        selectRec = String.format(sel,
                C04C, C05C, C06C, C07C, C08C, C09C, C10C, C04C, C05C, C06C, C07C, C08C, C09C, C10C, TAB_CODLE_NAME, CODle, str);

        if (sqlDebug) {
            logmess = String.format("SQL Executing %s in TabLeQuery.java with query: %s", routine, selectRec);
            log.debug(logmess);
        }
        try {
            statement = getConn().createStatement();
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery(selectRec);
            tabs = loopOverRS(resultSet, str);

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
     * This function creates N @see TabCodLE classes
     *
     * @param rs the resultset to loop over
     * @return
     * @throws SQLException
     */
    private List<TabCodLE> loopOverRS(ResultSet rs, String codLe) throws SQLException {
        List<TabCodLE> rettabs = new ArrayList<>();
        
        String C04C = "C04C";
        String C05C = "C05C";
        String C06C = "C06C";
        String C07C = "C07C";
        String C08C = "C08C";
        String C09C = "C09C";
        String C10C = "C10C";
        String codes = "codes";

        while (rs.next()) {
            C04C= rs.getString(1);
            C05C= rs.getString(2);
            C06C= rs.getString(3);
            C07C= rs.getString(4);
            C08C= rs.getString(5);
            C09C= rs.getString(6);
            C10C= rs.getString(7);
            codes= rs.getString(8);
            
            
//            C04C= rs.getString(C04C);
//            C05C = rs.getString(C05C);
//            C06C = rs.getString(C06C);
//            C07C = rs.getString(C07C);
//            C08C = rs.getString(C08C);
//            C09C = rs.getString(C09C);
//            C10C = rs.getString(C10C);
//            codes = rs.getString(codes);
            rettabs.add(new TabCodLE(codLe, C04C, C05C, C06C, C07C, C08C, C09C, C10C, codes));
        }
        return rettabs;
    }
}
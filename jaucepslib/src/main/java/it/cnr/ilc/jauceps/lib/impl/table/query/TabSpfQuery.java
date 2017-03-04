/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl.table.query;

import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSpfDefinition.C_COD_SPF;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSpfDefinition.SEG_SPF;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSpfDefinition.TAB_SPF_NAME;
import it.cnr.ilc.jauceps.lib.headers.table.query.ATabSpfQuery;
import it.cnr.ilc.jauceps.lib.impl.Vars;
import it.cnr.ilc.jauceps.lib.impl.table.TabSPF;
import static it.cnr.ilc.jauceps.lib.structs.Segments.SPF1;
import static it.cnr.ilc.jauceps.lib.structs.Segments.SPF2;
import it.cnr.ilc.jauceps.lib.travellingobjects.TravellingTables;

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
 * porting of porting of query_table_TABSPF_alpha.h</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabSpfQuery extends ATabSpfQuery{
    private Statement statement = null;
    private ResultSet resultSet = null;
    List<TabSPF> tabs = new ArrayList<>();
    private boolean Any = false;

    Vars vars = new Vars();
    private final boolean sqlDebug = vars.isSqlDebug();
    private final boolean flowDebug = vars.isFlowDebug();
    private final boolean deepFlowDebug = vars.isDeepFlowDebug();

    static final String className = TabSpfQuery.class.getName();

    static Logger log = Logger.getLogger(className);
    Connection conn;
    TravellingTables travellingtables;

    /**
     * Constructor
     *
     * @param conn the connection to use
     */
    public TabSpfQuery(Connection conn) {
        super(conn);
    }

    @Override
    public List<TabSPF> getSPFset(String str, int spf_n) {
        conn = getConn();
        //System.err.println("\n\n\nCONN " + this.conn.toString());
        String routine = className + "/getSPFset";
        String logmess = "";
        String selectRec = "", sel = "";

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabSpfQuery.java", routine);
            log.debug(logmess);
        }
        switch (spf_n) {
            case SPF1:
                if (deepFlowDebug) {
                    logmess = String.format("START Executing %s in TabSpfQuery.java CASE SPF1", routine);
                    log.debug(logmess);
                }
                sel = "SELECT  %s, %s "
                        + " FROM %s WHERE %s=RIGHT(\'%s\',LENGTH(%s)) "
                        + " AND (LEFT(%s,1)='e' OR %s='') "
                        + " ORDER BY LENGTH(%s)";
                selectRec = String.format(sel, SEG_SPF, C_COD_SPF,
                        TAB_SPF_NAME, SEG_SPF, str, SEG_SPF,
                        C_COD_SPF, C_COD_SPF,
                        SEG_SPF
                );
                break;
            case SPF2:
                if (deepFlowDebug) {
                    logmess = String.format("START Executing %s in TabSpfQuery.java CASE SPF2", routine);
                    log.debug(logmess);
                }
                sel = "SELECT  %s, %s "
                        + " FROM %s WHERE %s=RIGHT(\'%s\',LENGTH(%s)) "
                        + " AND (LEFT(%s,1)!='e' OR %s='')"
                        + " ORDER BY LENGTH(%s)";
                selectRec = String.format(sel,
                        SEG_SPF, C_COD_SPF,
                        TAB_SPF_NAME, SEG_SPF, str, SEG_SPF,
                        C_COD_SPF, C_COD_SPF,
                        SEG_SPF
                );
                break;
        }
        if (sqlDebug) {
            logmess = String.format("SQL Executing %s in TabSpfQuery.java with spf_n:%d and query: %s", routine, spf_n, selectRec);
            log.debug(logmess);
        }
        try {
            statement = conn.createStatement();
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
            logmess = String.format("LQS Executing %s in TabSpfQuery.java with spf_n:%d and query: %s", routine, spf_n, selectRec);
            log.debug(logmess);
        }

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in TabSpfQuery.java", routine);
            log.debug(logmess);
        }
        return tabs;
    }

    /**
     * This function creates N TabSPF classes
     *
     * @param rs the resultset to loop over
     * @return
     * @throws SQLException
     */
    private List<TabSPF> loopOverRS(ResultSet rs) throws SQLException {
        List<TabSPF> tabs = new ArrayList<>();
        String SPF = "";
        String SPF_cod = "";
        while (rs.next()) {
            SPF = rs.getString(SEG_SPF);
            SPF_cod = rs.getString(C_COD_SPF);
            tabs.add(new TabSPF(SPF, SPF_cod));
        }
        return tabs;
    }

    
}
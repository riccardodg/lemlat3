/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl.table.query;

import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.SEG_SM;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.TAB_SM_NAME;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSpfDefinition.SEG_SPF;
import it.cnr.ilc.jauceps.lib.headers.table.query.ATabSmQuery;
import it.cnr.ilc.jauceps.lib.impl.Vars;
import it.cnr.ilc.jauceps.lib.impl.table.TabSM;
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
 * porting of query_table_TABSM_alpha.c</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabSmQuery extends ATabSmQuery{
    private Statement statement = null;
    private ResultSet resultSet = null;
    List<TabSM> tabs = new ArrayList<>();
    private boolean Any = false;

    Vars vars = new Vars();
    private final boolean sqlDebug = vars.isSqlDebug();
    private final boolean flowDebug = vars.isFlowDebug();
    private final boolean deepFlowDebug = vars.isDeepFlowDebug();
    

    static final String CLASS_NAME = TabSmQuery.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

    /**
     * Constructor
     * @param conn the connection to use
     */
    public TabSmQuery(Connection conn) {
        super(conn);
    }

    @Override
    public List<TabSM> getSMset(String str, int sm_n) {
        String routine = CLASS_NAME + "/getSMset";
        String logmess = "";
        String selectRec = "", sel = "";

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabSmQuery.java", routine);
            log.debug(logmess);
        }

        sel = "SELECT DISTINCT %s FROM %s WHERE %s=RIGHT(\'%s\',LENGTH(%s))";

        selectRec = String.format(sel, SEG_SM, TAB_SM_NAME, SEG_SM, str, SEG_SM);

        if (sqlDebug) {
            logmess = String.format("SQL Executing %s in TabSmQuery.java with spf_n:%d and query: %s", routine, sm_n, selectRec);
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
            logmess = String.format("LQS Executing %s in TabSmQuery.java with spf_n:%d and query: %s", routine, sm_n, selectRec);
            log.debug(logmess);
        }

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in TabSmQuery.java", routine);
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
    private List<TabSM> loopOverRS(ResultSet rs) throws SQLException {
        List<TabSM> tabs = new ArrayList<>();
        String SM = "";
        while (rs.next()) {
            SM = rs.getString(SEG_SPF);
            tabs.add(new TabSM(SM));
        }
        return tabs;
    }
   
    
}
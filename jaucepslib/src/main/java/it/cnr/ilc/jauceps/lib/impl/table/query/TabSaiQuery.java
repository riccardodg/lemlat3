/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl.table.query;

import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSaiDefinition.C_COD_SAI;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSaiDefinition.SEG_SAI;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSaiDefinition.SEG_SAI_ALT;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSaiDefinition.TAB_SAI_NAME;
import it.cnr.ilc.jauceps.lib.headers.table.query.ATabSaiQuery;
import it.cnr.ilc.jauceps.lib.impl.Vars;
import it.cnr.ilc.jauceps.lib.impl.table.TabSAI;


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
 * porting of porting of query_table_TABSAI_alpha.c</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabSaiQuery extends ATabSaiQuery{
    static final String CLASS_NAME = TabSaiQuery.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

    private Statement statement = null;
    private ResultSet resultSet = null;
    private List<TabSAI> tabs = new ArrayList<>();

    Vars vars = new Vars();
    private final boolean sqlDebug = vars.isSqlDebug();
    private final boolean flowDebug = vars.isFlowDebug();
    private final boolean deepFlowDebug = vars.isDeepFlowDebug();
   

    /**
     * Constructor
     * @param conn 
     */
    public TabSaiQuery(Connection conn) {
        super(conn);
    }

    @Override
    public List<TabSAI> getSAIset(String str) {
        String routine = CLASS_NAME + "/getSAIset";
        String logmess = "";
        String selectRec = "", sel = "";
        
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabSiQuery.java", routine);
            log.debug(logmess);
        }

        sel = "SELECT  t1.%s, t1.%s, t2.%s as segment_alt "
                + "FROM %s AS t1,%s AS t2 "
                + "WHERE t1.%s=LEFT(\'%s\',LENGTH(t1.%s)) "
                + "AND t1.%s=t2.%s AND t1.%s!=t2.%s ORDER BY t1.%s;";

        selectRec = String.format(sel,
                SEG_SAI, C_COD_SAI, SEG_SAI,
                TAB_SAI_NAME, TAB_SAI_NAME,
                SEG_SAI, str, SEG_SAI,
                C_COD_SAI, C_COD_SAI, SEG_SAI, SEG_SAI,
                SEG_SAI);
        

        if (sqlDebug) {
            logmess = String.format("SQL Executing %s in TabSaiQuery.java with query: %s", routine, selectRec);
            log.debug(logmess);
        }
        try {
            //System.err.println("CONN "+conn);
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
    private List<TabSAI> loopOverRS(ResultSet rs) throws SQLException {
        List<TabSAI> tabs = new ArrayList<>();
        String SAI = "";
        String SAI_cod = "";
        String SAI_alt = "";
        
        while (rs.next()) {
            SAI = rs.getString(SEG_SAI);
            SAI_cod = rs.getString(C_COD_SAI);
            SAI_alt = rs.getString(SEG_SAI_ALT);
            tabs.add(new TabSAI(SAI, SAI_cod,SAI_alt));
        }
        return tabs;
    }

   
    
}
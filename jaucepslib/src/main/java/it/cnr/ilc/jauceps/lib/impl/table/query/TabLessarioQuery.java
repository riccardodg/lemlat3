/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl.table.query;

import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabGraphVarsDefinition.GRAPH_VARS;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabGraphVarsDefinition.GV_CODE;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabGraphVarsDefinition.GV_IN;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabGraphVarsDefinition.GV_OUT;
import it.cnr.ilc.jauceps.lib.headers.table.query.ATabLessarioQuery;
import it.cnr.ilc.jauceps.lib.impl.Vars;
import it.cnr.ilc.jauceps.lib.impl.table.TabLessario;
import it.cnr.ilc.jauceps.lib.structs.LES_Q_MODE;
import static it.cnr.ilc.jauceps.lib.structs.LES_Q_MODE.BY_CLEM;
import static it.cnr.ilc.jauceps.lib.structs.LES_Q_MODE.BY_KEY;
import static it.cnr.ilc.jauceps.lib.structs.LES_Q_MODE.BY_LES;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabLessarioDefinition.A_GRA;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabLessarioDefinition.CODLEM;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabLessarioDefinition.CODLES;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabLessarioDefinition.COD_LE;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabLessarioDefinition.GEN;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabLessarioDefinition.GRA_U;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabLessarioDefinition.I_CLEM;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabLessarioDefinition.I_SI;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabLessarioDefinition.I_SMV;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabLessarioDefinition.I_SPF;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabLessarioDefinition.LEM;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabLessarioDefinition.LES;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabLessarioDefinition.LESSARIO;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabLessarioDefinition.N_ID;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabLessarioDefinition.PIU;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabLessarioDefinition.PR_KEY;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabLessarioDefinition.PT;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabLessarioDefinition.S_OMO;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabLessarioDefinition.TYPE;
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
 * porting of porting of query_table_LESSARIO_alpha.c</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabLessarioQuery extends ATabLessarioQuery{
    static final String CLASS_NAME = TabLessarioQuery.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

    private Statement statement = null;
    private ResultSet resultSet = null;
    private List<TabLessario> tabs = new ArrayList<>();
    

    Vars vars = new Vars();
    private final boolean sqlDebug = vars.isSqlDebug();
    private final boolean flowDebug = vars.isFlowDebug();
    private final boolean deepFlowDebug = vars.isDeepFlowDebug();

    /**
     * Constructor
     * @param conn the connection to use
     */
    public TabLessarioQuery(Connection conn) {
        super(conn);
    }

    @Override
    public List<TabLessario> getLESset(String value, LES_Q_MODE q_mode) {
        String routine = CLASS_NAME + "/getLESset";
        String logmess = "";
        String selectRec = "", sel = "";

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabLessarioQuery.java", routine);
            log.debug(logmess);
        }

        sel = String.format("SELECT %s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s ",
                N_ID, GEN, I_CLEM, I_SI, I_SMV, I_SPF, LES, CODLES, LEM, S_OMO, PIU, CODLEM, TYPE, COD_LE,
                PT, A_GRA, GRA_U, PR_KEY);

        switch (q_mode) {
            case BY_LES:
                sel = sel + " FROM %s INNER JOIN %s ON "
                        + "%s=%s WHERE  %s=REPLACE(\'%s\', %s, %s) "
                        + "UNION  "
                        + "SELECT %s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s "
                        + "FROM %s"
                        + " WHERE %s=\'%s\' ";

                selectRec = String.format(sel,
                        LESSARIO, GRAPH_VARS, A_GRA, GV_CODE,
                        LES, value, GV_IN, GV_OUT,
                        N_ID, GEN, I_CLEM, I_SI, I_SMV, I_SPF, LES, CODLES, LEM, S_OMO, PIU, CODLEM, TYPE, COD_LE,
                        PT, A_GRA, GRA_U, PR_KEY,
                        LESSARIO, LES, value);
                break;
            case BY_CLEM:
                sel = sel + " FROM %s WHERE %s=\'%s\' AND %s=\'v\'";
                selectRec = String.format(sel, LESSARIO, N_ID, value, I_CLEM);
                break;
            case BY_KEY:
                sel = sel + " FROM %s WHERE %s=%s ";
                selectRec = String.format(sel, LESSARIO, PR_KEY, value);

                break;
        }

        if (sqlDebug) {
            logmess = String.format("SQL Executing %s in TabLessarioQuery.java with query: %s", routine, selectRec);
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
            logmess = String.format("LQS Executing %s in TabLessarioQuery.java with  query: %s", routine, selectRec);
            log.debug(logmess);
        }
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in TabLessarioQuery.java", routine);
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
    private List<TabLessario> loopOverRS(ResultSet rs) throws SQLException {
        List<TabLessario> tabs = new ArrayList<>();

        String n_id = "";
        /* N_ID*/

        String gen = "";
        /* GEN*/

        String clem = "";
        /* I_CLEM*/

        String si = "";
        /* I_SI*/

        String smv = "";
        /* I_SMV*/

        String spf = "";
        /* I_SPF*/

        String les = "";
        /* LES*/

        String codles = "";
        /* CODLES*/

        String lem = "";
        /* LEM*/

        String s_omo = "";
        /* S_OMO*/

        String piu = "";
        /* PIU*/

        String codlem = "";
        /* CODLEM*/

        String type = "";
        /* TYPE*/

        String codLE = "";
        /* COD_LE*/

        String pt = "";
        /* PT*/

        String a_gra = "";
        /* A_GRA*/

        String gra_u = "";
        /* GRA_U*/

        String pr_key = "";
        /* PR_KEY*/

        while (rs.next()) {
            n_id = rs.getString(N_ID);
            gen = rs.getString(GEN);
            clem = rs.getString(I_CLEM);
            si = rs.getString(I_SI);
            smv = rs.getString(I_SMV);
            spf = rs.getString(I_SPF);
            les = rs.getString(LES);
            codles = rs.getString(CODLES);
            lem = rs.getString(LEM);
            s_omo = rs.getString(S_OMO);
            piu = rs.getString(PIU);
            codlem = rs.getString(CODLEM);
            type = rs.getString(TYPE);
            codLE = rs.getString(COD_LE);
            pt = rs.getString(PT);
            a_gra = rs.getString(A_GRA);
            gra_u = rs.getString(GRA_U);
            pr_key = rs.getString(PR_KEY);
            tabs.add(new TabLessario(n_id, gen, clem, si, smv,
                    spf, les, codles, lem, s_omo, piu,
                    codlem, type, codLE, pt,
                    a_gra, gra_u,
                    pr_key));
        }
        return tabs;
    }

    
}
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

import static it.cnr.ilc.latmorphlib.headers.table.definition.TabSfDefinition.C04F;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabSfDefinition.C05F;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabSfDefinition.C06F;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabSfDefinition.C07F;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabSfDefinition.C08F;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabSfDefinition.C09F;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabSfDefinition.C10F;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabSfDefinition.C_COD;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabSfDefinition.LSEG;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabSfDefinition.SEG;
import static it.cnr.ilc.latmorphlib.headers.table.definition.TabSfDefinition.TAB_SF_NAME;

import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C04;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C04M;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C05;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C05M;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C06;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C06M;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C07;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C07M;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C08;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C08M;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C09;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C09M;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C10;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C10M;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C_COD_P;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C_COD_P2;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C_COD_S;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.C_COD_S2;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.SEG_SM;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.SEG_SM2;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.TAB_SM_NAME;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabSmSm2Definition.TAB_SM_NAME_ALIAS;

import it.cnr.ilc.jauceps.lib.headers.table.query.ATabSfQuery;
import it.cnr.ilc.jauceps.lib.impl.Vars;
import it.cnr.ilc.jauceps.lib.impl.table.TabLessario;
import it.cnr.ilc.jauceps.lib.impl.table.TabSF;
import it.cnr.ilc.jauceps.lib.impl.table.TabSFCodMorSet;
import it.cnr.ilc.jauceps.lib.impl.table.TabSFCodSet;
import it.cnr.ilc.jauceps.lib.impl.table.TabSM;
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
 * porting of porting of query_table_TABSF_alpha.c</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabSfQuery extends ATabSfQuery {

    static final String CLASS_NAME = TabSfQuery.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

    private Statement statement = null;
    private ResultSet resultSet = null;
    private List<TabSF> tabs = new ArrayList<>();
    private List<TabSFCodSet> tabscset = new ArrayList<>();
    private List<TabSFCodMorSet> tabscmset = new ArrayList<>();

    Vars vars = new Vars();
    private final boolean sqlDebug = vars.isSqlDebug();
    private final boolean flowDebug = vars.isFlowDebug();
    private final boolean deepFlowDebug = vars.isDeepFlowDebug();

    /**
     * Constructor
     *
     * @param conn the connection to use
     */
    public TabSfQuery(Connection conn) {
        super(conn);
    }

    @Override
    public List<TabSF> getSFset(String str) {
        String routine = CLASS_NAME + "/getSFset";
        String logmess = "";
        String selectRec = "", sel = "";

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabSfQuery.java", routine);
            log.debug(logmess);
        }

        sel = "SELECT  DISTINCT %s, LENGTH(%s) as %s"
                + " FROM %s WHERE %s=RIGHT('%s',LENGTH(%s)) "
                + " ORDER BY LENGTH(%s)";
        selectRec = String.format(sel,
                SEG, SEG, LSEG, TAB_SF_NAME, SEG, str, SEG, SEG);

        /*sprintf(selectRec,
         "SELECT DISTINCT %s, LENGTH(%s) \
         FROM %s WHERE %s=RIGHT(\'%s\',LENGTH(%s)) \
         ORDER BY LENGTH(%s)",
         SEG, SEG, TAB_SF_NAME, SEG, str, SEG, SEG);
         */
        if (sqlDebug) {
            logmess = String.format("SQL Executing %s in TabSfQuery.java with query: %s", routine, selectRec);
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
            logmess = String.format("LQS Executing %s in TabSiQuery.java with  query: %s", routine, selectRec);
            log.debug(logmess);
        }
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabSfQuery.java", routine);
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
    private List<TabSF> loopOverRS(ResultSet rs) throws SQLException {
        List<TabSF> rettabs = new ArrayList<>();
        String SF = "";
        int LSF = -1;
        while (rs.next()) {
            SF = rs.getString(SEG);
            LSF = rs.getInt(LSEG);
            rettabs.add(new TabSF(SF, LSF));
        }
        return rettabs;
    }

    /**
     * This function creates N @see TabSF classes
     *
     * @param rs the resultset to loop over
     * @param mode the mode
     * @return
     * @throws SQLException
     */
    private List<TabSFCodSet> loopOverRS(ResultSet rs, int mode) throws SQLException {
        List<TabSFCodSet> tabscset = new ArrayList<>();
        TabSFCodSet tabcset;
        String C_COD = "";
        String C_COD_P = "";
        String C_COD_S = "";
        String C_COD_P2 = "";
        String C_COD_S2 = "";

        while (rs.next()) {
            switch (mode) {
                case 0:
                    //C_COD = rs.getString(C_COD);
                    
                    C_COD=rs.getString(1);
                    tabcset = new TabSFCodSet(C_COD);
                    tabcset.setCodeSetMode(mode);
                    tabscset.add(tabcset);
                    break;
                case 1:
                    C_COD = rs.getString(1);
                    C_COD_P = rs.getString(2);
                    C_COD_S =rs.getString(3);
                    
                    tabcset = new TabSFCodSet(C_COD, C_COD_P, C_COD_S);
                    tabcset.setCodeSetMode(mode);
                    tabscset.add(tabcset);
                    break;
                case 2:
                    C_COD = rs.getString(1);
                    C_COD_P = rs.getString(2);
                    C_COD_S = rs.getString(3);
                    C_COD_P2 = rs.getString(4);
                    C_COD_S2 = rs.getString(5);
                    tabcset = new TabSFCodSet(C_COD, C_COD_P, C_COD_S, C_COD_P2, C_COD_S2);
                    tabcset.setCodeSetMode(mode);
                    tabscset.add(tabcset);
                    break;
                case 3:
                    C_COD = rs.getString(1);
                    tabcset = new TabSFCodSet(C_COD);
                    tabcset.setCodeSetMode(mode);
                    tabscset.add(tabcset);
                    break;
                case 4:
                    C_COD = rs.getString(1);
                    tabcset = new TabSFCodSet(C_COD);
                    tabcset.setCodeSetMode(mode);
                    tabscset.add(tabcset);
                    break;
                case 5:
                    C_COD = rs.getString(1);
                    tabcset = new TabSFCodSet(C_COD);
                    tabcset.setCodeSetMode(mode);
                    tabscset.add(tabcset);
                    break;

            }
        }
        return tabscset;
    }

    private List<TabSFCodMorSet> loopOverRS(ResultSet rs, String gender, String isPt, String codle, String cod) throws SQLException {
        List<TabSFCodMorSet> rettabscmset = new ArrayList<>();
        TabSFCodMorSet tabcmset;
        String COD_4 = "";
        String COD_5 = "";
        String COD_6 = "";
        String COD_7 = "";
        String COD_8 = "";
        String COD_9 = "";
        String COD_10 = "";
        String codes = "";

        while (rs.next()) {

            /* COD_4 = rs.getString(COD_4);
            COD_5 = rs.getString(COD_5);
            COD_6 = rs.getString(COD_6);
            COD_7 = rs.getString(COD_7);
            COD_8 = rs.getString(COD_8);
            COD_9 = rs.getString(COD_9);
            COD_10 = rs.getString(COD_10);
            tabcmset = new TabSFCodMorSet(COD_4, COD_5, COD_6, COD_7, COD_8, COD_9, COD_10);
             */
            codes = rs.getString(1);
            tabcmset = new TabSFCodMorSet(codes);
            tabcmset.setGender(gender);
            tabcmset.setIsPT(isPt);
            tabcmset.setCodles(cod);
            tabcmset.setCodle(codle);
            rettabscmset.add(tabcmset);

        }
        return rettabscmset;
    }

    @Override
    //public List<TabSFCodSet> getSF_cod_set(String condition, String getSF, String getSm_1, String getSm_2, int mode)
    public List<TabSFCodSet> getSF_cod_set(String condition, TravellingTables travellingtables, int mode) {
        String routine = CLASS_NAME + "/getSF_cod_set";
        String logmess = "";
        String selectRec = "", sel = "";

        // variables
        String getSF = "";
        String getSm_1 = "";
        String getSm_2 = "";

        // tables
        TabSM tabSM_1 = travellingtables.getFirstTabSm();
        TabSM tabSM_2 = travellingtables.getSecondTabSm();
        TabSF tabSf = travellingtables.getTabSf();

        getSF = tabSf.getSEG();
        getSm_1 = tabSM_1.getSM();
        getSm_2 = tabSM_2.getSM();

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabSfQuery.java "
                    + "with condition -%s- getSF -%s- and mode -%d-", routine, condition, getSF, mode);
            log.debug(logmess);
        }
        /*switch on mode*/
        switch (mode) {
            case 0:
                sel = "SELECT DISTINCT %s FROM %s WHERE (%s='%s') AND (%s)";
                selectRec = String.format(sel,
                        C_COD, TAB_SF_NAME, SEG, getSF, condition);

                break;
            case 1:
                sel = "SELECT DISTINCT %s,%s,%s "
                        + "FROM %s,%s WHERE (%s.%s='%s') "
                        + "AND (%s.%s='%s') "
                        + "AND (%s=IF( LEFT(%s,1)='v', LEFT(%s,LENGTH(%s)), %s ) ) "
                        + "AND (%s)";
                selectRec = String.format(sel,
                        C_COD, C_COD_P, C_COD_S,
                        TAB_SF_NAME, TAB_SM_NAME,
                        TAB_SF_NAME, SEG, getSF,
                        TAB_SM_NAME, SEG_SM, getSm_1,
                        C_COD_S, C_COD_S, C_COD, C_COD_S, C_COD,
                        condition);

                break;
            case 2:
                sel = "SELECT DISTINCT %s,TSM1.%s,TSM1.%s,%s,%s "
                        + "FROM %s,%s as %s,%s as TSM1 "
                        + "WHERE (%s.%s='%s') AND (TSM1.%s='%s') "
                        + "AND (%s='%s') AND (%s=TSM1.%s) "
                        + "AND (TSM1.%s=IF( LEFT(TSM1.%s,1)='v', LEFT(%s,LENGTH(TSM1.%s)), %s ) ) AND (%s)";

                selectRec = String.format(sel,
                        C_COD, C_COD_P, C_COD_S, C_COD_P2, C_COD_S2,
                        TAB_SF_NAME, TAB_SM_NAME, TAB_SM_NAME_ALIAS, TAB_SM_NAME,
                        TAB_SF_NAME, SEG, getSF,
                        SEG_SM, getSm_1,
                        SEG_SM2, getSm_2,
                        C_COD_S2, C_COD_P,
                        C_COD_S, C_COD_S, C_COD, C_COD_S, C_COD,
                        condition);
                break;

            case 3:

                sel = "SELECT DISTINCT %s FROM %s LEFT JOIN %s ON  (%s=%s) "
                        + "AND (%s=%s) AND (%s=%s) AND (%s=%s) "
                        + "AND (%s=%s) AND (%s=%s) AND (%s=%s) "
                        + "AND %s AND ( %s IS NULL ) "
                        + "AND (%s='%s')";

                selectRec = String.format(sel, C_COD,
                        TAB_SF_NAME, TAB_CODLE_NAME,
                        C04C, C04F, C05C, C05F, C06C, C06F, C07C, C07F, C08C, C08F, C09C, C09F, C10C, C10F,
                        condition, CODle, SEG, getSF);

                break;
            case 4:

                sel = "SELECT DISTINCT %s FROM %s WHERE (%s='%s') AND (%s='%c') AND (%s)";
                selectRec = String.format(sel, C_COD, TAB_SF_NAME, SEG, getSF, C08, 'p', condition);
                break;
            case 5:
                sel = "SELECT DISTINCT %s FROM %s "
                        + "LEFT JOIN %s ON  (%s=%s) "
                        + "AND (%s=%s) AND (%s=%s) "
                        + "AND (%s=%s) AND (%s=%s) "
                        + "AND (%s=%s) AND (%s=%s)  "
                        + "AND %s AND ( %s IS NULL ) "
                        + "AND (%s='%s') AND (%s='%c')";
                selectRec = String.format(sel, C_COD,
                        TAB_SF_NAME, TAB_CODLE_NAME,
                        C04C, C04F, C05C, C05F, C06C, C06F, C07C, C07F, C08C, C08F, C09C, C09F, C10C, C10F,
                        condition, CODle, SEG, getSF, C08F, 'p');
                break;
        }

        if (sqlDebug) {
            logmess = String.format("SQL Executing %s in TabSfQuery.java with query: %s", routine, selectRec);
            log.debug(logmess);
        }
        try {
            statement = getConn().createStatement();
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery(selectRec);
            tabscset = loopOverRS(resultSet, mode);

        } catch (Exception e) {
            logmess = String.format("FATAL SQL Error in %s with mode -%d- and condition -%s-. Message from DB: %s. Query: %s", routine, mode,condition,e.getMessage(), selectRec);
            log.fatal(logmess);
            System.exit(-1);
        }

        if (sqlDebug) {
            logmess = String.format("LQS Executing %s in TabSiQuery.java with  query: %s", routine, selectRec);
            log.debug(logmess);
        }
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in TabSfQuery.java", routine);
            log.debug(logmess);
        }
        return tabscset;

    }

    /* morpho codes from tabsf */
    @Override
    public List<TabSFCodMorSet> getSFCod_morf_set(TravellingTables travellingtables, String seg) {
        String routine = CLASS_NAME + "/getSFCod_morf_set";
        String logmess = "";
        String selectRec = "", sel = "";

        // table
        TabLessario areal = travellingtables.getCopiedLessario();
        TabSM tabSm_1 = travellingtables.getFirstTabSm();
        TabSM tabSm_2 = travellingtables.getSecondTabSm();
        TabSFCodSet tabSfCodSet = travellingtables.getTabSfCodSet();
        TabSF tabSf = travellingtables.getTabSf();

        //values
        String cod = areal.getCodles();
        String cod_noseg = areal.getCodLE();
        String isPt = areal.getPt();
        String gender = areal.getGen();
        String getSm_1 = tabSm_1.getSM();
        String getSm_2 = tabSm_2.getSM();
        String COD_P = tabSfCodSet.getC_COD_P();
        String COD_S = tabSfCodSet.getC_COD_S();

        // first char of codles
        String cod_fp = cod.substring(0, 1);

        /*
         original parameters
         sil.segment)[4], a->codles, a->gen,
         a->cod_noseg, a->pt == 'x'
         the condition a->pt=='x' is true or false 
         getSM_1 = getSM(SM1);
         
         */
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabSfQuery.java "
                    + "with segment -%s- pt -%s-  codle -%s- gender -%s-", routine, seg,isPt, cod_noseg, gender);
            log.debug(logmess);
        }

        if (travellingtables.isIsanySM1()) {
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED in %s isIsanySM1 -%s- TRUE", routine, travellingtables.isIsanySM1());
                log.debug(logmess);
            }
            sel = "SELECT DISTINCT CONCAT(if(%s='=',%s,%s),"
                    + "if(%s='=',%s,%s),"
                    + "if(%s='=',%s,%s),"
                    + "if(%s='=',%s,%s),"
                    + "if(%s='=',%s,%s),"
                    + "if(%s='=',%s,%s),"
                    + "if(%s='=',%s,%s)) as codes"
                    + " FROM %s,%s WHERE (%s.%s='%s') "
                    + "AND (%s.%s='%s') "
                    + "AND (%s='%s') "
                    + "AND (%s='%s') "
                    + "AND (%s=IF( LEFT(%s,1)='v', LEFT(%s,LENGTH(%s)), %s ) )";

            selectRec = String.format(sel,
                    C04M, C04F, C04M, C05M, C05F, C05M,
                    C06M, C06F, C06M, C07M, C07F, C07M, C08M, C08F, C08M, C09M, C09F, C09M, C10M, C10F, C10M,
                    TAB_SF_NAME, TAB_SM_NAME,
                    TAB_SF_NAME, SEG, seg, TAB_SM_NAME, SEG_SM, getSm_1,
                    C_COD_P, COD_P, C_COD_S, COD_S,
                    C_COD_S, C_COD_S, C_COD, C_COD_S, C_COD);

        } else {
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW ****CHECKED in %s isIsanySM1 -%s- FALSE", routine, travellingtables.isIsanySM1());
                log.debug(logmess);
            }
            if (!cod_noseg.equals("")) { // a codLe is assigned
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED in %s cod_noseg -%s- NOT EMPTY", routine, cod_noseg);
                    log.debug(logmess);
                }
                sel = "SELECT CONCAT(%s,%s,%s,%s,%s,%s,%s) as codes "
                        + " FROM %s LEFT JOIN %s ON "
                        + "( (%s='%s')  "
                        + "AND (%s=%s) "
                        + "AND (%s=%s) "
                        + "AND (%s=%s) "
                        + "AND (%s=%s) "
                        + "AND (%s=%s) "
                        + "AND (%s=%s) "
                        + "AND (%s=%s) ) "
                        + " WHERE ( %s IS NULL ) AND (%s='%s') AND (%s='%s')";
                selectRec = String.format(sel, C04F, C05F, C06F, C07F, C08F, C09F, C10F,
                        TAB_SF_NAME, TAB_CODLE_NAME,
                        CODle, cod_noseg,
                        C04C, C04F, C05C, C05F, C06C, C06F, C07C, C07F, C08C, C08F, C09C, C09F, C10C, C10F,
                        CODle, SEG, seg, C_COD, cod);

                if (!isPt.equals("")) { //true if isPt==x
                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW ****CHECKED in %s isPt -%s- NOT EMPTY", routine, isPt);
                        log.debug(logmess);
                    }
                    /* add sprintf(selectRec, "%s AND (%s=\'%c\') ",
                     selectRec, C08F, 'p');*/
                    selectRec = String.format("%s AND (%s='%c') ", selectRec, C08F, 'p');

                } else if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED in %s isPt -%s-  EMPTY", routine, isPt);
                    log.debug(logmess);
                }// else isPt

            } else { // else cod_noseg
                if (deepFlowDebug) {
                    logmess = String.format("DEEPFLOW ****CHECKED in %s cod_noseg -%s-  EMPTY", routine, cod_noseg);
                    log.debug(logmess);
                }
                sel = "SELECT CONCAT(%s,%s,%s,%s,%s,%s,%s) as codes "
                        + "FROM %s WHERE (%s='%s') ";
                selectRec = String.format(sel, C04, C05, C06, C07, C08, C09, C10,
                        TAB_SF_NAME, SEG, seg);

                if ("v".equals(cod_fp)) {
                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW ****CHECKED in %s cod_fp -%s-  v YES ", routine, cod_fp);
                        log.debug(logmess);
                    }
                    /*sprintf(selectRec, "%s AND (LEFT(%s,%u)=\'%s\') ",
                     selectRec, C_COD, strlen(cod), cod);*/
                    selectRec = String.format("%s AND (LEFT(%s,%d)='%s')", selectRec, C_COD, cod.length(), cod);

                } else {
                    if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW ****CHECKED in %s cod_fp -%s-  v NO ", routine, cod_fp);
                        log.debug(logmess);
                    }
                    /*printf("    ****CHECKED cod[0] == v KO\n");
                     sprintf(selectRec, "%s AND (%s=\'%s\') ",
                     selectRec, C_COD, cod);*/

                    selectRec = String.format("%s AND (%s='%s')  ", selectRec, C_COD, cod);

                    if (!isPt.equals("")) { //true if isPt==x
                        if (deepFlowDebug) {
                            logmess = String.format("DEEPFLOW ****CHECKED in %s isPt -%s- and cod_fp -%s NOT EMPTY", routine, isPt, cod_fp);
                            log.debug(logmess);
                        }
                        /*sprintf(selectRec, "%s AND (%s=\'%c\') ",
                         selectRec, C08, 'p');*/
                        selectRec = String.format("%s AND (%s='%c') ", selectRec, C08, 'p');

                    } else if (deepFlowDebug) {
                        logmess = String.format("DEEPFLOW ****CHECKED in %s isPt -%s- and cod_fp -%s  EMPTY", routine, isPt, cod_fp);
                        log.debug(logmess);
                    }// else isPt in else cod_fp

                } // else cod_fp
            } // else cod_noseg
        } // esle isanySM1
        // verify gender
        if (deepFlowDebug) {
            logmess = String.format("DEEPFLOW ****CHECKED in %s gender -%s- ", routine, gender);
            log.debug(logmess);
        }
        switch (gender) {
            case "m":
            case "f":
            case "n":
                selectRec = String.format("%s AND (%s='%s') ", selectRec, C07F, gender);
                break;
            case "1":
                selectRec = String.format("%s AND ( (%s='m') OR (%s='n') ) ", selectRec, C07F, C07F);
                break;
            case "2":
                selectRec = String.format("%s AND ( (%s='m') OR (%s='f') ) ", selectRec, C07F, C07F);

                break;
            case "3":
                selectRec = String.format("%s AND ( (%s='n') OR (%s='f') ) ", selectRec, C07F, C07F);

                break;

        }

        if (sqlDebug) {
            logmess = String.format("SQL Executing %s in TabSfQuery.java with query: %s", routine, selectRec);
            log.debug(logmess);
        }
        try {
            statement = getConn().createStatement();
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery(selectRec);
            tabscmset = loopOverRS(resultSet, gender, isPt, cod_noseg, cod);
            //setAnyCodSet(isAnyCodSetRec());

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
            logmess = String.format("DEEPFLOW START Executing %s in TabSfQuery.java", routine);
            log.debug(logmess);
        }
        return tabscmset;

    }

}
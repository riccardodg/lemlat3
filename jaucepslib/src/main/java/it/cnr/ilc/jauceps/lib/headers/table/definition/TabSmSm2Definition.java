/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.headers.table.definition;

import it.cnr.ilc.jauceps.lib.structs.Segments;



/**
 *  <P>
 * PORTING</P>
 * <p>
 * porting of table_TABSM_TABSM2_definition_alpha.h</p>
 *  @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabSmSm2Definition {

    public static int SM_MAX = 2;
    public static int SM1 = Segments.SM1;
    public static int SM2 = Segments.SM2;

//Fields name
    public static String TAB_SM_NAME = "tabsm";
    public static String TAB_SM_NAME_ALIAS = "tabsm2";

    public static String PM2 = "tabsm2.pm";
    public static String C_COD_P2 = "tabsm2.comp_cod_prec";
    public static String C_COD_S2 = "tabsm2.comp_cod_succ";
    public static String SEG_SM2 = "tabsm2.segment";
    public static String C01M = "tabsm.c01";
    public static String C02M = "tabsm.c02";
    public static String C03M = "tabsm.c03";
    public static String C04M = "tabsm.c04";
    public static String C05M = "tabsm.c05";
    public static String C06M = "tabsm.c06";
    public static String C07M = "tabsm.c07";
    public static String C08M = "tabsm.c08";
    public static String C09M = "tabsm.c09";
    public static String C10M = "tabsm.c10";

    public static String SEG_SM = "segment";
    public static String PM = "pm";
    public static String C_COD_P = "comp_cod_prec";
    public static String C_COD_S = "comp_cod_succ";
    public static String C01 = "c01";
    public static String C02 = "c02";
    public static String C03 = "c03";
    public static String C04 = "c04";
    public static String C05 = "c05";
    public static String C06 = "c06";
    public static String C07 = "c07";
    public static String C08 = "c08";
    public static String C09 = "c09";
    public static String C10 = "c10";
    public static String EX = "ex";
    public static String TAB_SF_PR_KEY = "pr_key";
    public static String TAB_SF_TS = "ts";
//Fields length
    public static int lSEG_SPF = 20;
    public static int lC_COD_SPF = 4;

//Fields length
    public static int lSEG_SM = 20;
    public static int lPM = 1;
    public static int lC_COD_P = 4;
    public static int lC_COD_S = 4;
    public static int lC01 = 1;
    public static int lC02 = 1;
    public static int lC03 = 1;
    public static int lC04 = 1;
    public static int lC05 = 1;
    public static int lC06 = 1;
    public static int lC07 = 1;
    public static int lC08 = 1;
    public static int lC09 = 1;
    public static int lC10 = 1;
    public static int lEX = 64;
    public static int lCODS = lC01
            + lC02
            + lC03
            + lC04
            + lC05
            + lC06
            + lC07
            + lC08
            + lC09
            + lC10;

}

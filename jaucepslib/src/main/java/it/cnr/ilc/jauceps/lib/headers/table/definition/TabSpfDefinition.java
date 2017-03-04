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
 * porting of table_TABSPF_definition_alpha.h</p>
 *  @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabSpfDefinition {

    public static int SPF_MAX = 2;
    public static int SPF1 = Segments.SPF1;
    public static int SPF2 = Segments.SPF2;

//Fields name
    public static String TAB_SPF_NAME = "tabspf";
    public static String SEG_SPF = "segment";
    public static String C_COD_SPF = "comp_cod";

//Fields length
    public static int lSEG_SPF = 20;
    public static int lC_COD_SPF = 4;

}

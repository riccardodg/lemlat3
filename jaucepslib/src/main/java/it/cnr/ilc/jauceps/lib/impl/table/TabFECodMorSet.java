/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl.table;

import it.cnr.ilc.jauceps.lib.impl.Vars;



/**
 * <p>
 * PORTING</p>
 * <p>
 * This class manages the table tab_fe and the final 7 codes</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabFECodMorSet {

    Vars vars = new Vars();
    private String EOS = vars.getEOS();

    private String COD_4 = EOS;
    private String COD_5 = EOS;
    private String COD_6 = EOS;
    private String COD_7 = EOS;
    private String COD_8 = EOS;
    private String COD_9 = EOS;
    private String COD_10 = EOS;
    String codes = "-------";
    
    private String lesId="";
    

    /**
     * Constructor
     * @param COD_4 code 4
     * @param COD_5 code 5
     * @param COD_6 code 6
     * @param COD_7 code 7
     * @param COD_8 code 8
     * @param COD_9 code 9
     * @param COD_10 code 10
     * @param  codes the concatenation of codes
     */
    public TabFECodMorSet(String COD_4, String COD_5, String COD_6, String COD_7, String COD_8, String COD_9, String COD_10, String codes) {
        this.COD_4 = COD_4;
        this.COD_5 = COD_4;
        this.COD_6 = COD_4;
        this.COD_7 = COD_4;
        this.COD_8 = COD_4;
        this.COD_9 = COD_4;
        this.COD_10 = COD_4;
        this.codes=codes;

    }

    public TabFECodMorSet() {
    }
    
    public TabFECodMorSet(String codes) {
        this.codes=codes;
    }

    /**
     * @return the COD_4
     */
    public String getCOD_4() {
        return COD_4;
    }

    /**
     * @param COD_4 the COD_4 to set
     */
    public void setCOD_4(String COD_4) {
        this.COD_4 = COD_4;
    }

    /**
     * @return the COD_5
     */
    public String getCOD_5() {
        return COD_5;
    }

    /**
     * @return the COD_6
     */
    public String getCOD_6() {
        return COD_6;
    }

    /**
     * @param COD_5 the COD_5 to set
     */
    public void setCOD_5(String COD_5) {
        this.COD_5 = COD_5;
    }

    /**
     * @param COD_6 the COD_6 to set
     */
    public void setCOD_6(String COD_6) {
        this.COD_6 = COD_6;
    }

    /**
     * @return the COD_7
     */
    public String getCOD_7() {
        return COD_7;
    }

    /**
     * @return the COD_8
     */
    public String getCOD_8() {
        return COD_8;
    }

    /**
     * @param COD_7 the COD_7 to set
     */
    public void setCOD_7(String COD_7) {
        this.COD_7 = COD_7;
    }

    /**
     * @param COD_8 the COD_8 to set
     */
    public void setCOD_8(String COD_8) {
        this.COD_8 = COD_8;
    }

    /**
     * @return the COD_9
     */
    public String getCOD_9() {
        return COD_9;
    }

    /**
     * @param COD_9 the COD_9 to set
     */
    public void setCOD_9(String COD_9) {
        this.COD_9 = COD_9;
    }

    /**
     * @return the COD_10
     */
    public String getCOD_10() {
        return COD_10;
    }

    /**
     * @param COD_10 the COD_10 to set
     */
    public void setCOD_10(String COD_10) {
        this.COD_10 = COD_10;
    }

   

    

    /**
     * @return the codes
     */
    public String getCodes() {
        return codes;
    }

    /**
     * @param codes the codes to set
     */
    public void setCodes(String codes) {
        this.codes = codes;
    }

    /**
     * @return the lesId
     */
    public String getLesId() {
        return lesId;
    }

    /**
     * @param lesId the lesId to set
     */
    public void setLesId(String lesId) {
        this.lesId = lesId;
    }

}

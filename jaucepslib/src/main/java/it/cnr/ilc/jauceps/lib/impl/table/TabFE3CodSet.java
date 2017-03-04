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
 * This class manages the table tab_fe and the result set getSF_cod_set with
 * case 2</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabFE3CodSet {

    Vars vars = new Vars();
    private String EOS = vars.getEOS();

//    String C01 = EOS;
//    String C02 = EOS;
//    String C03 = EOS;
    
    String C01 = "";
    String C02 = "";
    String C03 = "";

    String codes = "";

    String les_id = "";

    public TabFE3CodSet() {
    }

    public TabFE3CodSet(String codes) {
        this.codes = codes;
    }

    public TabFE3CodSet(String C01, String C02, String C03, String codes) {
        this.C01 = C01;
        this.C02 = C02;
        this.C03 = C03;
        this.codes = codes;
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
     * @return the C01
     */
    public String getC01() {
        return C01;
    }

    /**
     * @param C01 the C01 to set
     */
    public void setC01(String C01) {
        this.C01 = C01;
    }

    /**
     * @return the C02
     */
    public String getC02() {
        return C02;
    }

    /**
     * @param C02 the C02 to set
     */
    public void setC02(String C02) {
        this.C02 = C02;
    }

    /**
     * @return the C03
     */
    public String getC03() {
        return C03;
    }

    /**
     * @param C03 the C03 to set
     */
    public void setC03(String C03) {
        this.C03 = C03;
    }

    /**
     * @return the les_id
     */
    public String getLes_id() {
        return les_id;
    }

    /**
     * @param les_id the les_id to set
     */
    public void setLes_id(String les_id) {
        this.les_id = les_id;
    }

}

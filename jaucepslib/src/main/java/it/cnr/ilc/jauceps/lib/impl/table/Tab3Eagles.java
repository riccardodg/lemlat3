/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl.table;

import it.cnr.ilc.jauceps.lib.impl.Vars;

/**
 *
 * <p>
 * This class manages the three eagles codes of table eagles</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class Tab3Eagles {

    Vars vars = new Vars();
    private String EOS = vars.getEOS();

    private String codLem = EOS;

    private String c01 = EOS;
    private String c02 = EOS;
    private String c03 = EOS;

    /**
     * Void constructor
     */
    public Tab3Eagles() {
    }

    /**
     * Full constructor
     *
     * @param codLem the lem code
     * @param c01 first code
     * @param c02 second code
     * @param c03 third code
     */
    public Tab3Eagles(String codLem, String c01, String c02, String c03) {
        this.codLem = codLem;
        this.c01 = c01;
        this.c02 = c02;
        this.c03 = c03;

    }

    /**
     * @return the codLem
     */
    public String getCodLem() {
        return codLem;
    }

    /**
     * @return the c01
     */
    public String getC01() {
        return c01;
    }

    /**
     * @return the c02
     */
    public String getC02() {
        return c02;
    }

    /**
     * @return the c03
     */
    public String getC03() {
        return c03;
    }

    /**
     * @param codLem the codLem to set
     */
    public void setCodLem(String codLem) {
        this.codLem = codLem;
    }

    /**
     * @param c01 the c01 to set
     */
    public void setC01(String c01) {
        this.c01 = c01;
    }

    /**
     * @param c02 the c02 to set
     */
    public void setC02(String c02) {
        this.c02 = c02;
    }

    /**
     * @param c03 the c03 to set
     */
    public void setC03(String c03) {
        this.c03 = c03;
    }

}

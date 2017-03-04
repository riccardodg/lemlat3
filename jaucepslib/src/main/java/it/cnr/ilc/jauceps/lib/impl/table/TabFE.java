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
 * This class manages the table tab_fe</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabFE {

    Vars vars = new Vars();
    private String EOS = vars.getEOS();

    private String lesId = EOS;
    private String addLem = EOS;
    private String encFE = EOS;

    public TabFE() {
    }

    public TabFE(String lesId, String addLem, String encFE) {
        this.lesId = lesId;
        this.addLem = addLem;
        this.encFE = encFE;

    }

    /**
     * @return the lesId
     */
    public String getLesId() {
        return lesId;
    }

    /**
     * @return the addLem
     */
    public String getAddLem() {
        return addLem;
    }

    /**
     * @return the encFE
     */
    public String getEncFE() {
        return encFE;
    }

    /**
     * @param lesId the lesId to set
     */
    public void setLesId(String lesId) {
        this.lesId = lesId;
    }

    /**
     * @param addLem the addLem to set
     */
    public void setAddLem(String addLem) {
        this.addLem = addLem;
    }

    /**
     * @param encFE the encFE to set
     */
    public void setEncFE(String encFE) {
        this.encFE = encFE;
    }

}

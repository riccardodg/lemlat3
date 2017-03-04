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
 * This class manages the table lemma_ending</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabSF {

    Vars vars = new Vars();
    private String EOS = vars.getEOS();

    private String SEG = EOS;
    private int LSEG = -1;

    public TabSF(String SEG, int LSEG) {
        this.SEG = SEG;
        this.LSEG = LSEG;
    }

    public TabSF() {
        setSEG(SEG);
        setLSEG(LSEG);
    }

    /**
     * porting of getSF
     *
     * @return the SEG
     */
    public String getSEG() {
        return SEG;
    }

    /**
     * @return the LSEG
     */
    public int getLSEG() {
        return LSEG;
    }

    /**
     * @param SEG the SEG to set
     */
    public void setSEG(String SEG) {
        this.SEG = SEG;
    }

    /**
     * @param LSEG the LSEG to set
     */
    public void setLSEG(int LSEG) {
        this.LSEG = LSEG;
    }

}

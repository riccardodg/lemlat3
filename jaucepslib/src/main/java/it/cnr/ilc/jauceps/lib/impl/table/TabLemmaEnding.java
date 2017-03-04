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
 * Porting of method get_3eagles</p>
 * <p>
 * This class manages the table lemma_ending</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabLemmaEnding {

    Vars vars = new Vars();
    private String EOS = vars.getEOS();

    private String cur_lemma = EOS;

    /**
     * Void constructor
     */
    public TabLemmaEnding() {
    }

    /**
     * Full constructor
     *
     * @param cur_lemma current lemma
     */
    public TabLemmaEnding(String cur_lemma) {
        this.cur_lemma = cur_lemma;

    }

    /**
     * @return the cur_lemma
     */
    public String getCur_lemma() {
        return cur_lemma;
    }

    /**
     * @param cur_lemma the cur_lemma to set
     */
    public void setCur_lemma(String cur_lemma) {
        this.cur_lemma = cur_lemma;
    }

}

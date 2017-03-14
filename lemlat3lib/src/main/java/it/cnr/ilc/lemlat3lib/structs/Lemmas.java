/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lemlat3lib.structs;

import java.util.ArrayList;
import java.util.List;

/**<p>PORTING</p>
 * <p>porting of struct Lemmas in aucepsLIB_alpha.h</p>
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class Lemmas {

    private List<Lemma> Lemmas = new ArrayList<>();
    private int numL = 0;

    /**
     * void constructor
     */
    public Lemmas() {
    }

    public Lemmas(ArrayList<Lemma> lemmas, int numL) {
        this.Lemmas = lemmas;
        this.numL = numL;

    }

    /**
     * @return the Lemmas
     */
    public List<Lemma> getLemmas() {
        return Lemmas;
    }

    /**
     * @return the numL
     */
    public int getNumL() {
        return numL;
    }

    /**
     * @param Lemmas the Lemmas to set
     */
    public void setLemmas(List<Lemma> Lemmas) {
        this.Lemmas = Lemmas;
    }

    /**
     * @param numL the numL to set
     */
    public void setNumL(int numL) {
        this.numL = numL;
    }

    @Override
    public String toString() {
        return "Lemmas{" + "Lemmas=" + Lemmas.toString() + ", numL=" + numL + '}';
    }
    
    

}

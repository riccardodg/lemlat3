/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.structs;

import java.util.Arrays;

/**<p>PORTING</p>
 * <p>porting of struct Analysis in aucepsLIB_alpha.h</p>
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class Analysis {
    private String[] segments = new String[7];
    private short part=0;
    private short n_cod_morf=0;
    private String[] cod_morf_4_10=new String[20]; /*MAX_N_COD_MORF 20*/ 
    private Lemmas lemmas=new Lemmas();
    private int numCa=0;

    /**
     * @return the segments
     */
    public String[] getSegments() {
        return segments;
    }

    /**
     * @return the part
     */
    public short getPart() {
        return part;
    }

    /**
     * @return the n_cod_morf
     */
    public short getN_cod_morf() {
        return n_cod_morf;
    }

    /**
     * @return the cod_morf_4_10
     */
    public String[] getCod_morf_4_10() {
        return cod_morf_4_10;
    }

    /**
     * @return the lemmas
     */
    public Lemmas getLemmas() {
        return lemmas;
    }

    /**
     * @param segments the segments to set
     */
    public void setSegments(String[] segments) {
        this.segments = segments;
    }

    /**
     * @param part the part to set
     */
    public void setPart(short part) {
        this.part = part;
    }

    /**
     * @param n_cod_morf the n_cod_morf to set
     */
    public void setN_cod_morf(short n_cod_morf) {
        this.n_cod_morf = n_cod_morf;
    }

    /**
     * @param cod_morf_4_10 the cod_morf_4_10 to set
     */
    public void setCod_morf_4_10(String[] cod_morf_4_10) {
        this.cod_morf_4_10 = cod_morf_4_10;
    }

    /**
     * @param lemmas the lemmas to set
     */
    public void setLemmas(Lemmas lemmas) {
        this.lemmas = lemmas;
    }

    @Override
    public String toString() {
        //return "AAAA ";
        return "Analysis{" + "segments=" + Arrays.toString(segments) + ", part=" + part + ", n_cod_morf=" + n_cod_morf + ", cod_morf_4_10=" + Arrays.toString(cod_morf_4_10) + ", lemmas=" + lemmas.toString() + '}';
    }

    /**
     * @return the numCa
     */
    public int getNumCa() {
        return numCa;
    }

    /**
     * @param numCa the numCa to set
     */
    public void setNumCa(int numCa) {
        this.numCa = numCa;
    }
    
    
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lemlat3lib.structs;


import java.util.Arrays;

/**<p>PORTING</p>
 * <p>porting of struct lemma in aucepsLIB_alpha.h</p>
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class Lemma {

    private String out_lemma;
    private String cod_lemma;
    private String[] cod_morf_1_3;
    private LEM_TYPE type;
    private String n_id;
    private String gen;
    private String codles;
    private int les_id;
    

    /**
     * @return the out_lemma
     */
    public String getOut_lemma() {
        return out_lemma;
    }

    /**
     * @return the cod_lemma
     */
    public String getCod_lemma() {
        return cod_lemma;
    }

    /**
     * @return the cod_morf_1_3
     */
    public String[] getCod_morf_1_3() {
        return cod_morf_1_3;
    }

    /**
     * @return the type
     */
    public LEM_TYPE getType() {
        return type;
    }

    /**
     * @return the n_id
     */
    public String getN_id() {
        return n_id;
    }

    /**
     * @return the gen
     */
    public String getGen() {
        return gen;
    }

    /**
     * @return the codles
     */
    public String getCodles() {
        return codles;
    }

    /**
     * @return the les_id
     */
    public int getLes_id() {
        return les_id;
    }

    /**
     * @param out_lemma the out_lemma to set
     */
    public void setOut_lemma(String out_lemma) {

        this.out_lemma = out_lemma;

    }

    /**
     * @param cod_lemma the cod_lemma to set
     */
    public void setCod_lemma(String cod_lemma) {

        this.cod_lemma = cod_lemma;

    }

    /**
     * @param cod_morf_1_3 the cod_morf_1_3 to set
     */
    public void setCod_morf_1_3(String[] cod_morf_1_3) {

        this.cod_morf_1_3 = cod_morf_1_3;

    }

    /**
     * @param type the type to set
     */
    public void setType(LEM_TYPE type) {

        this.type = type;

    }

    /**
     * @param n_id the n_id to set
     */
    public void setN_id(String n_id) {

        this.n_id = n_id;

    }

    /**
     * @param gen the gen to set
     */
    public void setGen(String gen) {

        this.gen = gen;

    }

    /**
     * @param codles the codles to set
     */
    public void setCodles(String codles) {

        this.codles = codles;

    }

    /**
     * @param les_id the les_id to set
     */
    public void setLes_id(int les_id) {

        this.les_id = les_id;

    }

    @Override
    public String toString() {
        return "Lemma{" + "out_lemma=" + out_lemma + ", cod_lemma=" + cod_lemma + ", cod_morf_1_3=" + Arrays.toString(cod_morf_1_3) + ", type=" + type + ", n_id=" + n_id + ", gen=" + gen + ", codles=" + codles + ", les_id=" + les_id + '}';
    }
    
    

}

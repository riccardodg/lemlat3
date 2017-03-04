/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl.table;

import it.cnr.ilc.jauceps.lib.impl.Vars;

/**
 * <p>This class manages the table lessario</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabLessario {

    Vars vars = new Vars();
    private String EOS = vars.getEOS();

    private String n_id = EOS;
    private String gen = EOS;
    private String clem = EOS;
    private String si = EOS;
    private String smv = EOS;
    private String spf = EOS;
    private String les = EOS;
    private String codles = EOS;
    private String lem = EOS;
    private String s_omo = EOS;
    private String piu = EOS;
    private String codlem = EOS;
    private String type = EOS;
    private String codLE = EOS; /*codLe* was cod_noseg*/

    private String pt = EOS;
    private String a_gra = EOS;
    private String gra_u = EOS;
    private String pr_key = EOS; /*pr_key*/
    
  
   
  
   


    public TabLessario(String n_id, String gen, String clem, String si, String smv, String spf, String les, String codles, String lem, String s_omo, String piu, String codlem, String type, String codLE, String pt, String a_gra, String gra_u, String pr_key) {
        this.n_id = n_id;
        this.gen = gen;
        this.clem = clem;
        this.si = si;
        this.smv = smv;
        this.spf = spf;
        this.les = les;
        this.codles = codles;
        this.lem = lem;
        this.s_omo = s_omo;
        this.piu = piu;
        this.codlem = codlem;
        this.type = type;
        this.codLE = codLE;
        this.pt = pt;
        this.a_gra = a_gra;
        this.gra_u = gra_u;
        this.pr_key = pr_key;
    }

    public TabLessario() {
        setN_id(EOS);
        setGen(EOS);
        setClem(EOS);
        setSi(EOS);
        setSmv(EOS);
        setSpf(EOS);
        setLes(EOS);
        setCodles(EOS);
        setLem(EOS);
        setS_omo(EOS);
        setPiu(EOS);
        setCodlem(EOS);
        setType(EOS);
        setCodLE(EOS);
        setPt(EOS);
        setA_gra(EOS);
        setGra_u(EOS);
        setPr_key(EOS);
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
     * @return the clem
     */
    public String getClem() {
        return clem;
    }

    /**
     * @return the si
     */
    public String getSi() {
        return si;
    }

    /**
     * @return the smv
     */
    public String getSmv() {
        return smv;
    }

    /**
     * @return the spf
     */
    public String getSpf() {
        return spf;
    }

    /**
     * @return the les
     */
    public String getLes() {
        return les;
    }

    /**
     * @return the codles
     */
    public String getCodles() {
        return codles;
    }

    /**
     * @return the lem
     */
    public String getLem() {
        return lem;
    }

    /**
     * @return the s_omo
     */
    public String getS_omo() {
        return s_omo;
    }

    /**
     * @return the piu
     */
    public String getPiu() {
        return piu;
    }

    /**
     * @return the codlem
     */
    public String getCodlem() {
        return codlem;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the codLE
     */
    public String getCodLE() {
        return codLE;
    }

    /**
     * @return the pt
     */
    public String getPt() {
        return pt;
    }

    /**
     * @return the a_gra
     */
    public String getA_gra() {
        return a_gra;
    }

    /**
     * @return the gra_u
     */
    public String getGra_u() {
        return gra_u;
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
     * @param clem the clem to set
     */
    public void setClem(String clem) {
        this.clem = clem;
    }

    /**
     * @param si the si to set
     */
    public void setSi(String si) {
        this.si = si;
    }

    /**
     * @param smv the smv to set
     */
    public void setSmv(String smv) {
        this.smv = smv;
    }

    /**
     * @param spf the spf to set
     */
    public void setSpf(String spf) {
        this.spf = spf;
    }

    /**
     * @param les the les to set
     */
    public void setLes(String les) {
        this.les = les;
    }

    /**
     * @param codles the codles to set
     */
    public void setCodles(String codles) {
        this.codles = codles;
    }

    /**
     * @param lem the lem to set
     */
    public void setLem(String lem) {
        this.lem = lem;
    }

    /**
     * @param s_omo the s_omo to set
     */
    public void setS_omo(String s_omo) {
        this.s_omo = s_omo;
    }

    /**
     * @param piu the piu to set
     */
    public void setPiu(String piu) {
        this.piu = piu;
    }

    /**
     * @param codlem the codlem to set
     */
    public void setCodlem(String codlem) {
        this.codlem = codlem;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @param codLE the codLE to set
     */
    public void setCodLE(String codLE) {
        this.codLE = codLE;
    }

    /**
     * @param pt the pt to set
     */
    public void setPt(String pt) {
        this.pt = pt;
    }

    /**
     * @param a_gra the a_gra to set
     */
    public void setA_gra(String a_gra) {
        this.a_gra = a_gra;
    }

    /**
     * @param gra_u the gra_u to set
     */
    public void setGra_u(String gra_u) {
        this.gra_u = gra_u;
    }

    /**
     * @return the pr_key
     */
    public String getPr_key() {
        return pr_key;
    }

    /**
     * @param pr_key the pr_key to set
     */
    public void setPr_key(String pr_key) {
        this.pr_key = pr_key;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lemlat3lib.structs;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author riccardodelgratta
 */
public class SilType {

    private String initValue;

    /**
     * Internal identifier used for logging purposes
     */
    private String silId = "";

    /**
     * the radical
     */
    private String radical;

    /**
     * the form to search
     */
    private String form;

    /**
     * the lemma of the form
     */
    private String lemma;

    /**
     * the code of the form
     */
    private String codice;

    /**
     * n array with three eagles codes
     */
    private String[] eagles3 = new String[3];

    /**
     * radical from Final Segment (SF)
     */
    private String rad_sf;

    /**
     * radical from Initial Segment (SI)
     */
    private String rad_si;

    /**
     * radical from Post Final Segment (SPF cod=e)
     */
    private String rad_spfe;

    /**
     * radical from Post Final Segment (SPF cod <>e)
     */
    private String rad_spf;

    /**
     * radical from First Median Segment (SM1)
     */
    private String rad_sm1;

    /**
     * radical from Second Median Segment (SM2)
     */
    private String rad_sm2;

    /**
     * The alternate radical
     */
    private String rad_alt;

    /**
     * radical from Alternate Initial Segment (SAI)
     */
    private String rad_sai;

    /**
     * TODO
     */
    private String ind_alt = null;

    /**
     * Seven segments SI, LES, SM1, SM2, SF, SPF2, SPF1
     */
    private String[] segment = new String[7];

    /**
     * TODO
     */
    private int part;

    /**
     * TODO
     */
    private int isLE;

    /**
     * void constructor. It use y=this constructor run the initSil method
     */
    public SilType() {

        silId = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        silId = "RunID_" + silId;
        setSilId(silId);

    }

    /**
     * Constructor. Run initSil by itself
     *
     * @param initValue the value to initialize the structure
     */
    public SilType(String initValue) {
        this.initValue = initValue;
        initSil(initValue);
    }

    /**
     * Init the sil structure
     *
     * @param initField the value to check if the sil has been initialized
     */
    public void initSil(String initField) {
        setCodice(initField);
        setEagles3(new String[3]);
        setForm(null);
        setInd_alt(initField);
        setIsLE(0);
        setLemma(initField);
        setPart(0);
        setRad_alt(initField);
        setRad_sai(initField);
        setRad_si(initField);
        setRad_sf(initField);
        setRad_sm1(initField);
        setRad_sm2(initField);
        setRad_spf(initField);
        setRad_spfe(initField);
        setRadical(initField);
        setSegment(new String[7]);

    }

    /**
     * @return the silId
     */
    public String getSilId() {
        return silId;
    }

    /**
     * @param silId the silId to set
     */
    public void setSilId(String silId) {
        this.silId = silId;
    }

    /**
     * @return the radical
     */
    public String getRadical() {
        return radical;
    }

    /**
     * @param radical the radical to set
     */
    public void setRadical(String radical) {
        this.radical = radical;
    }

    /**
     * @return the form
     */
    public String getForm() {
        return form;
    }

    /**
     * @param form the form to set
     */
    public void setForm(String form) {
        this.form = form;
    }

    /**
     * @return the lemma
     */
    public String getLemma() {
        return lemma;
    }

    /**
     * @param lemma the lemma to set
     */
    public void setLemma(String lemma) {
        this.lemma = lemma;
    }

    /**
     * @return the codice
     */
    public String getCodice() {
        return codice;
    }

    /**
     * @param codice the codice to set
     */
    public void setCodice(String codice) {
        this.codice = codice;
    }

    /**
     * @return the eagles3
     */
    public String[] getEagles3() {
        return eagles3;
    }

    /**
     * @param eagles3 the eagles3 to set
     */
    public void setEagles3(String[] eagles3) {
        this.eagles3 = eagles3;
    }

    /**
     * @return the rad_sf
     */
    public String getRad_sf() {
        return rad_sf;
    }

    /**
     * @param rad_sf the rad_sf to set
     */
    public void setRad_sf(String rad_sf) {
        this.rad_sf = rad_sf;
    }

    /**
     * @return the rad_si
     */
    public String getRad_si() {
        return rad_si;
    }

    /**
     * @param rad_si the rad_si to set
     */
    public void setRad_si(String rad_si) {
        this.rad_si = rad_si;
    }

    /**
     * @return the rad_spfe
     */
    public String getRad_spfe() {
        return rad_spfe;
    }

    /**
     * @param rad_spfe the rad_spfe to set
     */
    public void setRad_spfe(String rad_spfe) {
        this.rad_spfe = rad_spfe;
    }

    /**
     * @return the rad_spf
     */
    public String getRad_spf() {
        return rad_spf;
    }

    /**
     * @param rad_spf the rad_spf to set
     */
    public void setRad_spf(String rad_spf) {
        this.rad_spf = rad_spf;
    }

    /**
     * @return the rad_sm1
     */
    public String getRad_sm1() {
        return rad_sm1;
    }

    /**
     * @param rad_sm1 the rad_sm1 to set
     */
    public void setRad_sm1(String rad_sm1) {
        this.rad_sm1 = rad_sm1;
    }

    /**
     * @return the rad_sm2
     */
    public String getRad_sm2() {
        return rad_sm2;
    }

    /**
     * @param rad_sm2 the rad_sm2 to set
     */
    public void setRad_sm2(String rad_sm2) {
        this.rad_sm2 = rad_sm2;
    }

    /**
     * @return the rad_alt
     */
    public String getRad_alt() {
        return rad_alt;
    }

    /**
     * @param rad_alt the rad_alt to set
     */
    public void setRad_alt(String rad_alt) {
        this.rad_alt = rad_alt;
    }

    /**
     * @return the rad_sai
     */
    public String getRad_sai() {
        return rad_sai;
    }

    /**
     * @param rad_sai the rad_sai to set
     */
    public void setRad_sai(String rad_sai) {
        this.rad_sai = rad_sai;
    }

    /**
     * @return the ind_alt
     */
    public String getInd_alt() {
        return ind_alt;
    }

    /**
     * @param ind_alt the ind_alt to set
     */
    public void setInd_alt(String ind_alt) {
        this.ind_alt = ind_alt;
    }

    /**
     * @return the segment
     */
    public String[] getSegment() {
        return segment;
    }

    /**
     * @param segment the segment to set
     */
    public void setSegment(String[] segment) {
        this.segment = segment;
    }

    /**
     * @return the part
     */
    public int getPart() {
        return part;
    }

    /**
     * @param part the part to set
     */
    public void setPart(int part) {
        this.part = part;
    }

    /**
     * @return the isLE
     */
    public int getIsLE() {
        return isLE;
    }

    /**
     * @param isLE the isLE to set
     */
    public void setIsLE(int isLE) {
        this.isLE = isLE;
    }

}

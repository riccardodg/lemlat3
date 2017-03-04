/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.outputobjects;

import it.cnr.ilc.jauceps.lib.structs.Analyses;
import it.cnr.ilc.jauceps.lib.structs.Analysis;
import it.cnr.ilc.jauceps.lib.structs.SilType;

/**
 * This class contains the update @SilType and the last @see Analysis and @see
 * Analyses
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class AucepsResponse {
    
    
    private boolean comp_le;
    private boolean comp;
    private boolean compai;
    private boolean compsi;
    private boolean compspfe;
    private boolean compspf;
    private boolean compsf;
    private boolean compsm1;
    private boolean compsm2;
    
    private boolean exitInComp_le;
    private boolean exitInComp;
    private boolean exitInCompai;
    private boolean exitInCompsi;
    private boolean exitInCompspfe;
    private boolean exitInCompspf;
    private boolean exitInCompsf;
    private boolean exitInCompsm1;
    private boolean exitInCompsm2;
    private boolean exitInLemtiz;
    private boolean exitInLemv;
    
    private boolean executedLemmiEcc;
   
    
    private Analyses analyses;
    private SilType sil;
    private Analysis cur_analysis;
    private String resId="";
    private String status ="0";

    public AucepsResponse(Analyses analyses, SilType sil, Analysis cur_analysis) {
        this.analyses = analyses;
        this.sil = sil;
        this.cur_analysis = cur_analysis;
    }

    public AucepsResponse(SilType sil) {
        this.sil = sil;
    }

    @Override
    public String toString() {
        return "AucepsResponse={" + "comp_le=" + comp_le + ", comp=" + comp + ", compai=" + compai + ", compsi=" + compsi + ", compspfe=" + compspfe + ", compspf=" + compspf + ", compsf=" + compsf + ", compsm1=" + compsm1 + ", compsm2=" + compsm2 + ", exitInComp_le=" + exitInComp_le + ", exitInComp=" + exitInComp + ", exitInCompai=" + exitInCompai + ", exitInCompsi=" + exitInCompsi + ", exitInCompspfe=" + exitInCompspfe + ", exitInCompspf=" + exitInCompspf + ", exitInCompsf=" + exitInCompsf + ", exitInCompsm1=" + exitInCompsm1 + ", exitInCompsm2=" + exitInCompsm2 + ", exitInLemtiz=" + exitInLemtiz + ", exitInLemv=" + exitInLemv + ", executedLemmiEcc=" + executedLemmiEcc + ", analyses=" + analyses + ", sil=" + sil + ", cur_analysis=" + cur_analysis + ", resId=" + resId + ", status=" + status + '}';
    }


    
    
    
    

    /**
     * @return the resId
     */
    public String getResId() {
        return resId;
    }

    /**
     * @param resId the resId to set
     */
    public void setResId(String resId) {
        this.resId = resId;
    }

    /**
     * @return the analyses
     */
    public Analyses getAnalyses() {
        return analyses;
    }

    /**
     * @return the sil
     */
    public SilType getSil() {
        return sil;
    }

    /**
     * @return the cur_analysis
     */
    public Analysis getCur_analysis() {
        return cur_analysis;
    }

    /**
     * @param analyses the analyses to set
     */
    public void setAnalyses(Analyses analyses) {
        this.analyses = analyses;
    }

    /**
     * @param sil the sil to set
     */
    public void setSil(SilType sil) {
        this.sil = sil;
    }

    /**
     * @param cur_analysis the cur_analysis to set
     */
    public void setCur_analysis(Analysis cur_analysis) {
        this.cur_analysis = cur_analysis;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the comp_le
     */
    public boolean isComp_le() {
        return comp_le;
    }

    /**
     * @return the comp
     */
    public boolean isComp() {
        return comp;
    }

    /**
     * @return the compai
     */
    public boolean isCompai() {
        return compai;
    }

    /**
     * @return the compsi
     */
    public boolean isCompsi() {
        return compsi;
    }

    /**
     * @return the compspfe
     */
    public boolean isCompspfe() {
        return compspfe;
    }

    /**
     * @return the compspf
     */
    public boolean isCompspf() {
        return compspf;
    }

    /**
     * @return the compsf
     */
    public boolean isCompsf() {
        return compsf;
    }

    /**
     * @return the compsm1
     */
    public boolean isCompsm1() {
        return compsm1;
    }

    /**
     * @return the compsm2
     */
    public boolean isCompsm2() {
        return compsm2;
    }

    /**
     * @param comp_le the comp_le to set
     */
    public void setComp_le(boolean comp_le) {
        this.comp_le = comp_le;
    }

    /**
     * @param comp the comp to set
     */
    public void setComp(boolean comp) {
        this.comp = comp;
    }

    /**
     * @param compai the compai to set
     */
    public void setCompai(boolean compai) {
        this.compai = compai;
    }

    /**
     * @param compsi the compsi to set
     */
    public void setCompsi(boolean compsi) {
        this.compsi = compsi;
    }

    /**
     * @param compspfe the compspfe to set
     */
    public void setCompspfe(boolean compspfe) {
        this.compspfe = compspfe;
    }

    /**
     * @param compspf the compspf to set
     */
    public void setCompspf(boolean compspf) {
        this.compspf = compspf;
    }

    /**
     * @param compsf the compsf to set
     */
    public void setCompsf(boolean compsf) {
        this.compsf = compsf;
    }

    /**
     * @param compsm1 the compsm1 to set
     */
    public void setCompsm1(boolean compsm1) {
        this.compsm1 = compsm1;
    }

    /**
     * @param compsm2 the compsm2 to set
     */
    public void setCompsm2(boolean compsm2) {
        this.compsm2 = compsm2;
    }

    /**
     * @return the exitInComp_le
     */
    public boolean isExitInComp_le() {
        return exitInComp_le;
    }

    /**
     * @return the exitInComp
     */
    public boolean isExitInComp() {
        return exitInComp;
    }

    /**
     * @return the exitInCompai
     */
    public boolean isExitInCompai() {
        return exitInCompai;
    }

    /**
     * @return the exitInCompsi
     */
    public boolean isExitInCompsi() {
        return exitInCompsi;
    }

    /**
     * @return the exitInCompspfe
     */
    public boolean isExitInCompspfe() {
        return exitInCompspfe;
    }

    /**
     * @return the exitInCompspf
     */
    public boolean isExitInCompspf() {
        return exitInCompspf;
    }

    /**
     * @return the exitInCompsf
     */
    public boolean isExitInCompsf() {
        return exitInCompsf;
    }

    /**
     * @return the exitInCompsm1
     */
    public boolean isExitInCompsm1() {
        return exitInCompsm1;
    }

    /**
     * @return the exitInCompsm2
     */
    public boolean isExitInCompsm2() {
        return exitInCompsm2;
    }

    /**
     * @param exitInComp_le the exitInComp_le to set
     */
    public void setExitInComp_le(boolean exitInComp_le) {
        this.exitInComp_le = exitInComp_le;
    }

    /**
     * @param exitInComp the exitInComp to set
     */
    public void setExitInComp(boolean exitInComp) {
        this.exitInComp = exitInComp;
    }

    /**
     * @param exitInCompai the exitInCompai to set
     */
    public void setExitInCompai(boolean exitInCompai) {
        this.exitInCompai = exitInCompai;
    }

    /**
     * @param exitInCompsi the exitInCompsi to set
     */
    public void setExitInCompsi(boolean exitInCompsi) {
        this.exitInCompsi = exitInCompsi;
    }

    /**
     * @param exitInCompspfe the exitInCompspfe to set
     */
    public void setExitInCompspfe(boolean exitInCompspfe) {
        this.exitInCompspfe = exitInCompspfe;
    }

    /**
     * @param exitInCompspf the exitInCompspf to set
     */
    public void setExitInCompspf(boolean exitInCompspf) {
        this.exitInCompspf = exitInCompspf;
    }

    /**
     * @param exitInCompsf the exitInCompsf to set
     */
    public void setExitInCompsf(boolean exitInCompsf) {
        this.exitInCompsf = exitInCompsf;
    }

    /**
     * @param exitInCompsm1 the exitInCompsm1 to set
     */
    public void setExitInCompsm1(boolean exitInCompsm1) {
        this.exitInCompsm1 = exitInCompsm1;
    }

    /**
     * @param exitInCompsm2 the exitInCompsm2 to set
     */
    public void setExitInCompsm2(boolean exitInCompsm2) {
        this.exitInCompsm2 = exitInCompsm2;
    }

    /**
     * @return the exitInLemtiz
     */
    public boolean isExitInLemtiz() {
        return exitInLemtiz;
    }

    /**
     * @param exitInLemtiz the exitInLemtiz to set
     */
    public void setExitInLemtiz(boolean exitInLemtiz) {
        this.exitInLemtiz = exitInLemtiz;
    }

    /**
     * @return the exitInLemv
     */
    public boolean isExitInLemv() {
        return exitInLemv;
    }

    /**
     * @param exitInLemv the exitInLemv to set
     */
    public void setExitInLemv(boolean exitInLemv) {
        this.exitInLemv = exitInLemv;
    }

    /**
     * @return the executedLemmiEcc
     */
    public boolean isExecutedLemmiEcc() {
        return executedLemmiEcc;
    }

    /**
     * @param executedLemmiEcc the executedLemmiEcc to set
     */
    public void setExecutedLemmiEcc(boolean executedLemmiEcc) {
        this.executedLemmiEcc = executedLemmiEcc;
    }

    
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl;

import it.cnr.ilc.jauceps.lib.headers.AVars;

/**
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class Vars extends AVars {

    private String EOS = "";

    private boolean sqlDebug = false;

    private boolean flowDebug = false;

    private boolean valueDebug = false;

    private boolean deepFlowDebug = false;

    private boolean printSplash = false;

    private boolean callerDebug = false;

    private boolean analysisDebug = false;

    private boolean printStructDebug = false;

    private int printFormatted = 2;

    private boolean debugJson = false;

    private boolean useInPipe = false;

    private boolean operationDebug = false;

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#isFlowDebug()
     */
    @Override
    public boolean isSqlDebug() {
        // TODO Auto-generated method stub
        return sqlDebug;
    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#isFlowDebug()
     */
    @Override
    public void setSqlDebug(boolean val) {
        sqlDebug = val;

    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#isFlowDebug()
     */
    @Override
    public boolean isFlowDebug() {
        return flowDebug;
    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#isValueDebug()
     */
    @Override
    public boolean isValueDebug() {
        return valueDebug;
    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#isDeepFlowDebug()
     */
    @Override
    public boolean isDeepFlowDebug() {

        return deepFlowDebug;
    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#isCallerDebug()
     */
    @Override
    public boolean isCallerDebug() {
        return callerDebug;
    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#isAnalysisDebug()
     */
    @Override
    public boolean isAnalysisDebug() {
        return analysisDebug;
    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#isPrintStructDebug()
     */
    @Override
    public boolean isPrintStructDebug() {
        return printStructDebug;
    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#getPrintFormatted()
     */
    @Override
    public int getPrintFormatted() {
        return printFormatted;
    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#isDebugJson()
     */
    @Override
    public boolean isDebugJson() {
        return debugJson;
    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#isUseInPipe()
     */
    @Override
    public boolean isUseInPipe() {
        return useInPipe;
    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#isPrintSplash()
     */
    @Override
    public boolean isPrintSplash() {
        return printSplash;
    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#setFlowDebug(boolean)
     */
    @Override
    public void setFlowDebug(boolean val) {
        flowDebug = val;

    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#setValueDebug(boolean)
     */
    @Override
    public void setValueDebug(boolean val) {
        valueDebug = val;

    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#setDeepFlowDebug(boolean)
     */
    @Override
    public void setDeepFlowDebug(boolean val) {
        deepFlowDebug = val;

    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#setCallerDebug(boolean)
     */
    @Override
    public void setCallerDebug(boolean val) {
        callerDebug = val;

    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#setAnalysisDebug(boolean)
     */
    @Override
    public void setAnalysisDebug(boolean val) {

        callerDebug = val;
    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#setPrintStructDebug(boolean)
     */
    @Override
    public void setPrintStructDebug(boolean val) {
        callerDebug = val;

    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#setPrintFormatted(int)
     */
    @Override
    public void setPrintFormatted(int val) {
        printFormatted = val;

    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#setDebugJson(boolean)
     */
    @Override
    public void setDebugJson(boolean val) {
        debugJson = val;
    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#setUseInPipe(boolean)
     */
    @Override
    public void setUseInPipe(boolean val) {
        useInPipe = val;
    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see it.cnr.ilc.libjauceps.headers.AVars#setPrintSplash(boolean)
     */
    @Override
    public void setPrintSplash(boolean val) {
        printSplash = val;
    }

    /**
     * @return the EOS
     */
    public String getEOS() {
        return EOS;
    }

    /**
     * @param EOS the EOS to set
     */
    public void setEOS(String EOS) {
        this.EOS = EOS;
    }

    @Override
    public boolean isOperationDebug() {
        return this.operationDebug;
    }

    @Override
    public void setOperationDebug(boolean operationDebug) {
        this.operationDebug = operationDebug;
    }

}

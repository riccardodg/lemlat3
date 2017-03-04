/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.headers;

/**
 * porting of vars.h
 *
 * @author riccardo
 *
 */
public abstract class AVars {

    /**
     * C '\0'- EOS
     */
    String EOS;

    /**
     * debug sql instructions
     */
    boolean sqlDebug;

    /**
     * flow debug
     */
    boolean flowDebug;

    /**
     * value debug
     */
    boolean valueDebug;

    /**
     * deep flow debug to show where the program is for example in IF-ELSE,
     * SWITCH
     */
    boolean deepFlowDebug;

    /**
     * calling/caller debug
     */
    boolean callerDebug;

    /**
     * true to print info to the user
     */
    boolean printSplash;

    /**
     * print analysis
     */
    boolean analysisDebug;

    /**
     * print structure
     */
    boolean printStructDebug;

    /**
     * 0 to print plain (standard); 1 for compact; 2 for JSON
     */
    int printFormatted = 2;

    /**
     * debug json
     */
    boolean debugJson;

    /**
     * Set it to true to use the program in pipe
     */
    boolean useInPipe;

    /**
     * Set it to true to print specific operation
     */
    private boolean operationDebug;

    /**
     * @return the flowDebug
     */
    abstract public boolean isSqlDebug();

    /**
     * @return the flowDebug
     */
    abstract public boolean isFlowDebug();

    /**
     * @return the valueDebug
     */
    abstract public boolean isValueDebug();

    /**
     * @return the deepFlowDebug
     */
    abstract public boolean isDeepFlowDebug();

    /**
     * @return the callerDebug
     */
    abstract public boolean isCallerDebug();

    /**
     * @return the analysisDebug
     */
    abstract public boolean isAnalysisDebug();

    /**
     * @return the printStructDebug
     */
    abstract public boolean isPrintStructDebug();

    /**
     * @return the printFormatted
     */
    abstract public int getPrintFormatted();

    /**
     * @return the debugJson
     */
    abstract public boolean isDebugJson();

    /**
     * @return the useInPipe
     */
    abstract public boolean isUseInPipe();

    /**
     *
     * @param sqlDebug the sqlDebug to set
     */
    abstract public void setSqlDebug(boolean sqlDebug);

    /**
     * @param flowDebug the flowDebug to set
     */
    abstract public void setFlowDebug(boolean flowDebug);

    /**
     * @param valueDebug the valueDebug to set
     */
    abstract public void setValueDebug(boolean valueDebug);

    /**
     * @param deepFlowDebug the deepFlowDebug to set
     */
    abstract public void setDeepFlowDebug(boolean deepFlowDebug);

    /**
     * @param callerDebug the callerDebug to set
     */
    abstract public void setCallerDebug(boolean callerDebug);

    /**
     * @param analysisDebug the analysisDebug to set
     */
    abstract public void setAnalysisDebug(boolean analysisDebug);

    /**
     * @param printStructDebug the printStructDebug to set
     */
    abstract public void setPrintStructDebug(boolean printStructDebug);

    /**
     * @param printFormatted the printFormatted to set
     */
    abstract public void setPrintFormatted(int printFormatted);

    /**
     * @param debugJson the debugJson to set
     */
    abstract public void setDebugJson(boolean debugJson);

    /**
     * @param useInPipe the useInPipe to set
     */
    abstract public void setUseInPipe(boolean useInPipe);

    /**
     * @return the printSplash
     */
    abstract public boolean isPrintSplash();

    /**
     * @param printSplash the printSplash to set
     */
    abstract public void setPrintSplash(boolean printSplash);

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

    /**
     * @return the operationDebug
     */
    abstract public boolean isOperationDebug();

    /**
     * @param operationDebug the operationDebug to set
     */
    abstract public void setOperationDebug(boolean operationDebug);

}

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
public final class StaticVars  {

    /**
     * @return the EOS
     */
    public static String getEOS() {
        return EOS;
    }

    /**
     * @return the sqlDebug
     */
    public static boolean isSqlDebug() {
        return sqlDebug;
    }

    /**
     * @return the flowDebug
     */
    public static boolean isFlowDebug() {
        return flowDebug;
    }

    /**
     * @return the valueDebug
     */
    public static boolean isValueDebug() {
        return valueDebug;
    }

    /**
     * @return the deepFlowDebug
     */
    public static boolean isDeepFlowDebug() {
        return deepFlowDebug;
    }

    /**
     * @return the printSplash
     */
    public static boolean isPrintSplash() {
        return printSplash;
    }

    /**
     * @return the callerDebug
     */
    public static boolean isCallerDebug() {
        return callerDebug;
    }

    /**
     * @return the analysisDebug
     */
    public static boolean isAnalysisDebug() {
        return analysisDebug;
    }

    /**
     * @return the printStructDebug
     */
    public static boolean isPrintStructDebug() {
        return printStructDebug;
    }

    /**
     * @return the printFormatted
     */
    public static int getPrintFormatted() {
        return printFormatted;
    }

    /**
     * @return the debugJson
     */
    public static boolean isDebugJson() {
        return debugJson;
    }

    /**
     * @return the useInPipe
     */
    public static boolean isUseInPipe() {
        return useInPipe;
    }

    /**
     * @return the operationDebug
     */
    public static boolean isOperationDebug() {
        return operationDebug;
    }

    /**
     * @param aEOS the EOS to set
     */
    public static void setEOS(String aEOS) {
        EOS = aEOS;
    }

    /**
     * @param aSqlDebug the sqlDebug to set
     */
    public static void setSqlDebug(boolean aSqlDebug) {
        sqlDebug = aSqlDebug;
    }

    /**
     * @param aFlowDebug the flowDebug to set
     */
    public static void setFlowDebug(boolean aFlowDebug) {
        flowDebug = aFlowDebug;
    }

    /**
     * @param aValueDebug the valueDebug to set
     */
    public static void setValueDebug(boolean aValueDebug) {
        valueDebug = aValueDebug;
    }

    /**
     * @param aDeepFlowDebug the deepFlowDebug to set
     */
    public static void setDeepFlowDebug(boolean aDeepFlowDebug) {
        deepFlowDebug = aDeepFlowDebug;
    }

    /**
     * @param aPrintSplash the printSplash to set
     */
    public static void setPrintSplash(boolean aPrintSplash) {
        printSplash = aPrintSplash;
    }

    /**
     * @param aCallerDebug the callerDebug to set
     */
    public static void setCallerDebug(boolean aCallerDebug) {
        callerDebug = aCallerDebug;
    }

    /**
     * @param aAnalysisDebug the analysisDebug to set
     */
    public static void setAnalysisDebug(boolean aAnalysisDebug) {
        analysisDebug = aAnalysisDebug;
    }

    /**
     * @param aPrintStructDebug the printStructDebug to set
     */
    public static void setPrintStructDebug(boolean aPrintStructDebug) {
        printStructDebug = aPrintStructDebug;
    }

    /**
     * @param aPrintFormatted the printFormatted to set
     */
    public static void setPrintFormatted(int aPrintFormatted) {
        printFormatted = aPrintFormatted;
    }

    /**
     * @param aDebugJson the debugJson to set
     */
    public static void setDebugJson(boolean aDebugJson) {
        debugJson = aDebugJson;
    }

    /**
     * @param aUseInPipe the useInPipe to set
     */
    public static void setUseInPipe(boolean aUseInPipe) {
        useInPipe = aUseInPipe;
    }

    /**
     * @param aOperationDebug the operationDebug to set
     */
    public static void setOperationDebug(boolean aOperationDebug) {
        operationDebug = aOperationDebug;
    }

    private StaticVars() {
    }

    private static String EOS = "";

    private static boolean sqlDebug = true;

    private static boolean flowDebug = true;

    private static boolean valueDebug = true;

    private static boolean deepFlowDebug = true;

    private static boolean printSplash = false;

    private static boolean callerDebug = true;

    private static boolean analysisDebug = false;

    private static boolean printStructDebug = false;

    private static int printFormatted = 2;

    private static boolean debugJson = false;

    private static boolean useInPipe = false;

    private static boolean operationDebug = true;

    

}

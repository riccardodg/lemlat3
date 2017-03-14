/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lemlat3lib.core;

import it.cnr.ilc.lemlat3lib.structs.SilType;
import java.sql.Connection;

/**
 * This class contains all methods to perform the analysis
 *
 * @author riccardodelgratta
 */
public class Lemlat3CoreLib {

    static final String CLASS_NAME = Lemlat3CoreLib.class.getName();
    private Connection conn;
    private String wordForm;
    private SilType sil;
    private Boolean[] debugs;

    /*
    debug properties
     */
    private boolean debug; //0
    private boolean sqlDebug; //1
    private boolean flowDebug; //2

    private boolean deepFlowDebug; //3
    private boolean printSplash;
    private boolean callerDebug; //4
    private boolean analysisDebug; //5
    private boolean printStructDebug;//6
    private boolean valueDebug; //7
    private boolean debugJson; //8
    private boolean operationDebug; //9
    private boolean useInPipe; //10

    /**
     * constructor
     *
     * @param conn the connection
     * @param wordForm the wordform to analyze
     * @param sil the siltype
     * @param debugs the array of debug values
     */
    public Lemlat3CoreLib(Connection conn, String wordForm, SilType sil, Boolean[] debugs) {
        this.conn = conn;
        this.wordForm = wordForm;
        this.sil = sil;
        this.debugs = debugs;
    }

    /**
     * constructor
     *
     * @param conn the connection
     * @param debugs the array of debug values
     */
    public Lemlat3CoreLib(Connection conn, Boolean[] debugs) {
        this.conn = conn;
        
        initDebugs(debugs);
    }

    /**
     * void constructor
     */
    public Lemlat3CoreLib() {
    }

    /**
     * init the different value for debug
     *
     * @param debugs the array for debug values
     */
    public void initDebugs(Boolean[] debugs) {
        debug = debugs[0];
        sqlDebug = debugs[1];
        flowDebug = debugs[2];
        deepFlowDebug = debugs[3];
        callerDebug = debugs[4];
        analysisDebug = debugs[5];
        printStructDebug = debugs[6];
        valueDebug = debugs[7];
        debugJson = debugs[8];
        operationDebug = debugs[9];
        useInPipe = debugs[10];
        
    }

    /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * @param conn the conn to set
     */
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    /**
     * @return the wordForm
     */
    public String getWordForm() {
        return wordForm;
    }

    /**
     * @param wordForm the wordForm to set
     */
    public void setWordForm(String wordForm) {
        this.wordForm = wordForm;
    }

    /**
     * @return the sil
     */
    public SilType getSil() {
        return sil;
    }

    /**
     * @param sil the sil to set
     */
    public void setSil(SilType sil) {
        this.sil = sil;
    }

}

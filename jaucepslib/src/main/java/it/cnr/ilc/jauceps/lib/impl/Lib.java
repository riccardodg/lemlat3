/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl;

import it.cnr.ilc.jauceps.lib.headers.ALib;
import it.cnr.ilc.jauceps.lib.structs.SilType;
import java.io.PrintStream;
import java.sql.Connection;
import org.apache.log4j.Logger;

/**
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class Lib extends ALib {

    //classes
    Vars vars = new Vars();
    DataSource ds = new DataSource();

    // log4j
    int loglevel = 0;
    /* only info */
    static final String CLASS_NAME = Lib.class.getName();
    static Logger log = Logger.getLogger(CLASS_NAME);

    // vars
    boolean sqlDebug = vars.isSqlDebug();
    boolean flowDebug = vars.isFlowDebug();
    boolean valueDebug = vars.isValueDebug();
    boolean deepFlowDebug = vars.isDeepFlowDebug();
    boolean printSplash = vars.isPrintSplash();
    boolean callerDebug = vars.isCallerDebug();
    boolean analysisDebug = vars.isAnalysisDebug();
    boolean printStructDebug = vars.isPrintStructDebug();
    int printFormatted = vars.getPrintFormatted();
    boolean debugJson = vars.isDebugJson();
    boolean useInPipe = vars.isUseInPipe();

    private Connection conn = null;
    private SilType sil;

    /**
     * Void constructor
     */
    public Lib() {
        super();
    }

    /**
     * Constructor
     *
     * @param sil the sil type to initialize
     */
    public Lib(SilType sil) {
        this.sil = sil;
    }

    @Override
    public boolean initialize(String app_name, PrintStream lf, PrintStream ef) {
        String routine = Lib.class.getName() + "/initialize";
        String logmess = "";
        SilType lsil = getSil();
        Connection lconn = null;

        boolean ret = false;

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in class Lib.java", routine);
            log.debug(logmess);
        }
        if (app_name == null) {
            app_name = APP_DEFAULT_NAME;
        }
        /*Init Sil */
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Initialize SIL in class Lib.java");
            log.debug(logmess);

        }
        lsil.setInd_alt("");
        /* Note 7 is the number of segments in the structure silType (TO CLARIFY)*/

        for (int i = 0; i < 7; i++) {
            sil.getSegment()[i] = null;
        }
        lsil.setIsLE(0);
        lsil.setForm("");
        setSil(lsil);
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW END Initialize SIL in class Lib.java");
            log.debug(logmess);
        }

        if (callerDebug) {
            logmess = String.format("CALLING -ll_connect- in Lib.java. CALLER: %s", routine);
            log.debug(logmess);

        }
        lconn = ds.ll_connect(app_name, lf, ef);
        setConn(lconn);

        

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW END Executing %s in class Lib.java", routine);
            log.debug(logmess);
        }
        if(lconn != null)
            ret=true;
        
        return ret;
    }
    
    public SilType resetSil(SilType sil) {
        String routine = Lib.class.getName() + "/initialize";
        String logmess = "";
        
        Connection lconn = null;

        boolean ret = false;

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in class Lib.java", routine);
            log.debug(logmess);
        }
        
        /*Init Sil */
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Initialize SIL in class Lib.java");
            log.debug(logmess);

        }
        sil.setInd_alt("");
        /* Note 7 is the number of segments in the structure silType (TO CLARIFY)*/

        for (int i = 0; i < 7; i++) {
            sil.getSegment()[i] = null;
        }
        sil.setIsLE(0);
        sil.setForm("");
        sil.setCodice("");
        
        
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW END Initialize SIL in class Lib.java");
            log.debug(logmess);
        }

        
        
        return sil;
    }

    @Override
    public void finalize(int stopServer) {
        String logmess = "";
        
        String routine = Lib.class.getName() + "/finalize";
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in class Lib.java", routine);
            log.debug(logmess);
        }
        ds.ll_disconnect(conn);
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in class Lib.java", routine);
            log.debug(logmess);
        }
        

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

}

package it.cnr.ilc.lemlat3app;

import it.cnr.ilc.lemlat3db.DbManager;
import it.cnr.ilc.lemlat3lib.core.Lemlat3CoreLib;
import it.cnr.ilc.lemlat3lib.structs.SilType;
import it.cnr.ilc.lemlat3utils.PropertyLoader;
import java.sql.Connection;
import java.util.Properties;
import org.apache.log4j.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Main class, just to play around
 *
 * @author riccardodelgratta
 */
public class Main {

    static final String CLASS_NAME = Main.class.getName();

    /*
    database properties
     */
    private static String HOST = "host";
    private static String USER = "user";
    private static String PASSWD = "passwd";
    private static String DB = "db";
    private static String PORT = "port";
    private static String APP_DEFAULT_NAME = "app_default_name";
    private static String DEBS = "debugsDim";
    private static String INITVAL = "initval";

    /*
    debug properties
     */
    private static boolean sqlDebug; //1
    private static boolean flowDebug; //2
    private static boolean valueDebug; //7
    private static boolean deepFlowDebug; //3
    private static boolean printSplash;
    private static boolean callerDebug; //4
    private static boolean analysisDebug; //5
    private static boolean printStructDebug;//6
    private static int printFormatted;
    private static boolean debugJson; //8
    private static boolean useInPipe; //10
    private static boolean debug; //0
    private static boolean operationDebug; //9;

    /*
    logger init
     */
    static Logger log = Logger.getLogger(CLASS_NAME);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String routine = CLASS_NAME + "/main routine";
        String logmess = "";
        Boolean[] debugs;//= new Boolean[0];
        Connection conn = null;

        /*
    DbManager
         */
        DbManager dbManager;
        
        /**
         * lemlat3 core libs
         */
        Lemlat3CoreLib lemlat;
        
        /**
         * siltype 
         */
        SilType sil;

        logmess = String.format("Loading property file and assigning values. %s", routine);

        log.info(logmess);

        PropertyLoader propLoad = new PropertyLoader("/lemlat3.properties");
        Properties props = propLoad.propertyLoader();
        HOST = propLoad.getPropertyAsString(props, HOST);
        USER = propLoad.getPropertyAsString(props, USER);
        PASSWD = propLoad.getPropertyAsString(props, PASSWD);
        DB = propLoad.getPropertyAsString(props, DB);
        APP_DEFAULT_NAME = propLoad.getPropertyAsString(props, APP_DEFAULT_NAME);
        INITVAL = propLoad.getPropertyAsString(props, INITVAL);

        debug =propLoad.getPropertyAsBoolean(props, "debug");
        if (debug) {
            logmess = String.format("Property 'host ' with value -%s- %s", HOST, routine);
            log.info(logmess);
            logmess = String.format("Property 'user ' with value -%s- %s", USER, routine);
            log.info(logmess);
            logmess = String.format("Property 'db ' with value -%s- %s", DB, routine);
            log.info(logmess);

            logmess = String.format("CALLING 'initDebugs ' %s", routine);
            log.info(logmess);
        }
        debugs = initDebugs(propLoad);
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

//        callerDebug = propLoad.getPropertyAsBoolean(props, "callerDebug");
//        operationDebug = propLoad.getPropertyAsBoolean(props, "operationDebug");
        if (callerDebug) {
            logmess = String.format("CALLING db_connect. Caller %s ", routine);
            log.info(logmess);
        }
        if (operationDebug) {
            logmess = String.format("OPERATIONAL Init DbManager. Caller %s ", routine);
            log.info(logmess);
        }
        dbManager = new DbManager();

        if (operationDebug) {
            logmess = String.format("OPERATIONAL Connecting to database %s .... Caller %s ", DB, routine);
            log.info(logmess);
        }

        conn = dbManager.db_connect(HOST, DB, USER, PASSWD, APP_DEFAULT_NAME);
        // start operation from here //
        if (conn != null) {
            if (operationDebug) {
                logmess = String.format("OPERATIONAL Iniztialize sil structure.... Caller %s ", routine);
                log.info(logmess);
            }
            sil=new SilType(INITVAL);
            if (deepFlowDebug) {
                logmess = String.format("DEEPFLOW Checking initialized sil structure: the form is -%s- Caller %s ", sil.getForm(),routine);
                log.info(logmess);
            }
            
            
            if (operationDebug) {
                logmess = String.format("OPERATIONAL Iniztialize lemlat core libs.... Caller %s ", routine);
                log.info(logmess);
            }
            lemlat=new Lemlat3CoreLib(conn,  debugs);
            if (callerDebug) {
                logmess = String.format("CALLING db_connect. Caller %s ", routine);
                log.info(logmess);
            }
        }

        if (operationDebug) {
            logmess = String.format("OPERATIONAL Disconnecting from database %s .... Caller %s ", DB, routine);
            log.info(logmess);
        }

        dbManager.db_disconnect(dbManager.getConn());

    }

    private static Boolean[] initDebugs(PropertyLoader propLoad) {
        Properties props = propLoad.propertyLoader();
        int debugsDim = propLoad.getPropertyAsInt(props, DEBS);
        boolean debug; //0
        boolean sqlDebug; //1
        boolean flowDebug; //2
        boolean deepFlowDebug; //3
        boolean callerDebug; //4
        boolean analysisDebug; //5
        boolean printStructDebug;//6
        boolean valueDebug; //7
        boolean debugJson; //8
        boolean operationDebug; //9;
        boolean useInPipe; //10

        Boolean[] temp = new Boolean[debugsDim];

        debug = propLoad.getPropertyAsBoolean(props, "debug");
        temp[0] = debug;

        sqlDebug = propLoad.getPropertyAsBoolean(props, "sqlDebug");
        temp[1] = sqlDebug;

        flowDebug = propLoad.getPropertyAsBoolean(props, "flowDebug");
        temp[2] = flowDebug;

        deepFlowDebug = propLoad.getPropertyAsBoolean(props, "deepFlowDebug");
        temp[3] = deepFlowDebug;

        callerDebug = propLoad.getPropertyAsBoolean(props, "callerDebug");
        temp[4] = callerDebug;

        analysisDebug = propLoad.getPropertyAsBoolean(props, "analysisDebug");
        temp[5] = analysisDebug;

        printStructDebug = propLoad.getPropertyAsBoolean(props, "printStructDebug");
        temp[6] = printStructDebug;

        valueDebug = propLoad.getPropertyAsBoolean(props, "valueDebug");
        temp[7] = valueDebug;

        debugJson = propLoad.getPropertyAsBoolean(props, "debugJson");
        temp[8] = debugJson;

        operationDebug = propLoad.getPropertyAsBoolean(props, "operationDebug");
        temp[9] = operationDebug;

        useInPipe = propLoad.getPropertyAsBoolean(props, "useInPipe");
        temp[10] = useInPipe;

        return temp;
    }

}

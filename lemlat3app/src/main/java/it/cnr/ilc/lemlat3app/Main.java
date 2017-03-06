package it.cnr.ilc.lemlat3app;

import it.cnr.ilc.lemlat3db.DbManager;
import it.cnr.ilc.lemlat3utils.PropertyLoader;
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
    private static String APP_DEFAULT_NAME="app_default_name";

    /*
    debug properties
     */
    private static boolean sqlDebug;
    private static boolean flowDebug;
    private static boolean valueDebug;
    private static boolean deepFlowDebug;
    private static boolean printSplash;
    private static boolean callerDebug;
    private static boolean analysisDebug;
    private static boolean printStructDebug;
    private static int printFormatted;
    private static boolean debugJson;
    private static boolean useInPipe;
    private static boolean debug;
    private static boolean operationDebug;

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
        
        /*
    DbManager
         */
        DbManager dbManager;

        logmess = String.format("Loading property file and assigning values. %s", routine);

        log.info(logmess);

        PropertyLoader propLoad = new PropertyLoader("/lemlat3.properties");
        Properties props = propLoad.propertyLoader();
        HOST = propLoad.getPropertyAsString(props, HOST);
        USER = propLoad.getPropertyAsString(props, USER);
        PASSWD = propLoad.getPropertyAsString(props, PASSWD);
        DB = propLoad.getPropertyAsString(props, DB);
        APP_DEFAULT_NAME = propLoad.getPropertyAsString(props, APP_DEFAULT_NAME);

        debug = propLoad.getPropertyAsBoolean(props, "debug");
        if (debug) {
            logmess = String.format("Property 'host ' with value -%s- %s", HOST, routine);
            log.info(logmess);
            logmess = String.format("Property 'user ' with value -%s- %s", USER, routine);
            log.info(logmess);
            logmess = String.format("Property 'db ' with value -%s- %s", DB, routine);
            log.info(logmess);
        }

        callerDebug = propLoad.getPropertyAsBoolean(props, "callerDebug");
        operationDebug = propLoad.getPropertyAsBoolean(props, "operationDebug");
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
            logmess = String.format("OPERATIONAL Connecting to database %s .... Caller %s ", DB,routine);
            log.info(logmess);
        }
        dbManager.db_connect(HOST, DB, USER, PASSWD, APP_DEFAULT_NAME);
        
        if (operationDebug) {
            logmess = String.format("OPERATIONAL Disconnecting from database %s .... Caller %s ", DB,routine);
            log.info(logmess);
        }
        dbManager.db_disconnect(dbManager.getConn());
        

    }

}

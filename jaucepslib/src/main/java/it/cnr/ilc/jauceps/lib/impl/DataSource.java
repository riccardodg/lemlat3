/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl;

import it.cnr.ilc.jauceps.lib.headers.ADataSource;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.Logger;

/**
 * <p>
 * PORTING</p>
 * <p>
 * porting of mysqlUtils.c</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;F
 */
public class DataSource extends ADataSource {

    Vars vars = new Vars();
    private final boolean sqlDebug = vars.isSqlDebug();
    private final boolean flowDebug = vars.isFlowDebug();
    private final boolean valueDebug = vars.isValueDebug();
    private final boolean deepFlowDebug = vars.isDeepFlowDebug();
    private final boolean printSplash = vars.isPrintSplash();
    private final boolean callerDebug = vars.isCallerDebug();
    private final boolean analysisDebug = vars.isAnalysisDebug();
    private final boolean printStructDebug = vars.isPrintStructDebug();
    private final int printFormatted = vars.getPrintFormatted();
    private final boolean debugJson = vars.isDebugJson();
    private final boolean useInPipe = vars.isUseInPipe();

    private Connection conn = null;

    private final PrintStream errorFile = null;
    private final PrintStream logFile = null;

    int loglevel = 0;
    /* only info */
    static final String CLASS_NAME = DataSource.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

    @Override
    public Connection ll_connect(String app_name, PrintStream lf, PrintStream ef) {

        String routine = DataSource.class.getName() + "/ll_connect";
        String logmess = "";
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in class DataSource.java", routine);
            log.debug(logmess);
        }
        if(conn==null)
            conn = db_connect(app_name, lf, ef);
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in class DataSource.java. Connection Id -%s-", routine, conn.toString());
            log.debug(logmess);
        }

        return conn;
    }

    @Override
    public boolean ll_disconnect(Connection db) {
        boolean stopServer = false;
        stopServer = db_disconnect(db);
        return stopServer;
    }

    @Override
    public ResultSet db_do_query(Connection db, String query) {
        return null;

    }

    @Override
    public Integer first_row(Connection db, String query, ResultSet db_res) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer next_row(ResultSet db_res) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * A pointer to the current token which represents the connection of the
     * application to the database
     *
     * @param app_name Name of the application
     * @param lf log file
     * @param ef error file, usually standard output
     * @return a pointer to the connection
     */
    private Connection db_connect(String app_name, PrintStream lf, PrintStream ef) {
        String connStr = "jdbc:mysql://" + host + "/" + database + "?" + "user=" + user + "&password=" + passwd;
        String routine = DataSource.class.getName() + "/db_connect";
        String logmess = "";
        if (conn == null) {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                if (conn == null) {
                    conn = DriverManager
                            .getConnection(connStr);
                }

            } catch (SQLException | ClassNotFoundException sqle) {
                logmess = app_name + " - " + routine + " " + sqle.getMessage();
                log.fatal(logmess);
                System.exit((-1));

            }
        } else {
            System.err.println("XXXCONN " + conn);
        }
        return conn;
    }

    private boolean db_disconnect(Connection db) {
        String routine = DataSource.class.getName() + "/db_disconnect";
        String logmess = "";
        boolean stopServer = false;
        if (db != null) {
            try {
                db.close();
                stopServer = true;
            } catch (SQLException sqle) {

                logmess = routine + " " + sqle.getMessage();
                log.fatal(logmess);

            }

        }
        return stopServer;
    }

}

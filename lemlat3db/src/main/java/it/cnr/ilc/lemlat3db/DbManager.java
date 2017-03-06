/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lemlat3db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.log4j.Logger;

/**
 * This class contains methods to access the database
 *
 * @author riccardodelgratta
 */
public class DbManager {

    static final String CLASS_NAME = DbManager.class.getName();
    /*
    logger init
     */
    static Logger log = Logger.getLogger(CLASS_NAME);

    private Connection conn = null;

    /**
     * void constructor
     */
    public DbManager() {
    }

    /**
     * A pointer to the current token which represents the connection of the
     * application to the database
     *
     * @param host the host
     * @param database the database
     * @param user the user
     * @param passwd the password
     * @param app_name Name of the application
     * @return a pointer to the connection
     */
    public Connection db_connect(String host, String database, String user, String passwd, String app_name) {
        String connStr = "jdbc:mysql://" + host + "/" + database + "?" + "user=" + user + "&password=" + passwd;
        String routine = CLASS_NAME + "/db_connect";
        String logmess = "";
        if (getConn() == null) {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                if (getConn() == null) {
                    setConn(DriverManager
                            .getConnection(connStr));
                }

            } catch (SQLException | ClassNotFoundException sqle) {
                logmess = app_name + " - " + routine + " " + sqle.getMessage();
                log.fatal(logmess);
                System.exit((-1));

            }
        } else {
            System.err.println("XXXCONN " + getConn());
        }
        return getConn();
    }

    /**
     * Disconnect from the database
     *
     * @param db the connection to the database
     * @return true is disconnected
     */
    public boolean db_disconnect(Connection db) {
        String routine = CLASS_NAME + "/db_disconnect";
        String logmess = "";
        boolean stopServer = false;
        if (db != null) {
            try {
                db.close();
                stopServer = true;
                setConn(null);
            } catch (SQLException sqle) {
                logmess = routine + " " + sqle.getMessage();
                log.fatal(logmess);
            }

        }

        return stopServer;
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

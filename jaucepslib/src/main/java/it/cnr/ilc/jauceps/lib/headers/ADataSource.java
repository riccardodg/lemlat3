/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.headers;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 * <p>PORTING</p>
 * <p>porting of mysqlUtils.h</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public abstract class ADataSource {
    
    /* Connection parameters */ // NEED TO MOVE IN A FILE
    public final String host = "localhost";
    public final String user = "auceps";
    public final String passwd = "auceps";
    public final String database = "lemlat_db";

   

    /**
     * A pointer to the current token which represents the connection of the
     * application to the database
     *
     * @param app_name Name of the application
     * @param lf log file
     * @param ef error file, usually standard output
     * @return a pointer to the connection
     */
    public abstract Connection ll_connect(String app_name,  PrintStream lf, PrintStream ef);

    /**
     * Disconnect from the database. Use the pointer to the current connection.
     *
     * @param db The current connection
     * @return true if correctly disconnected
     */
    public abstract boolean ll_disconnect(Connection db);

    /**
     * Execute the query <code>query</code>
     *
     * @param db the current connection
     * @param query the query to execute
     * @return the resultset
     */
    public abstract ResultSet db_do_query(Connection db, String query);

    /**
     * Identifies the first row of the dataset. WRT the corresponding C function
     * only the resultset is needed
     *
     * @param db the current connection
     * @param query the query to execute
     * @param db_res the resultset
     * @return 0 if something goes bad; 1 for the first row
     */
    public abstract Integer first_row(Connection db, String query, ResultSet db_res);

    /**
     * The next row in the dataset.WRT the corresponding C function
     * only the resultset is needed
     *
     * @param db_res a pointer to a MYSQL_RES structure
     * @return 1 if the dataset has new rows. 0 otherwise
     */
    public abstract Integer next_row(ResultSet db_res);
    
}

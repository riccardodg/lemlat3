/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.headers;

import java.io.PrintStream;

/**
 * <p>
 * PORTING</p>
 * <p>
 * Porting of part of aucepsLIB_alpha.h. Only initialize and finalize methods
 * are ported here<p>
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public abstract class ALib {

    public final String APP_DEFAULT_NAME = "JAUCEPS_ALPHA_CLIENT";

     /**
     * Void constructor
     */
    public ALib() {
    }

    /**
     * The init of the application.
     * <ol>
     * <li>Configure the starting SIL structure;</li>
     * <li>Connect to the database</li>
     * </ol>
     *
     * @param app_name the name of the application
     * @param lf log file
     * @param ef error file, usually standard output
     * @return true if everything is fine
     */
    public abstract boolean initialize(String app_name, PrintStream lf, PrintStream ef);

    /**
     * Release the memory and stops the server
     *
     * @param stopServer 1 to stop
     */
    public abstract void finalize(int stopServer);

}

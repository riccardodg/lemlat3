/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl.table.query;

import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabEAGLESDefinition.C01;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabEAGLESDefinition.C02;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabEAGLESDefinition.C03;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabEAGLESDefinition.CODLEM;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabEAGLESDefinition.CODLES;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabEAGLESDefinition.TAB_EAGLES;
import it.cnr.ilc.jauceps.lib.headers.table.query.ATabEaglesQuery;
import it.cnr.ilc.jauceps.lib.impl.Vars;
import it.cnr.ilc.jauceps.lib.impl.table.Tab3Eagles;
import it.cnr.ilc.jauceps.lib.structs.THREE_EAGLES_MODE;
import static it.cnr.ilc.jauceps.lib.structs.THREE_EAGLES_MODE.BY_CODLEM;
import static it.cnr.ilc.jauceps.lib.structs.THREE_EAGLES_MODE.BY_CODLES;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * <P>
 * PORTING</P>
 * <p>
 * porting of query_table_EAGLES_alpha.c</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabEaglesQuery extends ATabEaglesQuery{
    /**
     * Constructor
     * @param conn the connection to use
     */
    public TabEaglesQuery(Connection conn) {
        super(conn);
    }
    
    static final String CLASS_NAME = TabEaglesQuery.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

    private Statement statement = null;
    private ResultSet resultSet = null;
    private List<Tab3Eagles> tabs = new ArrayList<>();
   

    private String codlem, codles;

    Vars vars = new Vars();
    private final boolean sqlDebug = vars.isSqlDebug();
    private final boolean flowDebug = vars.isFlowDebug();
    private final boolean deepFlowDebug = vars.isDeepFlowDebug();
    
    @Override
    public List<Tab3Eagles> get3EaglesSet(String cod2search, THREE_EAGLES_MODE mode) {
        String routine = CLASS_NAME + "/get3EaglesSet";
        String logmess = "";
        String selectRec = "", sel = "";

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabEaglesQuery.java", routine);
            log.debug(logmess);
        }
        switch (mode) {
            case BY_CODLEM:
                setCodlem(cod2search);
                sel = "SELECT  %s,%s, %s ,%s"
                        + " FROM %s WHERE (%s=\'%s\') LIMIT 1";
                selectRec = String.format(sel,
                        CODLEM, C01, C02, C03, TAB_EAGLES, CODLEM, cod2search);
                break;
            case BY_CODLES: 
                setCodlem("unk");
                sel = "SELECT  %s,%s, %s ,%s"
                        + " FROM %s WHERE (%s=\'%s\') LIMIT 1";
                selectRec = String.format(sel,
                        CODLEM, C01, C02, C03, TAB_EAGLES,  CODLES, cod2search);
                break;
        }

        if (sqlDebug) {
            logmess = String.format("SQL Executing %s in TabEaglesQuery.java with query: %s", routine, selectRec);
            log.debug(logmess);
        }
        try {
            
            statement = getConn().createStatement();
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery(selectRec);
            tabs = loopOverRS(resultSet);
            

        } catch (Exception e) {
            logmess = String.format("FATAL SQL Error in %s. Message from DB: %s. Qyery: %s", routine, e.getMessage(), selectRec);
            log.fatal(logmess);
            System.exit(-1);
        }

        if (sqlDebug) {
            logmess = String.format("LQS Executing %s in TabEaglesQuery.java with  query: %s", routine, selectRec);
            log.debug(logmess);
        }
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabEaglesQuery.java", routine);
            log.debug(logmess);
        }
        return tabs;

    }

    /**
     * This function creates N @see Tab3Eagles classes
     *
     * @param rs the resultset to loop over
     * @return
     * @throws SQLException
     */
    private List<Tab3Eagles> loopOverRS(ResultSet rs) throws SQLException {
        List<Tab3Eagles> tabs = new ArrayList<>();
        String codlem = "";
        String logmess = "";
        String routine = CLASS_NAME + "/get3EaglesSet-(loopOverRS)-";

        String c01, c02, c03 = "";
        int l = 0;
        while (rs.next()) {
            codlem = rs.getString(CODLEM);
            c01 = rs.getString(C01);
            c02 = rs.getString(C02);
            c03 = rs.getString(C03);

            tabs.add(new Tab3Eagles(codlem, c01, c02, c03));
            l++;
        }
        if (l == 0) {
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW 0 record in %s in TabEaglesQuery.java: set codes to '-'", routine);
                log.debug(logmess);
            }
            codlem = getCodlem();
            tabs.add(new Tab3Eagles(codlem, "-", "-", "-"));
        }

        return tabs;
    }

    
    

    /**
     * @return the codlem
     */
    public String getCodlem() {
        return codlem;
    }

    /**
     * @return the codles
     */
    public String getCodles() {
        return codles;
    }

    /**
     * @param codlem the codlem to set
     */
    public void setCodlem(String codlem) {
        this.codlem = codlem;
    }

    /**
     * @param codles the codles to set
     */
    public void setCodles(String codles) {
        this.codles = codles;
    }
    
}
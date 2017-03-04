/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl.table.query;

import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabCodMorfDescrDefinition.FIELD_DESCR;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabCodMorfDescrDefinition.FIELD_POS;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabCodMorfDescrDefinition.TAB_CODMORF_NAME;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabCodMorfDescrDefinition.VALUE;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabCodMorfDescrDefinition.VALUE_DESCR;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabLemmaEndingDefinition.CUR_LEMMA;
import it.cnr.ilc.jauceps.lib.headers.table.query.ATabCodMorfQuery;
import it.cnr.ilc.jauceps.lib.impl.Vars;
import it.cnr.ilc.jauceps.lib.impl.table.TabCodMorfDescr;
import it.cnr.ilc.jauceps.lib.impl.table.TabLemmaEnding;
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
 * porting of porting of query_table_LEMMAENDING_alpha.c</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class TabCodMorfQuery extends ATabCodMorfQuery {

    static final String CLASS_NAME = TabCodMorfQuery.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

    private Statement statement = null;
    private ResultSet resultSet = null;
    private List<TabCodMorfDescr> tabs = new ArrayList<>();

    Vars vars = new Vars();
    private final boolean sqlDebug = vars.isSqlDebug();
    private final boolean flowDebug = vars.isFlowDebug();
    private final boolean deepFlowDebug = vars.isDeepFlowDebug();

    /**
     * Constructor
     *
     * @param conn the connection to use
     */
    public TabCodMorfQuery(Connection conn) {
        super(conn);
    }

    //@Override
    /**
     * 
     * @param pos
     * @param cod
     * @return 
     */
    public List<TabCodMorfDescr> getCodMorfDescrSet(int pos, String cod) {
        String routine = CLASS_NAME + "/getCodMorfDescrSet";
        String logmess = "";
        String selectRec = "", sel = "";

        if ((flowDebug || deepFlowDebug)&& false) {
            logmess = String.format("DEEPFLOW START Executing %s in TabCodMorfQuery.java. Parameters in_str -%s- cod -%s-", routine, pos, cod);
            log.debug(logmess);
        }

        sel = "SELECT %s,%s FROM %s WHERE %s=%d AND %s=LOWER('%s')";

        selectRec = String.format(sel,
                FIELD_DESCR, VALUE_DESCR, TAB_CODMORF_NAME,
                FIELD_POS, pos, VALUE, cod);

        if ((sqlDebug)&&false) {
            logmess = String.format("SQL Executing %s in TabCodMorfQuery.java with query: %s", routine, selectRec);
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

        if ((sqlDebug)&&false) {
            logmess = String.format("LQS Executing %s in TabCodMorfQuery.java with  query: %s", routine, selectRec);
            log.debug(logmess);
        }
         if ((flowDebug || deepFlowDebug)&& false) {
            logmess = String.format("DEEPFLOW STOP Executing %s in TabCodMorfQuery.java", routine);
            log.debug(logmess);
        }
        return tabs;

    }

    /**
     * This function creates N @see TabLemmaEnding classes
     *
     * @param rs the resultset to loop over
     * @return
     * @throws SQLException
     */
    private List<TabCodMorfDescr> loopOverRS(ResultSet rs) throws SQLException {
        List<TabCodMorfDescr> tabs = new ArrayList<>();
        String field_descr = "";
        String value_descr = "";
        String logmess = "";
        String routine = CLASS_NAME + "/loopOverRS-(loopOverRS)-";

        int l = 0;
        while (rs.next()) {
            field_descr = rs.getString(1);
            value_descr = rs.getString(2);

            tabs.add(new TabCodMorfDescr(field_descr, value_descr));
            l++;
        }

        return tabs;
    }

}
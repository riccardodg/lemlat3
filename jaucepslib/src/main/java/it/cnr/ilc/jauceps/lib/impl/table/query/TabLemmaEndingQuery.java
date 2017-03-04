/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl.table.query;

import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabLemmaEndingDefinition.CODLES;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabLemmaEndingDefinition.CUR_LEMMA;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabLemmaEndingDefinition.IN_ENDING;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabLemmaEndingDefinition.OUT_ENDING;
import static it.cnr.ilc.jauceps.lib.headers.table.definition.TabLemmaEndingDefinition.TAB_LEMEMDING_NAME;
import it.cnr.ilc.jauceps.lib.headers.table.query.ATabLemmaEndingQuery;
import it.cnr.ilc.jauceps.lib.impl.Vars;
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
public class TabLemmaEndingQuery extends ATabLemmaEndingQuery {

    static final String CLASS_NAME = TabLemmaEndingQuery.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

    private Statement statement = null;
    private ResultSet resultSet = null;
    private List<TabLemmaEnding> tabs = new ArrayList<>();

    Vars vars = new Vars();
    private final boolean sqlDebug = vars.isSqlDebug();
    private final boolean flowDebug = vars.isFlowDebug();
    private final boolean deepFlowDebug = vars.isDeepFlowDebug();

    private String lemma = "";

    /**
     * Constructor
     *
     * @param conn the connection to use
     */
    public TabLemmaEndingQuery(Connection conn) {
        super(conn);
    }

    @Override
    public String build_lemma() {
        return getLemma();
    }

    //@Override
    public List<TabLemmaEnding> getBuildLemmaSet(String in_str, String cod) {
        String routine = CLASS_NAME + "/getBuildLemmaSet";
        String logmess = "";
        String selectRec = "", sel = "";
        setLemma(in_str);

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in TabLemmaEndingQuery.java. Parameters in_str -%s- cod -%s-", routine, in_str, cod);
            log.debug(logmess);
        }

        //CONCAT(SUBSTRING('ros',1,(LENGTH('ros')-LENGTH(in_ending))),out_ending) as cur_lemma
        sel = "SELECT CONCAT(SUBSTRING('%s',1,(LENGTH('%s')-LENGTH(%s))),%s) as %s FROM %s WHERE %s='%s' "
                + "AND %s=RIGHT('%s',LENGTH(%s)) "
                + "ORDER BY LENGTH(%s) DESC LIMIT 1";

        selectRec = String.format(sel,
                in_str, in_str, IN_ENDING,
                OUT_ENDING, CUR_LEMMA, TAB_LEMEMDING_NAME, CODLES,
                cod, IN_ENDING, in_str, IN_ENDING, IN_ENDING);

//        sel = "SELECT CONCAT(INSERT('%s',LENGTH('%s')-LENGTH(%s)+1,"
//                + "LENGTH(%s),%s), %s) as %s FROM %s WHERE %s='%s' "
//                + "AND %s=RIGHT('%s',LENGTH(%s)) "
//                + "ORDER BY LENGTH(%s) DESC LIMIT 1";
//       
//        selectRec = String.format(sel,
//                in_str, in_str, IN_ENDING,
//                IN_ENDING, OUT_ENDING, OUT_ENDING,CUR_LEMMA, TAB_LEMEMDING_NAME, CODLES,
//                cod, IN_ENDING, in_str, IN_ENDING, IN_ENDING);
//        sel = "SELECT INSERT('%s',LENGTH('%s')-LENGTH(%s)+1,"
//                + "LENGTH(%s),%s) as %s FROM %s WHERE %s='%s' "
//                + "AND %s=RIGHT('%s',LENGTH(%s)) "
//                + "ORDER BY LENGTH(%s) DESC LIMIT 1";
//       
//        selectRec = String.format(sel,
//                in_str, in_str, IN_ENDING,
//                IN_ENDING, OUT_ENDING, CUR_LEMMA, TAB_LEMEMDING_NAME, CODLES,
//                cod, IN_ENDING, in_str, IN_ENDING, IN_ENDING);
//"SELECT INSERT(\'%s\',LENGTH(\'%s\')-LENGTH(%s)+1,LENGTH(%s),%s) \
        //FROM %s WHERE %s=\'%s\' AND %s=RIGHT(\'%s\',LENGTH(%s)) \
        //ORDER BY LENGTH(%s) DESC LIMIT 1",
        /*SELECT in_str, in_str, IN_ENDING, IN_ENDING, OUT_ENDING,
         // /*FROM*///TAB_LEMEMDING_NAME,
        // /*WHERE*/CODLES, cod, IN_ENDING, in_str, IN_ENDING,
        // /*ORDER BY*/IN_ENDING);
        if (sqlDebug) {
            logmess = String.format("SQL Executing %s in getBuildLemmaSet.java with query: %s", routine, selectRec);
            log.debug(logmess);
        }
        try {

            statement = getConn().createStatement();
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery(selectRec);
            tabs = loopOverRS(in_str, resultSet);

        } catch (Exception e) {
            logmess = String.format("FATAL SQL Error in %s. Message from DB: %s. Qyery: %s", routine, e.getMessage(), selectRec);
            log.fatal(logmess);
            System.exit(-1);
        }

        if (sqlDebug) {
            logmess = String.format("LQS Executing %s in getBuildLemmaSet.java with  query: %s", routine, selectRec);
            log.debug(logmess);
        }
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in getBuildLemmaSet.java", routine);
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
    private List<TabLemmaEnding> loopOverRS(String in_str, ResultSet rs) throws SQLException {
        List<TabLemmaEnding> tabs = new ArrayList<>();
        String cur_lemma = "";
        String logmess = "";
        String routine = CLASS_NAME + "/getBuildLemmaSet-(loopOverRS)-";

        int l = 0;
        while (rs.next()) {
            cur_lemma = rs.getString(1);

            tabs.add(new TabLemmaEnding(cur_lemma));
            l++;
        }

        if (l > 0) {
            setLemma(cur_lemma);
        }

        return tabs;
    }

    /**
     * @return the lemma
     */
    public String getLemma() {
        return lemma;
    }

    /**
     * @param lemma the lemma to set
     */
    public void setLemma(String lemma) {
        this.lemma = lemma;
    }

}

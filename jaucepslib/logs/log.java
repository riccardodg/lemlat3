cd /opt/java/app/jlatmorphV2/jaucepsapp; JAVA_HOME=/opt/java/jdk1.8.0_31 /opt/java/netbeans-8.0.2/java/maven/bin/mvn "-Dexec.args=-Xmx4096m -Xms1024m -classpath %classpath it.cnr.ilc.jauceps.app.JAucepsApp +f /tmp/out_21" -Dexec.executable=/opt/java/jdk1.8.0_31/bin/java org.codehaus.mojo:exec-maven-plugin:1.2.1:exec
Running NetBeans Compile On Save execution. Phase execution is skipped and output directories of dependency projects (with Compile on Save turned on) will be used instead of their jar artifacts.
Scanning for projects...
                                                                        
------------------------------------------------------------------------
Building jaucepsapp 1.0-SNAPSHOT
------------------------------------------------------------------------

--- exec-maven-plugin:1.2.1:exec (default-cli) @ jaucepsapp ---
2016-01-22 15:49:49 DEBUG JAucepsApp:97 - DEEPFLOW START -it.cnr.ilc.jauceps.app.JAucepsApp/main-
2016-01-22 15:49:49 DEBUG JAucepsApp:108 - CALLING -startroutine- in Interact.java. CALLER: it.cnr.ilc.jauceps.app.JAucepsApp/main
2016-01-22 15:49:49 DEBUG Interact:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Interact/startroutine in class Interact.java
2016-01-22 15:49:49 DEBUG Interact:127 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Interact/startroutine in class Interact.java
2016-01-22 15:49:49 DEBUG JAucepsApp:135 - CALLING -initialize- in Lib.java. CALLER: it.cnr.ilc.jauceps.app.JAucepsApp/main
2016-01-22 15:49:49 DEBUG Lib:73 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Lib/initialize in class Lib.java
2016-01-22 15:49:49 DEBUG Lib:81 - DEEPFLOW START Initialize SIL in class Lib.java
2016-01-22 15:49:49 DEBUG Lib:95 - DEEPFLOW END Initialize SIL in class Lib.java
2016-01-22 15:49:49 DEBUG Lib:100 - CALLING -ll_connect- in Lib.java. CALLER: it.cnr.ilc.jauceps.lib.impl.Lib/initialize
2016-01-22 15:49:49 DEBUG DataSource:57 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.DataSource/ll_connect in class DataSource.java
2016-01-22 15:49:49 DEBUG DataSource:62 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.DataSource/ll_connect in class DataSource.java. Connection Id -com.mysql.jdbc.JDBC4Connection@759ebb3d-
2016-01-22 15:49:49 DEBUG Lib:110 - DEEPFLOW END Executing it.cnr.ilc.jauceps.lib.impl.Lib/initialize in class Lib.java
2016-01-22 15:49:49 DEBUG JAucepsApp:149 - VALUES SilId: -RunID_2016.01.22.15.49.49- in -it.cnr.ilc.jauceps.app.JAucepsApp/main-
2016-01-22 15:49:49 DEBUG JAucepsApp:151 - VALUES connection: -com.mysql.jdbc.JDBC4Connection@759ebb3d- in -it.cnr.ilc.jauceps.app.JAucepsApp/main-
2016-01-22 15:49:49 DEBUG JAucepsApp:158 - CALLING -prompt- in Interact.java. CALLER: it.cnr.ilc.jauceps.app.JAucepsApp/main
2016-01-22 15:49:49 DEBUG Lib:128 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Lib/initialize in class Lib.java
2016-01-22 15:49:49 DEBUG Lib:134 - DEEPFLOW START Initialize SIL in class Lib.java
2016-01-22 15:49:49 DEBUG Lib:150 - DEEPFLOW END Initialize SIL in class Lib.java
2016-01-22 15:49:49 DEBUG Interact:139 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Interact/prompt in class Interact.java

>type the WORD-FORM you wish to analyze. end to exit
adnabam
2016-01-22 15:50:29 DEBUG Interact:172 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Interact/prompt in class Interact.java. Wordform: adnabam
2016-01-22 15:50:29 DEBUG InputFunctions:98 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.InputFunctions/silcall in InputFunctions.java
2016-01-22 15:50:29 DEBUG InputFunctions:109 - DEEPFLOW ****CHANGING wordform -adnabam- to lowercase
2016-01-22 15:50:29 DEBUG InputFunctions:114 - DEEPFLOW ****CHANGED wordform -adnabam- to lowercase
2016-01-22 15:50:29 DEBUG InputFunctions:120 - DEEPFLOW ****CHANGING wordform -adnabam- v-> u and j->i
2016-01-22 15:50:29 DEBUG InputFunctions:128 - DEEPFLOW ****CHANGED wordform -adnabam- v-> u and j->i
2016-01-22 15:50:29 DEBUG InputFunctions:134 - DEEPFLOW ****COPYING wordform adnabam to sil.form --
2016-01-22 15:50:29 DEBUG InputFunctions:141 - DEEPFLOW ****COPIED wordform adnabam to sil.form -adnabam-
2016-01-22 15:50:29 DEBUG InputFunctions:146 - CALLING initAnalyses in  RunAnalyses.java CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/silcall
2016-01-22 15:50:29 DEBUG RunAnalyses:68 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/initAnalyses in RunAnalyses.java with parameters: wordform -adnabam- alternative form -adnabam- nun of analysis 0
2016-01-22 15:50:29 DEBUG RunAnalyses:72 - DEEPFLOW ****COPYING forma_orig -adnabam- to analyses.in_form -null-
2016-01-22 15:50:29 DEBUG RunAnalyses:74 - DEEPFLOW ****COPYING forma_alt -adnabam- to analyses.alt_form -null-
2016-01-22 15:50:29 DEBUG RunAnalyses:80 - DEEPFLOW ****COPIED forma_orig -adnabam- to analyses.in_form -adnabam-
2016-01-22 15:50:29 DEBUG RunAnalyses:82 - DEEPFLOW ****COPIED forma_alt -adnabam- to analyses.alt_form -adnabam-
2016-01-22 15:50:29 DEBUG RunAnalyses:86 - DEEPFLOW ****ASSIGNING 0 to analyses.numAnalysis 0
2016-01-22 15:50:29 DEBUG RunAnalyses:92 - DEEPFLOW ****ASSIGNED 0 to analyses.numAnalysis 0
2016-01-22 15:50:29 DEBUG RunAnalyses:97 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/initAnalyses in RunAnalyses.java with parameters: wordforf -adnabam- alternative form -adnabam- nun of analysis 0
2016-01-22 15:50:29 DEBUG InputFunctions:165 - CALLING siln in  InputFunctions.java. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/silcall
2016-01-22 15:50:29 DEBUG InputFunctions:246 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln in InputFunctions.java
2016-01-22 15:50:29 DEBUG InputFunctions:252 - CALLING tabspfq_1.getSPFset in TabSpfQuery.java with parameters: form -adnabam- and SPF1 -0-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG TabSpfQuery:70 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java
2016-01-22 15:50:29 DEBUG TabSpfQuery:76 - START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java CASE SPF1
2016-01-22 15:50:29 DEBUG TabSpfQuery:107 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java with spf_n:0 and query: SELECT  segment, comp_cod  FROM tabspf WHERE segment=RIGHT('adnabam',LENGTH(segment))  AND (LEFT(comp_cod,1)='e' OR comp_cod='')  ORDER BY LENGTH(segment)
2016-01-22 15:50:29 DEBUG TabSpfQuery:124 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java with spf_n:0 and query: SELECT  segment, comp_cod  FROM tabspf WHERE segment=RIGHT('adnabam',LENGTH(segment))  AND (LEFT(comp_cod,1)='e' OR comp_cod='')  ORDER BY LENGTH(segment)
2016-01-22 15:50:29 DEBUG TabSpfQuery:129 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java
2016-01-22 15:50:29 DEBUG InputFunctions:267 - ****VALUES of getFirstListOfTabSpf  -1-
2016-01-22 15:50:29 DEBUG InputFunctions:270 - ****VALUES of getFirstListOfTabSpf is -1- LOOP SPF1 -1-
2016-01-22 15:50:29 DEBUG InputFunctions:323 - DEEPFLOW LOOP SPF1. Counters spf1 -0- spf2 -0- si -0- sf -0- sm_1 -0- sm_2 -0- isanySPF1 -true- isanySPF2 -false- isanySI -false- isanySF -false- isanySM1 -false- isanySM2 -false- travellingtabes.status -01-
2016-01-22 15:50:29 DEBUG InputFunctions:327 - DEEPFLOW ****ASSIGNING EOS to sil.segment[6] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:334 - DEEPFLOW ****ASSIGNED EOS to sil.segment[6] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -0- with value -null-
2016-01-22 15:50:29 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -1- with value -null-
2016-01-22 15:50:29 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -2- with value -null-
2016-01-22 15:50:29 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -3- with value -null-
2016-01-22 15:50:29 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -4- with value -null-
2016-01-22 15:50:29 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -5- with value -null-
2016-01-22 15:50:29 DEBUG InputFunctions:340 - ****VALUES IN LOOP getSPFset_1 Segment at index -6- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:346 - CALLING spferic in  it.cnr.ilc.jauceps.lib.impl.InputFunctions.Parameters form -adnabam-and spf1 -0- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG Sillib:84 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spferic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:91 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/spferic N chars 7 of sil.form adnabam on sil.rad_spfe 
2016-01-22 15:50:29 DEBUG Sillib:98 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/spferic N chars 7 of sil.form adnabam on sil.rad_spfe adnabam
2016-01-22 15:50:29 DEBUG Sillib:104 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spferic in Sillib.java. rad_spfe adnabam
2016-01-22 15:50:29 DEBUG InputFunctions:360 - CALLING tabspfq_2.getSPFset in TabSpfQuery.java with parameters: rad_spfe -adnabam- and SPF2 -1-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG TabSpfQuery:70 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java
2016-01-22 15:50:29 DEBUG TabSpfQuery:91 - START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java CASE SPF2
2016-01-22 15:50:29 DEBUG TabSpfQuery:107 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java with spf_n:1 and query: SELECT  segment, comp_cod  FROM tabspf WHERE segment=RIGHT('adnabam',LENGTH(segment))  AND (LEFT(comp_cod,1)!='e' OR comp_cod='') ORDER BY LENGTH(segment)
2016-01-22 15:50:29 DEBUG TabSpfQuery:124 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java with spf_n:1 and query: SELECT  segment, comp_cod  FROM tabspf WHERE segment=RIGHT('adnabam',LENGTH(segment))  AND (LEFT(comp_cod,1)!='e' OR comp_cod='') ORDER BY LENGTH(segment)
2016-01-22 15:50:29 DEBUG TabSpfQuery:129 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSpfQuery/getSPFset in TabSpfQuery.java
2016-01-22 15:50:29 DEBUG InputFunctions:375 - ****VALUES of getSecondListOfTabSpf  -1-
2016-01-22 15:50:29 DEBUG InputFunctions:378 - ****VALUES of getFirstListOfTabSpf is -1- LOOP SPF2 -1-
2016-01-22 15:50:29 DEBUG InputFunctions:429 - DEEPFLOW LOOP SPF2. Counters spf1 -0- spf2 -0- si -0- sf -0- sm_1 -0- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -false- isanySF -false- isanySM1 -false- isanySM2 -false- travellingtabes.status -012-
2016-01-22 15:50:29 DEBUG InputFunctions:433 - DEEPFLOW ****ASSIGNING EOS to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:440 - DEEPFLOW ****ASSIGNED EOS to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:447 - CALLING spfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_spfe -adnabam- and spf1 -0- and spf2 -0. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG Sillib:119 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spfric in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:124 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/spfric N chars 7 of sil.rad_spfe adnabam on sil.rad_spf 
2016-01-22 15:50:29 DEBUG Sillib:131 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/spfric N chars 7 of sil.rad_spfe adnabam on sil.rad_spf adnabam
2016-01-22 15:50:29 DEBUG Sillib:136 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/spfric in Sillib.java
2016-01-22 15:50:29 DEBUG InputFunctions:460 - DEEPFLOW ****ASSIGNING getSPF(SPF2) to sil.segment[5] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:467 - DEEPFLOW ****ASSIGNED getSPF(SPF2) to sil.segment[5] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -0- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -1- with value -null-
2016-01-22 15:50:29 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -2- with value -null-
2016-01-22 15:50:29 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -3- with value -null-
2016-01-22 15:50:29 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -4- with value -null-
2016-01-22 15:50:29 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -5- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:473 - ****VALUES IN LOOP getSPFset_2 Segment at index -6- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:479 - CALLING getSIset in TabSiQuery.java with parameters: rad_spf -adnabam-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG TabSiQuery:61 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java
2016-01-22 15:50:29 DEBUG TabSiQuery:72 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java with query: SELECT  segment, comp_cod  FROM tabsi WHERE segment=LEFT('adnabam',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-22 15:50:29 DEBUG TabSiQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java with  query: SELECT  segment, comp_cod  FROM tabsi WHERE segment=LEFT('adnabam',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-22 15:50:29 DEBUG TabSiQuery:93 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSiQuery/getSIset in TabSiQuery.java
2016-01-22 15:50:29 DEBUG InputFunctions:493 - ****VALUES of getListOfTabSI  -1-
2016-01-22 15:50:29 DEBUG InputFunctions:496 - ****VALUES of getListOfTabSI is -1- LOOP SI -1-
2016-01-22 15:50:29 DEBUG InputFunctions:546 - DEEPFLOW LOOP SI. Counters spf1 -0- spf2 -0- si -0- sf -0- sm_1 -0- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -false- isanySM1 -false- isanySM2 -false- travellingtabes.status -0123-
2016-01-22 15:50:29 DEBUG InputFunctions:551 - DEEPFLOW ****ASSIGNING EOS to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:558 - DEEPFLOW ****ASSIGNED EOS to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:565 - CALLING siric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_spf -adnabam- and spf1 -0- and spf2 -0 and si-0-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG Sillib:195 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/siric in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:199 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/siric N chars 0 of sil.rad_spf adnabam on sil.rad_si adnabam
2016-01-22 15:50:29 DEBUG Sillib:206 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/siric N chars 0 of sil.rad_spf adnabam on sil.rad_si adnabam
2016-01-22 15:50:29 DEBUG Sillib:210 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/siric in Sillib.java
2016-01-22 15:50:29 DEBUG InputFunctions:576 - DEEPFLOW ****ASSIGNING getSI to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:578 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:580 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:582 - DEEPFLOW ****ASSIGNING getRad_si to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -0- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -1- with value -adnabam-
2016-01-22 15:50:29 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -2- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -3- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -4- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -5- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:593 - ****VALUES IN LOOP getSIset Segment at index -6- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:599 - DEEPFLOW ****ASSIGNED getSI to sil.segment[0] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:601 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:603 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:605 - DEEPFLOW ****ASSIGNED getRad_si to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:610 - ****VALUES IN LOOP getSI Segment at index -0- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:610 - ****VALUES IN LOOP getSI Segment at index -1- with value -adnabam-
2016-01-22 15:50:29 DEBUG InputFunctions:610 - ****VALUES IN LOOP getSI Segment at index -2- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:610 - ****VALUES IN LOOP getSI Segment at index -3- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:610 - ****VALUES IN LOOP getSI Segment at index -4- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:610 - ****VALUES IN LOOP getSI Segment at index -5- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:610 - ****VALUES IN LOOP getSI Segment at index -6- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:616 - CALLING lemmi_ecc in -it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln- CALLER siln  with parameter sil.rad_si: adnabam
2016-01-22 15:50:29 DEBUG InputFunctions:1058 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc in InputFunctions.java with rad_si: adnabam
2016-01-22 15:50:29 DEBUG InputFunctions:1063 - DEEPFLOW ****COPYING rad_si (str) adnabam on sil.radical null
2016-01-22 15:50:29 DEBUG InputFunctions:1065 - DEEPFLOW ****ASSIGNING EOS to sil.ind_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-22 15:50:29 DEBUG InputFunctions:1067 - DEEPFLOW ****ASSIGNING EOS to sil.rad_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-22 15:50:29 DEBUG InputFunctions:1076 - DEEPFLOW ****COPIED rad_si (str) adnabam on sil.radical adnabam
2016-01-22 15:50:29 DEBUG InputFunctions:1078 - DEEPFLOW ****ASSIGNED EOS to sil.ind_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-22 15:50:29 DEBUG InputFunctions:1080 - DEEPFLOW ****ASSIGNED EOS to sil.rad_alt in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc
2016-01-22 15:50:29 DEBUG InputFunctions:1087 - CALLING getLEset with parameters rad_si: -adnabam- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc 
2016-01-22 15:50:29 DEBUG TabLeQuery:61 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java
2016-01-22 15:50:29 DEBUG TabLeQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java with query: SELECT les_id, codLE, lemma FROM tab_le WHERE lemma='adnabam'
2016-01-22 15:50:29 DEBUG TabLeQuery:88 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java with  query: SELECT les_id, codLE, lemma FROM tab_le WHERE lemma='adnabam'
2016-01-22 15:50:29 DEBUG TabLeQuery:92 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLeQuery/getLEset in TabLeQuery.java
2016-01-22 15:50:29 DEBUG InputFunctions:1101 - CALLING getLEset with parameters rad_si: -adnabam- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc 
2016-01-22 15:50:29 DEBUG InputFunctions:1105 - ****VALUES of getListOfTabLE  -0-
2016-01-22 15:50:29 DEBUG InputFunctions:1108 - ****VALUES of getListOfTabLE is -0-  LOOP ON TABLE -0-
2016-01-22 15:50:29 DEBUG InputFunctions:1245 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.InputFunctions/lemmi_ecc in InputFunctions.java with rad_si: adnabam
2016-01-22 15:50:29 DEBUG InputFunctions:628 - CALLING getSFset in TabSfQuery.java with parameters: rad_si -adnabam-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG TabSfQuery:113 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSfQuery.java
2016-01-22 15:50:29 DEBUG TabSfQuery:130 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSfQuery.java with query: SELECT  DISTINCT segment, LENGTH(segment) as lseg FROM tabsf WHERE segment=RIGHT('adnabam',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-22 15:50:29 DEBUG TabSfQuery:147 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSiQuery.java with  query: SELECT  DISTINCT segment, LENGTH(segment) as lseg FROM tabsf WHERE segment=RIGHT('adnabam',LENGTH(segment))  ORDER BY LENGTH(segment)
2016-01-22 15:50:29 DEBUG TabSfQuery:151 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSfQuery/getSFset in TabSfQuery.java
2016-01-22 15:50:29 DEBUG InputFunctions:642 - ****VALUES of getListOfTabSF  -5-
2016-01-22 15:50:29 DEBUG InputFunctions:645 - ****VALUES of getListOfTabSF is -5- ADDITIONAL LOOP SF -5-
2016-01-22 15:50:29 DEBUG InputFunctions:692 - DEEPFLOW LOOP SF. Counters spf1 -0- spf2 -0- si -0- sf -0- sm_1 -0- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -012320-
2016-01-22 15:50:29 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:701 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:713 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -adnabam- and spf1 -0- and spf2 -0 and si-0- and sf -0-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG Sillib:153 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:159 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 7 of sil.rad_si -adnabam- on sil.rad_sf --
2016-01-22 15:50:29 DEBUG Sillib:167 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 7 of sil.rad_si -adnabam- on sil.rad_sf -adnabam-
2016-01-22 15:50:29 DEBUG Sillib:172 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-22 15:50:29 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:725 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -1- with value -adnabam-
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -4- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -5- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getSF -- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:744 - DEEPFLOW ****ASSIGNED getRad_sf -adnabam- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:752 - CALLING analysis (1) with sf -0- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -adnabam- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-22 15:50:29 DEBUG RunAnalyses:264 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adnabam-
2016-01-22 15:50:29 DEBUG RunAnalyses:268 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -adnabam- on sil.radical -adnabam-
2016-01-22 15:50:29 DEBUG RunAnalyses:275 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -adnabam- on sil.radical -adnabam-
2016-01-22 15:50:29 DEBUG RunAnalyses:279 - CALLING getSAISet radical=-adnabam- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:284 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -adnabam-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-22 15:50:29 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adnabam',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-22 15:50:29 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adnabam',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-22 15:50:29 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:297 - ****VALUES of getSAIset  -3-
2016-01-22 15:50:29 DEBUG RunAnalyses:300 - ****VALUES of getListOfTabSAI is -3- ADDITIONAL LOOP SAI -3-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -0-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adnabam- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnabam on sil.rad_sai null
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d06- on sil.ind_alt 
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -ann- on sil.rad_alt 
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnabam on sil.rad_sai abam
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d06- on sil.ind_alt d06
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -ann- on sil.rad_alt annabam
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -annabam- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('annabam', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='annabam' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('annabam', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='annabam' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -1-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adnabam- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnabam on sil.rad_sai abam
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d06
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -adgn- on sil.rad_alt annabam
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnabam on sil.rad_sai abam
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -adgn- on sil.rad_alt adgnabam
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -adgnabam- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adgnabam', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adgnabam' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adgnabam', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adgnabam' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -2-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adnabam- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnabam on sil.rad_sai abam
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -agn- on sil.rad_alt adgnabam
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnabam on sil.rad_sai abam
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -agn- on sil.rad_alt agnabam
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -agnabam- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('agnabam', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='agnabam' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('agnabam', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='agnabam' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:374 - DEEPFLOW EXIT LOOP SAI. Counter sai -3- les -0- isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:387 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:389 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:397 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:399 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:404 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -adnabam- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adnabam', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adnabam' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adnabam', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adnabam' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:431 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:435 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adnabam-
2016-01-22 15:50:29 DEBUG InputFunctions:765 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -adnabam-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-22 15:50:29 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adnabam',LENGTH(segment))
2016-01-22 15:50:29 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adnabam',LENGTH(segment))
2016-01-22 15:50:29 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-22 15:50:29 DEBUG InputFunctions:779 - ****VALUES of getFirstListOfTabSM  -0-
2016-01-22 15:50:29 DEBUG InputFunctions:782 - ****VALUES of getFirstListOfTabSM is -0- LOOP SM1 -0-
2016-01-22 15:50:29 DEBUG InputFunctions:692 - DEEPFLOW LOOP SF. Counters spf1 -0- spf2 -0- si -0- sf -1- sm_1 -0- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -01232011111120-
2016-01-22 15:50:29 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:701 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:713 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -adnabam- and spf1 -0- and spf2 -0 and si-0- and sf -1-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG Sillib:153 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:159 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 6 of sil.rad_si -adnabam- on sil.rad_sf --
2016-01-22 15:50:29 DEBUG Sillib:167 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 6 of sil.rad_si -adnabam- on sil.rad_sf -adnaba-
2016-01-22 15:50:29 DEBUG Sillib:172 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-22 15:50:29 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:725 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -1- with value -adnaba-
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -4- with value -m-
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -5- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getSF -m- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:744 - DEEPFLOW ****ASSIGNED getRad_sf -adnaba- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:752 - CALLING analysis (1) with sf -1- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -adnaba- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-22 15:50:29 DEBUG RunAnalyses:264 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adnaba-
2016-01-22 15:50:29 DEBUG RunAnalyses:268 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -adnaba- on sil.radical -adnabam-
2016-01-22 15:50:29 DEBUG RunAnalyses:275 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -adnaba- on sil.radical -adnaba-
2016-01-22 15:50:29 DEBUG RunAnalyses:279 - CALLING getSAISet radical=-adnaba- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:284 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -adnaba-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-22 15:50:29 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adnaba',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-22 15:50:29 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adnaba',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-22 15:50:29 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:297 - ****VALUES of getSAIset  -3-
2016-01-22 15:50:29 DEBUG RunAnalyses:300 - ****VALUES of getListOfTabSAI is -3- ADDITIONAL LOOP SAI -3-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -0-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adnaba- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnaba on sil.rad_sai abam
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d06- on sil.ind_alt 
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -ann- on sil.rad_alt 
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnaba on sil.rad_sai aba
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d06- on sil.ind_alt d06
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -ann- on sil.rad_alt annaba
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -annaba- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('annaba', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='annaba' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('annaba', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='annaba' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -1-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adnaba- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnaba on sil.rad_sai aba
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d06
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -adgn- on sil.rad_alt annaba
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnaba on sil.rad_sai aba
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -adgn- on sil.rad_alt adgnaba
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -adgnaba- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adgnaba', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adgnaba' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adgnaba', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adgnaba' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -2-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adnaba- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnaba on sil.rad_sai aba
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -agn- on sil.rad_alt adgnaba
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnaba on sil.rad_sai aba
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -agn- on sil.rad_alt agnaba
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -agnaba- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('agnaba', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='agnaba' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('agnaba', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='agnaba' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:374 - DEEPFLOW EXIT LOOP SAI. Counter sai -3- les -0- isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:387 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:389 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:397 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:399 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:404 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -adnaba- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adnaba', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adnaba' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adnaba', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adnaba' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:431 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:435 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adnaba-
2016-01-22 15:50:29 DEBUG InputFunctions:765 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -adnaba-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-22 15:50:29 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adnaba',LENGTH(segment))
2016-01-22 15:50:29 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adnaba',LENGTH(segment))
2016-01-22 15:50:29 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-22 15:50:29 DEBUG InputFunctions:779 - ****VALUES of getFirstListOfTabSM  -1-
2016-01-22 15:50:29 DEBUG InputFunctions:782 - ****VALUES of getFirstListOfTabSM is -1- LOOP SM1 -1-
2016-01-22 15:50:29 DEBUG InputFunctions:826 - DEEPFLOW LOOP SM1. Counters spf1 -0- spf2 -0- si -0- sf -1- sm_1 -0- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -true- isanySM2 -false- travellingtabes.status -0123201111112011111121-
2016-01-22 15:50:29 DEBUG InputFunctions:831 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:840 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:844 - CALLING smric in  Sillib.java with rad_sf -adnaba- and SM -0- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG Sillib:274 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/smric in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:290 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/smric N chars  of sil.rad_sf a on sil.rad_sm adnaba for mode -0-
2016-01-22 15:50:29 DEBUG Sillib:302 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/smric N chars of sil.rad_sf adnab on sil.rad_sm adnaba for mode -0-
2016-01-22 15:50:29 DEBUG Sillib:307 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/smric in Sillib.java
2016-01-22 15:50:29 DEBUG InputFunctions:851 - DEEPFLOW ****ASSIGNING getSm_1 to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:853 - DEEPFLOW ****ASSIGNING rad_sm1 to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:863 - DEEPFLOW ****ASSIGNED getSm_1 to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:865 - DEEPFLOW ****ASSIGNED rad_sm1 to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:871 - ****VALUES IN LOOP getSM1set Segment at index -0- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:871 - ****VALUES IN LOOP getSM1set Segment at index -1- with value -adnab-
2016-01-22 15:50:29 DEBUG InputFunctions:871 - ****VALUES IN LOOP getSM1set Segment at index -2- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:871 - ****VALUES IN LOOP getSM1set Segment at index -3- with value -a-
2016-01-22 15:50:29 DEBUG InputFunctions:871 - ****VALUES IN LOOP getSM1set Segment at index -4- with value -m-
2016-01-22 15:50:29 DEBUG InputFunctions:871 - ****VALUES IN LOOP getSM1set Segment at index -5- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:871 - ****VALUES IN LOOP getSM1set Segment at index -6- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:877 - CALLING analysis (2) with sm1 -0- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -adnab- FROM LOOP getSFset
2016-01-22 15:50:29 DEBUG RunAnalyses:264 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adnab-
2016-01-22 15:50:29 DEBUG RunAnalyses:268 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -adnab- on sil.radical -adnaba-
2016-01-22 15:50:29 DEBUG RunAnalyses:275 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -adnab- on sil.radical -adnab-
2016-01-22 15:50:29 DEBUG RunAnalyses:279 - CALLING getSAISet radical=-adnab- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:284 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -adnab-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-22 15:50:29 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adnab',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-22 15:50:29 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adnab',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-22 15:50:29 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:297 - ****VALUES of getSAIset  -3-
2016-01-22 15:50:29 DEBUG RunAnalyses:300 - ****VALUES of getListOfTabSAI is -3- ADDITIONAL LOOP SAI -3-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -0-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adnab- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnab on sil.rad_sai aba
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d06- on sil.ind_alt 
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -ann- on sil.rad_alt 
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnab on sil.rad_sai ab
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d06- on sil.ind_alt d06
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -ann- on sil.rad_alt annab
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -annab- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('annab', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='annab' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('annab', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='annab' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -1-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adnab- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnab on sil.rad_sai ab
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d06
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -adgn- on sil.rad_alt annab
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnab on sil.rad_sai ab
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -adgn- on sil.rad_alt adgnab
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -adgnab- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adgnab', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adgnab' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adgnab', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adgnab' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -2-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adnab- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnab on sil.rad_sai ab
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -agn- on sil.rad_alt adgnab
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnab on sil.rad_sai ab
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -agn- on sil.rad_alt agnab
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -agnab- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('agnab', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='agnab' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('agnab', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='agnab' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:374 - DEEPFLOW EXIT LOOP SAI. Counter sai -3- les -0- isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:387 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:389 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:397 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:399 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:404 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -adnab- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adnab', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adnab' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adnab', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adnab' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:431 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:435 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adnab-
2016-01-22 15:50:29 DEBUG InputFunctions:887 - CALLING getSMset_2 in TabSmQuery.java with parameters: rad_sm1 -adnab-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-22 15:50:29 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:1 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adnab',LENGTH(segment))
2016-01-22 15:50:29 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:1 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adnab',LENGTH(segment))
2016-01-22 15:50:29 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-22 15:50:29 DEBUG InputFunctions:901 - ****VALUES of getSecondListOfTabSM  -0-
2016-01-22 15:50:29 DEBUG InputFunctions:904 - ****VALUES of getSecondListOfTabSM is -0- LOOP SM2 -0-
2016-01-22 15:50:29 DEBUG InputFunctions:692 - DEEPFLOW LOOP SF. Counters spf1 -0- spf2 -0- si -0- sf -2- sm_1 -1- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -012320111111201111112111111120-
2016-01-22 15:50:29 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:701 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:713 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -adnabam- and spf1 -0- and spf2 -0 and si-0- and sf -2-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG Sillib:153 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:159 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 5 of sil.rad_si -adnabam- on sil.rad_sf --
2016-01-22 15:50:29 DEBUG Sillib:167 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 5 of sil.rad_si -adnabam- on sil.rad_sf -adnab-
2016-01-22 15:50:29 DEBUG Sillib:172 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-22 15:50:29 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:725 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -1- with value -adnab-
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -4- with value -am-
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -5- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getSF -am- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:744 - DEEPFLOW ****ASSIGNED getRad_sf -adnab- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:752 - CALLING analysis (1) with sf -2- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -adnab- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-22 15:50:29 DEBUG RunAnalyses:264 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adnab-
2016-01-22 15:50:29 DEBUG RunAnalyses:268 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -adnab- on sil.radical -adnab-
2016-01-22 15:50:29 DEBUG RunAnalyses:275 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -adnab- on sil.radical -adnab-
2016-01-22 15:50:29 DEBUG RunAnalyses:279 - CALLING getSAISet radical=-adnab- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:284 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -adnab-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-22 15:50:29 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adnab',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-22 15:50:29 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adnab',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-22 15:50:29 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:297 - ****VALUES of getSAIset  -3-
2016-01-22 15:50:29 DEBUG RunAnalyses:300 - ****VALUES of getListOfTabSAI is -3- ADDITIONAL LOOP SAI -3-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -0-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adnab- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnab on sil.rad_sai ab
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d06- on sil.ind_alt 
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -ann- on sil.rad_alt 
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnab on sil.rad_sai ab
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d06- on sil.ind_alt d06
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -ann- on sil.rad_alt annab
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -annab- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('annab', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='annab' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('annab', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='annab' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -1-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adnab- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnab on sil.rad_sai ab
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d06
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -adgn- on sil.rad_alt annab
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnab on sil.rad_sai ab
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -adgn- on sil.rad_alt adgnab
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -adgnab- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adgnab', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adgnab' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adgnab', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adgnab' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -2-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adnab- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnab on sil.rad_sai ab
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -agn- on sil.rad_alt adgnab
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adnab on sil.rad_sai ab
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -agn- on sil.rad_alt agnab
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -agnab- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('agnab', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='agnab' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('agnab', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='agnab' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:374 - DEEPFLOW EXIT LOOP SAI. Counter sai -3- les -0- isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:387 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:389 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:397 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:399 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:404 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -adnab- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adnab', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adnab' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adnab', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adnab' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:431 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:435 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adnab-
2016-01-22 15:50:29 DEBUG InputFunctions:765 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -adnab-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-22 15:50:29 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adnab',LENGTH(segment))
2016-01-22 15:50:29 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adnab',LENGTH(segment))
2016-01-22 15:50:29 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-22 15:50:29 DEBUG InputFunctions:779 - ****VALUES of getFirstListOfTabSM  -0-
2016-01-22 15:50:29 DEBUG InputFunctions:782 - ****VALUES of getFirstListOfTabSM is -0- LOOP SM1 -0-
2016-01-22 15:50:29 DEBUG InputFunctions:692 - DEEPFLOW LOOP SF. Counters spf1 -0- spf2 -0- si -0- sf -3- sm_1 -1- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -01232011111120111111211111112011111120-
2016-01-22 15:50:29 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:701 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:713 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -adnabam- and spf1 -0- and spf2 -0 and si-0- and sf -3-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG Sillib:153 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:159 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 4 of sil.rad_si -adnabam- on sil.rad_sf --
2016-01-22 15:50:29 DEBUG Sillib:167 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 4 of sil.rad_si -adnabam- on sil.rad_sf -adna-
2016-01-22 15:50:29 DEBUG Sillib:172 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-22 15:50:29 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:725 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -1- with value -adna-
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -4- with value -bam-
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -5- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getSF -bam- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:744 - DEEPFLOW ****ASSIGNED getRad_sf -adna- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:752 - CALLING analysis (1) with sf -3- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -adna- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-22 15:50:29 DEBUG RunAnalyses:264 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adna-
2016-01-22 15:50:29 DEBUG RunAnalyses:268 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -adna- on sil.radical -adnab-
2016-01-22 15:50:29 DEBUG RunAnalyses:275 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -adna- on sil.radical -adna-
2016-01-22 15:50:29 DEBUG RunAnalyses:279 - CALLING getSAISet radical=-adna- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:284 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -adna-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-22 15:50:29 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adna',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-22 15:50:29 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adna',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-22 15:50:29 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:297 - ****VALUES of getSAIset  -3-
2016-01-22 15:50:29 DEBUG RunAnalyses:300 - ****VALUES of getListOfTabSAI is -3- ADDITIONAL LOOP SAI -3-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -0-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adna- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adna on sil.rad_sai ab
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d06- on sil.ind_alt 
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -ann- on sil.rad_alt 
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adna on sil.rad_sai a
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d06- on sil.ind_alt d06
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -ann- on sil.rad_alt anna
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -anna- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('anna', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='anna' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('anna', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='anna' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -1-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adna- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adna on sil.rad_sai a
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d06
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -adgn- on sil.rad_alt anna
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adna on sil.rad_sai a
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -adgn- on sil.rad_alt adgna
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -adgna- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adgna', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adgna' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adgna', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adgna' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -2-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adna- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adna on sil.rad_sai a
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -agn- on sil.rad_alt adgna
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adna on sil.rad_sai a
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -agn- on sil.rad_alt agna
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -agna- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('agna', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='agna' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('agna', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='agna' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:374 - DEEPFLOW EXIT LOOP SAI. Counter sai -3- les -0- isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:387 - DEEPFLOW ****ASSIGNING EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:389 - DEEPFLOW ****ASSIGNING EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:397 - DEEPFLOW ****ASSIGNED EOS to sil.Ind_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:399 - DEEPFLOW ****ASSIGNED EOS to sil.Rad_alt in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:404 - CALLING getLESset OUTSIDE TABSAI with parameters radical: -adna- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adna', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adna' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adna', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adna' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:431 - DEEPFLOW EXIT LOOP LES OUTSIDE TABSAI. Counter les -0-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:435 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adna-
2016-01-22 15:50:29 DEBUG InputFunctions:765 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -adna-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-22 15:50:29 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adna',LENGTH(segment))
2016-01-22 15:50:29 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adna',LENGTH(segment))
2016-01-22 15:50:29 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-22 15:50:29 DEBUG InputFunctions:779 - ****VALUES of getFirstListOfTabSM  -1-
2016-01-22 15:50:29 DEBUG InputFunctions:782 - ****VALUES of getFirstListOfTabSM is -1- LOOP SM1 -1-
2016-01-22 15:50:29 DEBUG InputFunctions:826 - DEEPFLOW LOOP SM1. Counters spf1 -0- spf2 -0- si -0- sf -3- sm_1 -1- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -true- isanySM2 -false- travellingtabes.status -0123201111112011111121111111201111112011111121-
2016-01-22 15:50:29 DEBUG InputFunctions:831 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:840 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:844 - CALLING smric in  Sillib.java with rad_sf -adna- and SM -0- CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG Sillib:274 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/smric in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:290 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/smric N chars  of sil.rad_sf a on sil.rad_sm adna for mode -0-
2016-01-22 15:50:29 DEBUG Sillib:302 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/smric N chars of sil.rad_sf adn on sil.rad_sm adna for mode -0-
2016-01-22 15:50:29 DEBUG Sillib:307 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/smric in Sillib.java
2016-01-22 15:50:29 DEBUG InputFunctions:851 - DEEPFLOW ****ASSIGNING getSm_1 to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:853 - DEEPFLOW ****ASSIGNING rad_sm1 to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:863 - DEEPFLOW ****ASSIGNED getSm_1 to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:865 - DEEPFLOW ****ASSIGNED rad_sm1 to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:871 - ****VALUES IN LOOP getSM1set Segment at index -0- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:871 - ****VALUES IN LOOP getSM1set Segment at index -1- with value -adn-
2016-01-22 15:50:29 DEBUG InputFunctions:871 - ****VALUES IN LOOP getSM1set Segment at index -2- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:871 - ****VALUES IN LOOP getSM1set Segment at index -3- with value -a-
2016-01-22 15:50:29 DEBUG InputFunctions:871 - ****VALUES IN LOOP getSM1set Segment at index -4- with value -bam-
2016-01-22 15:50:29 DEBUG InputFunctions:871 - ****VALUES IN LOOP getSM1set Segment at index -5- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:871 - ****VALUES IN LOOP getSM1set Segment at index -6- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:877 - CALLING analysis (2) with sm1 -1- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -adn- FROM LOOP getSFset
2016-01-22 15:50:29 DEBUG RunAnalyses:264 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adn-
2016-01-22 15:50:29 DEBUG RunAnalyses:268 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -adn- on sil.radical -adna-
2016-01-22 15:50:29 DEBUG RunAnalyses:275 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -adn- on sil.radical -adn-
2016-01-22 15:50:29 DEBUG RunAnalyses:279 - CALLING getSAISet radical=-adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:284 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -adn-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-22 15:50:29 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adn',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-22 15:50:29 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adn',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-22 15:50:29 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:297 - ****VALUES of getSAIset  -3-
2016-01-22 15:50:29 DEBUG RunAnalyses:300 - ****VALUES of getListOfTabSAI is -3- ADDITIONAL LOOP SAI -3-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -0-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adn on sil.rad_sai a
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d06- on sil.ind_alt 
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -ann- on sil.rad_alt 
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adn on sil.rad_sai 
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d06- on sil.ind_alt d06
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -ann- on sil.rad_alt ann
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -ann- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('ann', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='ann' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('ann', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='ann' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:353 - CALLING comp with parameters rad: -adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG RunAnalyses:457 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter adn
2016-01-22 15:50:29 DEBUG RunAnalyses:490 - DEEPFLOW ****CHECKED sil.ind_alt -d06- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NOT NULL
2016-01-22 15:50:29 DEBUG RunAnalyses:494 - CALLING compai with parameters a_gra: -- and SAI_cod -d06- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-22 15:50:29 DEBUG Comparator:73 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d06-
2016-01-22 15:50:29 DEBUG Comparator:122 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d06- EXIT 0
2016-01-22 15:50:29 DEBUG RunAnalyses:500 - DEEPFLOW ****CHECKED compai in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters a_gra: -- and SAI_cod -d06- EXIT FALSE 
2016-01-22 15:50:29 DEBUG RunAnalyses:353 - CALLING comp with parameters rad: -adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG RunAnalyses:457 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter adn
2016-01-22 15:50:29 DEBUG RunAnalyses:490 - DEEPFLOW ****CHECKED sil.ind_alt -d06- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NOT NULL
2016-01-22 15:50:29 DEBUG RunAnalyses:494 - CALLING compai with parameters a_gra: -- and SAI_cod -d06- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-22 15:50:29 DEBUG Comparator:73 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d06-
2016-01-22 15:50:29 DEBUG Comparator:122 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d06- EXIT 0
2016-01-22 15:50:29 DEBUG RunAnalyses:500 - DEEPFLOW ****CHECKED compai in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters a_gra: -- and SAI_cod -d06- EXIT FALSE 
2016-01-22 15:50:29 DEBUG RunAnalyses:353 - CALLING comp with parameters rad: -adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG RunAnalyses:457 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter adn
2016-01-22 15:50:29 DEBUG RunAnalyses:490 - DEEPFLOW ****CHECKED sil.ind_alt -d06- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NOT NULL
2016-01-22 15:50:29 DEBUG RunAnalyses:494 - CALLING compai with parameters a_gra: -- and SAI_cod -d06- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-22 15:50:29 DEBUG Comparator:73 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d06-
2016-01-22 15:50:29 DEBUG Comparator:122 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d06- EXIT 0
2016-01-22 15:50:29 DEBUG RunAnalyses:500 - DEEPFLOW ****CHECKED compai in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters a_gra: -- and SAI_cod -d06- EXIT FALSE 
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -3-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -1-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adn on sil.rad_sai 
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d06
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -adgn- on sil.rad_alt ann
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adn on sil.rad_sai 
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -adgn- on sil.rad_alt adgn
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -adgn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adgn', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adgn' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adgn', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adgn' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -3-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -2-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adn on sil.rad_sai 
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -agn- on sil.rad_alt adgn
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adn on sil.rad_sai 
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -agn- on sil.rad_alt agn
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -agn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('agn', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='agn' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('agn', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='agn' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:353 - CALLING comp with parameters rad: -adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG RunAnalyses:457 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter adn
2016-01-22 15:50:29 DEBUG RunAnalyses:490 - DEEPFLOW ****CHECKED sil.ind_alt -d12- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NOT NULL
2016-01-22 15:50:29 DEBUG RunAnalyses:494 - CALLING compai with parameters a_gra: -- and SAI_cod -d12- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-22 15:50:29 DEBUG Comparator:73 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d12-
2016-01-22 15:50:29 DEBUG Comparator:122 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d12- EXIT 0
2016-01-22 15:50:29 DEBUG RunAnalyses:500 - DEEPFLOW ****CHECKED compai in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters a_gra: -- and SAI_cod -d12- EXIT FALSE 
2016-01-22 15:50:29 DEBUG RunAnalyses:353 - CALLING comp with parameters rad: -adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG RunAnalyses:457 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter adn
2016-01-22 15:50:29 DEBUG RunAnalyses:490 - DEEPFLOW ****CHECKED sil.ind_alt -d12- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NOT NULL
2016-01-22 15:50:29 DEBUG RunAnalyses:494 - CALLING compai with parameters a_gra: -- and SAI_cod -d12- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-22 15:50:29 DEBUG Comparator:73 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d12-
2016-01-22 15:50:29 DEBUG Comparator:122 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d12- EXIT 0
2016-01-22 15:50:29 DEBUG RunAnalyses:500 - DEEPFLOW ****CHECKED compai in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters a_gra: -- and SAI_cod -d12- EXIT FALSE 
2016-01-22 15:50:29 DEBUG RunAnalyses:353 - CALLING comp with parameters rad: -adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG RunAnalyses:457 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter adn
2016-01-22 15:50:29 DEBUG RunAnalyses:490 - DEEPFLOW ****CHECKED sil.ind_alt -d12- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NOT NULL
2016-01-22 15:50:29 DEBUG RunAnalyses:494 - CALLING compai with parameters a_gra: -- and SAI_cod -d12- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-22 15:50:29 DEBUG Comparator:73 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d12-
2016-01-22 15:50:29 DEBUG Comparator:122 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d12- EXIT 0
2016-01-22 15:50:29 DEBUG RunAnalyses:500 - DEEPFLOW ****CHECKED compai in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters a_gra: -- and SAI_cod -d12- EXIT FALSE 
2016-01-22 15:50:29 DEBUG RunAnalyses:353 - CALLING comp with parameters rad: -adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG RunAnalyses:457 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter adn
2016-01-22 15:50:29 DEBUG RunAnalyses:490 - DEEPFLOW ****CHECKED sil.ind_alt -d12- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NOT NULL
2016-01-22 15:50:29 DEBUG RunAnalyses:494 - CALLING compai with parameters a_gra: -- and SAI_cod -d12- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-22 15:50:29 DEBUG Comparator:73 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d12-
2016-01-22 15:50:29 DEBUG Comparator:122 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d12- EXIT 0
2016-01-22 15:50:29 DEBUG RunAnalyses:500 - DEEPFLOW ****CHECKED compai in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters a_gra: -- and SAI_cod -d12- EXIT FALSE 
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -7-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:374 - DEEPFLOW EXIT LOOP SAI. Counter sai -3- les -7- isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:381 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java with sil.rad_sf -adn-
2016-01-22 15:50:29 DEBUG InputFunctions:887 - CALLING getSMset_2 in TabSmQuery.java with parameters: rad_sm1 -adn-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-22 15:50:29 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:1 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adn',LENGTH(segment))
2016-01-22 15:50:29 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:1 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adn',LENGTH(segment))
2016-01-22 15:50:29 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-22 15:50:29 DEBUG InputFunctions:901 - ****VALUES of getSecondListOfTabSM  -0-
2016-01-22 15:50:29 DEBUG InputFunctions:904 - ****VALUES of getSecondListOfTabSM is -0- LOOP SM2 -0-
2016-01-22 15:50:29 DEBUG InputFunctions:692 - DEEPFLOW LOOP SF. Counters spf1 -0- spf2 -0- si -0- sf -4- sm_1 -2- sm_2 -0- isanySPF1 -true- isanySPF2 -true- isanySI -true- isanySF -true- isanySM1 -false- isanySM2 -false- travellingtabes.status -01232011111120111111211111112011111120111111211112121211111212121220-
2016-01-22 15:50:29 DEBUG InputFunctions:699 - DEEPFLOW ****ASSIGNING EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:701 - DEEPFLOW ****ASSIGNING EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:713 - CALLING sfric in it.cnr.ilc.jauceps.lib.impl.InputFunctions. Parameters rad_si -adnabam- and spf1 -0- and spf2 -0 and si-0- and sf -4-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG Sillib:153 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:159 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 3 of sil.rad_si -adnabam- on sil.rad_sf --
2016-01-22 15:50:29 DEBUG Sillib:167 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sfric N chars 3 of sil.rad_si -adnabam- on sil.rad_sf -adn-
2016-01-22 15:50:29 DEBUG Sillib:172 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sfric in Sillib.java
2016-01-22 15:50:29 DEBUG InputFunctions:723 - DEEPFLOW ****ASSIGNING getSF to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:725 - DEEPFLOW ****ASSIGNING getRad_sf to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -0- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -1- with value -adn-
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -2- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -3- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -4- with value -abam-
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -5- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:733 - ****VALUES IN LOOP getSFset Segment at index -6- with value --
2016-01-22 15:50:29 DEBUG InputFunctions:738 - DEEPFLOW ****ASSIGNED EOS to sil.segment[2] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:740 - DEEPFLOW ****ASSIGNED EOS to sil.segment[3] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:742 - DEEPFLOW ****ASSIGNED getSF -abam- to sil.segment[4] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:744 - DEEPFLOW ****ASSIGNED getRad_sf -adn- to sil.segment[1] in routine it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG InputFunctions:752 - CALLING analysis (1) with sf -4- in it.cnr.ilc.jauceps.lib.impl.InputFunctions CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln  with parameter sil.rad_sf -adn- isanysm1 -false- isanysm2 -false- FROM LOOP getSFset
2016-01-22 15:50:29 DEBUG RunAnalyses:264 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses with sil.rad_sf -adn-
2016-01-22 15:50:29 DEBUG RunAnalyses:268 - DEEPFLOW COPYING in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in it.cnr.ilc.jauceps.lib.impl.RunAnalyses rad -adn- on sil.radical -adn-
2016-01-22 15:50:29 DEBUG RunAnalyses:275 - DEEPFLOW COPIED in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java rad -adn- on sil.radical -adn-
2016-01-22 15:50:29 DEBUG RunAnalyses:279 - CALLING getSAISet radical=-adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG RunAnalyses:284 - CALLING getSAIset in TabSaiQuery.java with parameters: radical -adn-. CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG TabSaiQuery:64 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-22 15:50:29 DEBUG TabSaiQuery:82 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSaiQuery.java with query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adn',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-22 15:50:29 DEBUG TabSaiQuery:100 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java with  query: SELECT  t1.segment, t1.comp_cod, t2.segment as segment_alt FROM tabsai AS t1,tabsai AS t2 WHERE t1.segment=LEFT('adn',LENGTH(t1.segment)) AND t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment ORDER BY t1.segment;
2016-01-22 15:50:29 DEBUG TabSaiQuery:104 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSaiQuery/getSAIset in TabSiQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:297 - ****VALUES of getSAIset  -3-
2016-01-22 15:50:29 DEBUG RunAnalyses:300 - ****VALUES of getListOfTabSAI is -3- ADDITIONAL LOOP SAI -3-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -0-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adn on sil.rad_sai 
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d06- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -ann- on sil.rad_alt agn
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adn on sil.rad_sai 
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d06- on sil.ind_alt d06
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -ann- on sil.rad_alt ann
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -ann- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('ann', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='ann' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('ann', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='ann' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:353 - CALLING comp with parameters rad: -adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG RunAnalyses:457 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter adn
2016-01-22 15:50:29 DEBUG RunAnalyses:490 - DEEPFLOW ****CHECKED sil.ind_alt -d06- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NOT NULL
2016-01-22 15:50:29 DEBUG RunAnalyses:494 - CALLING compai with parameters a_gra: -- and SAI_cod -d06- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-22 15:50:29 DEBUG Comparator:73 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d06-
2016-01-22 15:50:29 DEBUG Comparator:122 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d06- EXIT 0
2016-01-22 15:50:29 DEBUG RunAnalyses:500 - DEEPFLOW ****CHECKED compai in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters a_gra: -- and SAI_cod -d06- EXIT FALSE 
2016-01-22 15:50:29 DEBUG RunAnalyses:353 - CALLING comp with parameters rad: -adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG RunAnalyses:457 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter adn
2016-01-22 15:50:29 DEBUG RunAnalyses:490 - DEEPFLOW ****CHECKED sil.ind_alt -d06- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NOT NULL
2016-01-22 15:50:29 DEBUG RunAnalyses:494 - CALLING compai with parameters a_gra: -- and SAI_cod -d06- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-22 15:50:29 DEBUG Comparator:73 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d06-
2016-01-22 15:50:29 DEBUG Comparator:122 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d06- EXIT 0
2016-01-22 15:50:29 DEBUG RunAnalyses:500 - DEEPFLOW ****CHECKED compai in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters a_gra: -- and SAI_cod -d06- EXIT FALSE 
2016-01-22 15:50:29 DEBUG RunAnalyses:353 - CALLING comp with parameters rad: -adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG RunAnalyses:457 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter adn
2016-01-22 15:50:29 DEBUG RunAnalyses:490 - DEEPFLOW ****CHECKED sil.ind_alt -d06- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NOT NULL
2016-01-22 15:50:29 DEBUG RunAnalyses:494 - CALLING compai with parameters a_gra: -- and SAI_cod -d06- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-22 15:50:29 DEBUG Comparator:73 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d06-
2016-01-22 15:50:29 DEBUG Comparator:122 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d06- EXIT 0
2016-01-22 15:50:29 DEBUG RunAnalyses:500 - DEEPFLOW ****CHECKED compai in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters a_gra: -- and SAI_cod -d06- EXIT FALSE 
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -3-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -1-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adn on sil.rad_sai 
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d06
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -adgn- on sil.rad_alt ann
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adn on sil.rad_sai 
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -adgn- on sil.rad_alt adgn
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -adgn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adgn', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adgn' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('adgn', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='adgn' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -3-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:307 - DEEPFLOW LOOP SAI. Counter sai -2-  isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:321 - CALLING sairic radical=-adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis
2016-01-22 15:50:29 DEBUG Sillib:225 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Sillib/sairic in Sillib.java
2016-01-22 15:50:29 DEBUG Sillib:230 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adn on sil.rad_sai 
2016-01-22 15:50:29 DEBUG Sillib:232 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:234 - DEEPFLOW ****COPYING in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -agn- on sil.rad_alt adgn
2016-01-22 15:50:29 DEBUG Sillib:252 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic N chars 3 of sil.radical adn on sil.rad_sai 
2016-01-22 15:50:29 DEBUG Sillib:254 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_cod -d12- on sil.ind_alt d12
2016-01-22 15:50:29 DEBUG Sillib:256 - DEEPFLOW ****COPIED in it.cnr.ilc.jauceps.lib.impl.Sillib/sairic  getSai_alt -agn- on sil.rad_alt agn
2016-01-22 15:50:29 DEBUG RunAnalyses:330 - CALLING getLESset with parameters rad_alt: -agn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:85 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG TabLessarioQuery:121 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('agn', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='agn' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:138 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java with  query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE  les=REPLACE('agn', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key FROM lessario WHERE les='agn' 
2016-01-22 15:50:29 DEBUG TabLessarioQuery:142 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabLessarioQuery/getLESset in TabLessarioQuery.java
2016-01-22 15:50:29 DEBUG RunAnalyses:353 - CALLING comp with parameters rad: -adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG RunAnalyses:457 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter adn
2016-01-22 15:50:29 DEBUG RunAnalyses:490 - DEEPFLOW ****CHECKED sil.ind_alt -d12- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NOT NULL
2016-01-22 15:50:29 DEBUG RunAnalyses:494 - CALLING compai with parameters a_gra: -- and SAI_cod -d12- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-22 15:50:29 DEBUG Comparator:73 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d12-
2016-01-22 15:50:29 DEBUG Comparator:122 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d12- EXIT 0
2016-01-22 15:50:29 DEBUG RunAnalyses:500 - DEEPFLOW ****CHECKED compai in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters a_gra: -- and SAI_cod -d12- EXIT FALSE 
2016-01-22 15:50:29 DEBUG RunAnalyses:353 - CALLING comp with parameters rad: -adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG RunAnalyses:457 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter adn
2016-01-22 15:50:29 DEBUG RunAnalyses:490 - DEEPFLOW ****CHECKED sil.ind_alt -d12- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NOT NULL
2016-01-22 15:50:29 DEBUG RunAnalyses:494 - CALLING compai with parameters a_gra: -- and SAI_cod -d12- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-22 15:50:29 DEBUG Comparator:73 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d12-
2016-01-22 15:50:29 DEBUG Comparator:122 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d12- EXIT 0
2016-01-22 15:50:29 DEBUG RunAnalyses:500 - DEEPFLOW ****CHECKED compai in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters a_gra: -- and SAI_cod -d12- EXIT FALSE 
2016-01-22 15:50:29 DEBUG RunAnalyses:353 - CALLING comp with parameters rad: -adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG RunAnalyses:457 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter adn
2016-01-22 15:50:29 DEBUG RunAnalyses:490 - DEEPFLOW ****CHECKED sil.ind_alt -d12- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NOT NULL
2016-01-22 15:50:29 DEBUG RunAnalyses:494 - CALLING compai with parameters a_gra: -- and SAI_cod -d12- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-22 15:50:29 DEBUG Comparator:73 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d12-
2016-01-22 15:50:29 DEBUG Comparator:122 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d12- EXIT 0
2016-01-22 15:50:29 DEBUG RunAnalyses:500 - DEEPFLOW ****CHECKED compai in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters a_gra: -- and SAI_cod -d12- EXIT FALSE 
2016-01-22 15:50:29 DEBUG RunAnalyses:353 - CALLING comp with parameters rad: -adn- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis 
2016-01-22 15:50:29 DEBUG RunAnalyses:457 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in RunStaticAnalyses.java. Parameter adn
2016-01-22 15:50:29 DEBUG RunAnalyses:490 - DEEPFLOW ****CHECKED sil.ind_alt -d12- in it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp: WAS NOT NULL
2016-01-22 15:50:29 DEBUG RunAnalyses:494 - CALLING compai with parameters a_gra: -- and SAI_cod -d12- CALLER it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp 
2016-01-22 15:50:29 DEBUG Comparator:73 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d12-
2016-01-22 15:50:29 DEBUG Comparator:122 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.Comparator/compai in Comparator.java with parameters a_gra -- and cod -d12- EXIT 0
2016-01-22 15:50:29 DEBUG RunAnalyses:500 - DEEPFLOW ****CHECKED compai in routine it.cnr.ilc.jauceps.lib.impl.RunAnalyses/comp in with parameters a_gra: -- and SAI_cod -d12- EXIT FALSE 
2016-01-22 15:50:29 DEBUG RunAnalyses:364 - DEEPFLOW EXIT LOOP LES. Counter les -7-  isanyLes -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:374 - DEEPFLOW EXIT LOOP SAI. Counter sai -3- les -7- isanySAI -false-
2016-01-22 15:50:29 DEBUG RunAnalyses:381 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.RunAnalyses/analysis in Sillib.java with sil.rad_sf -adn-
2016-01-22 15:50:29 DEBUG InputFunctions:765 - CALLING getSMset_1 in TabSmQuery.java with parameters: rad_sf -adn-. CALLER it.cnr.ilc.jauceps.lib.impl.InputFunctions/siln
2016-01-22 15:50:29 DEBUG TabSmQuery:62 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-22 15:50:29 DEBUG TabSmQuery:71 - SQL Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adn',LENGTH(segment))
2016-01-22 15:50:29 DEBUG TabSmQuery:89 - LQS Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java with spf_n:0 and query: SELECT DISTINCT segment FROM tabsm WHERE segment=RIGHT('adn',LENGTH(segment))
2016-01-22 15:50:29 DEBUG TabSmQuery:94 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.lib.impl.table.query.TabSmQuery/getSMset in TabSmQuery.java
2016-01-22 15:50:29 DEBUG InputFunctions:779 - ****VALUES of getFirstListOfTabSM  -0-
2016-01-22 15:50:29 DEBUG InputFunctions:782 - ****VALUES of getFirstListOfTabSM is -0- LOOP SM1 -0-
2016-01-22 15:50:29 DEBUG PrintAnalyses:410 - DEEPFLOW START Executing it.cnr.ilc.jauceps.app.api.PrintAnalyses/printCompact in it.cnr.ilc.jauceps.app.api.PrintAnalyses 
2016-01-22 15:50:29 DEBUG PrintAnalyses:469 - DEEPFLOW STOP Executing it.cnr.ilc.jauceps.app.api.PrintAnalyses/printCompact in it.cnr.ilc.jauceps.app.api.PrintAnalyses 
adnabam	adnabam	not-found#-
2016-01-22 15:50:29 DEBUG Lib:128 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Lib/initialize in class Lib.java
2016-01-22 15:50:29 DEBUG Lib:134 - DEEPFLOW START Initialize SIL in class Lib.java
2016-01-22 15:50:29 DEBUG Lib:150 - DEEPFLOW END Initialize SIL in class Lib.java
2016-01-22 15:50:29 DEBUG Interact:139 - DEEPFLOW START Executing it.cnr.ilc.jauceps.lib.impl.Interact/prompt in class Interact.java

>type the WORD-FORM you wish to analyze. end to exit

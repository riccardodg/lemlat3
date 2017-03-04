CALLING silcall in  aucepsLIB_alpha.c. CALLER  main.c  GNILLAC

START Executing silcall in input_functions_alpha.c TRATS
        ****COPYING wordform adnabam to sil.form rosas
        ****COPIED wordform adnabam to sil.form adnabam
        ****CHANGING sil.form adnabam to lowercase 
        ****CHANGING v into u and j into i in sil.form adnabam
        ****CHANGED sil.form adnabam to lowercase
        ****CHANGED v into u and j into i in sil.form adnabam
        ****CHANGING sil.form adnabam to lowercase 
        ****CHANGING v into u and j into i in sil.form adnabam
        ****CHANGED sil.form adnabam to lowercase
        ****CHANGED v into u and j into i in sil.form adnabam
        ****CHANGING sil.form adnabam to lowercase 
        ****CHANGING v into u and j into i in sil.form adnabam
        ****CHANGED sil.form adnabam to lowercase
        ****CHANGED v into u and j into i in sil.form adnabam
        ****CHANGING sil.form adnabam to lowercase 
        ****CHANGING v into u and j into i in sil.form adnabam
        ****CHANGED sil.form adnabam to lowercase
        ****CHANGED v into u and j into i in sil.form adnabam
        ****CHANGING sil.form adnabam to lowercase 
        ****CHANGING v into u and j into i in sil.form adnabam
        ****CHANGED sil.form adnabam to lowercase
        ****CHANGED v into u and j into i in sil.form adnabam
        ****CHANGING sil.form adnabam to lowercase 
        ****CHANGING v into u and j into i in sil.form adnabam
        ****CHANGED sil.form adnabam to lowercase
        ****CHANGED v into u and j into i in sil.form adnabam
        ****CHANGING sil.form adnabam to lowercase 
        ****CHANGING v into u and j into i in sil.form adnabam
        ****CHANGED sil.form adnabam to lowercase
        ****CHANGED v into u and j into i in sil.form adnabam
        ****ASSIGNING EOS to sil.form adnabam
        ****ASSIGNED EOS to sil.form adnabam

CALLING initAnalyses in  aucepsLIB_alpha.c. CALLER silcall GNILLAC

START Executing initAnalyses  in input_function_alpha.c TRATS
START Executing initAnalyses  in input_function_alpha.c with numAnalysis: 2 and wordform: adnabam and sil.form: adnabam TRATS
        ****COPYING forma_orig adnabam to analyses.in_form rosas
        ****COPYING forma_alt adnabam to analyses.in_form rosas
        ****COPIED forma_orig adnabam to analyses.in_form adnabam
        ****COPIED forma_alt adnabam to analyses.alt_in_form adnabam
        ****ASSIGNING 0 to analyses.numAnalysis 0
        ****ASSIGNED 0 to analyses.numAnalysis 0
STOP Executing initAnalyses  in input_function_alpha.c POTS
STOP Executing initAnalyses (first analysis) in input_function_alpha.c with numAnalysis: 0 and wordform: adnabam and sil.form: adnabam POTS

CALLING siln in  aucepsLIB_alpha.c. CALLER silcall GNILLAC

START Executing siln in input_functions_alpha.c TRATS

CALLING getSPFset (SPF1) in query_table_TABSPF_alpha.c CALLER siln GNILLAC
CALLING getSPFset in query_table_TABSPF_alpha.c with parameters: form :adnabam and SPF1 :0. CALLER siln in input_functions_alpha.c GNILLAC

START Executing getSPFset in query_table_TABSF_alpha.c CASE SPF1 TRATS

SQL Executing getSPFset in query_table_TABSPF_alpha.c with spf_n:0 and query: SELECT  segment, comp_cod 			FROM tabspf WHERE segment=RIGHT('adnabam',LENGTH(segment)) 			AND (LEFT(comp_cod,1)='e' OR comp_cod='') 			ORDER BY LENGTH(segment) SQL
LQS Executing getSPFset in query_table_TABSPF_alpha.c with spf_n:0 and query: SELECT  segment, comp_cod 			FROM tabspf WHERE segment=RIGHT('adnabam',LENGTH(segment)) 			AND (LEFT(comp_cod,1)='e' OR comp_cod='') 			ORDER BY LENGTH(segment) LQS

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
NULL in  isanySPF and spf -1-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --
LOOP SPF1. Counters:spf1 -0- spf2 -0- si-0- isanySPF(SPF1) -1- isanySPF(SPF2) -0- isanySI -0- 
        ****ASSIGNING EOS to sil.segment[6]
        ****ASSIGNED EOS to sil.segment[6] 
        ****VALUES IN LOOP getSPFset_1 Segments sil.segment[6]:-- SEULAV
 CALLING spferic in sillib.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING spferic in sillib.c CALLER siln in input_functions_alpha.c FROM LOOP getSPFset_1 GNILLAC

START Executing spferic in sillib.c TRATS

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
        ****COPYING in spferic N chars 7 of sil.form on sil.rad_spfe 
        ****ADDIND in spferic '        ****COPIED in spferic N chars 7 of sil.form adnabam on sil.rad_spfe adnabam
        ****ADDED in spferic 'STOP Executing spferic in sillib.c POTS 
STOP Executing spferic in sillib.c POTS 

CALLING getSPFset (SPF2) in query_table_TABSPF_alpha.c CALLER siln GNILLAC
CALLING getSPFset in query_table_TABSPF_alpha.c with parameters: rad_spfe :adnabam and SPF2 :1. CALLER siln in input_functions_alpha.c  GNILLAC

START Executing getSPFset in query_table_TABSF_alpha.c CASE SPF2 TRATS

SQL Executing getSPFset in query_table_TABSPF_alpha.c with spf_n:1 and query: SELECT  segment, comp_cod 			FROM tabspf WHERE segment=RIGHT('adnabam',LENGTH(segment)) 			AND (LEFT(comp_cod,1)!='e' OR comp_cod='')			ORDER BY LENGTH(segment) SQL
LQS Executing getSPFset in query_table_TABSPF_alpha.c with spf_n:1 and query: SELECT  segment, comp_cod 			FROM tabspf WHERE segment=RIGHT('adnabam',LENGTH(segment)) 			AND (LEFT(comp_cod,1)!='e' OR comp_cod='')			ORDER BY LENGTH(segment) LQS

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --
LOOP SPF2. Counters:spf1 -0- spf2 -0- si-0- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -0- 
        ****ASSIGNING EOS to sil.segment[0]
        ****ASSIGNED EOS to sil.segment[0] 
CALLING spfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING spfric in sillib.c CALLER siln in input_functions_alpha.c FROM LOOP getSPFset_2 GNILLAC

START Executing spfric in sillib.c TRATS

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  STOP
        ****COPYING in spfric N chars 7 of sil.rad_spfe on sil.rad_spf 
        ****ADDIND in spfric '        ****COPIED in spfric N chars 7 of sil.rad_spfe on sil.rad_spf 
        ****ADDED in spfric 'STOP Executing spfric in sillib.c. POTS
STOP Executing spfric in sillib.c. POTS
        ****ASSIGNING getSPF(SPF2) to sil.segment[5]

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  STOP
        ****ASSIGNED getSPF(SPF2) to sil.segment[5]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[5]: SEULAV
     ****VALUES IN LOOP getSPFset_2 Segments sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSPFset_2 Segments sil.segment[5]: SEULAV
 CALLING getSIset in query_table_TABSI_alpha.c CALLER siln  GNILLAC
CALLING getSIset in query_table_TABSI_alpha.c CALLER siln  with parameter: adnabam GNILLAC

SQL Executing getSIset in query_table_TABSI_alpha.c with query: SELECT  segment, comp_cod 		FROM tabsi WHERE segment=LEFT('adnabam',LENGTH(segment)) 		ORDER BY LENGTH(segment) SQL
LQS Executing getSIset in query_table_TABSI_alpha.c with query: SELECT  segment, comp_cod 		FROM tabsi WHERE segment=LEFT('adnabam',LENGTH(segment)) 		ORDER BY LENGTH(segment) LQS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --
LOOP SI. Counters:spf1 -0- spf2 -0- si-0- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -1- 
CALLING siric in sillib.c CALLER siln GNILLAC

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing siric in sillib.c TRAST
        ****COPYING in siric  sil.rad_spf + length 0 on sil.rad_si 
        ****COPIED in siric  sil.rad_spf (null) + length 76871647 on sil.rad_si adnabam 
STOP Executing siric in sillib.c POTS
        ****ASSIGNING getSI to sil.segment[0]

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
        ****ASSIGNED getSI to sil.segment[0]
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNING sil.rad_si to sil.segment[1]
        ****ASSIGNED '        ****ASSIGNED '        ****ASSIGNED sil.rad_si adnabam to sil.segment[1]
        ****VALUES Segment sil.segment[0]: SEULAV
         ****VALUES Segment sil.segment[1]:adnabam SEULAV
         ****VALUES Segment sil.segment[2]: SEULAV
         ****VALUES Segment sil.segment[3]: SEULAV
         ****VALUES Segment sil.segment[4]: SEULAV
         ****VALUES Segment sil.segment[5]: SEULAV
         ****VALUES Segment sil.segment[6]: SEULAV
         ****VALUES IN LOOP getSIset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[1]:adnabam SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[2]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[3]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[4]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[5]: SEULAV
         ****VALUES IN LOOP getSIset Segment sil.segment[6]: SEULAV
 CALLING lemmi_ecc in input_functions_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING lemmi_ecc in input_functions_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_si: adnabam GNILLAC

START Executing lemmi_ecc in input_functions_alpha.c TRAST

START Executing lemmi_ecc in input_functions_alpha.c Parameter adnabam TRAST
        ***COPYING adnabam to sil.radical
        ***ASSIGNING EOS to sil.ind_alt
        ***ASSIGNING EOS to sil.rad_alt
        ***COPIED adnabam to sil.radical adnabam
        ***ASSIGNED EOS to sil.ind_alt 
        ***ASSIGNED EOS to sil.rad_alt 
CALLING getLEset CALLER lemmi_ecc in input_functions_alpha.c GNILLAC
CALLING getLEset with parameters: str :adnabam  CALLER lemmi_ecc in input_functions_alpha.c GNILLAC

SQL Executing getLEset in query_table_TABLE_alpha.c with query: SELECT les_id, codLE, lemma		FROM tab_le WHERE lemma='adnabam' SQL
LQS Executing getLEset in query_table_TABLE_alpha.c with query: SELECT les_id, codLE, lemma		FROM tab_le WHERE lemma='adnabam' LQS

START Executing isanyLE in query_table_TABLE_ECC_alpha.c TRATS
STOP Executing isanyLE in query_table_TABLE_ECC_alpha.c  POTS
STOP Executing lemmi_ecc in input_functions_alpha.c POTS
STOP Executing lemmi_ecc in input_functions_alpha.c Parameter adnabam POTS
CALLING getSFset in query_table_TABSF_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSFset in query_table_TABSF_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_si: adnabam GNILLAC

SQL Executing getSFset in query_table_TABSF_alpha.c with query: SELECT DISTINCT segment, LENGTH(segment) 		FROM tabsf WHERE segment=RIGHT('adnabam',LENGTH(segment)) 		ORDER BY LENGTH(segment) SQL
LQS Executing getSFset in query_table_TABSF_alpha.c with query: SELECT DISTINCT segment, LENGTH(segment) 		FROM tabsf WHERE segment=RIGHT('adnabam',LENGTH(segment)) 		ORDER BY LENGTH(segment) LQS

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNED EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[3]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC

START Executing sfric in sillib.c TRAST

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****COPYING in sfric N chars 7 of sil.rad_si on sil.rad_sf 
        ****ADDIND in sfric '        ****COPIED in sfric N chars 7 of sil.rad_si adnabam on sil.rad_sf adnabam 
        ****ADDIND in sfric 'STOP Executing sfric in sillib.c POTS
        ****ASSIGNING getSF to sil.segment[4]
        ****ASSIGNING sil.rad_sf to sil.segment[1]

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNED getSF to sil.segment[4]
        ****ASSIGNED sil.rad_sf to sil.segment[1]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[1]:adnabam SEULAV
     ****VALUES Segment sil.segment[2]: SEULAV
     ****VALUES Segment sil.segment[3]: SEULAV
     ****VALUES Segment sil.segment[4]: SEULAV
     ****VALUES Segment sil.segment[5]: SEULAV
     ****VALUES Segment sil.segment[6]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[1]:adnabam SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[2]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[3]: SEULAV
     ****ALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[4]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[5]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[6]: SEULAV
 CALLING analysis (1) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (1) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf adnabam FROM LOOP getSFset GNILLAC

START Executing analysis in sillib.c Parameter: rad adnabam TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad adnabam on sil.radical adnabam
CALLING getSAIset with parameters: rad :adnabam  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment 		FROM tabsai AS t1,tabsai AS t2 		WHERE t1.segment=LEFT('adnabam',LENGTH(t1.segment)) AND 		t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 		ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment 		FROM tabsai AS t1,tabsai AS t2 		WHERE t1.segment=LEFT('adnabam',LENGTH(t1.segment)) AND 		t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 		ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adnabam at index 3 to rad_sai abam 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d06 to sil.ind_alt d06 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt ann to sil.rad_alt annabam 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai abam to rad_alt annabam
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt annabam and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('annabam', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='annabam'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('annabam', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='annabam'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adnabam at index 3 to rad_sai abam 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d12 to sil.ind_alt d12 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt adgn to sil.rad_alt adgnabam 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai abam to rad_alt adgnabam
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt adgnabam and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adgnabam', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adgnabam'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adgnabam', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adgnabam'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adnabam at index 3 to rad_sai abam 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d12 to sil.ind_alt d12 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt agn to sil.rad_alt agnabam 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai abam to rad_alt agnabam
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt agnabam and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('agnabam', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='agnabam'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('agnabam', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='agnabam'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad adnabam POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical adnabam and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adnabam', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adnabam'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adnabam', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adnabam'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf: adnabam GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment 		FROM tabsm WHERE segment=RIGHT('adnabam',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment 		FROM tabsm WHERE segment=RIGHT('adnabam',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing nextSF in query_table_TABSF_alpha.c TRATS
STOP Executing nextSF in query_table_TABSF_alpha.c  POTS

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNED EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[3]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC

START Executing sfric in sillib.c TRAST

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****COPYING in sfric N chars 6 of sil.rad_si on sil.rad_sf 
        ****ADDIND in sfric '        ****COPIED in sfric N chars 6 of sil.rad_si adnabam on sil.rad_sf adnaba 
        ****ADDIND in sfric 'STOP Executing sfric in sillib.c POTS
        ****ASSIGNING getSF to sil.segment[4]
        ****ASSIGNING sil.rad_sf to sil.segment[1]

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNED getSF to sil.segment[4]
        ****ASSIGNED sil.rad_sf to sil.segment[1]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[1]:adnaba SEULAV
     ****VALUES Segment sil.segment[2]: SEULAV
     ****VALUES Segment sil.segment[3]: SEULAV
     ****VALUES Segment sil.segment[4]:m SEULAV
     ****VALUES Segment sil.segment[5]: SEULAV
     ****VALUES Segment sil.segment[6]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[1]:adnaba SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[2]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[3]: SEULAV
     ****ALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[4]:m SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[5]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[6]: SEULAV
 CALLING analysis (1) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (1) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf adnaba FROM LOOP getSFset GNILLAC

START Executing analysis in sillib.c Parameter: rad adnaba TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad adnaba on sil.radical adnaba
CALLING getSAIset with parameters: rad :adnaba  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment 		FROM tabsai AS t1,tabsai AS t2 		WHERE t1.segment=LEFT('adnaba',LENGTH(t1.segment)) AND 		t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment 		FROM tabsai AS t1,tabsai AS t2 		WHERE t1.segment=LEFT('adnaba',LENGTH(t1.segment)) AND 		t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adnaba at index 3 to rad_sai aba 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d06 to sil.ind_alt d06 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt ann to sil.rad_alt annaba 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai aba to rad_alt annaba
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt annaba and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('annaba', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='annaba'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('annaba', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='annaba'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adnaba at index 3 to rad_sai aba 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d12 to sil.ind_alt d12 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt adgn to sil.rad_alt adgnaba 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai aba to rad_alt adgnaba
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt adgnaba and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adgnaba', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adgnaba'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adgnaba', gv_in, gv_out) UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adgnaba'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adnaba at index 3 to rad_sai aba 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d12 to sil.ind_alt d12 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt agn to sil.rad_alt agnaba 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai aba to rad_alt agnaba
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt agnaba and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('agnaba', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='agnaba'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('agnaba', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='agnaba'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad adnaba POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical adnaba and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adnaba', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adnaba'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adnaba', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adnaba'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf: adnaba GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment 		FROM tabsm WHERE segment=RIGHT('adnaba',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment 		FROM tabsm WHERE segment=RIGHT('adnaba',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[2]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING smric in sillib.c CALLER siln in input_functions_alpha.c with parameters sil.rad_sf, sil.rad_sm1, SM1 GNILLAC

START Executing smric in sillib.c TRATS

START Executing getSM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing getSM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing getSM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:0 POTS
        ****COPYING in smric N chars 5 of radi_si on rado (SM=sm_n 0)
        ****ADDIND in smric '        ****COPIED in smric N chars 5 of radi adnaba on rado adnab (SM=sm_n 0)
        ****ADDED in smric 'STOP Executing smric in sillib.c POTS
STOP Executing smric in sillib.c POTS
        ****ASSIGNING getSM(SM1) to sil.segment[3]
        ****ASSIGNING sil.rad_sm1 to sil.segment[1]

START Executing getSM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:0 POTS
        ****ASSIGNED getSM(SM1) to sil.segment[3]
        ****ASSIGNED sil.rad_sm1 to sil.segment[1]
        ****VALUES IN LOOP getSMset_1 (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
         ****VALUES IN LOOP getSMset_1 (CHANGED) Segment sil.segment[1]:adnab SEULAV
         ****VALUES IN LOOP getSMset_1 Segment sil.segment[2]: SEULAV
         ****VALUES IN LOOP getSMset_1 (CHANGED) Segment sil.segment[3]:a SEULAV
         ****VALUES IN LOOP getSMset_1 Segment sil.segment[4]:m SEULAV
         ****VALUES IN LOOP getSMset_1 Segment sil.segment[5]: SEULAV
         ****VALUES IN LOOP getSMset_1 Segment sil.segment[6]: SEULAV
         ****VALUES Segment sil.segment[0]: SEULAV
         ****VALUES Segment sil.segment[1]:adnab SEULAV
         ****VALUES Segment sil.segment[2]: SEULAV
         ****VALUES Segment sil.segment[3]:a SEULAV
         ****VALUES Segment sil.segment[4]:m SEULAV
         ****VALUES Segment sil.segment[5]: SEULAV
         ****VALUES Segment sil.segment[6]: SEULAV
 CALLING analysis (2) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (2) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sm1 adnab FROM LOOP getSMset_1 GNILLAC

START Executing analysis in sillib.c Parameter: rad adnab TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad adnab on sil.radical adnab
CALLING getSAIset with parameters: rad :adnab  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment 		FROM tabsai AS t1,tabsai AS t2 		WHERE t1.segment=LEFT('adnab',LENGTH(t1.segment)) AND 		t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment 		FROM tabsai AS t1,tabsai AS t2 		WHERE t1.segment=LEFT('adnab',LENGTH(t1.segment)) AND 		t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adnab at index 3 to rad_sai ab 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d06 to sil.ind_alt d06 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt ann to sil.rad_alt annab 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai ab to rad_alt annab
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt annab and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('annab', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='annab'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('annab', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='annab'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adnab at index 3 to rad_sai ab 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d12 to sil.ind_alt d12 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt adgn to sil.rad_alt adgnab 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai ab to rad_alt adgnab
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt adgnab and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adgnab', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adgnab'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adgnab', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adgnab'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adnab at index 3 to rad_sai ab 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d12 to sil.ind_alt d12 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt agn to sil.rad_alt agnab 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai ab to rad_alt agnab
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt agnab and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('agnab', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='agnab'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('agnab', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='agnab'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad adnab POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical adnab and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adnab', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adnab'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adnab', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adnab'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_2 (SM2) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_2 (SM2) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sm1: adnab GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment 		FROM tabsm WHERE segment=RIGHT('adnab',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment 		FROM tabsm WHERE segment=RIGHT('adnab',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 POTS

START Executing nextSM in query_table_TABSM_alpha.c with sm_n:0 and curSMset[sm_n]:  and curSM[sm_n]: 24298952 TRATS
STOP Executing nextSM in query_table_TABSM_alpha.c with sm_n:0 and curSMset[sm_n]:  and curSM[sm_n]: 24298952 TRATS POTS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing nextSF in query_table_TABSF_alpha.c TRATS
STOP Executing nextSF in query_table_TABSF_alpha.c  POTS

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNED EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[3]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC

START Executing sfric in sillib.c TRAST

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****COPYING in sfric N chars 5 of sil.rad_si on sil.rad_sf 
        ****ADDIND in sfric '        ****COPIED in sfric N chars 5 of sil.rad_si adnabam on sil.rad_sf adnab 
        ****ADDIND in sfric 'STOP Executing sfric in sillib.c POTS
        ****ASSIGNING getSF to sil.segment[4]
        ****ASSIGNING sil.rad_sf to sil.segment[1]

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNED getSF to sil.segment[4]
        ****ASSIGNED sil.rad_sf to sil.segment[1]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[1]:adnab SEULAV
     ****VALUES Segment sil.segment[2]: SEULAV
     ****VALUES Segment sil.segment[3]: SEULAV
     ****VALUES Segment sil.segment[4]:am SEULAV
     ****VALUES Segment sil.segment[5]: SEULAV
     ****VALUES Segment sil.segment[6]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[1]:adnab SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[2]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[3]: SEULAV
     ****ALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[4]:am SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[5]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[6]: SEULAV
 CALLING analysis (1) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (1) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf adnab FROM LOOP getSFset GNILLAC

START Executing analysis in sillib.c Parameter: rad adnab TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad adnab on sil.radical adnab
CALLING getSAIset with parameters: rad :adnab  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment 		FROM tabsai AS t1,tabsai AS t2 		WHERE t1.segment=LEFT('adnab',LENGTH(t1.segment)) AND 		t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment 		FROM tabsai AS t1,tabsai AS t2 		WHERE t1.segment=LEFT('adnab',LENGTH(t1.segment)) AND 		t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adnab at index 3 to rad_sai ab 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d06 to sil.ind_alt d06 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt ann to sil.rad_alt annab 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai ab to rad_alt annab
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt annab and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('annab', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='annab'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('annab', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='annab'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adnab at index 3 to rad_sai ab 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d12 to sil.ind_alt d12 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt adgn to sil.rad_alt adgnab 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai ab to rad_alt adgnab
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt adgnab and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adgnab', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adgnab'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adgnab', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adgnab'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adnab at index 3 to rad_sai ab 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d12 to sil.ind_alt d12 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt agn to sil.rad_alt agnab 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai ab to rad_alt agnab
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt agnab and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('agnab', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='agnab'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('agnab', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='agnab'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad adnab POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical adnab and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adnab', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adnab'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adnab', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adnab'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf: adnab GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment 		FROM tabsm WHERE segment=RIGHT('adnab',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment 		FROM tabsm WHERE segment=RIGHT('adnab',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing nextSF in query_table_TABSF_alpha.c TRATS
STOP Executing nextSF in query_table_TABSF_alpha.c  POTS

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNED EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[3]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC

START Executing sfric in sillib.c TRAST

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****COPYING in sfric N chars 4 of sil.rad_si on sil.rad_sf 
        ****ADDIND in sfric '        ****COPIED in sfric N chars 4 of sil.rad_si adnabam on sil.rad_sf adna 
        ****ADDIND in sfric 'STOP Executing sfric in sillib.c POTS
        ****ASSIGNING getSF to sil.segment[4]
        ****ASSIGNING sil.rad_sf to sil.segment[1]

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNED getSF to sil.segment[4]
        ****ASSIGNED sil.rad_sf to sil.segment[1]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[1]:adna SEULAV
     ****VALUES Segment sil.segment[2]: SEULAV
     ****VALUES Segment sil.segment[3]: SEULAV
     ****VALUES Segment sil.segment[4]:bam SEULAV
     ****VALUES Segment sil.segment[5]: SEULAV
     ****VALUES Segment sil.segment[6]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[1]:adna SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[2]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[3]: SEULAV
     ****ALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[4]:bam SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[5]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[6]: SEULAV
 CALLING analysis (1) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (1) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf adna FROM LOOP getSFset GNILLAC

START Executing analysis in sillib.c Parameter: rad adna TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad adna on sil.radical adna
CALLING getSAIset with parameters: rad :adna  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment 		FROM tabsai AS t1,tabsai AS t2 		WHERE t1.segment=LEFT('adna',LENGTH(t1.segment)) AND 		t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment 		FROM tabsai AS t1,tabsai AS t2 		WHERE t1.segment=LEFT('adna',LENGTH(t1.segment)) AND 		t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adna at index 3 to rad_sai a 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d06 to sil.ind_alt d06 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt ann to sil.rad_alt anna 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai a to rad_alt anna
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt anna and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('anna', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='anna'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('anna', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='anna'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adna at index 3 to rad_sai a 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d12 to sil.ind_alt d12 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt adgn to sil.rad_alt adgna 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai a to rad_alt adgna
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt adgna and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adgna', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adgna'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adgna', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adgna'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adna at index 3 to rad_sai a 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d12 to sil.ind_alt d12 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt agn to sil.rad_alt agna 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai a to rad_alt agna
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt agna and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('agna', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='agna'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('agna', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='agna'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad adna POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical adna and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adna', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adna'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adna', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adna'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf: adna GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment 		FROM tabsm WHERE segment=RIGHT('adna',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment 		FROM tabsm WHERE segment=RIGHT('adna',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[2]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING smric in sillib.c CALLER siln in input_functions_alpha.c with parameters sil.rad_sf, sil.rad_sm1, SM1 GNILLAC

START Executing smric in sillib.c TRATS

START Executing getSM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing getSM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing getSM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:0 POTS
        ****COPYING in smric N chars 3 of radi_si on rado (SM=sm_n 0)
        ****ADDIND in smric '        ****COPIED in smric N chars 3 of radi adna on rado adn (SM=sm_n 0)
        ****ADDED in smric 'STOP Executing smric in sillib.c POTS
STOP Executing smric in sillib.c POTS
        ****ASSIGNING getSM(SM1) to sil.segment[3]
        ****ASSIGNING sil.rad_sm1 to sil.segment[1]

START Executing getSM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:0 POTS
        ****ASSIGNED getSM(SM1) to sil.segment[3]
        ****ASSIGNED sil.rad_sm1 to sil.segment[1]
        ****VALUES IN LOOP getSMset_1 (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
         ****VALUES IN LOOP getSMset_1 (CHANGED) Segment sil.segment[1]:adn SEULAV
         ****VALUES IN LOOP getSMset_1 Segment sil.segment[2]: SEULAV
         ****VALUES IN LOOP getSMset_1 (CHANGED) Segment sil.segment[3]:a SEULAV
         ****VALUES IN LOOP getSMset_1 Segment sil.segment[4]:bam SEULAV
         ****VALUES IN LOOP getSMset_1 Segment sil.segment[5]: SEULAV
         ****VALUES IN LOOP getSMset_1 Segment sil.segment[6]: SEULAV
         ****VALUES Segment sil.segment[0]: SEULAV
         ****VALUES Segment sil.segment[1]:adn SEULAV
         ****VALUES Segment sil.segment[2]: SEULAV
         ****VALUES Segment sil.segment[3]:a SEULAV
         ****VALUES Segment sil.segment[4]:bam SEULAV
         ****VALUES Segment sil.segment[5]: SEULAV
         ****VALUES Segment sil.segment[6]: SEULAV
 CALLING analysis (2) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (2) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sm1 adn FROM LOOP getSMset_1 GNILLAC

START Executing analysis in sillib.c Parameter: rad adn TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad adn on sil.radical adn
CALLING getSAIset with parameters: rad :adn  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment 		FROM tabsai AS t1,tabsai AS t2 		WHERE t1.segment=LEFT('adn',LENGTH(t1.segment)) AND 		t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment 		FROM tabsai AS t1,tabsai AS t2 		WHERE t1.segment=LEFT('adn',LENGTH(t1.segment)) AND 		t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adn at index 3 to rad_sai  

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d06 to sil.ind_alt d06 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt ann to sil.rad_alt ann 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai  to rad_alt ann
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt ann and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('ann', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='ann'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('ann', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='ann'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs r7051 and BY_LES CALLER analysis in sillib.c LOOP getLESset GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 3509 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id a2077
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen mv
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem v
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les ann
        ****COPIED in getLES curLES[q_mode][7] on rec->codles n2
        ****COPIED in getLES curLES[q_mode][8] on rec->lem 
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo a
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id 76871956 
CALLING comp CALLER analysis in sillib.c GNILLAC

START Executing comp in sillib.c
    ****CHECKED sil.ind_alt -d06- in comp in sillib.c OK
CALLING compai CALLER comp in sillib.c sil.ind_alt OK GNILLAC

START Executing compai in sillib.c TRATS

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS
STOPT Executing compai in sillib.c. Returning 0  POTS
    ****CHECKED compai comp in H�<$H���7� in sillib.c (sil.ind_alt OK) OK

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs a2077 and BY_LES CALLER analysis in sillib.c LOOP getLESset GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 3858 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id a2292
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen m
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les ann
        ****COPIED in getLES curLES[q_mode][7] on rec->codles n2
        ****COPIED in getLES curLES[q_mode][8] on rec->lem 
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo b
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id 76871956 
CALLING comp CALLER analysis in sillib.c GNILLAC

START Executing comp in sillib.c
    ****CHECKED sil.ind_alt -d06- in comp in sillib.c OK
CALLING compai CALLER comp in sillib.c sil.ind_alt OK GNILLAC

START Executing compai in sillib.c TRATS

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS
STOPT Executing compai in sillib.c. Returning 0  POTS
    ****CHECKED compai comp in H�<$H���7� in sillib.c (sil.ind_alt OK) OK

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs a2292 and BY_LES CALLER analysis in sillib.c LOOP getLESset GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 6137 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id a7061
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les ann
        ****COPIED in getLES curLES[q_mode][7] on rec->codles v1i
        ****COPIED in getLES curLES[q_mode][8] on rec->lem 
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id 76871956 
CALLING comp CALLER analysis in sillib.c GNILLAC

START Executing comp in sillib.c
    ****CHECKED sil.ind_alt -d06- in comp in sillib.c OK
CALLING compai CALLER comp in sillib.c sil.ind_alt OK GNILLAC

START Executing compai in sillib.c TRATS

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS
STOPT Executing compai in sillib.c. Returning 0  POTS
    ****CHECKED compai comp in H�<$H���7� in sillib.c (sil.ind_alt OK) OK

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adn at index 3 to rad_sai  

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d12 to sil.ind_alt d12 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt adgn to sil.rad_alt adgn 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai  to rad_alt adgn
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt adgn and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adgn', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adgn'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adgn', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adgn'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adn at index 3 to rad_sai  

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d12 to sil.ind_alt d12 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt agn to sil.rad_alt agn 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai  to rad_alt agn
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt agn and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('agn', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='agn'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('agn', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='agn'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs a7061 and BY_LES CALLER analysis in sillib.c LOOP getLESset GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 2126 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id a1182
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen f
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les agn
        ****COPIED in getLES curLES[q_mode][7] on rec->codles n1
        ****COPIED in getLES curLES[q_mode][8] on rec->lem 
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo a
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id 76871956 
CALLING comp CALLER analysis in sillib.c GNILLAC

START Executing comp in sillib.c
    ****CHECKED sil.ind_alt -d12- in comp in sillib.c OK
CALLING compai CALLER comp in sillib.c sil.ind_alt OK GNILLAC

START Executing compai in sillib.c TRATS

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
STOPT Executing compai in sillib.c. Returning 0  POTS
    ****CHECKED compai comp in H�<$H���7� in sillib.c (sil.ind_alt OK) OK

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs a1182 and BY_LES CALLER analysis in sillib.c LOOP getLESset GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 2166 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id a1201
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen f
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les agn
        ****COPIED in getLES curLES[q_mode][7] on rec->codles n2e
        ****COPIED in getLES curLES[q_mode][8] on rec->lem -os
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 2
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id 76871956 
CALLING comp CALLER analysis in sillib.c GNILLAC

START Executing comp in sillib.c
    ****CHECKED sil.ind_alt -d12- in comp in sillib.c OK
CALLING compai CALLER comp in sillib.c sil.ind_alt OK GNILLAC

START Executing compai in sillib.c TRATS

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
STOPT Executing compai in sillib.c. Returning 0  POTS
    ****CHECKED compai comp in H�<$H���7� in sillib.c (sil.ind_alt OK) OK

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs a1201 and BY_LES CALLER analysis in sillib.c LOOP getLESset GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 2179 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id a1207
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen m
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les agn
        ****COPIED in getLES curLES[q_mode][7] on rec->codles n2
        ****COPIED in getLES curLES[q_mode][8] on rec->lem 
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu +
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id 76871956 
CALLING comp CALLER analysis in sillib.c GNILLAC

START Executing comp in sillib.c
    ****CHECKED sil.ind_alt -d12- in comp in sillib.c OK
CALLING compai CALLER comp in sillib.c sil.ind_alt OK GNILLAC

START Executing compai in sillib.c TRATS

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
STOPT Executing compai in sillib.c. Returning 0  POTS
    ****CHECKED compai comp in H�<$H���7� in sillib.c (sil.ind_alt OK) OK

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs a1207 and BY_LES CALLER analysis in sillib.c LOOP getLESset GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 2180 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id a1207
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen f
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les agn
        ****COPIED in getLES curLES[q_mode][7] on rec->codles n1e
        ****COPIED in getLES curLES[q_mode][8] on rec->lem 
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo b
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu +
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id 76871956 
CALLING comp CALLER analysis in sillib.c GNILLAC

START Executing comp in sillib.c
    ****CHECKED sil.ind_alt -d12- in comp in sillib.c OK
CALLING compai CALLER comp in sillib.c sil.ind_alt OK GNILLAC

START Executing compai in sillib.c TRATS

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
STOPT Executing compai in sillib.c. Returning 0  POTS
    ****CHECKED compai comp in H�<$H���7� in sillib.c (sil.ind_alt OK) OK

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad adn POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical adn and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adn', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adn'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adn', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adn'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs a1207 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 1304 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id a0709
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv +
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les adn
        ****COPIED in getLES curLES[q_mode][7] on rec->codles v1i
        ****COPIED in getLES curLES[q_mode][8] on rec->lem 
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra d06
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id 76871956 
CALLING comp. CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing comp in sillib.c
    ****CHECKED sil.ind_alt   in sillib.c KO

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 --

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  STOP
    ****CHECKED in compspf getSPF(SPF2) OK 
    ****CHECKED in compspf areavs.spf[0] == 'p' returning 1 KO 
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) KO

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 POTS
    ****CHECKED in comp in sillib.c isanySM(SM2) KO

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS
    ****CHECKED isanySM(SM1) OK
CALLING compsm1 CALLER comp in sillib.c GNILLAC

START Executing compsm1 in sillib.c TRATS
    ****CHECKED in compsm1 areavs.smv = + and areavs.codles v1i OK
CALLING getSF_cod_set CALLER compsm1 
CALLING getSF_cod_set with condition ( comp_cod_prec='v1i' )  and mode 1 CALLER compsm1 

START Executing getSF_cod_set in query_table_TABSF_alpha.c CASE 1 TRATS

START Executing getSM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing getSM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS

SQL Executing getSF_cod_set in query_table_TABSF_alpha.c with condition:( comp_cod_prec='v1i' )  and mode: 1 and query:SELECT DISTINCT comp_cod,comp_cod_prec,comp_cod_succ 		FROM tabsf,tabsm 		WHERE (tabsf.segment='bam') AND (tabsm.segment='a') 		AND (comp_cod_succ=IF( LEFT(comp_cod_succ,1)='v', LEFT(comp_cod,LENGTH(comp_cod_succ)), comp_cod ) ) AND (( comp_cod_prec='v1i' ) ) CASE 1 SQL
LQS Executing getSF_cod_set in query_table_TABSF_alpha.c with condition:( comp_cod_prec='v1i' )  and mode: 1 and query:SELECT DISTINCT comp_cod,comp_cod_prec,comp_cod_succ 		FROM tabsf,tabsm 		WHERE (tabsf.segment='bam') AND (tabsm.segment='a') 		AND (comp_cod_succ=IF( LEFT(comp_cod_succ,1)='v', LEFT(comp_cod,LENGTH(comp_cod_succ)), comp_cod ) ) AND (( comp_cod_prec='v1i' ) ) CASE 1 LQS
STOP Executing getSF_cod_set in query_table_TABSF_alpha.c CASE 1 POTS

START Executing isanySF_cod in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF_cod in query_table_TABSF_alpha.c  POTS

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_2 (SM2) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_2 (SM2) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sm1: adn GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment 		FROM tabsm WHERE segment=RIGHT('adn',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment 		FROM tabsm WHERE segment=RIGHT('adn',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 POTS

START Executing nextSM in query_table_TABSM_alpha.c with sm_n:0 and curSMset[sm_n]:  and curSM[sm_n]: 24298952 TRATS
STOP Executing nextSM in query_table_TABSM_alpha.c with sm_n:0 and curSMset[sm_n]:  and curSM[sm_n]: 24298952 TRATS POTS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing nextSF in query_table_TABSF_alpha.c TRATS
STOP Executing nextSF in query_table_TABSF_alpha.c  POTS

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNING EOS to sil.segment[2]
        ****ASSIGNING EOS to sil.segment[3]
        ****ASSIGNED EOS to sil.segment[2]
        ****ASSIGNED EOS to sil.segment[3]
CALLING sfric in sillib.c CALLER siln in input_functions_alpha.c GNILLAC

START Executing sfric in sillib.c TRAST

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****COPYING in sfric N chars 3 of sil.rad_si on sil.rad_sf 
        ****ADDIND in sfric '        ****COPIED in sfric N chars 3 of sil.rad_si adnabam on sil.rad_sf adn 
        ****ADDIND in sfric 'STOP Executing sfric in sillib.c POTS
        ****ASSIGNING getSF to sil.segment[4]
        ****ASSIGNING sil.rad_sf to sil.segment[1]

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS
        ****ASSIGNED getSF to sil.segment[4]
        ****ASSIGNED sil.rad_sf to sil.segment[1]
    ****VALUES Segment sil.segment[0]: SEULAV
     ****VALUES Segment sil.segment[1]:adn SEULAV
     ****VALUES Segment sil.segment[2]: SEULAV
     ****VALUES Segment sil.segment[3]: SEULAV
     ****VALUES Segment sil.segment[4]:abam SEULAV
     ****VALUES Segment sil.segment[5]: SEULAV
     ****VALUES Segment sil.segment[6]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSIset) Segment sil.segment[0]: SEULAV
     ****VALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[1]:adn SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[2]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[3]: SEULAV
     ****ALUES IN LOOP getSFset (CHANGED IN LOOP getSFset) Segment sil.segment[4]:abam SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[5]: SEULAV
     ****VALUES IN LOOP getSFset Segment sil.segment[6]: SEULAV
 CALLING analysis (1) in sillib. CALLER siln in input_functions_alpha.c GNILLAC
CALLING analysis (1) in sillib.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf adn FROM LOOP getSFset GNILLAC

START Executing analysis in sillib.c Parameter: rad adn TRAST
        ****COPYING in (null) rad on sil.radical
        ****COPIED in analysis rad adn on sil.radical adn
CALLING getSAIset with parameters: rad :adn  CALLER analysis in sillib.c GNILLAC

SQL Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment 		FROM tabsai AS t1,tabsai AS t2 		WHERE t1.segment=LEFT('adn',LENGTH(t1.segment)) AND 		t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment SQL
LQS Executing getSAIset in query_table_TABSAI_alpha.c with query: SELECT  t1.segment, t1.comp_cod, t2.segment 		FROM tabsai AS t1,tabsai AS t2 		WHERE t1.segment=LEFT('adn',LENGTH(t1.segment)) AND 		t1.comp_cod=t2.comp_cod AND t1.segment!=t2.segment 	ORDER BY t1.segment LQS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adn at index 3 to rad_sai  

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d06 to sil.ind_alt d06 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:ann POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt ann to sil.rad_alt ann 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai  to rad_alt ann
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt ann and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('ann', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='ann'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('ann', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='ann'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs a0709 and BY_LES CALLER analysis in sillib.c LOOP getLESset GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 3509 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id a2077
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen mv
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem v
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les ann
        ****COPIED in getLES curLES[q_mode][7] on rec->codles n2
        ****COPIED in getLES curLES[q_mode][8] on rec->lem 
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo a
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id 76871956 
CALLING comp CALLER analysis in sillib.c GNILLAC

START Executing comp in sillib.c
    ****CHECKED sil.ind_alt -d06- in comp in sillib.c OK
CALLING compai CALLER comp in sillib.c sil.ind_alt OK GNILLAC

START Executing compai in sillib.c TRATS

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS
STOPT Executing compai in sillib.c. Returning 0  POTS
    ****CHECKED compai comp in H�<$H���7� in sillib.c (sil.ind_alt OK) OK

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs a2077 and BY_LES CALLER analysis in sillib.c LOOP getLESset GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 3858 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id a2292
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen m
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les ann
        ****COPIED in getLES curLES[q_mode][7] on rec->codles n2
        ****COPIED in getLES curLES[q_mode][8] on rec->lem 
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo b
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id 76871956 
CALLING comp CALLER analysis in sillib.c GNILLAC

START Executing comp in sillib.c
    ****CHECKED sil.ind_alt -d06- in comp in sillib.c OK
CALLING compai CALLER comp in sillib.c sil.ind_alt OK GNILLAC

START Executing compai in sillib.c TRATS

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS
STOPT Executing compai in sillib.c. Returning 0  POTS
    ****CHECKED compai comp in H�<$H���7� in sillib.c (sil.ind_alt OK) OK

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs a2292 and BY_LES CALLER analysis in sillib.c LOOP getLESset GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 6137 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id a7061
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les ann
        ****COPIED in getLES curLES[q_mode][7] on rec->codles v1i
        ****COPIED in getLES curLES[q_mode][8] on rec->lem 
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id 76871956 
CALLING comp CALLER analysis in sillib.c GNILLAC

START Executing comp in sillib.c
    ****CHECKED sil.ind_alt -d06- in comp in sillib.c OK
CALLING compai CALLER comp in sillib.c sil.ind_alt OK GNILLAC

START Executing compai in sillib.c TRATS

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d06 POTS
STOPT Executing compai in sillib.c. Returning 0  POTS
    ****CHECKED compai comp in H�<$H���7� in sillib.c (sil.ind_alt OK) OK

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adn at index 3 to rad_sai  

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d12 to sil.ind_alt d12 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:adgn POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt adgn to sil.rad_alt adgn 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai  to rad_alt adgn
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt adgn and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adgn', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adgn'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adgn', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adgn'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
CALLING sairic. CALLER (null) in sillib.c LOOP getSAIset GNILLAC

START Executing sairic in sillib.c TRATS

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 
        ****COPYING in  sairic in sillib.c. From the radical sil.radical at index 3 to rad_sai  
        ****COPYING in  sairic in sillib.c. From getSAI_cod to sil.ind_alt 
        ****COPYING in sairic in sillib.c. From getSAI_alt  to sil.rad_alt 
        ****ADDING in sairic in sillib.c. Add sil.rad_sai to sil.rad_alt 

START Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn TRATS 
STOP Executing getSAI in query_table_TABSAI_alpha.c with curSAI[0]:adn POTS 

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn POTS
        ****COPIED in  sairic in sillib.c. From the radical sil.radical adn at index 3 to rad_sai  

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
        ****COPIED in  sairic in sillib.c. From getSAI_cod d12 to sil.ind_alt d12 

START Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn TRATS
STOP Executing getSAI_alt in query_table_TABSAI_alpha.c with curSAI[2]:agn POTS
        ****COPIED in sairic in sillib.c. From getSAI_alt agn to sil.rad_alt agn 
        ****ADDED in sairic in sillib.c. Add sil.rad_sai  to rad_alt agn
STOP Executing sairic in sillib.c POTS
CALLING getLESset with parameters: sil.rad_alt agn and BY_LES CALLER analysis in sillib.c GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('agn', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='agn'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('agn', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='agn'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs a7061 and BY_LES CALLER analysis in sillib.c LOOP getLESset GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 2126 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id a1182
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen f
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les agn
        ****COPIED in getLES curLES[q_mode][7] on rec->codles n1
        ****COPIED in getLES curLES[q_mode][8] on rec->lem 
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo a
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id 76871956 
CALLING comp CALLER analysis in sillib.c GNILLAC

START Executing comp in sillib.c
    ****CHECKED sil.ind_alt -d12- in comp in sillib.c OK
CALLING compai CALLER comp in sillib.c sil.ind_alt OK GNILLAC

START Executing compai in sillib.c TRATS

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
STOPT Executing compai in sillib.c. Returning 0  POTS
    ****CHECKED compai comp in H�<$H���7� in sillib.c (sil.ind_alt OK) OK

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs a1182 and BY_LES CALLER analysis in sillib.c LOOP getLESset GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 2166 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id a1201
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen f
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les agn
        ****COPIED in getLES curLES[q_mode][7] on rec->codles n2e
        ****COPIED in getLES curLES[q_mode][8] on rec->lem -os
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 2
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id 76871956 
CALLING comp CALLER analysis in sillib.c GNILLAC

START Executing comp in sillib.c
    ****CHECKED sil.ind_alt -d12- in comp in sillib.c OK
CALLING compai CALLER comp in sillib.c sil.ind_alt OK GNILLAC

START Executing compai in sillib.c TRATS

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
STOPT Executing compai in sillib.c. Returning 0  POTS
    ****CHECKED compai comp in H�<$H���7� in sillib.c (sil.ind_alt OK) OK

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs a1201 and BY_LES CALLER analysis in sillib.c LOOP getLESset GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 2179 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id a1207
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen m
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les agn
        ****COPIED in getLES curLES[q_mode][7] on rec->codles n2
        ****COPIED in getLES curLES[q_mode][8] on rec->lem 
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu +
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id 76871956 
CALLING comp CALLER analysis in sillib.c GNILLAC

START Executing comp in sillib.c
    ****CHECKED sil.ind_alt -d12- in comp in sillib.c OK
CALLING compai CALLER comp in sillib.c sil.ind_alt OK GNILLAC

START Executing compai in sillib.c TRATS

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
STOPT Executing compai in sillib.c. Returning 0  POTS
    ****CHECKED compai comp in H�<$H���7� in sillib.c (sil.ind_alt OK) OK

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs a1207 and BY_LES CALLER analysis in sillib.c LOOP getLESset GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 2180 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id a1207
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen f
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv 
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les agn
        ****COPIED in getLES curLES[q_mode][7] on rec->codles n1e
        ****COPIED in getLES curLES[q_mode][8] on rec->lem 
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo b
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu +
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra 
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id 76871956 
CALLING comp CALLER analysis in sillib.c GNILLAC

START Executing comp in sillib.c
    ****CHECKED sil.ind_alt -d12- in comp in sillib.c OK
CALLING compai CALLER comp in sillib.c sil.ind_alt OK GNILLAC

START Executing compai in sillib.c TRATS

START Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 TRATS
STOP Executing getSAI_cod in query_table_TABSAI_alpha.c with curSAI[1]:d12 POTS
STOPT Executing compai in sillib.c. Returning 0  POTS
    ****CHECKED compai comp in H�<$H���7� in sillib.c (sil.ind_alt OK) OK

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing nextSAI in query_table_TABSAI_alpha.c TRATS
STOP Executing nextSAI in query_table_TABSAI_alpha.c  POTS

START Executing isanySAI in query_table_TABSAI_alpha.c TRATS
STOP Executing isanySAI in query_table_TABSAI_alpha.c  POTS
STOP Executing analysis in sillib.c Parameter rad adn POTS
        ****ASSIGNING EOS to sil.ind_alt
        ****ASSIGNING EOS to sil.rad_alt
        ****ASSIGNED EOS to sil.ind_alt 
        ****ASSIGNED EOS to sil.rad_alt 

START Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getLESset with parameters: sil.radical adn and BY_LES CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adn', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adn'  and BY_LES SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario INNER JOIN graph_vars ON a_gra=gv_code WHERE 			les=REPLACE('adn', gv_in, gv_out) 	UNION  SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key 			FROM lessario WHERE les='adn'  and BY_LES LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
CALLING getLES with parameters: areavs a1207 and BY_LES CALLER analysis in sillib.c LOOP getLESset loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing getLES in query_table_LESSARIO_alpha.c with   q_mode: 0 TRATS
        ****COPYING in getLES curLES[q_mode][0] on rec->n_id
        ****ASSIGNING in getLES curLES[q_mode][1])[0] to rec->gen
        ****ASSIGNING in getLES curLES[q_mode][2])[0] to rec->clem
        ****ASSIGNING in getLES curLES[q_mode][3])[0] to rec->si
        ****ASSIGNING in getLES curLES[q_mode][4])[0] to rec->smv
        ****COPYING in getLES curLES[q_mode][5] on rec->spf
        ****COPYING in getLES curLES[q_mode][6] on rec->les
        ****COPYING in getLES curLES[q_mode][7] on rec->codles
        ****COPYING in getLES curLES[q_mode][8] on rec->lem
        ****COPYING in getLES curLES[q_mode][9] on rec->s_omo
        ****ASSIGNING in getLES curLES[q_mode][10][0] to rec->piu
        ****COPYING in getLES curLES[q_mode][11] on rec->codlem
        ****ASSIGNING in getLES curLES[q_mode][12][0] to rec->type
        ****ASSIGNING in getLES curLES[q_mode][13][0] to rec->cod_noseg
        ****ASSIGNING in getLES curLES[q_mode][14][0] to rec->pt
        ****COPYING in getLES curLES[q_mode][15] on rec->a_gra
        ****ASSIGNING in getLES curLES[q_mode][16][0] to rec->gra_u
        ****COPYING (FORMATTING) in getLES curLES[q_mode][17] on rec->les_id
STOP Executing getLES in query_table_LESSARIO_alpha.c with rec (les_id) 1304 and q_mode: 0 POTS
        ****COPIED in getLES curLES[q_mode][0] on rec->n_id a0709
        ****ASSIGNED in getLES curLES[q_mode][1])[0] to rec->gen 
        ****ASSIGNED in getLES curLES[q_mode][2])[0] to rec->clem 
        ****ASSIGNED in getLES curLES[q_mode][3])[0] to rec->si 
        ****ASSIGNED in getLES curLES[q_mode][4])[0] to rec->smv +
        ****COPIED in getLES curLES[q_mode][5] on rec->spf 
        ****COPIED in getLES curLES[q_mode][6] on rec->les adn
        ****COPIED in getLES curLES[q_mode][7] on rec->codles v1i
        ****COPIED in getLES curLES[q_mode][8] on rec->lem 
        ****COPIED in getLES curLES[q_mode][9] on rec->s_omo 
        ****ASSIGNED in getLES curLES[q_mode][10][0] to rec->piu 
        ****COPIED in getLES curLES[q_mode][11] on rec->codlem 
        ****ASSIGNED in getLES curLES[q_mode][12][0] to rec->type 
        ****ASSIGNED in getLES curLES[q_mode][13][0] to rec->cod_noseg 
        ****ASSIGNED in getLES curLES[q_mode][14][0] to rec->pt 
        ****COPIED in getLES curLES[q_mode][15] on rec->a_gra d06
        ****ASSIGNED in getLES curLES[q_mode][16][0] to rec->gra_u 
        ****COPIED (FORMATTED) in getLES curLES[q_mode][17] on rec->les_id 76871956 
CALLING comp. CALLER analysis in sillib.c loop over LESSARIO outside the main loop over TABSAI GNILLAC

START Executing comp in sillib.c
    ****CHECKED sil.ind_alt   in sillib.c KO

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing getSI in query_table_TABSI_alpha.c with curSI[0]: 
STOP Executing getSI in query_table_TABSI_alpha.c with curSI[0]: POTS
GETSI KO -- and -1- comp
    ****CHECKED isanySI and getSI in comp in siilib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:0 and value:  STOP
GETSPF KO_1 -- and -1- comp
    ****CHECKED isanySPF(SPF1) and getSPF(SPF1) in comp in sillib.c KO

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --
GETSPF OK_2  -1- comp
    ****CHECKED isanySPF(SPF2) in comp in sillib.c OK

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  STOP
CALLING compspf CALLER comp in sillib.c (isanySPF(SPF2) OK) GNILLAC spf2 --

START Executing compspf in sillib.c TRATS
        ****ASSIGNING in compspf 0 to sil.part
        ****ASSIGNED in compspf 0 to sil.part 0 

START Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  TRAST
STOP Executing getSPF in query_table_TABSPF_alpha.c with spf_n:1 and value:  STOP
    ****CHECKED in compspf getSPF(SPF2) OK 
    ****CHECKED in compspf areavs.spf[0] == 'p' returning 1 KO 
    ****CHECKED compspf comp in sillib.c (isanySPF(SPF2) OK) KO

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:1 POTS
    ****CHECKED in comp in sillib.c isanySM(SM2) KO

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS
    ****CHECKED isanySM(SM1) KO
CALLING compsf CALLER comp in sillib.c GNILLAC

START Executing compsf in sillib.c TRATS
    ****CHECKED in compsf areavs.codles)[0] == 'v' OK
CALLING getSF_cod_set. CALLER compsf in sillib.c GNILLAC
CALLING getSF_cod_set. CALLER compsf in sillib.c with condition: ( LEFT(comp_cod,3) LIKE 'v1i' ) and mode 0 GNILLAC

START Executing getSF_cod_set in query_table_TABSF_alpha.c CASE 0 TRATS

START Executing getSF in query_table_TABSF_alpha.c TRATS
STOP Executing getSF in query_table_TABSF_alpha.c  POTS

SQL Executing getSF_cod_set in query_table_TABSF_alpha.c with condition:( LEFT(comp_cod,3) LIKE 'v1i' ) and mode: 0 and query:SELECT DISTINCT comp_cod 		FROM tabsf WHERE (segment='abam') AND (( LEFT(comp_cod,3) LIKE 'v1i' ))  CASE 0 SQL
LQS Executing getSF_cod_set in query_table_TABSF_alpha.c with condition:( LEFT(comp_cod,3) LIKE 'v1i' ) and mode: 0 and query:SELECT DISTINCT comp_cod 		FROM tabsf WHERE (segment='abam') AND (( LEFT(comp_cod,3) LIKE 'v1i' )) CASE 0 LQS
STOP Executing getSF_cod_set in query_table_TABSF_alpha.c CASE 0 POTS
CALLING areacp CALLER compsf in sillib.c 

START Executing areacp in sillib.c TRATS
        ****COPYING in areacp s->n_id on t->n_id 
        ****ASSIGNING in areacp s->gen to t->gen 
        ****ASSIGNING in areacp s->clem to t->clem 
        ****ASSIGNING in areacp s->si to t->si 
        ****ASSIGNING in areacp s->smv to t->smv 
        ****COPYING in areacp s->spf on t->spf 
        ****COPYING in areacp s->codles on t->codles 
        ****COPYING in areacp s->les on t->les 
        ****COPYING in areacp s->lem on t->lem 
        ****COPYING in areacp s->s_omo on t->s_omo 
        ****ASSIGNING in areacp s->piu to t->piu 
        ****COPYING in areacp s->codlem on t->codlem 
        ****ASSIGNING in areacp s->type to t->type 
        ****ASSIGNING in areacp s->cod_noseg to t->cod_noseg 
        ****ASSIGNING in areacp pt to t->pt 
        ****COPYING in areacp s->a_gra on t->a_gra 
        ****ASSIGNING in areacp s->gra_u to t->gra_u 
        ****ASSIGNING in areacp s->les_id to t->les_id 
        ****COPIED in areacp s->n_id a0709 on t->n_id a0709 
        ****ASSIGNED in areacp s->gen  to t->gen 
        ****ASSIGNED in areacp s->clem  to t->clem  
        ****ASSIGNED in areacp s->si (null) to t->si (null) 
        ****ASSIGNED in areacp s->smv to t->smv 
        ****COPIED in areacp s->spf  on t->spf  
        ****COPIED in areacp s->codles v1i on t->codles v1i 
        ****COPIED in areacp s->les adn on t->les adn 
        ****COPIED in areacp s->lem  on t->lem  
        ****COPIED in areacp s->s_omo  on t->s_omo  
        ****ASSIGNED in areacp s->piu (null) to t->piu (null) 
        ****COPIED in areacp s->codlem  on t->codlem  
        ****ASSIGNED in areacp s->type (null) to t->type (null) 
        ****ASSIGNED in areacp s->cod_noseg  to t->cod_noseg  
        ****ASSIGNED in areacp s->pt (null) to t->pt (null) 
        ****COPIED in areacp s->a_gra d06 on t->a_gra d06 
        ****ASSIGNED in areacp s->gra_u  to t->gra_u  
        ****ASSIGNED in areacp s->les_id 1304 to t->les_id 1304 
STOP Executing areacp in sillib.c POTS
    ****COPYING in compsf areal.les to sil.lemma 
    ****COPYING in compsf areal.codles to sil.codice 
    ****COPIED in compsf areal.les adn to sil.lemma adn 
    ****COPIED in compsf areal.codles v1i to sil.codice v1i 
CALLING lemtiz. CALLER compsf in sillib.c with areal: a0709 and IPOLEMMA GNILLAC

START Executing lemtiz in sillib.c TRATS
        ****CHECKED in lemtiz sil.isLE KO ELSESB_5 

SQL Executing build_lemma in query_table_LEMMAENDING_alpha.c with query: SELECT INSERT('adn',LENGTH('adn')-LENGTH(in_ending)+1,LENGTH(in_ending),out_ending) 		FROM lemma_ending WHERE codles='v1i' AND in_ending=RIGHT('adn',LENGTH(in_ending)) 		ORDER BY LENGTH(in_ending) DESC LIMIT 1 SQL
        ****CHECKING resultset in build_lemma
        ****CHECKED resultset in build_lemma OK
        ****COPYING in build_lemma cur_lemma[0] on out_str 
        ****COPIED in build_lemma cur_lemma[0] on out_str adno 
LQS Executing build_lemma in query_table_LEMMAENDING_alpha.c with query: SELECT INSERT('adn',LENGTH('adn')-LENGTH(in_ending)+1,LENGTH(in_ending),out_ending) 		FROM lemma_ending WHERE codles='v1i' AND in_ending=RIGHT('adn',LENGTH(in_ending)) 		ORDER BY LENGTH(in_ending) DESC LIMIT 1 LQS
        ****COPIED in lemtiz sil.lemma adno
        ****COPIED in lemtiz sil.codice v1i
CALLING set_codlem3eagles CALLER lemtiz in sillib.c SECOND BLOCK IFSB_4

START Executing set_codlem3eagles in sillib.c TRATS 
CALLING get_codlem3eagles CALLER set_codlem3eagles ELSE 
        ****CHECKED resultset in get_codlem3eagles OK
        ****COPYING in get_codlem3eagles cur_eagles3[0] on codlem
        ****ASSIGNING in get_codlem3eagles cur_eagles3[1] to c01
        ****ASSIGNING in get_codlem3eagles cur_eagles3[2] to c02
        ****ASSIGNING in get_codlem3eagles cur_eagles3[3] to c03
        ****COPIED in get_codlem3eagles cur_eagles3[0] on codlem
        ****ASSIGNED in get_codlem3eagles cur_eagles3[1] to c01
        ****ASSIGNED in get_codlem3eagles cur_eagles3[2] to c02
        ****ASSIGNED in get_codlem3eagles cur_eagles3[3] to c03
LQS Executing get_codlem3eagles in query_table_EAGLES_alpha.c with query: SELECT codlem,c01,c02,c03 		FROM eagles WHERE codles='v1i' LIMIT 1 LQS
STOP Executing set_codlem3eagles in sillib.c POTS 
CALLING pushLemma CALLER lemtiz in sillib.c SECOND BLOCK IFSB_4

START Executing pushLemma input_functions_alpha.c with IPOLEMMA TRATS
        ****COMPARING areavs.codles -> IF1
        ****COMPARED areavs.codles v1i IF1
CALLING newAnalysis. CALLER pushLemma in input_functions_alpha.c with IPOLEMMA and IF1 

START Executing newAnalysis in input_functions_alpha.c TRATS
        ****ASSIGNING curAnalysis: analysis 
        ****ASSIGNED curAnalysis: analysis 
        ****ASSIGNING EOS to  sil.segment[6] 
        ****ASSIGNED**** EOS to  sil.segment[6] 
        ****VALUES curAnalysis->segments[i] : SEULAV 0 
        ****COPYING segment[i]:  at index i: 0 IN IF input_functions_alpha.c
        ****COPIED segment[i]:  at index i: 0 IN IF input_functions_alpha.c
        ****VALUES curAnalysis->segments[i] :ros SEULAV 1 
        ****COPYING segment[i]: adn at index i: 1 IN IF input_functions_alpha.c
        ****COPIED segment[i]: adn at index i: 1 IN IF input_functions_alpha.c
        ****VALUES curAnalysis->segments[i] : SEULAV 2 
        ****COPYING segment[i]:  at index i: 2 IN IF input_functions_alpha.c
        ****COPIED segment[i]:  at index i: 2 IN IF input_functions_alpha.c
        ****VALUES curAnalysis->segments[i] : SEULAV 3 
        ****COPYING segment[i]:  at index i: 3 IN IF input_functions_alpha.c
        ****COPIED segment[i]:  at index i: 3 IN IF input_functions_alpha.c
        ****VALUES curAnalysis->segments[i] :as SEULAV 4 
        ****COPYING segment[i]: abam at index i: 4 IN IF input_functions_alpha.c
        ****COPIED segment[i]: abam at index i: 4 IN IF input_functions_alpha.c
        ****VALUES curAnalysis->segments[i] : SEULAV 5 
        ****COPYING segment[i]:  at index i: 5 IN IF input_functions_alpha.c
        ****COPIED segment[i]:  at index i: 5 IN IF input_functions_alpha.c
        ****VALUES curAnalysis->segments[i] : SEULAV 6 
        ****COPYING segment[i]:  at index i: 6 IN IF input_functions_alpha.c
        ****COPIED segment[i]:  at index i: 6 IN IF input_functions_alpha.c
        ****ASSIGNING sil.part to curAnalysis->part
        ****ASSIGNING 0 to curAnalysis->n_cod_morf
        ****ASSIGNED sil.part to curAnalysis->part
        ****ASSIGNED 0 to curAnalysis->n_cod_morf
CALLING initLemmas in input_functions_alpha.c CALLER newAnalysis in input_functions_alpha.c

START Executing initLemmas input_functions_alpha.c TRATS
        ****ASSIGNING numL=0 to curAnalysis->lemmas.numL
        ****ASSIGNED numL=0 to curAnalysis->lemmas.numL 0
STOP Executing initLemmas input_functions_alpha.c POTS
STOP Executing newAnalysis in input_functions_alpha.c POTS
        ****CHEKING sil.isLE
        ****VALUES sil.isLE 0 SEULAV 
CALLING getCod_morf_set. CALLER pushLemma in input_functions_alpha.c with IPOLEMMA and IF1 and sil.isLE KO 

SQL Executing getCod_morf_set in query_table_TABSF_alpha.c  SQL

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS
    ****CHECKED isanySM(SM1) KO
    ****CHECKED cod_noseg KO
    ****CHECKED cod[0] == v OK
        ****CHECKING gen in getCod_morf_set
        ****CHECKED gen  in getCod_morf_set 
LQS Executing getCod_morf_set in query_table_TABSF_alpha.c with query: SELECT CONCAT(c04,c05,c06,c07,c08,c09,c10) 				FROM tabsf WHERE (segment='abam')  AND (LEFT(comp_cod,3)='v1i')  LQS

START Executing isanyCod_morf in query_table_TABSF_alpha.c TRATS
STOP Executing isanyCod_morf in query_table_TABSF_alpha.c  POTS
        ****(MEM)COPYING 7 of getCod_morf() to curAnalysis->cod_morf_4_10[curAnalysis->n_cod_morf] -> IF1 and sil.isLE KO

START Executing getCod_morf in query_table_TABSF_alpha.c with curCod_morf[0]: a2--s1- TRATS
STOP Executing getCod_morf in query_table_TABSF_alpha.c with curCod_morf[0]: getCod_morf POTS
        ****(MEM)COPIED 7 of getCod_morf() to curAnalysis->cod_morf_4_10[curAnalysis->n_cod_morf] -> IF1 and sil.isLE KO a2--s1- 

START Executing nextCod_morf in query_table_TABSF_alpha.c TRATS
STOP Executing nextCod_morf in query_table_TABSF_alpha.c  POTS

START Executing isanyCod_morf in query_table_TABSF_alpha.c TRATS
STOP Executing isanyCod_morf in query_table_TABSF_alpha.c  POTS
CALLING newLemma. CALLER pushLemma in sillib.c with IPOLEMMA and IF1 

START Executing newLemma input_functions_alpha.c TRATS
        ****ASSIGNING curLemma: lemma 
        ****ASSIGNING curLemma: lem_type 
        ****ASSIGNED curLemma: lemma 
        ****ASSIGNED curLemma: lem_type
        ****COPYING a->n_id on curLemma->n_id 
        ****ASSIGNING a->gen to curLemma->gen 
        ****COPYING a->codles on curLemma->codles 
        ****COPYING sil.lemma on curLemma->out_lemma 
        ****COPYING sil.codice on curLemma->cod_lemma 
        ****ASSIGNING a->les_id to curLemma->les_id 
        ****COPIED a->n_id a0709 on curLemma->n_id a0709
        ****ASSIGNED a->gen  to curLemma->gen 
        ****COPIED a->codles v1i on curLemma->codles v1i 
        ****COPIED sil.lemma adno on curLemma->out_lemma adno
        ****COPIED sil.codice V1 on curLemma->cod_lemma V1 
        ****ASSIGNED a->les_id 1304 to curLemma->les_id 1304 
STOP Executing newLemma input_functions_alpha.c POTS
        ****(MEM)COPYING 3 of sil.eagles3 to curLemma->cod_morf_1_3 -> IF1 
        ****(MEM)COPIED 3 of sil.eagles3 to curLemma->cod_morf_1_3 -> IF1 VmF 
STOP Executing lemtiz in sillib.c returning  1 IFSB_4 POTS
        ****CHECKED in compsf lemtiz(&areal, IPOLEMMA) OK 
CALLING lemv. CALLER compsf in sillib.c with areal: a0709 and IPOLEMMA GNILLAC

START Executing lemv in sillib.c TRATS
    ****CHECKED areavs.clem  KO 
CALLING getLESset CALLER lemv

SQL Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario WHERE n_id='a0709' AND clem='v' and BY_CLEM SQL
LQS Executing getLESset in query_table_LESSARIO_alpha.c with query: SELECT n_id,gen,clem,si,smv,spf,les,codles,lem,s_omo,piu,codlem,type,codLE,pt,a_gra,gra_u,pr_key  FROM lessario WHERE n_id='a0709' AND clem='v' and BY_CLEM LQS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 1 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 1 POTS
STOP Executing lemv in sillib.c with areavs.clem:  POTS
CALLING clearSF_cod_set. CALLER compsf in sillib.c

START Executing clearSF_cod_set in query_table_TABSF_alpha.c TRATS
STOP Executing clearSF_cod_set in query_table_TABSF_alpha.c POTS
STOP Executing compsf in sillib.c POTS
STOP Executing comp in sillib.c POTS

START Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing nextLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS

START Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 TRATS
STOP Executing isanyLES in query_table_LESSARIO_alpha.c with q_mode: 0 POTS
STOP Executing analysis in sillib.c: loop over LESSARIO outside the main loop over TABSAI
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c GNILLAC
CALLING getSMset_1 (SM1) in query_table_TABSM_alpha.c CALLER siln in input_functions_alpha.c with parameter sil.rad_sf: adn GNILLAC

SQL Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment 		FROM tabsm WHERE segment=RIGHT('adn',LENGTH(segment)) SQL
LQS Executing getSMset in query_table_TABSM_alpha.c with query: SELECT DISTINCT segment 		FROM tabsm WHERE segment=RIGHT('adn',LENGTH(segment)) LQS

START Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 TRATS
STOP Executing isanySM in query_table_TABSM_alpha.c with sm_n:0 POTS

START Executing nextSF in query_table_TABSF_alpha.c TRATS
STOP Executing nextSF in query_table_TABSF_alpha.c  POTS

START Executing isanySF in query_table_TABSF_alpha.c TRATS
STOP Executing isanySF in query_table_TABSF_alpha.c  POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
Cursor in isanySI. Values anySI: -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --
EXITING LOOP SI. Counters:spf1 -0- spf2 -0- si-1- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -1- 

START Executing nextSI in query_table_TABSI_alpha.c TRATS
STOP Executing nextSI in query_table_TABSI_alpha.c  POTS

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -1- 0: -- 1: --

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --
EXITING LOOP SPF2. Counters:spf1 -0- spf2 -1- si-1- isanySPF(SPF1) -1- isanySPF(SPF2) -1- isanySI -0- 

START Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
NULL in  isanySPF and spf -1-

START Executing isanySI in query_table_TABSI_alpha.c TRATS
STOP Executing isanySI in query_table_TABSI_alpha.c  POTS
NULL in  isanySI

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:1  POTS 
NULL in  isanySPF and spf -1-

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
Cursor in isanySPF. Values anySPF: -1- spf -0- 0: -- 1: --
EXITING LOOP SPF1. Counters:spf1 -1- spf2 -1- si-1- isanySPF(SPF1) -1- isanySPF(SPF2) -0- isanySI -0- 

START Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing nextSPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 

START Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0 TRAST 
STOP Executing isanySPF in query_table_TABSPF_alpha.c with spf_n:0  POTS 
NULL in  isanySPF and spf -0-
STOP Executing siln in input_functions_alpha.c POTS
STOP Executing silcall in input_functions_alpha.c POTS


CALLING conOutLemmas in  interact.c. CALLER  main.c  GNILLAC

START Executing conOutLemmas in routine interact.c TRATS
Input  wordform : adnabam
Analized wordform : adnabam

============================RESULT OF ANALYSIS ================================

SEGMENTS:	adn -abam

------------------------codici morf. 1-------------------
a2--s1-


SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr 		FROM cod_morf WHERE field_pos=4 AND value=LOWER('a') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr Modo verbale  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Indicativo attivo 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr 		FROM cod_morf WHERE field_pos=4 AND value=LOWER('a') LQS
Modo verbale:	Indicativo attivo

SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr 		FROM cod_morf WHERE field_pos=5 AND value=LOWER('2') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr Tempo verbale  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Imperfetto 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr 		FROM cod_morf WHERE field_pos=5 AND value=LOWER('2') LQS
Tempo verbale:	Imperfetto

SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr 		FROM cod_morf WHERE field_pos=8 AND value=LOWER('s') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr Numero  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Singolare 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr 		FROM cod_morf WHERE field_pos=8 AND value=LOWER('s') LQS
Numero:	Singolare

SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr 		FROM cod_morf WHERE field_pos=9 AND value=LOWER('1') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr Persona  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Prima 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr 		FROM cod_morf WHERE field_pos=9 AND value=LOWER('1') LQS
Persona:	Prima
	============================LEMMA ================================
	adno                          V1   a0709 
	------------------------codici morfologici---------------------
	VmF


SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr 		FROM cod_morf WHERE field_pos=1 AND value=LOWER('V') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr PoS  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Verbo 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr 		FROM cod_morf WHERE field_pos=1 AND value=LOWER('V') LQS
	PoS:	Verbo

SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr 		FROM cod_morf WHERE field_pos=2 AND value=LOWER('m') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr Type  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  Main 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr 		FROM cod_morf WHERE field_pos=2 AND value=LOWER('m') LQS
	Type:	Main

SQL Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr 		FROM cod_morf WHERE field_pos=3 AND value=LOWER('F') SQL
        ****CHECKING resultset in descr_cod_morf
        ****CHECKED resultset in descr_cod_morf OK
        ****COPYING in descr_cod_morf cur_cod[0] on field_descr 
        ****COPYING in descr_cod_morf cur_cod[1] on value_descr 
        ****COPIED in descr_cod_morf cur_cod[0] on field_descr Categoria flessiva  
        ****COPIED in descr_cod_morf cur_cod[1] on value_descr  I coniug 
LQS Executing descr_cod_morf in query_table_CODMORF_alpha.c with query: SELECT field_descr,value_descr 		FROM cod_morf WHERE field_pos=3 AND value=LOWER('F') LQS
	Categoria flessiva:	I coniug
STOP Executing conOutLemmas in routine interact.c  POTS

CALLING prompt in  interact.c. CALLER  main.c . Parameter sw_file: 1 GNILLAC

START Executing prompt in routine interact.c TRATS

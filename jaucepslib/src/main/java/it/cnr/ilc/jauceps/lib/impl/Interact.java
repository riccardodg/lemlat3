/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.impl;

import it.cnr.ilc.jauceps.lib.headers.AInteract;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import org.apache.log4j.Logger;

/**
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public class Interact extends AInteract {

    int loglevel = 0;
    /* only info */
    static final String CLASS_NAME = Interact.class.getName();

    static Logger log = Logger.getLogger(CLASS_NAME);

    private File piFile;
    private File poFile;
    private File puFile;

    private PrintStream po = System.out;
    private PrintStream pu = System.out;
    private BufferedWriter pubw;// = new BufferedWriter(new OutputStreamWriter(pu));
    private BufferedWriter pobw; //= new BufferedWriter(new OutputStreamWriter(po));

    /* Init the Vars */
    Vars vars = new Vars();

    private final boolean flowDebug = vars.isFlowDebug();

    private final boolean deepFlowDebug = vars.isDeepFlowDebug();

    private int printFormatted = vars.getPrintFormatted();

    private final boolean useInPipe = vars.isUseInPipe();
    private boolean callPrompt = false;

    private String filename = "";
    private int sw_file = 0;
    private String wordform = "";

    @Override
    public void startroutine(String[] args) {
        boolean fileFound = false;
        String unk = ".unk";
        String lem = ".lem";
        String routine = Interact.class.getName() + "/startroutine";
        String logmess = "";
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in class Interact.java", routine);
            log.debug(logmess);
        }
        int i = 0;
        for (String a : args) {

            switch (a) {
                case "+f":
                    filename = args[i + 1];
                    setPiFile(new File(filename));
                    fileFound = true;
                    break;
                case "+p":
                    printFormatted = 0;
                    setPrintFormatted(printFormatted);
                    break;
                case "+c":
                    printFormatted = 1;
                    setPrintFormatted(printFormatted);
                    break;
                case "+j":
                    printFormatted = 2;
                    setPrintFormatted(printFormatted);
                    break;
                case "+w":
                    callPrompt = true;

                    try {
                        wordform = args[i + 1];
//                        if (!wordform.trim().equals("")) {
//                            wordform = "error";
//                        }
                    } catch (Exception e) {
                        if (wordform.trim().equals("")) {
                            wordform = "error";
                        }
                    }

                    setCallPrompt(callPrompt);
                    setWordform(wordform);
                    break;
//                default:
//                    printFormatted = 0;

            }
            i++;
        }
        if (fileFound) {
            sw_file = fileExist(filename);
            setPiFile(piFile);
        } else {
            sw_file = 0;
        }

        if (sw_file == 1) {
            // get the file with NO ext
            poFile = new File(fileWithoutExt(filename).concat(lem));
            puFile = new File(fileWithoutExt(filename).concat(unk));
            try {
                po = new PrintStream(poFile);
                pu = new PrintStream(puFile);
            } catch (FileNotFoundException e) {
                if (flowDebug || deepFlowDebug) {
                    logmess = String.format("DEEPFLOW STOP Executing %s in class Interact.java", routine);
                    log.debug(logmess);
                }
                sw_file = 0;
                po = System.out;
                pu = System.out;

            }

        }
        pubw = new BufferedWriter(new OutputStreamWriter(pu));
        pobw = new BufferedWriter(new OutputStreamWriter(po));
        setPrintFormatted(printFormatted);
        setSw_file(sw_file);
        setPo(po);
        setPu(pu);
        setPobw(pobw);
        setPubw(pubw);

        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW STOP Executing %s in class Interact.java", routine);
            log.debug(logmess);
        }

    } // end startroutine

    @Override
    public String prompt(String message) {
        String phrase = "";
        String routine = Interact.class.getName() + "/prompt";
        String logmess = "";
        if (flowDebug || deepFlowDebug) {
            logmess = String.format("DEEPFLOW START Executing %s in class Interact.java", routine);
            log.debug(logmess);
        }

        if (useInPipe) {
            message = "";
        } else {
            message = "\n>" + message;
        }
        try {
            System.out.println(message);
            BufferedReader br
                    = new BufferedReader(new InputStreamReader(System.in));

            String input;
            input = br.readLine();
            if (input.equalsIgnoreCase("end")) {
                phrase = null;
            } else {
                phrase = input.toLowerCase().trim();

            }

        } catch (IOException e) {
            if (flowDebug || deepFlowDebug) {
                logmess = String.format("DEEPFLOW SOME  ERRORS ON IO: %s", e.getMessage());
                log.fatal(logmess);
            }
            return null;
        }

        if (flowDebug || deepFlowDebug) {

            logmess = String.format("DEEPFLOW STOP Executing %s in class Interact.java. Wordform: %s", routine, phrase);
            log.debug(logmess);
        }
        return phrase;

    } // end prompt

    /**
     * @param filename
     * @return
     */
    private int fileExist(String filename) {
        int ret = 0;
        File f = new File(filename);
        if (f.exists() && !f.isDirectory()) {
            ret = 1;
        } else {
            ret = 0;
        }

        return ret;

    }

    /**
     * Remove the extension from filename
     *
     * @param filename the filename
     * @return
     */
    private String fileWithoutExt(String filename) {
        String ret = "";
        int dotInd = 0;
        dotInd = filename.lastIndexOf('.');

        // if dot is in the first position,
        // we are dealing with a hidden file rather than an extension
        ret = (dotInd > 0) ? filename.substring(0, dotInd) : filename;

        return ret;
    }

    /**
     * @return the printFormatted
     */
    public int getPrintFormatted() {
        return printFormatted;
    }

    /**
     * @return the filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * @param printFormatted the printFormatted to set
     */
    public void setPrintFormatted(int printFormatted) {
        this.printFormatted = printFormatted;
    }

    /**
     * @param filename the filename to set
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * @return the po
     */
    public PrintStream getPo() {
        return po;
    }

    /**
     * @return the pu
     */
    public PrintStream getPu() {
        return pu;
    }

    /**
     * @param po the po to set
     */
    public void setPo(PrintStream po) {
        this.po = po;
    }

    /**
     * @param pu the pu to set
     */
    public void setPu(PrintStream pu) {
        this.pu = pu;
    }

    /**
     *
     * @return sw_file 0 interactive,1 from file
     */
    public int getSw_file() {
        return sw_file;
    }

    /**
     * set the sw_file
     *
     * @param sw_file the sw_file to set
     */
    public void setSw_file(int sw_file) {
        this.sw_file = sw_file;
    }

    /**
     *
     * @return the wordform typed
     */
    public String getWordform() {
        return wordform;
    }

    /**
     * set the wordform
     *
     * @param wordform the wordform to set
     */
    public void setWordform(String wordform) {
        this.wordform = wordform;
    }

    /**
     * @return the piFile
     */
    public File getPiFile() {
        return piFile;
    }

    /**
     * @param piFile the piFile to set
     */
    public void setPiFile(File piFile) {
        this.piFile = piFile;
    }

    /**
     * @return the pubw
     */
    public BufferedWriter getPubw() {
        return pubw;
    }

    /**
     * @param pubw the pubw to set
     */
    public void setPubw(BufferedWriter pubw) {
        this.pubw = pubw;
    }

    /**
     * @return the pobw
     */
    public BufferedWriter getPobw() {
        return pobw;
    }

    /**
     * @param pobw the pobw to set
     */
    public void setPobw(BufferedWriter pobw) {
        this.pobw = pobw;
    }

    /**
     * @return the callPrompt
     */
    public boolean isCallPrompt() {
        return callPrompt;
    }

    /**
     * @param callPrompt the callPrompt to set
     */
    public void setCallPrompt(boolean callPrompt) {
        this.callPrompt = callPrompt;
    }

}

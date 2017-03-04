/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.jauceps.lib.headers;

/**
 * <P>
 * PORTING</P>
 * <p>
 * porting of interact.h</p>
 *
 * @author Riccardo Del Gratta &lt;riccardo.delgratta@ilc.cnr.it&gt;
 */
public abstract class AInteract {

    /**
     * select the modality of usage: interactive/batch
     *
     * @param args the args to parse
     */
    public abstract void startroutine(String[] args);

    /**
     * Prompt a message and get the typed string
     *
     * @param message The message to display to the user
     * @return the typed wordform
     */
    public abstract String prompt(String message);
    
    

}

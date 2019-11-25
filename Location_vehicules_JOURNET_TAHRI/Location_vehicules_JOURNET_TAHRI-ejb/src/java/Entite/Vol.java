/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

/**
 *
 * @author tahri
 */
public enum Vol {
    Oui,Non;
    private Vol mention;
   public Vol getMention(){
       return mention;
   }
   public void setMention(Vol mention) {
       this.mention=mention;
   }
}
    


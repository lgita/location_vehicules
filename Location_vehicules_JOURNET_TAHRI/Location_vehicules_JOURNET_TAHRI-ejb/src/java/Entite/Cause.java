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
public enum Cause {
    Panne, Accident;
    
         private Cause mention;
   public Cause getMention(){
       return mention;
   }
   public void setMention(Cause  mention) {
       this.mention=mention;
   }
    
}

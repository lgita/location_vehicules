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
public enum Type_entretien {
    Revision, Reparation;
    
    
        private Type_entretien mention;
   public Type_entretien getMention(){
       return mention;
   }
   public void setMention(Type_entretien mention) {
       this.mention=mention;
   }
    
}

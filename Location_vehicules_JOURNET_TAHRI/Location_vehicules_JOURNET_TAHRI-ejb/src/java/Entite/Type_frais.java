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
public enum Type_frais {
    Caution_reversée_en_intégralité, Caution_avec_déduction_des_réparations, Amende_de_retard, Frais_de_suppression_de_réservation;
    
        private Type_frais mention;
   public Type_frais getMention(){
       return mention;
   }
   public void setMention(Type_frais mention) {
       this.mention=mention;
   }
    
    
}

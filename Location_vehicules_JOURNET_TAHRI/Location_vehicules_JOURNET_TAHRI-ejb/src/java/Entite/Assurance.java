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
public enum Assurance {
   Nonsouscrit, Souscrit;
   
   private Assurance mention;
   public Assurance getMention(){
       return mention;
   }
   public void setMention(Assurance mention) {
       this.mention=mention;
   }
}

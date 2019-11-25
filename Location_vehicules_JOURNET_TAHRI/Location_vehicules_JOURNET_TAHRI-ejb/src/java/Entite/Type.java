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
public enum Type {
    Sport,Confort,Famille,Luxe,Eco;
    
       private Type mention;
   public Type getMention(){
       return mention;
   }
   public void setMention(Type mention) {
       this.mention=mention;
   }
    
    
}

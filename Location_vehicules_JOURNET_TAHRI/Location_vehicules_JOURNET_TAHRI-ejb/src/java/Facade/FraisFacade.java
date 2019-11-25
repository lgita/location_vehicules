/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entite.Frais;
import Entite.Location;
import Entite.Reservation;
import Entite.Type_frais;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tahri
 */
@Stateless
public class FraisFacade extends AbstractFacade<Frais> implements FraisFacadeLocal {

    @PersistenceContext(unitName = "Location_vehicules_JOURNET_TAHRI-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FraisFacade() {
        super(Frais.class);
    }
    
        @Override
     public void CreerFrais(String numFrais, String typeFrais, double montantFrais, Location leLocataire, Reservation laReservation) {

         Frais f = new Frais();
         f.setLalocation(leLocataire);
         f.setLareservation(laReservation);
         f.setMontant_frais(montantFrais);
         f.setNum_frais(numFrais);
         getEntityManager().persist(f);
     }

}

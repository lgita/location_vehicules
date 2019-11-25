/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entite.Entretien;
import Entite.Statut;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tahri
 */
@Stateless
public class StatutFacade extends AbstractFacade<Statut> implements StatutFacadeLocal {

    @PersistenceContext(unitName = "Location_vehicules_JOURNET_TAHRI-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StatutFacade() {
        super(Statut.class);
    }

    @Override
    public void CreerStatut(String numStatut, String libelleStatut, Entretien leEntretien) {
        Statut s = new Statut();
        s.setEntretien(leEntretien);
        s.setLibelle(libelleStatut);
        s.setNum_statut(numStatut);
        getEntityManager().persist(s);
    }
    

}

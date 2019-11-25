

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entite.Entretien;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author journ
 */
@Stateless
public class EntretienFacade extends AbstractFacade<Entretien> implements EntretienFacadeLocal {
    @PersistenceContext(unitName = "Location_vehicules_JOURNET_TAHRI-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EntretienFacade() {
        super(Entretien.class);
    }

    @Override
    public void CreerEntretien(String num, Date dated, Date datef) {
        Entretien e = new Entretien();
        e.setNum_entretien(num);
        e.setDate_debut_entretien(dated);
        e.setDate_fin_entretien(datef);
        getEntityManager().persist(e);
    }
    
}

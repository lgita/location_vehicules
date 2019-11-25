
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entite.Statut;
import Entite.Vehicule;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author journ
 */
@Stateless
public class VehiculeFacade extends AbstractFacade<Vehicule> implements VehiculeFacadeLocal {
    @PersistenceContext(unitName = "Location_vehicules_JOURNET_TAHRI-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VehiculeFacade() {
        super(Vehicule.class);
    }

    @Override
    public void CreerVehicule(String num, String marque, String modele, double prixj, double prixs, Double nbkm) {
        Vehicule v = new Vehicule();
        v.setNum_véhicule(num);
        v.setMarque(marque);
        v.setPrix_jour(prixj);
        v.setPrix_semaine(prixs);
        v.setNb_km(nbkm);
        getEntityManager().persist(v);
    }

    @Override
    public Vehicule RechercherVehicule(String num) {
             Vehicule v =null;
        List<Vehicule> result;

        String txt="SELECT v FROM Vehicule AS v WHERE v.num_vehicule=:nu ";
        Query req=getEntityManager().createQuery(txt);
        req=req.setParameter("nu",num);
         result = req.getResultList();
       	 if (result.size()==1)
       	 {
          		  v = (Vehicule)result.get(0);
	}
         return v;
    }

    @Override
    public void ModificationStatut(Vehicule v, Statut statut) {
        v.setLestatut(statut);
        getEntityManager().merge(v);
    }
    
    
    
    
    
}

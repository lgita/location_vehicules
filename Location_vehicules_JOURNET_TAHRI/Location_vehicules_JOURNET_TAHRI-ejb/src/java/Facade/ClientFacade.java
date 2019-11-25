/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entite.Client;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author journ
 */
@Stateless
public class ClientFacade extends AbstractFacade<Client> implements ClientFacadeLocal {
    @PersistenceContext(unitName = "Location_vehicules_JOURNET_TAHRI-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClientFacade() {
        super(Client.class);
    }

    @Override
    public void CreationClient(String num, String nom, String prenom, String adresse, String tel) {
        Client c = new Client();
        c.setNum_client(num);
        c.setNom(nom);
        c.setPrenom(prenom);
        c.setAdresse(adresse);
        c.setTel(tel);
        getEntityManager().persist(c);
    }
    
}

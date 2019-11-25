

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entite.Client;
import Entite.Compte;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author journ
 */
@Stateless
public class CompteFacade extends AbstractFacade<Compte> implements CompteFacadeLocal {
    @PersistenceContext(unitName = "Location_vehicules_JOURNET_TAHRI-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompteFacade() {
        super(Compte.class);
    }

    @Override
    public Compte Authentification(String login, String mdp) {
        Compte c;
        String txt="SELECT c FROM Compte AS c WHERE c.login=:lo and c.mdp=:motp";
        Query req=getEntityManager().createQuery(txt);
        req=req.setParameter("lo",login);
        req=req.setParameter("motp",mdp);
        c = (Compte)req.getSingleResult();
        return c;
    }

    @Override
    public void CreerCompte(String num, String login, String mdp, Date date, String mail, Client client) {
    Compte c = new Compte();
    c.setNum_compte(mdp);
    c.setLogin(login);
    c.setMdp(mdp);
    c.setDate_inscription(date);
    c.setEmail(mail);
    c.setLeclient(client);
    getEntityManager().persist(c);
    }

    @Override
    public void ModificationMdp(Compte C, String Nouveau_Mdp) {
        C.setMdp(Nouveau_Mdp);
        getEntityManager().merge(C);
    }
    
    
    
 
 
    
}
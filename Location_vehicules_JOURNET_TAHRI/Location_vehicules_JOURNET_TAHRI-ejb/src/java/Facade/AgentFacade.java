/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entite.Agence;
import Entite.Agent;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author tahri
 */
@Stateless
public class AgentFacade extends AbstractFacade<Agent> implements AgentFacadeLocal {

    @PersistenceContext(unitName = "Location_vehicules_JOURNET_TAHRI-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AgentFacade() {
        super(Agent.class);
    }
    
        @Override
     public void CreerAgent(String numAgent, String nomAgent, String login, String mdp, Agence Laagence) {

         Agent a = new Agent();
         a.setLogin(login);
         a.setMdp(mdp);
         a.setNum_agent(numAgent);
         a.setNom(nomAgent);
         a.setLaagence(Laagence);
         getEntityManager().persist(a);
     }

         @Override
    public Agent Authetification(String l, String mdp) {
          Agent a;
        String txt="SELECT a FROM Agent AS a WHERE a.login=:lo and a.mdp=:motp";
        Query req=getEntityManager().createQuery(txt);
        req=req.setParameter("lo",l);
        req=req.setParameter("motp",mdp);
        a = (Agent)req.getSingleResult();
        return a;
    }
    
}

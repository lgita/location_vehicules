/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entite.Client;
import Entite.Compte;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author tahri
 */
@Local
public interface CompteFacadeLocal {

    void create(Compte compte);

    void edit(Compte compte);

    void remove(Compte compte);

    Compte find(Object id);

    List<Compte> findAll();

    List<Compte> findRange(int[] range);

    int count();

    public Compte Authentification(String login, String mdp);

    public void CreerCompte(String num, String login, String mdp, Date date, String mail, Client client);

    public void ModificationMdp(Compte C, String Nouveau_Mdp);
    
}

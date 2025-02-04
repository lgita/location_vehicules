/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entite.Client;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author tahri
 */
@Local
public interface ClientFacadeLocal {

    void create(Client client);

    void edit(Client client);

    void remove(Client client);

    Client find(Object id);

    List<Client> findAll();

    List<Client> findRange(int[] range);

    int count();

    public void CreationClient(String num, String nom, String prenom, String adresse, String tel);
    
}

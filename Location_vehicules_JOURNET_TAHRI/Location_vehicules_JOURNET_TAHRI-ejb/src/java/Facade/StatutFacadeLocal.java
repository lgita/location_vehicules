/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entite.Entretien;
import Entite.Statut;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author tahri
 */
@Local
public interface StatutFacadeLocal {

    void create(Statut statut);

    void edit(Statut statut);

    void remove(Statut statut);

    Statut find(Object id);

    List<Statut> findAll();

    List<Statut> findRange(int[] range);

    int count();

    public void CreerStatut(String numStatut, String libelleStatut, Entretien leEntretien);
    
}

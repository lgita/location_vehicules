/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author tahri
 */
@Entity
public class Agence implements Serializable {

    @OneToMany(mappedBy = "Laagence")
    private List<Agent> Lesagents;

    
    
    
      @Column(nullable = false)
    private String Nom;

    /**
     * Get the value of Nom
     *
     * @return the value of Nom
     */
    public String getNom() {
        return Nom;
    }

    /**
     * Set the value of Nom
     *
     * @param Nom new value of Nom
     */
    public void setNom(String Nom) {
        this.Nom = Nom;
    }

      @Column(nullable = false)
    private String Localisation;

    /**
     * Get the value of Localisation
     *
     * @return the value of Localisation
     */
    public String getLocalisation() {
        return Localisation;
    }

    /**
     * Set the value of Localisation
     *
     * @param Localisation new value of Localisation
     */
    public void setLocalisation(String Localisation) {
        this.Localisation = Localisation;
    }

      @Column(unique = true,nullable = false)
    private String Num_agence;

    /**
     * Get the value of Num_agence
     *
     * @return the value of Num_agence
     */
    public String getNum_agence() {
        return Num_agence;
    }

    /**
     * Set the value of Num_agence
     *
     * @param Num_agence new value of Num_agence
     */
    public void setNum_agence(String Num_agence) {
        this.Num_agence = Num_agence;
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agence)) {
            return false;
        }
        Agence other = (Agence) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entite.Agence[ id=" + id + " ]";
    }
    
}

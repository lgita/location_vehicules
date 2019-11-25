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
import javax.persistence.OneToOne;

/**
 *
 * @author tahri
 */
@Entity
public class Client implements Serializable {

    @OneToOne(mappedBy = "Leclient")
    private Compte Lecompte;

    @OneToMany(mappedBy = "Leclient")
    private List<Location> Leslocations;

      @Column(nullable = false)
    private String Tel;

    /**
     * Get the value of Tel
     *
     * @return the value of Tel
     */
    public String getTel() {
        return Tel;
    }

    /**
     * Set the value of Tel
     *
     * @param Tel new value of Tel
     */
    public void setTel(String Tel) {
        this.Tel = Tel;
    }

      @Column(nullable = false)
    private String Nom;
        @Column(unique = true,nullable = false)
    private String Num_client;

    /**
     * Get the value of Num_client
     *
     * @return the value of Num_client
     */
    public String getNum_client() {
        return Num_client;
    }

    /**
     * Set the value of Num_client
     *
     * @param Num_client new value of Num_client
     */
    public void setNum_client(String Num_client) {
        this.Num_client = Num_client;
    }

      @Column(nullable = false)
    private String Prenom;
        @Column(nullable = false)
    private String Adresse;

    /**
     * Get the value of Adresse
     *
     * @return the value of Adresse
     */
    public String getAdresse() {
        return Adresse;
    }

    /**
     * Set the value of Adresse
     *
     * @param Adresse new value of Adresse
     */
    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }


    /**
     * Get the value of Prenom
     *
     * @return the value of Prenom
     */
    public String getPrenom() {
        return Prenom;
    }

    /**
     * Set the value of Prenom
     *
     * @param Prenom new value of Prenom
     */
    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }


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

    private Location Lalocation;

    /**
     * Get the value of Lalocation
     *
     * @return the value of Lalocation
     */
    public Location getLalocation() {
        return Lalocation;
    }

    /**
     * Set the value of Lalocation
     *
     * @param Lalocation new value of Lalocation
     */
    public void setLalocation(Location Lalocation) {
        this.Lalocation = Lalocation;
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
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entite.Client[ id=" + id + " ]";
    }
    
    
    
    
}

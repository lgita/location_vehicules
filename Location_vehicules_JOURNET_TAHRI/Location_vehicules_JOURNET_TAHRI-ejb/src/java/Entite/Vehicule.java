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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author tahri
 */
@Entity
public class Vehicule implements Serializable {

    @ManyToOne
    private Statut Lestatut;

    /**
     * Get the value of Lestatut
     *
     * @return the value of Lestatut
     */
    public Statut getLestatut() {
        return Lestatut;
    }

    /**
     * Set the value of Lestatut
     *
     * @param Lestatut new value of Lestatut
     */
    public void setLestatut(Statut Lestatut) {
        this.Lestatut = Lestatut;
    }

    @OneToMany(mappedBy = "Levehicule")
    private List<Location> Leslocations;

         @Column(nullable = false)
    private String Marque;

    /**
     * Get the value of Marque
     *
     * @return the value of Marque
     */
    public String getMarque() {
        return Marque;
    }

    /**
     * Set the value of Marque
     *
     * @param Marque new value of Marque
     */
    public void setMarque(String Marque) {
        this.Marque = Marque;
    }

         @Column(nullable = false)
    private String Modele;

    /**
     * Get the value of Modele
     *
     * @return the value of Modele
     */
    public String getModele() {
        return Modele;
    }

    /**
     * Set the value of Modele
     *
     * @param Modele new value of Modele
     */
    public void setModele(String Modele) {
        this.Modele = Modele;
    }

    
      @Column(nullable = false)
    private Type Type;

    /**
     * Get the value of Type
     *
     * @return the value of Type
     */
    public Type getType() {
        return Type;
    }

    /**
     * Set the value of Type
     *
     * @param Type new value of Type
     */
    public void setType(Type Type) {
        this.Type = Type;
    }

      @Column(nullable = false)
    private double Prix_semaine;

    /**
     * Get the value of Prix_semaine
     *
     * @return the value of Prix_semaine
     */
    public double getPrix_semaine() {
        return Prix_semaine;
    }

    /**
     * Set the value of Prix_semaine
     *
     * @param Prix_semaine new value of Prix_semaine
     */
    public void setPrix_semaine(double Prix_semaine) {
        this.Prix_semaine = Prix_semaine;
    }

      @Column(nullable = false)
    private double Nb_km;

    /**
     * Get the value of Nb_km
     *
     * @return the value of Nb_km
     */
    public double getNb_km() {
        return Nb_km;
    }

    /**
     * Set the value of Nb_km
     *
     * @param Nb_km new value of Nb_km
     */
    public void setNb_km(double Nb_km) {
        this.Nb_km = Nb_km;
    }

      @Column(nullable = false)
    private double Prix_jour;

    /**
     * Get the value of Prix_jour
     *
     * @return the value of Prix_jour
     */
    public double getPrix_jour() {
        return Prix_jour;
    }

    /**
     * Set the value of Prix_jour
     *
     * @param Prix_jour new value of Prix_jour
     */
    public void setPrix_jour(double Prix_jour) {
        this.Prix_jour = Prix_jour;
    }

            @Column(unique = true,nullable = false)
    private String Num_véhicule;

    /**
     * Get the value of Num_véhicule
     *
     * @return the value of Num_véhicule
     */
    public String getNum_véhicule() {
        return Num_véhicule;
    }

    /**
     * Set the value of Num_véhicule
     *
     * @param Num_véhicule new value of Num_véhicule
     */
    public void setNum_véhicule(String Num_véhicule) {
        this.Num_véhicule = Num_véhicule;
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
        if (!(object instanceof Vehicule)) {
            return false;
        }
        Vehicule other = (Vehicule) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entite.Vehicule[ id=" + id + " ]";
    }
    
}

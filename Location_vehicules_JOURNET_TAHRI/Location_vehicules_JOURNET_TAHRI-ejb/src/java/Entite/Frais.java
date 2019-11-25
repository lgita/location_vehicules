/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author tahri
 */
@Entity
public class Frais implements Serializable {

    private double Montant_frais;

    /**
     * Get the value of Montant_frais
     *
     * @return the value of Montant_frais
     */
    public double getMontant_frais() {
        return Montant_frais;
    }

    /**
     * Set the value of Montant_frais
     *
     * @param Montant_frais new value of Montant_frais
     */
    public void setMontant_frais(double Montant_frais) {
        this.Montant_frais = Montant_frais;
    }

    @OneToOne
    private Reservation Lareservation;

    /**
     * Get the value of Lareservation
     *
     * @return the value of Lareservation
     */
    public Reservation getLareservation() {
        return Lareservation;
    }

    /**
     * Set the value of Lareservation
     *
     * @param Lareservation new value of Lareservation
     */
    public void setLareservation(Reservation Lareservation) {
        this.Lareservation = Lareservation;
    }

    @ManyToOne
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

    
    
        @Column(nullable = false)
    private Type_frais Type_frais;

    /**
     * Get the value of Type_frais
     *
     * @return the value of Type_frais
     */
    public Type_frais getType_frais() {
        return Type_frais;
    }

    /**
     * Set the value of Type_frais
     *
     * @param Type_frais new value of Type_frais
     */
    public void setType_frais(Type_frais Type_frais) {
        this.Type_frais = Type_frais;
    }

        @Column(unique = true,nullable = false)
    private String Num_frais;

    /**
     * Get the value of Num_frais
     *
     * @return the value of Num_frais
     */
    public String getNum_frais() {
        return Num_frais;
    }

    /**
     * Set the value of Num_frais
     *
     * @param Num_frais new value of Num_frais
     */
    public void setNum_frais(String Num_frais) {
        this.Num_frais = Num_frais;
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
        if (!(object instanceof Frais)) {
            return false;
        }
        Frais other = (Frais) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entite.Frais[ id=" + id + " ]";
    }
    
}

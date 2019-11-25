/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author tahri
 */
@Entity
public class Reservation implements Serializable {

    @ManyToOne
    private Compte Lecompte;

    /**
     * Get the value of Lecompte
     *
     * @return the value of Lecompte
     */
    public Compte getLecompte() {
        return Lecompte;
    }

    /**
     * Set the value of Lecompte
     *
     * @param Lecompte new value of Lecompte
     */
    public void setLecompte(Compte Lecompte) {
        this.Lecompte = Lecompte;
    }

    @OneToOne
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

    @OneToOne(mappedBy = "Lareservation")
    private Frais Lefrais;

        @Column(nullable = false)
    private double Pourcentage_acompte;

    /**
     * Get the value of Pourcentage_acompte
     *
     * @return the value of Pourcentage_acompte
     */
    public double getPourcentage_acompte() {
        return Pourcentage_acompte;
    }

    /**
     * Set the value of Pourcentage_acompte
     *
     * @param Pourcentage_acompte new value of Pourcentage_acompte
     */
    public void setPourcentage_acompte(double Pourcentage_acompte) {
        this.Pourcentage_acompte = Pourcentage_acompte;
    }

        @Column(nullable = false)
    private double Montant_acompte;

    /**
     * Get the value of Montant_acompte
     *
     * @return the value of Montant_acompte
     */
    public double getMontant_acompte() {
        return Montant_acompte;
    }

    /**
     * Set the value of Montant_acompte
     *
     * @param Montant_acompte new value of Montant_acompte
     */
    public void setMontant_acompte(double Montant_acompte) {
        this.Montant_acompte = Montant_acompte;
    }

        @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Date_fin_reservation;

    /**
     * Get the value of Date_fin_reservation
     *
     * @return the value of Date_fin_reservation
     */
    public Date getDate_fin_reservation() {
        return Date_fin_reservation;
    }

    /**
     * Set the value of Date_fin_reservation
     *
     * @param Date_fin_reservation new value of Date_fin_reservation
     */
    public void setDate_fin_reservation(Date Date_fin_reservation) {
        this.Date_fin_reservation = Date_fin_reservation;
    }

        @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Date_debut_reservation;

    /**
     * Get the value of Date_debut_reservation
     *
     * @return the value of Date_debut_reservation
     */
    public Date getDate_debut_reservation() {
        return Date_debut_reservation;
    }

    /**
     * Set the value of Date_debut_reservation
     *
     * @param Date_debut_reservation new value of Date_debut_reservation
     */
    public void setDate_debut_reservation(Date Date_debut_reservation) {
        this.Date_debut_reservation = Date_debut_reservation;
    }

        @Column(unique = true,nullable = false)
    private String Num_reservation;

    /**
     * Get the value of Num_reservation
     *
     * @return the value of Num_reservation
     */
    public String getNum_reservation() {
        return Num_reservation;
    }

    /**
     * Set the value of Num_reservation
     *
     * @param Num_reservation new value of Num_reservation
     */
    public void setNum_reservation(String Num_reservation) {
        this.Num_reservation = Num_reservation;
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
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entite.Reservation[ id=" + id + " ]";
    }
    
}

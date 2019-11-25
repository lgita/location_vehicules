/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author tahri
 */
@Entity
public class Location implements Serializable {

    @OneToOne(mappedBy = "Lalocation")
    private Reservation Lareservation;

    @OneToMany(mappedBy = "Lalocation")
    private List<Frais> Lesfrais;

    @ManyToOne
    private Vehicule Levehicule;

    /**
     * Get the value of Levehicule
     *
     * @return the value of Levehicule
     */
    public Vehicule getLevehicule() {
        return Levehicule;
    }

    /**
     * Set the value of Levehicule
     *
     * @param Levehicule new value of Levehicule
     */
    public void setLevehicule(Vehicule Levehicule) {
        this.Levehicule = Levehicule;
    }

    
    
    @ManyToOne
    private Agent Leagent;

    /**
     * Get the value of Leagent
     *
     * @return the value of Leagent
     */
    public Agent getLeagent() {
        return Leagent;
    }

    /**
     * Set the value of Leagent
     *
     * @param Leagent new value of Leagent
     */
    public void setLeagent(Agent Leagent) {
        this.Leagent = Leagent;
    }

    @ManyToOne
    private Client Leclient;

    /**
     * Get the value of Leclient
     *
     * @return the value of Leclient
     */
    public Client getLeclient() {
        return Leclient;
    }

    /**
     * Set the value of Leclient
     *
     * @param Leclient new value of Leclient
     */
    public void setLeclient(Client Leclient) {
        this.Leclient = Leclient;
    }

    
    private Vol Vol;

    /**
     * Get the value of Vol
     *
     * @return the value of Vol
     */
    public Vol getVol() {
        return Vol;
    }

    /**
     * Set the value of Vol
     *
     * @param Vol new value of Vol
     */
    public void setVol(Vol Vol) {
        this.Vol = Vol;
    }

        @Column(nullable = false)
    private double Prix_initial;

    /**
     * Get the value of Prix_initial
     *
     * @return the value of Prix_initial
     */
    public double getPrix_initial() {
        return Prix_initial;
    }

    /**
     * Set the value of Prix_initial
     *
     * @param Prix_initial new value of Prix_initial
     */
    public void setPrix_initial(double Prix_initial) {
        this.Prix_initial = Prix_initial;
    }

    
    private String Etat_voiture_retour;

    /**
     * Get the value of Etat_voiture_retour
     *
     * @return the value of Etat_voiture_retour
     */
    public String getEtat_voiture_retour() {
        return Etat_voiture_retour;
    }

    /**
     * Set the value of Etat_voiture_retour
     *
     * @param Etat_voiture_retour new value of Etat_voiture_retour
     */
    public void setEtat_voiture_retour(String Etat_voiture_retour) {
        this.Etat_voiture_retour = Etat_voiture_retour;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Date_fin_reel;

    /**
     * Get the value of Date_fin_reel
     *
     * @return the value of Date_fin_reel
     */
    public Date getDate_fin_reel() {
        return Date_fin_reel;
    }

    /**
     * Set the value of Date_fin_reel
     *
     * @param Date_fin_reel new value of Date_fin_reel
     */
    public void setDate_fin_reel(Date Date_fin_reel) {
        this.Date_fin_reel = Date_fin_reel;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Date_fin_prevue;

    /**
     * Get the value of Date_fin_prevue
     *
     * @return the value of Date_fin_prevue
     */
    public Date getDate_fin_prevue() {
        return Date_fin_prevue;
    }

    /**
     * Set the value of Date_fin_prevue
     *
     * @param Date_fin_prevue new value of Date_fin_prevue
     */
    public void setDate_fin_prevue(Date Date_fin_prevue) {
        this.Date_fin_prevue = Date_fin_prevue;
    }

        @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Date_debut_reel;

    /**
     * Get the value of Date_debut_reel
     *
     * @return the value of Date_debut_reel
     */
    public Date getDate_debut_reel() {
        return Date_debut_reel;
    }

    /**
     * Set the value of Date_debut_reel
     *
     * @param Date_debut_reel new value of Date_debut_reel
     */
    public void setDate_debut_reel(Date Date_debut_reel) {
        this.Date_debut_reel = Date_debut_reel;
    }

        
    private double Montant_caution;

    /**
     * Get the value of Montant_caution
     *
     * @return the value of Montant_caution
     */
    public double getMontant_caution() {
        return Montant_caution;
    }

    /**
     * Set the value of Montant_caution
     *
     * @param Montant_caution new value of Montant_caution
     */
    public void setMontant_caution(double Montant_caution) {
        this.Montant_caution = Montant_caution;
    }

        @Column(nullable = false)
    private double Montant_restant;

    /**
     * Get the value of Montant_restant
     *
     * @return the value of Montant_restant
     */
    public double getMontant_restant() {
        return Montant_restant;
    }

    /**
     * Set the value of Montant_restant
     *
     * @param Montant_restant new value of Montant_restant
     */
    public void setMontant_restant(double Montant_restant) {
        this.Montant_restant = Montant_restant;
    }

        @Column(nullable = false)
        private Assurance Assurance;

    /**
     * Get the value of Assurance
     *
     * @return the value of Assurance
     */
    public Assurance getAssurance() {
        return Assurance;
    }

    /**
     * Set the value of Assurance
     *
     * @param Assurance new value of Assurance
     */
    public void setAssurance(Assurance Assurance) {
        this.Assurance = Assurance;
    }

        @Column(nullable = false)
    private String Etat_voiture_début;

    /**
     * Get the value of Etat_voiture_début
     *
     * @return the value of Etat_voiture_début
     */
    public String getEtat_voiture_début() {
        return Etat_voiture_début;
    }

    /**
     * Set the value of Etat_voiture_début
     *
     * @param Etat_voiture_début new value of Etat_voiture_début
     */
    public void setEtat_voiture_début(String Etat_voiture_début) {
        this.Etat_voiture_début = Etat_voiture_début;
    }

        @Column(unique = true,nullable = false)
        private String Num_location;

    /**
     * Get the value of Num_location
     *
     * @return the value of Num_location
     */
    public String getNum_location() {
        return Num_location;
    }

    /**
     * Set the value of Num_location
     *
     * @param Num_location new value of Num_location
     */
    public void setNum_location(String Num_location) {
        this.Num_location = Num_location;
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
        if (!(object instanceof Location)) {
            return false;
        }
        Location other = (Location) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entite.Location[ id=" + id + " ]";
    }
    
}

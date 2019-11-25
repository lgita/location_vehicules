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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author tahri
 */
@Entity
public class Compte implements Serializable {

    @OneToOne
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

    @OneToMany(mappedBy = "Lecompte")
    private List<Reservation> Lesreservations;

      @Column(nullable = false)
    private String Email;

    /**
     * Get the value of Email
     *
     * @return the value of Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Set the value of Email
     *
     * @param Email new value of Email
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
      @Column(nullable = false)
    private Date Date_inscription;

    /**
     * Get the value of Date_inscription
     *
     * @return the value of Date_inscription
     */
    public Date getDate_inscription() {
        return Date_inscription;
    }

    /**
     * Set the value of Date_inscription
     *
     * @param Date_inscription new value of Date_inscription
     */
    public void setDate_inscription(Date Date_inscription) {
        this.Date_inscription = Date_inscription;
    }

      @Column(nullable = false)
    private String Mdp;

    /**
     * Get the value of Mdp
     *
     * @return the value of Mdp
     */
    public String getMdp() {
        return Mdp;
    }

    /**
     * Set the value of Mdp
     *
     * @param Mdp new value of Mdp
     */
    public void setMdp(String Mdp) {
        this.Mdp = Mdp;
    }

      @Column(unique = true,nullable = false)
    private String Login;

    /**
     * Get the value of Login
     *
     * @return the value of Login
     */
    public String getLogin() {
        return Login;
    }

    /**
     * Set the value of Login
     *
     * @param Login new value of Login
     */
    public void setLogin(String Login) {
        this.Login = Login;
    }

      @Column(unique = true,nullable = false)
    private String Num_compte;

    /**
     * Get the value of Num_compte
     *
     * @return the value of Num_compte
     */
    public String getNum_compte() {
        return Num_compte;
    }

    /**
     * Set the value of Num_compte
     *
     * @param Num_compte new value of Num_compte
     */
    public void setNum_compte(String Num_compte) {
        this.Num_compte = Num_compte;
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
        if (!(object instanceof Compte)) {
            return false;
        }
        Compte other = (Compte) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entite.Compte[ id=" + id + " ]";
    }
    
}

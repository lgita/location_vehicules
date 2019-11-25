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
import javax.persistence.Temporal;

/**
 *
 * @author tahri
 */
@Entity
public class Entretien implements Serializable {

    @OneToMany(mappedBy = "Entretien")
    private List<Statut> Lesstatuts;

     @Column(nullable = false)
    private Cause Cause;

    /**
     * Get the value of Cause
     *
     * @return the value of Cause
     */
    public Cause getCause() {
        return Cause;
    }

    /**
     * Set the value of Cause
     *
     * @param Cause new value of Cause
     */
    public void setCause(Cause Cause) {
        this.Cause = Cause;
    }

     @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Date_fin_entretien;

    /**
     * Get the value of Date_fin_entretien
     *
     * @return the value of Date_fin_entretien
     */
    public Date getDate_fin_entretien() {
        return Date_fin_entretien;
    }

    /**
     * Set the value of Date_fin_entretien
     *
     * @param Date_fin_entretien new value of Date_fin_entretien
     */
    public void setDate_fin_entretien(Date Date_fin_entretien) {
        this.Date_fin_entretien = Date_fin_entretien;
    }

     @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Date_debut_entretien;

    /**
     * Get the value of Date_debut_entretien
     *
     * @return the value of Date_debut_entretien
     */
    public Date getDate_debut_entretien() {
        return Date_debut_entretien;
    }

    /**
     * Set the value of Date_debut_entretien
     *
     * @param Date_debut_entretien new value of Date_debut_entretien
     */
    public void setDate_debut_entretien(Date Date_debut_entretien) {
        this.Date_debut_entretien = Date_debut_entretien;
    }

     @Column(nullable = false)
    private Type_entretien Type_entretien;

    /**
     * Get the value of Type_entretien
     *
     * @return the value of Type_entretien
     */
    public Type_entretien getType_entretien() {
        return Type_entretien;
    }

    /**
     * Set the value of Type_entretien
     *
     * @param Type_entretien new value of Type_entretien
     */
    public void setType_entretien(Type_entretien Type_entretien) {
        this.Type_entretien = Type_entretien;
    }

     @Column(unique = true,nullable = false)
    private String Num_entretien;

    /**
     * Get the value of Num_entretien
     *
     * @return the value of Num_entretien
     */
    public String getNum_entretien() {
        return Num_entretien;
    }

    /**
     * Set the value of Num_entretien
     *
     * @param Num_entretien new value of Num_entretien
     */
    public void setNum_entretien(String Num_entretien) {
        this.Num_entretien = Num_entretien;
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
        if (!(object instanceof Entretien)) {
            return false;
        }
        Entretien other = (Entretien) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entite.Entretien[ id=" + id + " ]";
    }
    
}

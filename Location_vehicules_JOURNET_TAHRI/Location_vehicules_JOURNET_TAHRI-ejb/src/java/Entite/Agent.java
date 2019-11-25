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
public class Agent implements Serializable {

    
    @ManyToOne
        private Agence Laagence;

    /**
     * Get the value of Laagence
     *
     * @return the value of Laagence
     */
    public Agence getLaagence() {
        return Laagence;
    }

    /**
     * Set the value of Laagence
     *
     * @param Laagence new value of Laagence
     */
    public void setLaagence(Agence Laagence) {
        this.Laagence = Laagence;
    }

    @OneToMany(mappedBy = "Leagent")
    private List<Location> Leslocations;

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

      @Column(unique = true,nullable = false)
    private String Num_agent;

    /**
     * Get the value of Num_agent
     *
     * @return the value of Num_agent
     */
    public String getNum_agent() {
        return Num_agent;
    }

    /**
     * Set the value of Num_agent
     *
     * @param Num_agent new value of Num_agent
     */
    public void setNum_agent(String Num_agent) {
        this.Num_agent = Num_agent;
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
        if (!(object instanceof Agent)) {
            return false;
        }
        Agent other = (Agent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entite.Agent[ id=" + id + " ]";
    }
    
}

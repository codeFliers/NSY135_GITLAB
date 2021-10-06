package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="Artiste")
public class Artiste implements Serializable {
    @Column(length=100, name="nom", table="Artiste", nullable = false)
    private String nom;
    @Column(length=100, name="prenom", table="Artiste", nullable = false)
    private String prenom;
    @Column(length=100, name="annee_naissance", table="Artiste", nullable = false)
    private Integer annee_naissance;

    @Column(name="id", table="Artiste")
    @Id
    private Long id;

    public Artiste() {
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAnnee_naissance() {
        return annee_naissance;
    }
    public void setAnnee_naissance(Integer annee_naissance) {
        this.annee_naissance = annee_naissance;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}

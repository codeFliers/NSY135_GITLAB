package Models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Internaute")
public class Internaute implements Serializable {
    @Column(length=100, name="nom", table="Internaute", nullable = false)
    private String nom;
    @Column(length=100, name="prenom", table="Internaute", nullable = false)
    private String prenom;
    @Column(length=100, name="mot_de_passe", table="Internaute", nullable = false)
    private String motDePasse;
    @Column(length=100, name="annee_naissance", table="Internaute", nullable = false)
    private int dateNaissance;

    @Column(name="id", table="Internaute")
    @Id
    private String email;

    public Internaute() {
    }

    public Internaute(String email, String nom, String prenom, String motDePasse, int dateNaissance) {
        this();
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.motDePasse = motDePasse;
        this.dateNaissance = dateNaissance;
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

    public String getMotDePasse() {
        return motDePasse;
    }
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public int getDateNaissance() {
        return dateNaissance;
    }
    public void setDateNaissance(int dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

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
    private String dateNaissance;

    @Column(name="id", table="Internaute")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String email;

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

    public String getDateNaissance() {
        return dateNaissance;
    }
    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

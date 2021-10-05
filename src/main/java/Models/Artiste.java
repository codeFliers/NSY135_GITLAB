package Models;

public class Artiste {
    private String nom;
    private String prenom;
    private Integer annee_naissance;

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


}

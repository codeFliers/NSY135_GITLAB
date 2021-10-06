package Models;

import java.io.Serializable;

public class ArtistePK implements Serializable {
    private String nom;
    private String prenom;

    public ArtistePK() {
        //
    }
    public ArtistePK(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
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

    @Override
    public int hashCode() {
        return this.nom.hashCode() + this.prenom.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof ArtistePK){
            ArtistePK clientPK = (ArtistePK) o;

            if (this.getNom().equals(clientPK.getNom())) {
                if(this.getPrenom().equals(clientPK.getPrenom())) {
                    return true;
                }
            }
        }
        return false;
    }
}

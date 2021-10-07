package Models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable //<=
public class RolePKEmbedded implements Serializable{
    //Composite key (same name as in Role)
    private int id_acteur;
    private int id_film;

    public RolePKEmbedded(){
        //
    }

    public int getIdActeur() {
        return id_acteur;
    }
    public void setIdActeur(int id_acteur) {
        this.id_acteur = id_acteur;
    }

    public int getIdFilm() {
        return id_film;
    }
    public void setIdFilm(int idFilm) {
        this.id_film = idFilm;
    }

    @Override
    public boolean equals(Object o) {
        Boolean bool = false;
        if(o != null && o instanceof RolePKEmbedded) {
            RolePKEmbedded rolePKEmbedded = (RolePKEmbedded) o;

            if(rolePKEmbedded.getIdActeur() == this.getIdActeur() &&
                    rolePKEmbedded.getIdFilm() == this.getIdFilm()) {
                bool = true;
            }
        }
        return bool;
    }

    @Override
    public int hashCode() {
        return this.getIdFilm()+this.getIdActeur();
    }
}

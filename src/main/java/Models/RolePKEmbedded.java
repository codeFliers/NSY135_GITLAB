package Models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RolePKEmbedded implements Serializable{
    private int id_artiste;
    private int id_film;

    public RolePKEmbedded(){
        //
    }

    public int getIdArtiste() {
        return id_artiste;
    }
    public void setIdArtiste(int id_artiste) {
        this.id_artiste = id_artiste;
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

            if(rolePKEmbedded.getIdArtiste() == this.getIdArtiste() &&
                    rolePKEmbedded.getIdFilm() == this.getIdFilm()) {
                bool = true;
            }
        }
        return bool;
    }

    @Override
    public int hashCode() {
        return this.getIdFilm()+this.getIdArtiste();
    }
}

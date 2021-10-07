package Models;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable //<=
public class NotationPKEmbedded implements Serializable {
    //Composite key (same name as in Role)
    private int id_film;
    private String email;

    public NotationPKEmbedded(){
        //
    }

    public int getIdFilm() {
        return id_film;
    }
    public void setIdFilm(int id_film) {
        this.id_film = id_film;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        Boolean bool = false;
        if(o != null && o instanceof RolePKEmbedded) {
            NotationPKEmbedded notationPKEmbedded = (NotationPKEmbedded) o;

            if(notationPKEmbedded.getEmail() == this.getEmail() &&
                    notationPKEmbedded.getIdFilm() == this.getIdFilm()) {
                bool = true;
            }
        }
        return bool;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id_film, getEmail());
    }

    /*
    @Override
    public int hashCode() {
        return this.getIdFilm()+this.getEmail().hashCode();
    }
     */
}

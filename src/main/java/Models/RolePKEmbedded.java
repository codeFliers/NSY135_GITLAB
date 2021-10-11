package Models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable //<=
public class RolePKEmbedded implements Serializable{
    //Composite key (same name as in Role)
    private Long id_acteur;
    private Long id_film;

    public RolePKEmbedded(){
        //
    }

    /*
        public int getId_Acteur() {
        return id_acteur;
        }
        public void setId_Acteur(int id_acteur) {
            this.id_acteur = id_acteur;
        }

     */
    public Long getId_acteur() {
        return id_acteur;
    }

    public void setId_acteur(Long id_acteur) {
        this.id_acteur = id_acteur;
    }

    public Long getIdFilm() {
        return id_film;
    }
    public void setIdFilm(Long idFilm) {
        this.id_film = idFilm;
    }

    @Override
    public boolean equals(Object o) {
        Boolean bool = false;
        if(o != null && o instanceof RolePKEmbedded) {
            RolePKEmbedded rolePKEmbedded = (RolePKEmbedded) o;

            if(rolePKEmbedded.getId_acteur() == this.getId_acteur() &&
                    rolePKEmbedded.getIdFilm() == this.getIdFilm()) {
                bool = true;
            }
        }
        return bool;
    }

    @Override
    public int hashCode() {
        Long v = this.getIdFilm()+this.getId_acteur();
        int res = Integer.parseInt(v.toString());
        return res;
    }
}

package Models;

import java.io.Serializable;

public class RolePK  implements Serializable {
    private int Artiste;
    private int Film;

    public RolePK() {
        //
    }

    public int getArtiste() {
        return Artiste;
    }
    public void setArtiste(int artiste) {
        Artiste = artiste;
    }

    public int getFilm() {
        return Film;
    }
    public void setFilm(int film) {
        Film = film;
    }

    @Override
    public int hashCode() {
        return this.getArtiste() + this.getFilm();
    }
    @Override
    public boolean equals(Object o) {
        boolean boolRes = false;
        if (o != null && o instanceof RolePK) {
            RolePK rolePK = (RolePK) o;
            boolRes = ( rolePK.getArtiste() == this.getArtiste() && rolePK.getFilm() == this.getFilm() );
        }
        return boolRes;
    }
}

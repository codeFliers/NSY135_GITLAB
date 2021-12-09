package Models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Genre implements Serializable {
    private String genre;

    public Genre() {
        //
    }
    public Genre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
    private void setGenre(String genre) {
        this.genre = genre;
    }
}

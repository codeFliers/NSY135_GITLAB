package Models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Notation")
public class Notation  implements Serializable{
    @EmbeddedId //<= reference to the class describing the primary key (RolePKEmbedded)
    private NotationPKEmbedded notationPKEmbedded;

    @Column(length=100, name="note", table="Notation", nullable = false)
    private int note;

    @MapsId("id_film") //<= Designate to later form the composite key
    @ManyToOne
    @JoinColumn(name="id_film",
            foreignKey=@ForeignKey(name="FK_NOTATIONS_FILMS"))
    private Film film;


    @MapsId("email") //<= Designate to later form the composite key
    @ManyToOne
    @JoinColumn(name="email",
            foreignKey=@ForeignKey(name="FK_NOTATIONS_EMAILS"))
    private Internaute internaute;

    public Notation(){
        this.notationPKEmbedded = new NotationPKEmbedded();
    }


    public NotationPKEmbedded getNotationPKEmbedded() {
        return notationPKEmbedded;
    }
    public void setNotationPKEmbedded(NotationPKEmbedded notationPKEmbedded) {
        this.notationPKEmbedded = notationPKEmbedded;
    }

    public int getNote() {
        return note;
    }
    public void setNote(int note) {
        this.note = note;
    }

    public Film getFilm() {
        return film;
    }
    public void setFilm(Film film) {
        this.film = film;
    }

    public Internaute getInternaute() {
        return internaute;
    }
    public void setInternaute(Internaute internaute) {
        this.internaute = internaute;
    }
}

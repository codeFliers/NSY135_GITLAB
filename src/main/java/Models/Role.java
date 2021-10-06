package Models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Role")
public class Role implements Serializable {
    @EmbeddedId
    private RolePKEmbedded rolePKEmbedded;

    @Column(length=100, name="nom_role", table="Role", nullable = false)
    private String nom_role;

    @MapsId("id_artiste")
    @ManyToOne
    @JoinColumn(name="id_artiste",
            foreignKey=@ForeignKey(name="FK_ROLE_ARTISTES"))
    private Artiste artiste;


    @MapsId("id_film")
    @ManyToOne
    @JoinColumn(name="id_film",
            foreignKey=@ForeignKey(name="FK_ROLE_FILMS"))
    private Film film;


    public Role() {
        this.rolePKEmbedded = new RolePKEmbedded();
    }

    public RolePKEmbedded getRolePKEmbedded() {
        return rolePKEmbedded;
    }
    public void setRolePKEmbedded(RolePKEmbedded rolePKEmbedded) {
        this.rolePKEmbedded = rolePKEmbedded;
    }

    public String getNom_role() {
        return nom_role;
    }
    public void setNom_role(String nom_role) {
        this.nom_role = nom_role;
    }

    public Artiste getArtiste() {
        return artiste;
    }
    public void setArtiste(Artiste artiste) {
        this.artiste = artiste;
    }

    public Film getFilm() {
        return film;
    }
    public void setFilm(Film film) {
        this.film = film;
    }
}

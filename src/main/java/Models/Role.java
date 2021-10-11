package Models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Role")
public class Role implements Serializable {
    @EmbeddedId //<= reference to the class describing the primary key (RolePKEmbedded)
    private RolePKEmbedded rolePKEmbedded;

    @Column(length=100, name="nom_role", table="Role", nullable = false)
    private String nom_role;

    @MapsId("id_acteur") //<= Designate to later form the composite key
    @ManyToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name="id_acteur",
            foreignKey=@ForeignKey(name="FK_ROLES_ACTEURS"))
    private Artiste artiste;


    @MapsId("id_film") //<= Designate to later form the composite key
    @ManyToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name="id_film",
            foreignKey=@ForeignKey(name="FK_ROLES_FILMS"))
    private Film film;


    public Role() {
        this.rolePKEmbedded = new RolePKEmbedded();
    }
    public Role(Artiste artiste, Film film, String nom_role) {
        this();
        this.artiste = artiste;
        this.film = film;
        this.nom_role = nom_role;
    }


    public RolePKEmbedded getRolePKEmbedded() {
        return rolePKEmbedded;
    }
    // /!\ private
    private void setRolePKEmbedded(RolePKEmbedded rolePKEmbedded) {
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

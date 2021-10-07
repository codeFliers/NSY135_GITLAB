package Models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="Artiste")
public class Artiste implements Serializable {
    @Column(length=100, name="nom", table="Artiste", nullable = false)
    private String nom;
    @Column(length=100, name="prenom", table="Artiste", nullable = false)
    private String prenom;
    @Column(length=100, name="annee_naissance", table="Artiste", nullable = false)
    private Integer annee_naissance;

    @OneToMany
    @JoinColumn(name="id_realisateur",
            foreignKey = @ForeignKey(name="fk_films_artistes"))
    private List<Film> listFilm;

    @Column(name="id", table="Artiste")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    public Artiste() {
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

    public Integer getAnnee_naissance() {
        return annee_naissance;
    }
    public void setAnnee_naissance(Integer annee_naissance) {
        this.annee_naissance = annee_naissance;
    }

    public List<Film> getListFilm() {
        return listFilm;
    }
    public void setListFilm(List<Film> listFilm) {
        this.listFilm = listFilm;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

}

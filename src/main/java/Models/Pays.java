package Models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="Pays")
public class Pays implements Serializable {
    @Column(length=100, name="nom", table="Pays", nullable = false)
    private String nom;
    @Column(length=100, name="langue", table="Pays", nullable = false)
    private String langue;

    @OneToMany
    @JoinColumn(name="id_pays",
            foreignKey = @ForeignKey(name="fk_films_pays"))
    private List<Film> listFilm;

    @Column(name="code", table="Pays")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String code;


    public Pays() {
        //
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLangue() {
        return langue;
    }
    public void setLangue(String langue) {
        this.langue = langue;
    }

    public List<Film> getListFilm() {
        return listFilm;
    }
    public void setListFilm(List<Film> listFilm) {
        this.listFilm = listFilm;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
}

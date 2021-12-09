package Models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Film")
public class Film implements Serializable {
    @Column(length=100, name="titre", table="Film", nullable = false)
    private String titre;
    @Column(length=100, name="annee", table="Film", nullable = false)
    private Integer annee;
    @Column(length=100, name="resume", table="Film", nullable = false)
    private String resume;


    @Column(name="id", table="Film")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Embedded
    private Genre genre;

    public Film() {
        //
    }
    public Film(String titre, Integer annee, Genre genre, String resume) {
        this();
        this.titre = titre;
        this.annee = annee;
        this.genre = genre;
        this.resume = resume;
    }

    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Integer getAnnee() {
        return annee;
    }
    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getResume() {
        return resume;
    }
    public void setResume(String resume) {
        this.resume = resume;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}

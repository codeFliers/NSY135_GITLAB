package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Film")
public class Film {
    @Column(length=100, name="titre", table="Film", nullable = false)
    private String titre;
    @Column(length=100, name="annee", table="Film", nullable = false)
    private Integer annee;
    @Column(length=100, name="genre", table="Film", nullable = false)
    private String genre;
    @Column(length=100, name="resume", table="Film", nullable = false)
    private String resume;

    @Column(name="id", table="Film")
    @Id
    private Long id;


    public Film() {

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

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
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

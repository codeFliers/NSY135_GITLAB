package Models;

import Controllers.ApplicationListener;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class TestsJpa {

    private EntityManager em;

    public TestsJpa() {
        if(ApplicationListener.getEmf().isOpen()) {
            ApplicationListener.setPersistenceUnitName("default");
            //createEntityManager is "thread-safe" (1 thread by EntityManager)
            em = TestsJpa.getEntityManager();
        }
    }

    public static EntityManager getEntityManager()  {
        //createEntityManager is "thread-safe" (1 thread by EntityManager)
        return ApplicationListener.getEmf().createEntityManager();
    }

    public void testInsertion() {
        em.getTransaction().begin();

        Pays monPays = new Pays("is", "Islande", "islandais");
        Film film = new Film("Le chapelier", 1993, "Action", "Il était une fois ...");
        Artiste monArtiste = new Artiste("Toto", "de Tata", 1993);

        List<Film> listFilmArtiste = new ArrayList<>();
        listFilmArtiste.add(film);
        monArtiste.setListFilm(listFilmArtiste);

        List<Film> listFilmPays = new ArrayList<>();
        listFilmPays.add(film);
        monPays.setListFilm(listFilmPays);

        Role role = new Role(monArtiste, film, "The Strangers");
        Internaute internaute = new Internaute("abcd@orange.fr", "monNom",
                "monPrenom", "monMDP123", 2006);
        Notation notation = new Notation(film, internaute, 5);

        try {
            em.persist(monPays);
            em.persist(role);
            em.persist(notation);

            em.getTransaction().commit();

        }catch(Exception e) {
            em.getTransaction().rollback();
            System.out.println(e.getMessage());
        }
        em.close();
    }
}

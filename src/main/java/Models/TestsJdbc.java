package Models;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestsJdbc {
    private static final Integer port = 3306;

    /**
     * Pour communiquer avec MySQL
     */
    private Connection connexion;

    /**
     * Constructeur sans connexion
     */
    public TestsJdbc() throws ClassNotFoundException {
        /* On commence par "charger" le pilote MySQL */
        //Class.forName("com.mysql.cj.jdbc.Driver");
        Class.forName("com.mysql.jdbc.Driver");
    }

    public void connect(String server, String bd, String u, String p)
            throws SQLException {
        String url = "jdbc:mysql://" + server + ":" + port + "/" + bd;
        connexion = DriverManager.getConnection(url, u, p);
    }

    public List<Map<String, String>> getRequestA() throws SQLException {
        List<Map<String, String>> filmList = new ArrayList<Map<String, String>>();

        String sql = "SELECT * FROM Film";
        Statement stmt = connexion.createStatement();
        ResultSet result = stmt.executeQuery(sql);

        while(result.next()) {
            HashMap<String, String> film = new HashMap<>();
            film.put("titre", result.getString("titre"));
            film.put("annee", result.getString("annee"));
            film.put("id_realisateur", result.getString("id_realisateur"));
            film.put("genre", result.getString("genre"));
            film.put("resume", result.getString("resume"));
            film.put("code_pays", result.getString("code_pays"));

            filmList.add(film);
        }
        return filmList;
    }

    public List<Film> getRequestB() throws SQLException {
        List<Film> listFilm = new ArrayList<>();

        String sql = "SELECT * FROM Film";
        Statement stmt = connexion.createStatement();
        ResultSet result = stmt.executeQuery(sql);

        while(result.next()) {
            Film film = new Film();

            film.setTitre(result.getString("titre"));
            film.setAnnee(Integer.parseInt(result.getString("annee")));

            listFilm.add(film);
        }

        return listFilm;
    }

    public Artiste getArtiste(Integer idArtiste) throws SQLException{
        String sql = "SELECT * FROM Artiste WHERE id=?";
        PreparedStatement ps = connexion.prepareStatement(sql);
        System.out.println("2");
        ps.setInt(1, idArtiste);

        ResultSet rs = ps.executeQuery();
        Artiste artiste = new Artiste();

        while (rs.next()) {
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String dateNaissance = rs.getString("annee_naissance");

            artiste.setNom(nom);
            artiste.setPrenom(prenom);
            artiste.setAnnee_naissance(Integer.parseInt(dateNaissance));
        }

        return artiste;
    }

    public Artiste getRealisateur(Integer idFilm) throws SQLException{
        String sql = "SELECT Artiste.id, Artiste.nom, Artiste.prenom FROM Artiste, Film WHERE Film.id = ? AND Artiste.id = Film.id_realisateur";

        PreparedStatement ps = connexion.prepareStatement(sql);
        ps.setInt(1, idFilm);
        System.out.println(1.5);
        ResultSet rs = ps.executeQuery();

        Artiste artiste = new Artiste();
        System.out.println(1.7);

        if(rs.first()) {
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");

            artiste.setNom(nom);
            artiste.setPrenom(prenom);
            System.out.println(1.8);
        }
        System.out.println(1.9);
        System.out.println(artiste.getNom());
        System.out.println(artiste.getPrenom());
        return artiste;
    }

}
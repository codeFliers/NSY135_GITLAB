package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

}
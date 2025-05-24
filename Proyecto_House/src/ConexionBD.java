import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase {@code ConexionBD} que proporciona una conexión a una base de datos MySQL.
 * 
 * <p>Utiliza el controlador JDBC para conectarse a una base de datos alojada localmente
 * en el puerto 3306, con el nombre de base de datos "proyecto". Por defecto, se conecta
 * con el usuario "root" y sin contraseña, lo cual es común en entornos como XAMPP.</p>
 * 
 * <p>Esta clase es útil para centralizar la lógica de conexión y reutilizarla en otras
 * partes de la aplicación.</p>
 * 
 * @author Miguel Ceballos Sánchez y Daniel Rivera Miranda
 */
public class ConexionBD {

    /** URL de conexión a la base de datos. */
    private static final String URL = "jdbc:mysql://localhost:3306/proyecto";

    /** Nombre de usuario para la base de datos. */
    private static final String USUARIO = "root";

    /** Contraseña para la base de datos (vacía por defecto en XAMPP). */
    private static final String CONTRASENA = "";

    /**
     * Establece y devuelve una conexión a la base de datos MySQL.
     * 
     * @return una instancia de {@link Connection} si la conexión fue exitosa;
     *         {@code null} si ocurre un error durante la conexión.
     */
    public static Connection conectar() {
        try {
            Connection con = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Conexión exitosa");
            return con;
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
            return null;
        }
    }
}


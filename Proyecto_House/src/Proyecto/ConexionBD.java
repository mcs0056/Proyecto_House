package Proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	private static final String URL = "jdbc:mysql://localhost:3306/proyecto";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = ""; // vacía por defecto en XAMPP

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

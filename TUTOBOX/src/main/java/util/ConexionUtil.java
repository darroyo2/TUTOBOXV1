package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/tutobox";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "admin";

    public static Connection obtenerConexion() {
        Connection conexion = null;

        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión con la base de datos
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return conexion;
    }

    public static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

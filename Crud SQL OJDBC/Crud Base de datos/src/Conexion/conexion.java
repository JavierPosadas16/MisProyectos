package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    private static Connection conexion;
    private static String usuario = "SYSTEM";
    private static String contraseña = "ejemplo";
    private static String cadenaConexion = "jdbc:oracle:thin:@localhost:1521:PROYECTO";

    public static Connection getConexion() {
        try {
             Class.forName("oracle.jdbc.OracleDriver");
             conexion = DriverManager.getConnection(cadenaConexion,usuario,contraseña);
             conexion.setAutoCommit(false);
             if (conexion != null) {
                 System.out.println("Conexion exitosa");
            } else
                 System.out.println("Conexion erronea");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error");
        }
        
        return conexion;
    }

    

    public static void main(String[] args) {
        conexion connection = new conexion();
        connection.getConexion();
    }
}

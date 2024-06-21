package Modelo;

import java.sql.*;

public class Conexion {

    // Declarar los objetos JDBC.
    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public Conexion() {
        try {
            // Registrar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establecer la conexión.
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/matricula?verifyServerCertificate=false&useSSL=true", "root", "filadelfia26");
            con.setAutoCommit(true);
            
            System.out.println("Conexión exitosa...");

        } catch (SQLException | ClassNotFoundException e) {

            e.printStackTrace();

        } finally {
            
            // Cerrar recursos
            if (rs != null) try { rs.close(); } catch (Exception e) { e.printStackTrace(); }
            if (stmt != null) try { stmt.close(); } catch (Exception e) { e.printStackTrace(); }
            if (con != null) try { con.close(); } catch (Exception e) { e.printStackTrace(); }
        }
    }
}

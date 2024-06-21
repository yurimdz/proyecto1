package Modelo;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private Connection con = null;

    public Conexion() {
        try {
            // Registrar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión.
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_pacientes", "root", "filadelfia26");
            con.setAutoCommit(true);

            System.out.println("Conexión exitosa...");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean validarUsuario(String usuario, String clave) {
        String query = "SELECT * FROM usuarios WHERE login=yuri AND clave=1234";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, usuario);
            pst.setString(2, clave);
            ResultSet rs = pst.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Connection getConnection() {
        return con;
    }
}

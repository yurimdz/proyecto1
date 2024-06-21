package Modelo;

import java.sql.*;

public class Paciente {

    private String nombre, cedula, edad, contacto, residencia, fecha, hora;

    public Paciente(String nombre, String cedula, String edad, String contacto, String residencia, String fecha, String hora) {
        
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.contacto = contacto;
        this.residencia = residencia;
        this.fecha = fecha;
        this.hora = hora;

    }

    public String getNombre() { return nombre; }
    public String getCedula() { return cedula; }
    public String getEdad() { return edad; }
    public String getContacto() { return contacto; }
    public String getResidencia() { return residencia; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }

    public static boolean insertarPaciente(Paciente paciente) {

        try (Connection con = DataBaseConnection.getConnection()) {

            String query = "INSERT INTO pacientes (nombre, cedula, edad, contacto, residencia, fecha, hora) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getCedula());
            ps.setString(3, paciente.getEdad());
            ps.setString(4, paciente.getContacto());
            ps.setString(5, paciente.getResidencia());
            ps.setString(6, paciente.getFecha());
            ps.setString(7, paciente.getHora());
            ps.executeUpdate();

            return true;

        } catch (SQLException e) {
            
            e.printStackTrace();
            return false;
        }
    }

    public static Paciente consultarPaciente(String cedula) {
        try (Connection con = DataBaseConnection.getConnection()) {
            String query = "SELECT * FROM pacientes WHERE cedula = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, cedula);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Paciente(
                    rs.getString("nombre"),
                    rs.getString("cedula"),
                    rs.getString("edad"),
                    rs.getString("contacto"),
                    rs.getString("residencia"),
                    rs.getString("fecha"),
                    rs.getString("hora")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean actualizarPaciente(Paciente paciente) {
        try (Connection con = DataBaseConnection.getConnection()) {
            String query = "UPDATE pacientes SET nombre = ?, edad = ?, contacto = ?, residencia = ?, fecha = ?, hora = ? WHERE cedula = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getEdad());
            ps.setString(3, paciente.getContacto());
            ps.setString(4, paciente.getResidencia());
            ps.setString(5, paciente.getFecha());
            ps.setString(6, paciente.getHora());
            ps.setString(7, paciente.getCedula());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean eliminarPaciente(String cedula) {
        try (Connection con = DataBaseConnection.getConnection()) {
            String query = "DELETE FROM pacientes WHERE cedula = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, cedula);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
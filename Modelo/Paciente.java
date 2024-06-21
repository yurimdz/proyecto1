package Modelo;

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

}
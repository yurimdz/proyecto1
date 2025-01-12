package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MantenimientoPaciente extends JFrame implements ActionListener {

    private JTextField nombreField, cedulaField, edadField, contactoField, residenciaField, fechaField, horaField;
    private JButton insertarButton, actualizarButton, eliminarButton, consultarButton;

    public MantenimientoPaciente() {
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana() {
        setTitle("Mantenimiento de Pacientes");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
    }

    private void inicializarComponentes() {
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(50, 50, 150, 30);
        add(nombreLabel);

        nombreField = new JTextField();
        nombreField.setBounds(200, 50, 200, 30);
        add(nombreField);

        JLabel cedulaLabel = new JLabel("Cédula:");
        cedulaLabel.setBounds(50, 100, 150, 30);
        add(cedulaLabel);

        cedulaField = new JTextField();
        cedulaField.setBounds(200, 100, 200, 30);
        add(cedulaField);

        JLabel edadLabel = new JLabel("Edad:");
        edadLabel.setBounds(50, 150, 150, 30);
        add(edadLabel);

        edadField = new JTextField();
        edadField.setBounds(200, 150, 200, 30);
        add(edadField);

        JLabel contactoLabel = new JLabel("Contacto:");
        contactoLabel.setBounds(50, 200, 150, 30);
        add(contactoLabel);

        contactoField = new JTextField();
        contactoField.setBounds(200, 200, 200, 30);
        add(contactoField);

        JLabel residenciaLabel = new JLabel("Residencia:");
        residenciaLabel.setBounds(50, 250, 150, 30);
        add(residenciaLabel);

        residenciaField = new JTextField();
        residenciaField.setBounds(200, 250, 200, 30);
        add(residenciaField);

        JLabel fechaLabel = new JLabel("Fecha:");
        fechaLabel.setBounds(50, 300, 150, 30);
        add(fechaLabel);

        fechaField = new JTextField();
        fechaField.setBounds(200, 300, 200, 30);
        add(fechaField);

        JLabel horaLabel = new JLabel("Hora:");
        horaLabel.setBounds(50, 350, 150, 30);
        add(horaLabel);

        horaField = new JTextField();
        horaField.setBounds(200, 350, 200, 30);
        add(horaField);

        insertarButton = new JButton("Insertar");
        insertarButton.setBounds(450, 50, 150, 40);
        add(insertarButton);
        insertarButton.addActionListener(this);

        actualizarButton = new JButton("Actualizar");
        actualizarButton.setBounds(450, 150, 150, 40);
        add(actualizarButton);
        actualizarButton.addActionListener(this);

        eliminarButton = new JButton("Eliminar");
        eliminarButton.setBounds(450, 250, 150, 40);
        add(eliminarButton);
        eliminarButton.addActionListener(this);

        consultarButton = new JButton("Consultar");
        consultarButton.setBounds(450, 350, 150, 40);
        add(consultarButton);
        consultarButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == insertarButton) {
            // Implementar lógica de inserción
        }
        if (e.getSource() == actualizarButton) {
            // Implementar lógica de actualización
        }
        if (e.getSource() == eliminarButton) {
            // Implementar lógica de eliminación
        }
        if (e.getSource() == consultarButton) {
            // Implementar lógica de consulta
        }
    }
}

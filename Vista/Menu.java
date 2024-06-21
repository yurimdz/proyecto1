package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener {

    private JButton botonMantenimiento, botonDerechos, botonSalir;

    public Menu() {
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana() {
        setTitle("Menú Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
    }

    private void inicializarComponentes() {
        botonMantenimiento = new JButton("Mantenimiento");
        botonMantenimiento.setBounds(50, 50, 300, 30);
        add(botonMantenimiento);
        botonMantenimiento.addActionListener(this);

        botonDerechos = new JButton("Derechos de Autor");
        botonDerechos.setBounds(50, 100, 300, 30);
        add(botonDerechos);
        botonDerechos.addActionListener(this);

        botonSalir = new JButton("Salir");
        botonSalir.setBounds(50, 150, 300, 30);
        add(botonSalir);
        botonSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonMantenimiento) {
            MantenimientoPaciente mantenimiento = new MantenimientoPaciente();
            mantenimiento.setVisible(true);
        } else if (e.getSource() == botonDerechos) {
            JOptionPane.showMessageDialog(this, "Desarrolladores: Juan Pérez, Ana García, etc.", "Derechos de Autor", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == botonSalir) {
            System.exit(0);
        }
    }
}

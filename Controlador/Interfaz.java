package Controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import Modelo.Conexion;
import Vista.MantenimientoPaciente;
import Vista.Menu;

public class Interfaz extends JFrame implements ActionListener {

    JTextField usuarioField;
    JPasswordField claveField;
    JButton botonIngresar;

    public Interfaz() {
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        comp();
    }

    private void comp() {
        JLabel Inicio = new JLabel("Bienvenido al sistema de citas");
        Inicio.setBounds(225, 100, 600, 50);
        Inicio.setForeground(Color.WHITE);
        Inicio.setFont(new Font("cooper black", Font.ROMAN_BASELINE, 26));
        add(Inicio);

        JLabel Encabezado = new JLabel("Por favor, ingrese su usuario y contraseña para ingresar");
        Encabezado.setBounds(200, 145, 600, 50);
        Encabezado.setForeground(Color.WHITE);
        Encabezado.setFont(new Font("Roboto", Font.BOLD, 17));
        add(Encabezado);
        
        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setForeground(Color.WHITE);
        usuarioLabel.setFont(new Font("Roboto", Font.BOLD, 14));
        usuarioLabel.setBounds(275, 240, 100, 30);
        add(usuarioLabel);

        usuarioField = new JTextField();
        usuarioField.setBounds(375, 240, 200, 30);
        add(usuarioField);

        JLabel claveLabel = new JLabel("Contraseña:");
        claveLabel.setForeground(Color.WHITE);
        claveLabel.setFont(new Font("Roboto", Font.BOLD, 14));
        claveLabel.setBounds(275, 300, 100, 30);
        add(claveLabel);

        claveField = new JPasswordField();
        claveField.setBounds(375, 300, 200, 30);
        add(claveField);
        
        botonIngresar = new JButton("Ingresar al menú");
        botonIngresar.setBounds(405, 385, 130, 30);
        botonIngresar.setFont(new Font("Roboto", Font.BOLD, 12));
        botonIngresar.setForeground(new java.awt.Color(102, 102, 102));
        botonIngresar.setBackground(Color.WHITE);
        botonIngresar.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        add(botonIngresar);
        botonIngresar.addActionListener(this);
        
        JPanel fondo = new JPanel();
        fondo.setBackground(new java.awt.Color(42, 94, 166));
        fondo.setSize(900, 650);
        fondo.setLocation(0, 0);
        fondo.setVisible(true);
        add(fondo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == botonIngresar) {

            String usuario = usuarioField.getText();
            String clave = new String(claveField.getPassword());
            Conexion conexion = new Conexion();
            
            if (conexion.validarUsuario(usuario, clave)) {
                MantenimientoPaciente menu = new MantenimientoPaciente();
                menu.setVisible(true);
                this.dispose();

            } else {

                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

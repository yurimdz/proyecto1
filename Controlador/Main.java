package Controlador;

import java.awt.Color;

public class Main {
    
    public static void main(String[] args) {
      
        Interfaz GUI = new Interfaz();
       
        //Configuración de la ventana principal
        GUI.setTitle("LOGIN");
        GUI.setLayout(null);
        GUI.setBounds(300, 200, 900, 650);
        GUI.setBackground(Color.WHITE);
        GUI.setResizable(false);
        GUI.setVisible(true);
        GUI.setLocationRelativeTo(null);  
    } 
}
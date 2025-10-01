package com.mycompany.actividad3.MVC;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tarde
 */
public class main {
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(() -> {
            LogInVista vista = new LogInVista();
            new LogInControlador(vista);
            vista.setVisible(true);
        });
    }
}

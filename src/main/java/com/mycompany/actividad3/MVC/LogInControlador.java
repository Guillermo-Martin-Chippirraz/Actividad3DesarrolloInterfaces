/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad3.MVC;

import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author tarde
 */
public class LogInControlador {
    private LogInVista vista;
    private LogInModelo modelo;
    
    public LogInControlador(LogInVista vista, LogInModelo modelo){
        this.vista = new LogInVista();
        this.modelo = new LogInModelo(vista.getTxtUsuario(), 
                vista.getTxtPasswordTxt());

        
        vista.getBtnLogIn().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(modelo.check())
                    vista.getLblCheck().setText("El usuario es válido.");
                else vista.getLblCheck().setText("El usuario o la contraseña "
                        + "no son válidos.");
            }
        })
    }
}

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
    
    public LogInControlador(LogInVista vista){
        this.vista = vista;
        
        vista.getBtnLogIn().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String usuario = vista.getTxtUsuarioTxt();
                char[] password = vista.getTxtPasswordTxt();
                
                LogInModelo modelo = new LogInModelo(usuario, password);
                
                if(modelo.check())
                    vista.setLblCheck("El usuario es válido.");
                else
                    vista.setLblCheck("El usuario o la contraseña no son "
                            + "válidos.");
            }
        });
    }
    
}

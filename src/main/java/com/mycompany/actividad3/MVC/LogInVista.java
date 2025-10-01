/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad3.MVC;

import javax.swing.*;
/**
 *
 * @author tarde
 */
public class LogInVista extends JFrame{
    private TextoYCaja panelUsuario;
    private TextoYCaja panelPassword;
    private JButton btnLogIn;
    private JLabel lblCheck;
    
    public LogInVista(){
        
        setTitle("LogIn");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        panelUsuario = new TextoYCaja("Usuario", false);
        panelPassword = new TextoYCaja("Contraseña", true);
        btnLogIn = new JButton("Logearse");
        lblCheck = new JLabel();
        
        panelUsuario.setBounds(50, 30, 300, 45);
        panelPassword.setBounds(50, 30, 300, 45);
        btnLogIn.setBounds(150, 170, 100, 25);
        lblCheck.setBounds(150, 190, 150, 25);

        add(panelUsuario);
        add(panelPassword);
        add(btnLogIn);
        add(lblCheck);
    }
    
    public void setLblCheck(String txt){
        lblCheck.setText(txt);
    }
    
    public String getTxtUsuarioTxt(){
        return panelUsuario.getTexto();
    }
    
    public char[] getTxtPasswordTxt(){
        return panelPassword.getPassword();
    }
    
    public JButton getBtnLogIn(){
        return btnLogIn;
    }
    
    public JLabel getLblCheck(){
        return lblCheck;
    }
}

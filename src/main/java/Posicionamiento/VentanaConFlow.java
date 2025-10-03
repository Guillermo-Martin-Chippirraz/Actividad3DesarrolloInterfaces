/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posicionamiento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author tarde
 */
public class VentanaConFlow extends JFrame{
    private static final String USER = "admin";
    private static final char[] PASS = {'1', '2', '3', '4'};
    
    public VentanaConFlow(){
        setTitle("LogIn FlowLayout");
        setSize(360, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        JPanel filaUsuario = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel filaPassword = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        TextoYCajaPaFlow panelUsuario = new TextoYCajaPaFlow("Usuario", false);
        TextoYCajaPaFlow panelPassword = new TextoYCajaPaFlow("Contraseña", true);
        JButton btnLogIn = new JButton("logearse");
        JLabel lblCheck = new JLabel();
        
        panel.add(panelUsuario);
        panel.add(panelPassword);
        panel.add(btnLogIn);
        panel.add(lblCheck);
        
        btnLogIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                boolean check = true;
                
                for(int i = 0; i < panelPassword.getPassword().length; i++){
                    if(panelPassword.getPassword().length == PASS.length){
                        if(panelPassword.getPassword()[i] != PASS[i])
                        check = false;
                    }else check = false;
                   
                }
                
                if(panelUsuario.getTexto().equals(USER) && check)
                    lblCheck.setText("El usuario es válido.");
                else
                    lblCheck.setText("El usuario o la contraseña no son "
                            + "válidos.");
            }
        });
        
        add(panel);
    }
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new VentanaConFlow().setVisible(true));
    }
}

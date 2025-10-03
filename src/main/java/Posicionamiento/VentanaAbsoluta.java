/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posicionamiento;

import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author tarde
 */
public class VentanaAbsoluta extends JFrame{
    private static final String USER = "admin";
    private static final char[] PASS = {'1', '2', '3', '4'};
    
    public VentanaAbsoluta(){
        setTitle("LogIn Absolutooooooo");
        setSize(360, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel lblUsuario = new JLabel("Usuario");
        lblUsuario.setBounds(120, 20, 80, 25);
        panel.add(lblUsuario);
        
        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(100, 50, 100, 25);
        panel.add(txtUsuario);
        
        JLabel lblPassword = new JLabel("Contraseña");
        lblPassword.setBounds(120, 90, 80, 25);
        panel.add(lblPassword);
        
        JPasswordField txtPassword = new JPasswordField();
        txtPassword.setBounds(100, 110, 100, 25);
        panel.add(txtPassword);
        
        JButton btnLogIn = new JButton("Loguearse");
        btnLogIn.setBounds(150, 150, 60, 25);
        panel.add(btnLogIn);
        
        JLabel lblCheck = new JLabel();
        lblCheck.setBounds(120, 180, 80, 25);
        panel.add(lblCheck);
        
        btnLogIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                boolean check = true;
                
                for(int i = 0; i < txtPassword.getPassword().length; i++){
                    if(txtPassword.getPassword().length == PASS.length){
                        if(txtPassword.getPassword()[i] != PASS[i])
                        check = false;
                    }else check = false;
                   
                }
                
                if(txtUsuario.getText().equals(USER) && check)
                    lblCheck.setText("El usuario es válido.");
                else
                    lblCheck.setText("El usuario o la contraseña no son "
                            + "válidos.");
            }
        });
        
        add(panel);
    }
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new VentanaAbsoluta().setVisible(true));
    }
}

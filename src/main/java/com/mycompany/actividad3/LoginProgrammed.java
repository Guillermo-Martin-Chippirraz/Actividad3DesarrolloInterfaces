package com.mycompany.actividad3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author tarde
 */
public class LoginProgrammed extends JFrame{
    private static final String USER = "admin";
    private static final char[] PASS = {'1', '2', '3', '4'};
    
    private JLabel lblUsuario;
    private JTextField txtUsuario;
    private JLabel lblPassword;
    private JPasswordField txtPassword;
    private JButton btnLogIn;
    private JLabel lblCheck;
    
    public LoginProgrammed(){
        initComponents();
        
        setTitle("LogIn");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        lblUsuario = new JLabel("Usuario");
        txtUsuario = new JTextField();
        lblPassword = new JLabel("Constraseña");
        txtPassword = new JPasswordField();
        btnLogIn = new JButton("Logearse");
        lblCheck = new JLabel();
        
        lblUsuario.setBounds(150, 30, 100, 25);
        txtUsuario.setBounds(150, 60, 100, 25);
        lblPassword.setBounds(150, 100, 100, 25);
        txtPassword.setBounds(150, 130, 100, 25);
        btnLogIn.setBounds(150, 170, 100, 25);
        lblCheck.setBounds(150, 190, 150, 25);

        add(lblUsuario);
        add(txtUsuario);
        add(lblPassword);
        add(txtPassword);
        add(btnLogIn);
        add(lblCheck);
        
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
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents(){
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
                getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING).addGap(0, 400, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.
                GroupLayout.Alignment.LEADING).addGap(0, 300, Short.MAX_VALUE));
        pack();
    }
    
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(() -> new LoginProgrammed().
                setVisible(true));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logInMVC;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author tarde
 */
public class LogInVista extends JFrame{
    private JLabel lblUsuario;
    private JTextField txtUsuario;
    private JLabel lblPassword;
    private JPasswordField txtPassword;
    private JButton btnLogIn;
    private JLabel lblCheck;
    
    public LogInVista(){
        
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
    }
    
    public void setLblCheck(String txt){
        lblCheck.setText(txt);
    }
    
    public String getTxtUsuarioTxt(){
        return txtUsuario.getText();
    }
    
    public char[] getTxtPasswordTxt(){
        return txtPassword.getPassword();
    }
    
    public JButton getBtnLogIn(){
        return btnLogIn;
    }
    
    public JLabel getLblCheck(){
        return lblCheck;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Posicionamiento;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author tarde
 */
public class TextoYCajaPaFlow extends JPanel{
    private JLabel nombre;
    private JTextField campoTexto;
    private JPasswordField campoPassword;
    
    public TextoYCajaPaFlow(String textoNombre, boolean cifrado){
        setLayout(new FlowLayout());
        
        nombre = new JLabel(textoNombre);
        if(cifrado){
            campoPassword = new JPasswordField();
            campoPassword.setBounds(120, 10, 150, 25);
            add(campoPassword);
        }else{
            campoTexto = new JTextField();
            campoTexto.setBounds(120, 10, 150, 25);
            add(campoTexto);
        }
        
        
        nombre.setBounds(10, 10, 100, 25);
        
        add(nombre);
        
        setSize(300, 45);
    }
    
    public String getTexto(){
        return campoTexto.getText();
    }
    
    public void setTexto(String texto){
        campoTexto.setText(texto);
    }
    
    public char[] getPassword(){
        return campoPassword.getPassword();
    }
}

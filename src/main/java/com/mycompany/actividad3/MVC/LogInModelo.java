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
public class LogInModelo extends JFrame{
    private static final String USER = "admin";
    private static final char[] PASS = {'1', '2', '3', '4'};
    
    private String usuario;
    private char[] password;
    
    public LogInModelo(String usuario, char[] password){
        this.usuario = usuario;
        this.password = password;
    }
    
    public boolean check(){
        if(!usuario.equals(USER)) return false;
        if(password.length != PASS.length) return false;
        
        for(int i = 0; i < PASS.length; i++){
            if(password[i] != PASS[i]) return false;
        }
        
        return true;
    }
}

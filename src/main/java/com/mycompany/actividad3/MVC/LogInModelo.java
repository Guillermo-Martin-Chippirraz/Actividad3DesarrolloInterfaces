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
    private char[] pass;
    
    public LogInModelo(String usuario, char [] pass){
        this.usuario = usuario;
        for(int i = 0; i < pass.length; i++)
            this.pass[i] = pass[i];
        
    }
    
    public boolean check(){
        boolean check = true;
            
            if(pass.length == PASS.length){
                for(int i = 0; i < pass.getPassword().length; i++){
                    if(pass[i] != PASS[i])
                        check = false;
                }
            }else check = false;
        
            if(USER.equals(usuario) && check)
                return true;
            else return false;
            
    }
}

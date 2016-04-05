/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.PrincipalCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DELL
 */
public class Controlador_Ventana_Princ implements ActionListener {
    
    private PrincipalCalculadora ventaCalcu;
    private String var; 

    public Controlador_Ventana_Princ(PrincipalCalculadora ventaCalcu) {
        this.ventaCalcu = ventaCalcu;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Calcular"))
        {
            ventaCalcu.calcuOpe();
        }
                
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }
    
    
    

    
}

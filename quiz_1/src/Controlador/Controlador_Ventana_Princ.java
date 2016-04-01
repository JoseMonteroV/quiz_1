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
        
        
                
        // La cadena a analizar
        String cadena = "";

        // Obtenemos un Pattern con la expresión regular, y de él
        // un Matcher, para extraer los trozos de interés.
        Pattern patron = Pattern.compile("(\\d+)\\+(\\d+)=(\\d+)");

            Matcher matcher = patron.matcher(cadena);

        // Hace que Matcher busque los trozos.
        matcher.find();

        // Va devolviendo los trozos. El primer paréntesis es el 1,
        // el segundo el 2 y el tercero el 3
        System.out.println(matcher.group(1));
        System.out.println(matcher.group(2));
        System.out.println(matcher.group(3));
        System.out.println(matcher.groupCount());
        // La salida de este programa es
        // 23, 12,  35
        
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }
    
    
    

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionProfesor;

import javax.swing.JFrame;

/**
 *
 * @author sistemas10
 */
public class GestionarProfesor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame prueba;
        Profesor_Frame prueba2;
        Profesor_Frame prueba3;
        prueba2 = Profesor_Frame.Instanciar();
        prueba3 = Profesor_Frame.Instanciar();
        
        prueba2.setVisible(true); 
        prueba3.setVisible(true);
        System.out.println("GRAEACK");
    }
    
}

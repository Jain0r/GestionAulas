/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionProfesor;

import DAO.DAOProfesor;
import DAO.DAOProfesorImp;
import Entidad.Profesor;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.swing.JFrame;

/**
 *
 * @author sistemas10
 */
public class GestionarProfesor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Profesor_Frame form;
        form = Profesor_Frame.Instanciar();
        
        form.setVisible(true); 
        //Profesor_Frame form;
        Profesor prof = new Profesor();
        List<Profesor> listProf;
 
    }

}

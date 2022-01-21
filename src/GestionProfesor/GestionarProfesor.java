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
        
        //form.setVisible(true); 
        System.out.println("GRAEACK");
        //Profesor_Frame form;
        Profesor prof = new Profesor();
        List<Profesor> listProf; //= new ArrayList();
        
        //INSERTAR
        /*prof.setCodigo_profesor(5);
        prof.setNombre_profesor("GRAEACK2");
        prof.setEdad(22);
        prof.setTelefono(8574126);
        prof.setCorreo("jaaaaaaaaaaaaa");
        prof.setCurso_01(10);
        prof.setCurso_02(19);*/
        
        //LISTAR (ACA SUPONGO QUE AGREGO EL ORDENAMIENTO)
        try {
            DAOProfesor dao = new DAOProfesorImp();
            listProf = dao.listar();
            listProf.forEach(new Consumer<Profesor>(){
                @Override
                public void accept(Profesor listProf){
                    System.out.println(listProf.getNombre_profesor());
                }
            });
            
            form = new Profesor_Frame();
            form.setVisible(true);
            
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        
        /*JFrame prueba;
        Profesor_Frame prueba2;
        prueba2 = Profesor_Frame.Instanciar();
        
        prueba2.setVisible(true); 
        System.out.println("GRAEACK");*/
    }

}

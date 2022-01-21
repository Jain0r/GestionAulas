/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionProfesor;

import Entidad.Profesor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author sistemas10
 */
public class ProfesoresTableModel extends AbstractTableModel {

    private List<Profesor> profes;
    private String[] columns;

    public ProfesoresTableModel(List<Profesor> aProfe) {
        super();
        this.profes = aProfe;
        columns = new String[]{"Cod", "Nom", "Edad", "Tel", "Correo", "C1", "C2"};
    }

    @Override
    public int getRowCount() {
        return columns.length; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return profes.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int arg0, int arg1) {
        //To change body of generated methods, choose Tools | Templates.
        Profesor prof = profes.get(arg0);

        switch (arg1) {
            case 0: prof.getCodigo_profesor();
            case 1: prof.getNombre_profesor();
            case 2: prof.getEdad();
            case 3: prof.getTelefono();
            case 4: prof.getCorreo();
            case 5: prof.getCurso_01();
            case 6: prof.getCurso_02();
            default: return null;
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidad.Profesor;
import java.util.List;

/**
 *
 * @author sistemas10
 */
public interface DAOProfesor {
    
    public void Registrar(Profesor sideral) throws Exception;
    public void Modificar(Profesor sideral) throws Exception;
    public void Eliminar(Profesor sideral) throws Exception;
    public List<Profesor> listar() throws Exception;
}

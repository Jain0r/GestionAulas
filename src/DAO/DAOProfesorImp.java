/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidad.Profesor;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author sistemas10
 */
public class DAOProfesorImp extends Conexion implements DAOProfesor {

    @Override
    public void Registrar(Profesor sideral) throws Exception {
        try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO Profesores VALUES(?,?,?,?,?,?,?)");
            st.setInt(1,sideral.getCodigo_profesor());
            st.setString(2,sideral.getNombre_profesor());
            st.setInt(3, sideral.getEdad());
            st.setInt(4, sideral.getTelefono());
            st.setString(5, sideral.getCorreo());
            st.setInt(6, sideral.getCurso_01());
            st.setInt(7, sideral.getCurso_02());
            st.executeUpdate();
        } catch (Exception e){
            throw e;
        }finally{
            this.desconectar();
        }
    }

    @Override
    public void Modificar(Profesor sideral) throws Exception {
        try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE profesores set nombre_profesor = ?, edad = ?, telefono = ?, correo = ?, curso_01 = ?, curso_02 = ? WHERE codigo_profesor = ?");
            st.setString(1,sideral.getNombre_profesor());
            st.setInt(2,sideral.getEdad());
            st.setInt(3,sideral.getTelefono());
            st.setString(4,sideral.getCorreo());
            st.setInt(5,sideral.getCurso_01());
            st.setInt(6,sideral.getCurso_02());
            st.setInt(7,sideral.getCodigo_profesor());
            st.executeUpdate();
        }catch (Exception e){
            
        }
    }

    @Override
    public void Eliminar(Profesor sideral) throws Exception {
        try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE from profesores where codigo_profesor = ?");
            st.setInt(1, sideral.getCodigo_profesor());
            st.executeUpdate();
        } catch (Exception e) {

        }

    }

    
    @Override
    public List<Profesor> listar() throws Exception {
        List<Profesor> lista = null;
        try{
            this.conectar();
            PreparedStatement st = this.conexion.prepareStatement("select * from Profesores");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Profesor prof = new Profesor();
                prof.setCodigo_profesor(rs.getInt("codigo_profesor"));
                prof.setNombre_profesor(rs.getString("nombre_profesor"));
                prof.setEdad(rs.getInt("edad"));
                prof.setTelefono(rs.getInt("telefono"));
                prof.setCorreo(rs.getString("correo"));
                prof.setCurso_01(rs.getInt("curso_01"));
                prof.setCurso_02(rs.getInt("curso_02"));
                lista.add(prof);
            }
            rs.close();
            st.close();
            
        }catch (Exception e){
            throw e;
            
        } finally {
            this.desconectar();
        }
        return lista;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

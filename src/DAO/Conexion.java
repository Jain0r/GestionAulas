/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author sistemas10
 */
public class Conexion {
    protected Connection conexion;
    
    private final String Driver = "com.mysql.jdbc.Driver";
    private final String DB_URL ="jdbc:mysql://localhost:3306/gestionaulas";
    
    private final String USER = "root";
    private final String PASS = "oracle";
    
    public void conectar() throws Exception{
        try{
            Class.forName(Driver);
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        
        }catch(Exception e){
        }
        
    }
    
    public void desconectar() throws Exception{
        if(conexion!= null){
            if(!conexion.isClosed()){
                conexion.close(); 
            }
        }
    }
}

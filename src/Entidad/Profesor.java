/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author sistemas10
 */
public class Profesor {
    
    private int codigo_profesor;
    private String nombre_profesor;
    private int edad;
    private int telefono;
    private String correo;
    private int curso_01;
    private int curso_02;
    
    public Profesor(){};
    public Profesor(int cod, String nm, int edad, int tel, String correo, int c1, int c2){
        super();
        this.codigo_profesor = cod;
        this.nombre_profesor = nm;
        this.edad = edad;
        this.telefono = tel;
        this.correo = correo;
        this.curso_01 = c1;
        this.curso_02 = c2;
    }
    

    public int getCodigo_profesor() {
        return codigo_profesor;
    }

    public void setCodigo_profesor(int codigo_profesor) {
        this.codigo_profesor = codigo_profesor;
    }

    public String getNombre_profesor() {
        return nombre_profesor;
    }

    public void setNombre_profesor(String nombre_profesor) {
        this.nombre_profesor = nombre_profesor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCurso_01() {
        return curso_01;
    }

    public void setCurso_01(int curso_01) {
        this.curso_01 = curso_01;
    }

    public int getCurso_02() {
        return curso_02;
    }

    public void setCurso_02(int curso_02) {
        this.curso_02 = curso_02;
    }    
    
}

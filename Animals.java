/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class Student {
    
    
    //Atributos
    private String id;
    public String nombre;
    private int edad;
    public String jornada;
    public String curso;

    
    //Metodo Contructor 
    public Student(String id, String nombre, int edad, String jornada, String curso) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.jornada = jornada;
        this.curso = curso;
    }
    
    //Metodos de acceso Getters y Setters
    
    //Getters

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getJornada() {
        return jornada;
    }

    public String getCurso() {
        return curso;
    }
    
    
    //Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}



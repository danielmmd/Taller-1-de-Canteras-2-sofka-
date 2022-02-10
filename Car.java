/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class Car {
    
    
    //Atributos de la clase 
        
    private int numeroLLantas;
    private String modelo;
    public String[] color;
    private int numeroPuertas;
    
    
    //Metodo Constructor

    public Car(int numeroLLantas, String modelo, String[] color) {
        this.numeroLLantas = numeroLLantas;
        this.modelo = modelo;
        this.color = color;
    }
    
    
    //Metodos de acceso Getters y Setters
    //Getters
    public int getNumeroLLantas() {
        return numeroLLantas;
    }

    public String getModelo() {
        return modelo;
    }

    public String[] getColor() {
        return color;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    
    //Setters

    public void setNumeroLLantas(int numeroLLantas) {
        this.numeroLLantas = numeroLLantas;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    
    
    
    
}

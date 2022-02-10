/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class Fruit {
    
    //Atributos de la clase Fruta
    
    public String name;
    private float averageWeight;
    public String[] color;

    
    //Metodo constructor
    
    public Fruit(String name, float averageWeight, String[] color) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.color = color;
    }

    
    
    //metodos de acceso Getters y Setters
    
    
    //Setters
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    
    
    
    //Getters
    
    public String getName() {
        return name;
    }

    public float getAverageWeight() {
        return averageWeight;
    }

    public String[] getColor() {
        return color;
    }
    
    
    
}

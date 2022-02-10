
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class Person {
    
    //Atributos de la clase Person (Persona)
    
    public String name; 
    public String lastName1; 
    public String lastName2;
    public Date dateBirth; 
    public float height; 
    
    
    // Metodos constructore  
    
    
    
    public Person (String name, String lastName1, String lastName2, Date datebirth, float height  ){
        
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = datebirth;
        this.height = height;
        
    }
    
    
    //metodos de acceso, Getter y Setter
    
    
    //Setters

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    
    
    
    //Getters
    public String GetName(){
        return name;
        
    }
    
  public String GetlastName1(){
        return lastName1;
        
    }
  
  public String GetlastName2(){
        return lastName2;
        
    }
  
 public Date GetdateBirt(){
        return dateBirth;
 }
 
 public float Getheight(){
     return height;
 }
    
    
    
    
    
    
    
    
}

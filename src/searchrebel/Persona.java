/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchrebel;

/**
 *
 * @author CarlosGA
 */
public class Persona {
    
    public Persona(String nombre, String apellido){
        
        this.nombre = nombre;
        
        this.apellido = apellido;
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        
    return apellido;    
    
    }    
    private String nombre;
    
    private String apellido;
    
}

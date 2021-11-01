/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchrebel;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author CarlosGA
 */
public class SearchRebel {
       public static void main(String[] args) {
        // TODO code application logic here
        
        int contador = 0;
          
        ArrayList<Persona> personas = new ArrayList<>();
        
        ArrayList<Persona> searchPersona = new ArrayList<>();

        Persona p1 =new Persona("Juan", "Sanchez");
        
        Persona p2 =new Persona("Alan", "Martin");
        
        Persona p3 =new Persona("Alejandro", "Corin");
        
         Persona p4 =new Persona("Alan", "Fariaz");
        
        personas.add(p1);
        
        personas.add(p2);
        
        personas.add(p3);
        
        personas.add(p4);
        
        System.out.println("Listado de Perosnas");
        
        for(Persona per : personas){
            
            System.out.println(per.getNombre());          
            
        }  
        
        String nombreBusqueda = JOptionPane.showInputDialog("Ingrese un nombre a buscar"); 
        
        for(Persona perso : personas){ 
            if(nombreBusqueda.equals(perso.getNombre())){                 
                contador ++;        
                searchPersona.add(perso);
            }             
        }        
        if(contador != 0) System.out.println("Resultados de Busqueda");
        
        else System.out.println("No se encontro coincidencia de busqueda");
        
        for(Persona persona : searchPersona){            
            System.out.println(persona.getNombre()+ " "+ persona.getApellido());
        }      
       
    }
}


//patrones creacionales

package com.mycompany.labsingleton;

public class Cocina {
    public Cocina(){
        
    }
     static Cocina instanciaUnica = null;
    
    boolean agregarSal=false;
            
    public static Cocina obtenerInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Cocina(); 
        }
        return instanciaUnica;
    }

    
    
    public void hacerSopa(){
        if(!agregarSal){
            
            System.out.println("agregando sal");
            agregarSal=true;
        }
    }
}
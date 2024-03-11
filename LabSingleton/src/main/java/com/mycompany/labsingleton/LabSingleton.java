
//patrones creacionales

package com.mycompany.labsingleton;

public class LabSingleton {

    public static void main(String[] args) {
       
        Cocina cocina1 = Cocina.obtenerInstancia();
        Cocina cocina2 = Cocina.obtenerInstancia();
        Cocina cocina3 = Cocina.obtenerInstancia();
        
        cocina1.hacerSopa();
        cocina2.hacerSopa();
        cocina3.hacerSopa();
    }
}



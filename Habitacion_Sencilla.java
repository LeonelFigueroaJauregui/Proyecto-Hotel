
package com.mycompany.proyecto_hotel;


// Aplicamos herencia, esta clase hereda de Habitacion
public class Habitacion_Sencilla extends Habitacion {
    private int camasIndividuales;
    
    // Constructor
    public Habitacion_Sencilla(int numero, double precio_la_Noche, int camasIndividuales) {
        super(numero, precio_la_Noche); // Llamamos el constructor de la clase base
        this.camasIndividuales = camasIndividuales;
    }
    
    // Sobrescribimos el metodo mostrar_Info()
    @Override
    public void mostrar_Info() {
        super.mostrar_Info(); // Llamamos el método de la clase Habitacion
        System.out.println(" -> Camas individuales: " + camasIndividuales);
    }
}
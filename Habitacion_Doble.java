
package com.mycompany.proyecto_hotel;


public class Habitacion_Doble extends Habitacion {
    private int camasDobles; // atributo extra

    // Constructor
    public Habitacion_Doble(int numero, double precio_la_Noche, int camasDobles) {
        super(numero, precio_la_Noche); // llama al constructor de la clase base
        this.camasDobles = camasDobles;
    }

    // Sobrescribir mostrar_Info()
    @Override
    public void mostrar_Info() {
        super.mostrar_Info(); // muestra lo básico de Habitacion
        System.out.println(" -> Camas dobles: " + camasDobles);
    }
}
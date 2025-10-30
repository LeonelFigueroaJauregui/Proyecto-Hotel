
package com.mycompany.proyecto_hotel;



public class Suite extends Habitacion {
    private boolean tieneJacuzzi;
    private boolean tieneVistaMar;

    // Constructor
    public Suite(int numero, double precio_la_Noche, boolean tieneJacuzzi, boolean tieneVistaMar) {
        super(numero, precio_la_Noche); // inicializa la parte de Habitacion
        this.tieneJacuzzi = tieneJacuzzi;
        this.tieneVistaMar = tieneVistaMar;
    }

    // Sobrescribir mostrar_Info()
    @Override
    public void mostrar_Info() {
        super.mostrar_Info(); // muestra lo básico de Habitacion
        System.out.println(" -> Jacuzzi: " + (tieneJacuzzi ? "Si" : "No"));
        System.out.println(" -> Vista al mar: " + (tieneVistaMar ? "Si" : "No"));
    }
}


package com.mycompany.proyecto_hotel;

//Atributos de mi clase base
public class Habitacion {
    private int numero;
    private double precio_la_Noche;
    private boolean ocupada;
    
    //Constructor
    public Habitacion(int numero, double preciolaNoche)
    {
        this.numero = numero;
        this.precio_la_Noche = preciolaNoche;
        this.ocupada = false;
    }
    
    //Metodos
    public void reservar() 
    {
        ocupada = true;
    }
    
    public void liberar() 
    { 
        ocupada = false;
    }
    
    public double calcular_el_Costo(int noches) 
    {
        return precio_la_Noche * noches;
    }
    
    public void mostrar_Info() 
    {
        System.out.println("Habitacion" + numero + 
                " | Precio: $" + precio_la_Noche + "| Ocupada:" +
                (ocupada ? "Si " : "No"));
    }
    
    // Getters (para acceder a atributos desde otra clase)
    public int getNumero() {
        return numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public double getPrecio_la_Noche() {
        return precio_la_Noche;
    }
    
}
    

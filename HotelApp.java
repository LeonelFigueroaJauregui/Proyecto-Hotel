package com.mycompany.proyecto_hotel;

import java.util.Scanner;

public class HotelApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Crear habitaciones =====
        Habitacion[] habitaciones = {
            new Habitacion_Sencilla(101, 500.0, 1),
            new Habitacion_Sencilla(102, 600.0, 2),
            new Habitacion_Doble(201, 800.0, 2),
            new Suite(301, 1500.0, true, false),
            new Suite(302, 2000.0, true, true)
        };

        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== Sistema de Reservaciones ===");
            System.out.println("1) Mostrar todas las habitaciones");
            System.out.println("2) Reservar habitacion");
            System.out.println("3) Liberar habitacion");
            System.out.println("4) Calcular costo de estancia");
            System.out.println("0) Salir");

            int opcion = leerEntero(sc, "Elige una opcion: ");

            switch (opcion) {

                case 1: // Mostrar todas
                    for (Habitacion h : habitaciones) {
                        h.mostrar_Info();
                        System.out.println("------------------");
                    }
                    break;

                case 2: // Reservar
                    int numR = leerEntero(sc, "Ingresa el numero de habitacion a reservar: ");
                    reservarHabitacion(habitaciones, numR);
                    break;

                case 3: // Liberar
                    int numL = leerEntero(sc, "Ingresa el numero de habitacion a liberar: ");
                    liberarHabitacion(habitaciones, numL);
                    break;

                case 4: // Calcular costo
                    int numC = leerEntero(sc, "Ingresa el numero de habitacion: ");
                    int noches = leerEntero(sc, "Numero de noches: ");
                    calcularCostoHabitacion(habitaciones, numC, noches);
                    break;

                case 0: // Salir
                    salir = true;
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        }

        sc.close();
    }

    // ===== Metodo auxiliar para leer enteros seguros =====
    public static int leerEntero(Scanner sc, String mensaje) {
        int valor;
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                sc.nextLine(); // limpiar buffer
                break;
            } else {
                System.out.println("Error: Debes ingresar un numero.");
                sc.nextLine(); // limpiar buffer
            }
        }
        return valor;
    }

    // ===== Metodos auxiliares =====
    public static void reservarHabitacion(Habitacion[] habs, int numero) {
        for (Habitacion h : habs) {
            if (h.getNumero() == numero) {
                if (!h.isOcupada()) {
                    h.reservar();
                    System.out.println("Habitacion " + numero + " reservada.");
                } else {
                    System.out.println("La habitacion " + numero + " ya esta ocupada.");
                }
                return;
            }
        }
        System.out.println("No se encontro la habitacion " + numero);
    }

    public static void liberarHabitacion(Habitacion[] habs, int numero) {
        for (Habitacion h : habs) {
            if (h.getNumero() == numero) {
                if (h.isOcupada()) {
                    h.liberar();
                    System.out.println("Habitacion " + numero + " liberada.");
                } else {
                    System.out.println("La habitacion " + numero + " ya esta libre.");
                }
                return;
            }
        }     
        System.out.println("No se encontro la habitacion " + numero);
    }

    public static void calcularCostoHabitacion(Habitacion[] habs, int numero, int noches) {
        for (Habitacion h : habs) {
            if (h.getNumero() == numero) {
                double total = h.calcular_el_Costo(noches);
                System.out.println("El costo total de la estancia es: $" + total);
                return;
            }
        }
        System.out.println("No se encontro la habitacion " + numero);
    }
}



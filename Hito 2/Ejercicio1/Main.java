package Ejercicio1;

public class Main {

    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo();

        v1.Girar_a_la_derecha();

        // En la clase Vehiculo crear el metodo Cambiar de Carril y llamarlo desde
        // la clase main

        v1.Cambiar_de_carril();

        Vehiculo v2 = new Vehiculo("Turbo", "Blanco", "Vagoneta", "4x4", "Toyota");
        v2.Mover();

        // Crear un metodo en la clase Vehiculo que me permita mostrar todos sus atribbutos

        v2.Mostrar_vehiculo();

        System.out.println(v2.getNombre());;

        v2.setColor("Rojo");

        v2.Mostrar_vehiculo();

    }

}

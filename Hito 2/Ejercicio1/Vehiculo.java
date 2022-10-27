package Ejercicio1;

public class Vehiculo {

    // Atributos de la clase

    private String nombre;
    private String color;
    private String modelo;
    private String tamano;
    private String marca;

    // Constructor de la clase Vehiculo

    public Vehiculo() {
        System.out.println("Soy el constructor");
    }

    public Vehiculo(String nom, String col, String mod, String tam, String mar) {
        this.nombre = nom;
        this.color = col;
        this.modelo = mod;
        this.tamano = tam;
        this.marca = mar;
    }

    public void Mover() {
        System.out.println("Soy el metodo Mover");
    }

    public void Frenar() {
        System.out.println("Soy el metodo Frenar");
    }

    public void Girar_a_la_derecha() {
        System.out.println("Soy el metodo Girar a la derecha");
    }

    public void Girar_a_la_izquierda() {
        System.out.println("Soy el metodo Girar a la izquierda");
    }

    public void Cambiar_de_carril() {
        System.out.println("Soy el metodo Cambiar de carril");
    }

    public void Mostrar_vehiculo() {
        System.out.println(this.nombre);
        System.out.println(this.color);
        System.out.println(this.modelo);
        System.out.println(this.tamano);
        System.out.println(this.marca);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setColor(String Nuevo_color) {
        this.color = Nuevo_color;
    }
}


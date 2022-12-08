package Proyecto_Tienda_Celulares;

public class Accesorios {
    private int nro_de_accesorio;
    private String nombre;
    private String precios;

    public Accesorios(int nro_de_accesorio, String nombre, String precios) {
        this.nro_de_accesorio = nro_de_accesorio;
        this.nombre = nombre;
        this.precios = precios;
    }

    public int getNro_de_accesorio() {
        return nro_de_accesorio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecios() {
        return precios;
    }

    public void setNro_de_accesorio(int nro_de_accesorio) {
        this.nro_de_accesorio = nro_de_accesorio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecios(String precios) {
        this.precios = precios;
    }

    public void mostrarAcces()
    {
        System.out.println("\n ");
        System.out.println("ACCESORIO: " + this.nro_de_accesorio);
        System.out.println("NOMBRE: " + this.nombre);
        System.out.println("PRECIO: " + this.precios);
    }
}



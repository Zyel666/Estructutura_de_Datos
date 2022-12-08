package Proyecto_Tienda_Celulares;

public class Detalle_De_Tienda {

    private String Nombre_tienda;
    private String Dueño;
    private int nro_telefono;
    private String ubicacion;

    public Detalle_De_Tienda(String nombre_tienda, String dueño, int nro_telefono, String ubicacion) {
        Nombre_tienda = nombre_tienda;
        Dueño = dueño;
        this.nro_telefono = nro_telefono;
        this.ubicacion = ubicacion;
    }


    public void mostrar()
    {
        System.out.println(this.Nombre_tienda);
        System.out.println(this.Dueño);
        System.out.println(this.nro_telefono);
        System.out.println(this.ubicacion);
    }
}

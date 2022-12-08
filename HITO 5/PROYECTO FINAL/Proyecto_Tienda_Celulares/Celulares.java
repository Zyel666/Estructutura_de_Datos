package Proyecto_Tienda_Celulares;

public class Celulares {

    private int IMEI;
    private String marca;
    private String precio;

    public Celulares(int IMEI, String marca, String precio)
    {
        this.IMEI = IMEI;
        this.marca = marca;
        this.precio = precio;
    }

    public int getIMEI() {
        return IMEI;
    }

    public String getMarca() {
        return marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setIMEI(int IMEI) {
        this.IMEI = IMEI;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void mostrarCel()
    {
        System.out.println("\n ");
        System.out.println("IMEI: " + this.IMEI);
        System.out.println("MARCA: " + this.marca);
        System.out.println("PRECIO: " + this.precio);
    }
}

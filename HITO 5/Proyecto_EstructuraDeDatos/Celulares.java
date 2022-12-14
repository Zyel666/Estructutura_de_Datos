package Proyecto_EstructuraDeDatos;

public class Celulares {
    private int IMEI;
    private String modelo;
    private String marca;
    private String precio;
    private String estado;

    public Celulares(int IMEI, String modelo, String marca, String precio, String estado)
    {
        this.IMEI = IMEI;
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.estado = estado;

    }
    public int getIMEI() { return IMEI; }

    public String getModelo() { return modelo; }

    public String getMarca() { return marca; }

    public String getPrecio() { return precio; }

    public String getEstado() { return estado; }

    public void setIMEI(int IMEI) {this.IMEI = IMEI;}

    public void setModelo(String modelo) { this.modelo = modelo; }

    public void setMarca(String marca) {this.marca = marca;}

    public void setPrecio(String precio) {this.precio = precio;}

    public void setEstado(String estado) { this.estado = estado; }
    public void mostrarCel() {
        System.out.println("\n ");
        System.out.println("IMEI: " + this.IMEI);
        System.out.println("MODELO: " + this.modelo);
        System.out.println("MARCA: " + this.marca);
        System.out.println("PRECIO: " + this.precio);
        System.out.println("ESTADO: " + this.estado);
    }
}

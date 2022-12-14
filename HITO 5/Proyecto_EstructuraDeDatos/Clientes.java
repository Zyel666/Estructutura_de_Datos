package Proyecto_EstructuraDeDatos;

public class Clientes {

    private int Id_cliente;
    private String nombre;
    private String apellidos;
    private String CI;
    private String compra;

    public Clientes(int id_cliente, String nombre, String apellidos, String CI, String compra) {
        Id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.CI = CI;
        this.compra = compra;
    }

    public int getId_cliente() {
        return Id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCI() {
        return CI;
    }

    public String getCompra() {
        return compra;
    }

    public void setId_cliente(int id_cliente) {
        Id_cliente = id_cliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public void setCompra(String compra) {
        this.compra = compra;
    }

    public void mostrarClient()
    {
        System.out.println("\n ");
        System.out.println("ID: " + this.Id_cliente);
        System.out.println("NOMBRE: " + this.nombre);
        System.out.println("APELLIDOS: " + this.apellidos);
        System.out.println("CI: " + this.CI);
        System.out.println("Compro: " + this.compra);
    }
}

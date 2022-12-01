package ColaDeClientes;

public class Cliente {
    private String nombres;
    private String apellidos;
    private int edad;
    private String pais;
    private String genero;
    private String tipo;

//----------------------------------------------------------------------------------------------------------------------
//El constructor
    public Cliente(String nombre, String apellido, int edad, String pais, String genero, String tipo) {
        this.nombres = nombre;
        this.apellidos = apellido;
        this.edad = edad;
        this.pais = pais;
        this.genero = genero;
        this.tipo = tipo;
    }

//----------------------------------------------------------------------------------------------------------------------
// Todos los getters
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getPais() {
        return pais;
    }

    public String getGenero() {
        return genero;
    }

    public String getTipo() {
        return tipo;
    }

//----------------------------------------------------------------------------------------------------------------------
// todos los setters
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

//----------------------------------------------------------------------------------------------------------------------
    //metodo mostrar cliente
    public void mostrarCliente(){
        System.out.println("\n CLIENTES");
        System.out.println("Nombre: "+ this.nombres);
        System.out.println("Apellido: "+ this.apellidos);
        System.out.println("Edad: "+ this.edad);
        System.out.println("Pais: "+ this.pais);
        System.out.println("Genero: "+ this.genero);
        System.out.println("Tipo: "+ this.tipo);
    }
}

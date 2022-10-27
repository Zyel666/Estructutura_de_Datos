package H2Defensa;

public class Provincia {

    private String nombre;

    public Provincia (String nombre){
        this.nombre = nombre;
    }

    public Provincia(){

    }
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void mostrarprovincia(){
        System.out.println("Nombre de provincia: "+ this.getNombre());
    }

}

package DefensaDePilasHito3;

public class Estudiante {

    public String nombre;
    public String apellidos;
    public int edad;
    public String sede;
    public int notafinal;
    public String Ci;

    public Estudiante(String nombre, String apellidos, int edad, String sede, int notafinal, String Ci){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sede = sede;
        this.notafinal = notafinal;
        this.Ci = Ci;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getSede() {
        return sede;
    }

    public int getNotafinal() {
        return notafinal;
    }

    public String getCi() {
        return Ci;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setNotafinal(int notafinal) {
        this.notafinal = notafinal;
    }

    public void setCi(String ci) {
        Ci = ci;
    }

    public void mostrarEstudiante()
    {
        System.out.println("\n Estudiante");
        System.out.println("Nombre: " + this.nombre );
        System.out.println("Apelllido: " + this.apellidos);
        System.out.println("Edad: " + this.edad);
        System.out.println("Sede: " + this.sede );
        System.out.println("Nota Final:" + this.notafinal);
        System.out.println("Ci" + this.Ci);
    }


}

package H2Defensa;

public class Pais {
    private int NroDeps;
    private Departamento[] departamento;
    private String Nombre;

    public Pais() {

    }

    public Pais(int NroDeps, String Nombre, Departamento[] departamento) {
        this.NroDeps = NroDeps;
        this.Nombre = Nombre;
        this.departamento = departamento;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public int getNroDeps() {
        return this.NroDeps;
    }

    public void setdepartamento(Departamento[] departamento) {
        this.departamento = departamento;
    }

    public void setNroDeps(int NroDeps) {
        this.NroDeps = NroDeps;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public Departamento[] getDepartamento() {
        return this.departamento;
    }

    public void mostrarpais() {

        System.out.println("nombre pais: " + this.getNombre());
        System.out.println("Numero de departamentos: " + this.getNroDeps());
        for (int i = 0; i < this.getDepartamento().length; i++) {
            this.getDepartamento()[i].mostrardepartamento();
        }

    }
}

package H2Defensa;

public class Departamento {

    private String nombre;
    private int nroProv;
    private Provincia[] provincias;

    public Departamento (String nombre, int nroProv, Provincia[] provincias){
        this.nombre = nombre;
        this.nroProv = nroProv;
        this.provincias = provincias;
    }

    public Departamento (){

    }
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void setNroProv (int nroProv){
        this.nroProv = nroProv;
    }

    public void setProvincias (Provincia [] provincias){
        this.provincias = provincias;
    }

    public int getNroProv (){
        return this.nroProv;
    }
    public Provincia[] getProvincias (){
        return this.provincias;
    }
    public void mostrardepartamento(){

        System.out.println("nombre : " + this.getNombre());
        System.out.println("Numero de provincias: " + this.getNroProv());
        for(int i=0; i<this.getProvincias() .length;i++){
            this.getProvincias() [i].mostrarprovincia();
    }
    }
}

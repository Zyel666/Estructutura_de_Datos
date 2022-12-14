package Proyecto_EstructuraDeDatos;

public class Personal {

    private String Rol_personal;
    private String nombres;
    private String apellidos;
    private String CI;
    private int Nro_cel;

    public Personal(String rol_personal, String nombres, String apellidos, String CI, int nro_cel) {
        Rol_personal = rol_personal;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.CI = CI;
        Nro_cel = nro_cel;
    }

    public String getRol_personal() {
        return Rol_personal;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCI() {
        return CI;
    }

    public int getNro_cel() {
        return Nro_cel;
    }

    public void setRol_personal(String rol_personal) {
        Rol_personal = rol_personal;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public void setNro_cel(int nro_cel) {
        Nro_cel = nro_cel;
    }

    public void mostrar()
    {
        System.out.println("\n ");
        System.out.println("ROL: " + this.Rol_personal);
        System.out.println("NOMBRE: " + this.nombres);
        System.out.println("APELLIDOS: " + this.apellidos);
        System.out.println("CI: " + this.CI);
        System.out.println("CELULAR: " + this.Nro_cel);
    }
}

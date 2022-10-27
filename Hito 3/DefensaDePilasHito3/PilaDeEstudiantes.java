package DefensaDePilasHito3;

public class PilaDeEstudiantes {

    public int max;
    public int tope;
    public Estudiante[] Estudiante;

    public PilaDeEstudiantes(int max)
    {
        this.tope = 0;
        this.max = max;
        this.Estudiante = new Estudiante[this.max +1];
    }

    //------------------------------------------------
//Metodos
    public boolean esVacio()
    {
        if(this.tope == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean esllena()
    {
        if(tope == max)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int nroElementos()
    {
        return this.tope;
    }

    public void adicionar(Estudiante NuevoEstudiante)
    {
        if (!this.esllena())
        {
            this.tope = this.tope +1;
            this.Estudiante[this.tope] = NuevoEstudiante;

        }
        else
        {
            System.out.println("La pila de Estudiantes esta llena: ");
        }

    }

    public Estudiante eliminar()
    {

        Estudiante elementosEliminados = null;

        if (this.esllena() == false)
        {
            elementosEliminados = this.Estudiante[this.tope];
            this.tope = this.tope -1;
        }
        else
        {
            System.out.println("No se puede eliminar una pila vacia.");
        }
        return elementosEliminados;
    }

    public void llenar()
    {


    }

    public void mostrar()
    {
        Estudiante elem=null;
        if(this.esVacio()){
            System.out.println("Pila vacia no hay ITEMS que mostrar");}

        else{
            System.out.println("\n Datos de la Pila Estudiantes");
            PilaDeEstudiantes aux = new PilaDeEstudiantes(this.max) ;
            while (!esVacio())
            {
                elem = this.eliminar();
                aux.adicionar(elem);
                elem.mostrarEstudiante() ;
            }
            vaciar(aux);
        }
    }

    public void vaciar(PilaDeEstudiantes  pila)
    {
        while (!pila.esVacio())
            adicionar(pila.eliminar());
    }


}

package Proyecto_EstructuraDeDatos;

public class Pila_personal {

    public int max;
    public int tope;
    public Personal[] personals;

    public Pila_personal (int max)
    {
        this.tope = 0;
        this.max = max;
        personals = new Personal[this.max + 1];
    }

    public boolean esVacio()
    {
        if ( tope == 0 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean esLlena()
    {
        if ( tope == max )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int NroElementos()
    {
        return this.tope;
    }

    public void adicionar(Personal NuevoCliente)
    {
        if (this.esLlena() == false)
        {
            this.tope = this.tope + 1;
            this.personals[this.tope] = NuevoCliente;
        }
        else
        {
            System.out.println("La pila de Clintes esta llena.");
        }
    }

    public Personal eliminar()
    {

        Personal ElementosEliminados = null;

        if (this.esLlena() == false)
        {
            ElementosEliminados = this.personals[this.tope];
            this.tope = this.tope -1;
            return ElementosEliminados;
        }
        else
        {
            System.out.println("No se puede eliminar una pila vacia.");
        }
        return ElementosEliminados;
    }

    public void llenar() { }
    public void mostrar()
    {
        Personal elemento = null;
        if(esVacio())
        {
            System.out.println("Pila vacia");
        }
        else
        {
            System.out.println("\n Personal");
            Pila_personal aux = new Pila_personal(10) ;
            while (!esVacio())
            {
                elemento = eliminar();
                aux.adicionar(elemento);
                elemento.mostrar();
            }
            vaciar(aux);
        }
    }
    public void vaciar(Pila_personal  a)
    {
        while (!a.esVacio())
            adicionar(a.eliminar());
    }
}

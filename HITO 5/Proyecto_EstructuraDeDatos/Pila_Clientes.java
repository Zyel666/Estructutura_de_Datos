package Proyecto_EstructuraDeDatos;

public class Pila_Clientes {

    public int max;
    public int tope;
    public Clientes[] Clientes;

    public Pila_Clientes (int max)
    {
        this.tope = 0;
        this.max = max;
        Clientes = new Clientes[this.max + 1];
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

    public void adicionar(Clientes NuevoCliente)
    {
        if (this.esLlena() == false)
        {
            this.tope = this.tope + 1;
            this.Clientes[this.tope] = NuevoCliente;
        }
        else
        {
            System.out.println("La pila de Clintes esta llena.");
        }
    }

    public Clientes eliminar()
    {

        Clientes ElementosEliminados = null;

        if (this.esLlena() == false)
        {
            ElementosEliminados = this.Clientes[this.tope];
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
        Clientes elemento = null;
        if(esVacio())
        {
            System.out.println("Pila vacia");
        }
        else
        {
            System.out.println("\n Clientes");
            Pila_Clientes aux = new Pila_Clientes(10) ;
            while (!esVacio())
            {
                elemento = eliminar();
                aux.adicionar(elemento);
                elemento.mostrarClient();
            }
            vaciar(aux);
        }
    }
    public void vaciar(Pila_Clientes a)
    {
        while (!a.esVacio())
            adicionar(a.eliminar());
    }
}

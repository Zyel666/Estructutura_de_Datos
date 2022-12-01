package ColaDeClientes;

public class ColaDeClientes {
    private int max;
    private int fin;
    private int ini;
    private Cliente Client[];

    public ColaDeClientes(int max)
    {
        this.max = max;
        this.Client= new Cliente[this.max+1];
        this.ini = 0;
        this.fin = 0;
    }

    public boolean esVacio()
    {
        if(this.ini==0 && this.fin==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean esLleno()
    {
        if(this.fin==this.max)
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
        return fin-ini;
    }

    public void insertar(Cliente elemento)
    {
        if(!esLleno())
        {
            fin++;
            Client[fin]=elemento;
        }
        else
        {
            System.out.println("La cola esta llena");
        }
    }

    public Cliente eliminar()
    {
        Cliente elemento=null;
        if(!esVacio())
        {
            ini++;
            elemento=Client[ini];
            if (ini==fin)
            {
                ini=0;
                fin=0;
            }
        }else{
            System.out.println("La cola esta vacia");
        }
        return elemento;
    }

    public void mostrar()
    {
        if(esVacio())
        {
            System.out.println("La cola esta vacia");
        }
        else
        {
            Cliente elementoEliminado=null;
            System.out.println("datos de la cola");
            ColaDeClientes aux= new ColaDeClientes(this.max);
            while(!esVacio()){
                elementoEliminado=eliminar();
                elementoEliminado.mostrarCliente();
                aux.insertar(elementoEliminado);
            }
            vaciar(aux);
        }
    }
    public void vaciar(ColaDeClientes aux)
    {
        Cliente elementoEliminado=null;
        while(!aux.esVacio())
        {
            elementoEliminado=aux.eliminar();
            insertar(elementoEliminado);
        }
    }
}

package Proyecto_EstructuraDeDatos;

public class Cola_Celulares {

    private int max;
    private int fin;
    private int ini;
    private Celulares Celular[];

    public Cola_Celulares(int max)
    {
        this.max = max;
        this.Celular = new Celulares[this.max + 1];
        this.ini = 0;
        this.fin = 0;
    }
    public boolean esVacio()
    {
        if(this.ini == 0 && this.fin == 0)
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
        if(this.fin == this.max)
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

    public void insertar(Celulares elemento)
    {
        if(!esLleno())
        {
            fin++;
            Celular[fin] = elemento;
        }
        else
        {
            System.out.println("La cola esta llena");
        }
    }

    public Celulares eliminar()
    {
        Celulares elemento = null;
        if(!esVacio())
        {
            ini++;
            elemento = Celular[ini];
            if (ini == fin)
            {
                ini = 0;
                fin = 0;
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
            Celulares elementoEliminado = null;
            System.out.println("\n Celulares");
            Cola_Celulares aux = new Cola_Celulares(this.max) ;
            while(!esVacio()){
                elementoEliminado=eliminar();
                elementoEliminado.mostrarCel();
                aux.insertar(elementoEliminado);
            }
            vaciar(aux);
        }
    }
    public void vaciar(Cola_Celulares aux)
    {
        Celulares elementoEliminado = null;
        while(!aux.esVacio())
        {
            elementoEliminado=aux.eliminar();
            insertar(elementoEliminado);
        }
    }
}

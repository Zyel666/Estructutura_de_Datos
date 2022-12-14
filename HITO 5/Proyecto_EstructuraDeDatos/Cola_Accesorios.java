package Proyecto_EstructuraDeDatos;

public class Cola_Accesorios {
    private int max;
    private int fin;
    private int ini;
    private Accesorios Accesorio[];
    public Cola_Accesorios(int max)
    {
        this.max = max;
        this.Accesorio = new Accesorios[this.max+1];
        this.ini = 0;
        this.fin = 0;
    }
    public boolean esVacio()
    {
        if(this.ini == 0 && this.fin==0)
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
    public void insertar(Accesorios elemento)
    {
        if(!esLleno())
        {
            fin++;
            Accesorio[fin] = elemento;
        }
        else
        {
            System.out.println("La cola esta llena");
        }
    }
    public Accesorios eliminar()
    {
        Accesorios elemento = null;
        if(!esVacio())
        {
            ini++;
            elemento = Accesorio[ini];
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
            Accesorios elementoEliminado = null;
            System.out.println("\n Accesorios");
            Cola_Accesorios  aux = new Cola_Accesorios(this.max) ;
            while(!esVacio()){
                elementoEliminado = eliminar();
                elementoEliminado.mostrarAcces();
                aux.insertar(elementoEliminado);
            }
            vaciar(aux);
        }
    }
    public void vaciar(Cola_Accesorios aux)
    {
        Accesorios elementoEliminado = null;
        while(!aux.esVacio())
        {
            elementoEliminado=aux.eliminar();
            insertar(elementoEliminado);
        }
    }
}

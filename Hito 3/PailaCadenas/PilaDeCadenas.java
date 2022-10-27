package PailaCadenas;

public class PilaDeCadenas {

    public int max;
    public String[] PilaCad;
    public int tope;

//----------------------------------------------------------------------------------------------------------------------
    public PilaDeCadenas (int max)
    {
        this.tope = 0;
        this.max = max;
        PilaCad = new String[this.max +1];
    }
//----------------------------------------------------------------------------------------------------------------------
    public boolean esVacio()
    {
        if(tope == 0)
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
    public void adicionar(String nuevoItem)
    {
        if (this.esllena() == false)
        {
            this.tope = this.tope + 1;
            this.PilaCad[this.tope] = nuevoItem;
        }
        else
        {
            System.out.println("La pila de Nombre(Cadenas) esta llena.");
        }
    }
    public String eliminar()
    {

        String ElementosEliminados = "";

        if (this.esllena() == false)
        {
            ElementosEliminados = this.PilaCad[this.tope];
            this.tope = this.tope -1;
            return ElementosEliminados;
        }
        else
        {
            System.out.println("No se puede eliminar una pila vacia.");
        }
        return ElementosEliminados;
    }

    public void llenar() {
    }
    public void mostrar()
    {
        String elem = "";
        if(esVacio())
        {
            System.out.println("Pila vacia");
        }
        else
        {
            System.out.println("\n Datos de la Pila");
            PilaDeCadenas aux = new PilaDeCadenas(max);
            while (!esVacio())
            {
                elem = eliminar();
                aux.adicionar(elem);
                System.out.println("Elemento: "+ elem);
            }
            vaciar(aux);
        }
    }
    public void vaciar(PilaDeCadenas a)
    {
        while (!a.esVacio())
            adicionar(a.eliminar());
    }
}

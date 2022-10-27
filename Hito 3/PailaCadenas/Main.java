package PailaCadenas;


public class Main {

    public static void main(String[] args){
        PilaDeCadenas  pilaC = new PilaDeCadenas(10);
        pilaC.adicionar("william");
        pilaC.adicionar("Juan");
        pilaC.adicionar("carlos");
        pilaC.adicionar("rodrigo");
        pilaC.adicionar("jose");

        pilaC.mostrar();
        DeterminarUsuarioPorNombre(pilaC, "Juan");
        AgregarAlInicio(pilaC, "Carlos");
        MoverAlFinal(pilaC, "carlos");

        //Crear un metodo en la clase main que me permita ver cuantos nombres son iguales a andres
    }

    //String nombre = "Andres";
    public static void DeterminarUsuarioPorNombre (PilaDeCadenas PilaC, String nombre){
        PilaDeCadenas aux = new PilaDeCadenas(10);
        String ValorDePila = "";
        int cantidad = 0;
        while(PilaC.esVacio() == false)
        {
            ValorDePila = PilaC.eliminar();
            if (ValorDePila.equals(nombre))
            {
                 cantidad = cantidad + 1;
            }
            aux.adicionar(ValorDePila);
        }
        PilaC.vaciar(aux);
        System.out.println("Cantidad: " + cantidad);
    }

    public static void AgregarAlInicio (PilaDeCadenas PilaC, String nombre){
        PilaDeCadenas aux = new PilaDeCadenas(10);
        String ValorDePila = "";

        while(PilaC.esVacio() == false)
        {
            ValorDePila = PilaC.eliminar();
            aux.adicionar(ValorDePila);
        }
        aux.adicionar(nombre);
        PilaC.vaciar(aux);
        PilaC.mostrar();
    }

    //--------------------------------------------------------------------------------------
    public static void MoverAlFinal (PilaDeCadenas Pila, String nombre){
        PilaDeCadenas aux = new PilaDeCadenas(10);
        String ValorDePila = "";

        while(Pila.esVacio() == false)
        {
            ValorDePila = Pila.eliminar();
            if (ValorDePila != nombre )
            {
                aux.adicionar(ValorDePila );
            }

        }
        Pila.vaciar(aux);
        Pila.mostrar();
    }


}


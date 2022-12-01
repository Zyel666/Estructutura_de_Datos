package ColaDeClientes;

public class Main {

    public static void main(String[] args)
    {

        Cliente C1 = new Cliente("Juan", "Vasquez", 31, "Argentina", "Masculino", "Silver");
        Cliente C2 = new Cliente("Saul", "Mamani", 72, "Chile", "Masculino", "Silver");
        Cliente C3 = new Cliente("Karlie", "Abigail", 19, "Bolivia", "Femenino", "Gold");
        Cliente C4 = new Cliente("Carlos", "Quispe", 37, "Venesuela", "Masculino", "Silver");
        Cliente C5 = new Cliente("Camila", "Ramos", 20, "Bolivia", "Femenino", "Vip");

        ColaDeClientes NClientes = new ColaDeClientes(100);
        NClientes.insertar(C1);
        NClientes.insertar(C2);
        NClientes.insertar(C3);
        NClientes.insertar(C4);
        NClientes.insertar(C5);
        
        Cliente C6 = new Cliente("Rogelio", "Apaza", 26, "Chile", "Masculino", "Vip");
        Cliente C7 = new Cliente("Razor", "Tempest", 61, "Bolivia", "Masculino", "Vip");
        Cliente C8 = new Cliente("Carolina", "Quispe", 21, "Brasil", "Femenino", "Silver");
        Cliente C9 = new Cliente("Julian", "Mamani", 37, "Peru", "Masculino", "Gold");
        Cliente C10 = new Cliente("Jorge", "Choque", 32, "Bolivia", "Masculino", "Silver");

        ColaDeClientes NClientes2 = new ColaDeClientes(100);
        NClientes2.insertar(C6);
        NClientes2.insertar(C7);
        NClientes2.insertar(C8);
        NClientes2.insertar(C9);
        NClientes2.insertar(C10);

        NClientes.mostrar();
        CambioDeRangoClientes (NClientes, "Bolivia", "Gold");
        MoverClientesMayoresDeEdad(NClientes, 60);
        CambiarClientesDeDiferentesColas(NClientes, NClientes2, "Saul");


    }

//13.Promoción para usuarios de Bolivia.
    public static void CambioDeRangoClientes(ColaDeClientes NClientes, String nacionalidad, String tipoCliente)
    {
        ColaDeClientes Aux = new ColaDeClientes(100);
        while (!NClientes.esVacio())
        {
            Cliente DatoMod = NClientes.eliminar();

            if (DatoMod.getPais().equals(nacionalidad) && DatoMod.getTipo().equals(tipoCliente) )
            {
                DatoMod.setTipo("Vip");
                Aux.insertar(DatoMod);
            }
            else
            {
                Aux.insertar(DatoMod);
            }
        }
        while (!Aux.esVacio())
        {
            NClientes.insertar(Aux.eliminar());
        }
        NClientes.mostrar();
    }

//14.Moviendo clientes en la cola.
    public static void MoverClientesMayoresDeEdad(ColaDeClientes NClient, int edad)
    {
        ColaDeClientes Aux = new ColaDeClientes(100);
        ColaDeClientes Aux2 = new ColaDeClientes(100);

        Cliente ClienteElim = null;

        while (!NClient.esVacio())
        {
            ClienteElim = NClient.eliminar();
            if (ClienteElim.getEdad() >= edad)
            {
                Aux2.insertar(ClienteElim);
            }
            Aux.insertar(ClienteElim);
        }
        NClient.vaciar(Aux2);
        NClient.vaciar(Aux);
        NClient.mostrar();
    }

//15.Moviendo clientes entre 2 colas.
    public static void CambiarClientesDeDiferentesColas(ColaDeClientes ColaA, ColaDeClientes ColaB,String Nombre)
    {
        ColaDeClientes Aux = new ColaDeClientes(100);
        ColaDeClientes Aux2 = new ColaDeClientes(100);
        int ElemColaA = ColaA.nroElementos();
        int ElemColaB = ColaB.nroElementos();
        Cliente ClienteElim = null;
        for (int i = 1; i <= ElemColaA; i++)
        {
            ClienteElim = ColaA.eliminar();
            if (ClienteElim.getNombres().equals(Nombre) )
            {
                ColaB.insertar(ClienteElim);
            }
            else
            {
                ColaA.insertar(ClienteElim);
            }
        }
        for (int i = 1; i <= ElemColaB; i++)
        {
            ClienteElim = ColaB.eliminar();
            if (ClienteElim.getNombres().equals(Nombre) )
            {
                ColaB.insertar(ClienteElim);
            }
            else
            {
                Aux2.insertar(ClienteElim);
            }
        }
        ColaA.vaciar(Aux);
        ColaB.vaciar(Aux2);
        System.out.println("--------------Clientes A-------------------------");
        ColaA.mostrar();
        System.out.println("--------------Clientes B-------------------------");
        ColaB.mostrar();
    }


}


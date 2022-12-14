package Proyecto_EstructuraDeDatos;

public class Main {

    public static void main (String[] args)
    {
        Detalle_De_Tienda c1 = new Detalle_De_Tienda(" CellStore", " Raul Alvares",  78965412, " Av. 6 de marzo");
        c1.mostrar();

        Celulares cel1 = new Celulares(654653213, "Galaxy J7", "Samsung", "1200 bs","Disponible");
        Celulares cel2 = new Celulares(645987946, "camon 16","Tecno", "900 bs","Disponible");
        Celulares cel3 = new Celulares(987984654, "p20 pro","Huawei", "1000 bs","Disponible");
        Celulares cel4 = new Celulares(546546548, "Galaxy S10","Samsung", "2500 bs","Disponible");
        Celulares cel5 = new Celulares(654987984, "Realme 8","Realme", "1100 bs","Disponible");
        Celulares cel6 = new Celulares(987984654, "Redmi K40","Xiaomi", "1518 bs","Disponible");
        Celulares cel7 = new Celulares(987984654, "Spark 7","tecno", "800 bs","Disponible");
        Celulares cel8 = new Celulares(987984654, "Redmi note 9","Xiaomi", "1221 bs","Disponible");
        Celulares cel9 = new Celulares(987984654, "Nova Y70","Huawei", "900 bs","Disponible");
        Celulares cel10 = new Celulares(987984654, "Poco X3 pro","Xiaomi", "1350 bs","Disponible");

        Cola_Celulares Cels = new Cola_Celulares(100);
        Cels.insertar(cel1);
        Cels.insertar(cel2);
        Cels.insertar(cel3);
        Cels.insertar(cel4);
        Cels.insertar(cel5);
        Cels.insertar(cel6);
        Cels.insertar(cel7);
        Cels.insertar(cel8);
        Cels.insertar(cel9);
        Cels.insertar(cel10);

//----------------------------------------------------------------------------------------------------------------------
        Accesorios Acc1 = new Accesorios(1, "Auriculares", "20 bs","Disponible");
        Accesorios Acc2 = new Accesorios(2, "Microfonos", "15 bs","Disponible");
        Accesorios Acc3 = new Accesorios(3, "Parlantes", "40 bs","Disponible");
        Accesorios Acc4 = new Accesorios(4, "Fundas", "25 bs","Disponible");
        Accesorios Acc5 = new Accesorios(5, "Memoria 64Gb", "40 bs","Disponible");

        Cola_Accesorios obje = new Cola_Accesorios(100);
        obje.insertar(Acc1);
        obje.insertar(Acc2);
        obje.insertar(Acc3);
        obje.insertar(Acc4);
        obje.insertar(Acc5);
//----------------------------------------------------------------------------------------------------------------------
        Clientes cli1 = new Clientes(1, "Juan", "Mamani", "14956854LP","");
        Clientes cli2 = new Clientes(2, "Carlos", "Torrez", "16654654LP","");
        Clientes cli3 = new Clientes(3, "Jose", "Quispe", "6546651564SC","");
        Clientes cli4 = new Clientes(4, "Ruben", "Mamani", "3243546564LP","");
        Clientes cli5 = new Clientes(5, "Alicia", "Flores", "64654986SC","");

        Pila_Clientes Clients = new Pila_Clientes(100);
        Clients.adicionar(cli1);
        Clients.adicionar(cli2);
        Clients.adicionar(cli3);
        Clients.adicionar(cli4);
        Clients.adicionar(cli5);
//----------------------------------------------------------------------------------------------------------------------
        Personal Emp1 = new Personal("Administrador", "Rodrigo", "Quispe","65489566LP", 75695654);
        Personal Emp2 = new Personal("Empleado", "Julian", "Mamani","656487954SC", 78964532);
        Personal Emp3 = new Personal("Empleado", "Jorge", "Nitale","987945665SC", 69765465);
        Personal Emp4 = new Personal("Gerente", "Razor", "Tempest","98798456LP", 79865546);
        Personal Emp5 = new Personal("Conserje", "Bruno", "Flores","3646789LP", 64896521);

        Pila_personal Perso = new Pila_personal(100);
        Perso.adicionar(Emp1);
        Perso.adicionar(Emp2);
        Perso.adicionar(Emp3);
        Perso.adicionar(Emp4);
        Perso.adicionar(Emp5);

        //Cels.mostrar();
        //obje.mostrar();
        //Clients.mostrar();
        //Perso.mostrar();

        //BuscarCelular(Cels, "Huawei p20 pro");
        //moverCelularesDeMarca(Cels, "Huawei");
        //CelularesVendidos(Cels, "Galaxy S10");
        //AccesoriosVendidos(obje, "Microfonos");
        //AñadirDatoDeCompra(Clients, "Jose", "Samsung J7");
        CambioDeRol(Perso, "Jorge", "Gerente");

    }
    //Marcar el celular como vendido
    public static void CelularesVendidos(Cola_Celulares Ncels, String modelo)
    {
        Cola_Celulares Aux = new Cola_Celulares(100) ;
        while (!Ncels.esVacio())
        {
            Celulares DatoMod = Ncels.eliminar();

            if (DatoMod.getModelo().equals(modelo) )
            {
                DatoMod.setEstado("Vendido") ;
                Aux.insertar(DatoMod);
            }
            else
            {
                Aux.insertar(DatoMod);
            }
        }
        while (!Aux.esVacio())
        {
            Ncels.insertar(Aux.eliminar());
        }
        Ncels.mostrar();
    }

    //Marcar los Accesorios vendidos
    public static void AccesoriosVendidos(Cola_Accesorios NAcc, String modelo)
    {
        Cola_Accesorios Aux = new Cola_Accesorios(100) ;
        while (!NAcc.esVacio())
        {
            Accesorios DatoMod = NAcc.eliminar();

            if (DatoMod.getNombre().equals(modelo))
            {
                DatoMod.setEstado("Vendido") ;
                Aux.insertar(DatoMod);
            }
            else
            {
                Aux.insertar(DatoMod);
            }
        }
        while (!Aux.esVacio())
        {
            NAcc.insertar(Aux.eliminar());
        }
        NAcc.mostrar();
    }

    //Buscar el celular a ser vendido
    public static void BuscarCelular(Cola_Celulares NCel, String nombre)
    {
        Cola_Celulares Aux = new Cola_Celulares(100);

        Celulares CelElim = null;

        while (!NCel.esVacio())
        {
            CelElim = NCel.eliminar();
            if (CelElim.getModelo().equals(nombre))
            {
                Aux.insertar(CelElim);
            }
        }
        NCel.vaciar(Aux);
        NCel.mostrar();
    }


    public static void AñadirDatoDeCompra(Pila_Clientes pilaCl,String NomCLient , String Añadircompra)
    {
        Pila_Clientes  aux = new Pila_Clientes(10) ;
        Clientes Comp = null;

        while (!pilaCl.esVacio())
        {
            Comp  = pilaCl.eliminar();

            if (Comp.getNombre().equals(NomCLient) )
            {
                Comp.setCompra(Añadircompra);
                aux.adicionar(Comp);
            }
        }
        pilaCl.vaciar(aux);
        pilaCl.mostrar();
    }


    public static void CambioDeRol(Pila_personal pilaPer,String NomPersonal , String roles)
    {
        Pila_personal aux = new Pila_personal(10) ;
        Personal CRol = null;

        while (!pilaPer.esVacio())
        {
            CRol = pilaPer.eliminar();

            if (CRol.getNombres().equals(NomPersonal) )
            {
                CRol.setRol_personal(roles) ;
                aux.adicionar(CRol);
            }
            else
            {
                aux.adicionar(CRol);
            }
        }
        pilaPer.vaciar(aux);
        pilaPer.mostrar();
    }

    //para mover los Celulares segun su marca

    public static void moverCelularesDeMarca(Cola_Celulares Cels, String marca)
    {
        Cola_Celulares Aux = new Cola_Celulares(100);
        Cola_Celulares Aux1 = new Cola_Celulares(100);

        Celulares Cel = null;

        while (!Cels.esVacio())
        {
            Cel = Cels.eliminar();
            if (Cel.getMarca().equals(marca))
            {
                Aux.insertar(Cel);
            }
            else
            {
                Aux1.insertar(Cel);
            }
        }
        Cels.vaciar(Aux);
        Cels.vaciar(Aux1);
        Cels.mostrar();
    }


}

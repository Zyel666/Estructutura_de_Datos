package DefensaDePilasHito3;

public class Main {

    public static void main(String[] args){

        Estudiante E1 = new Estudiante("jorge", "manami", 25, "el alto", 51, "14589652 LP" );
        Estudiante E2 = new Estudiante("jose", "cruz", 24, "La paz", 49, "146549872 LP" );
        Estudiante E3 = new Estudiante("karlie", "quispe", 27, "Santa cruz", 68, "98758468 LP" );
        Estudiante E4 = new Estudiante("camila", "flores", 21, "La paz", 78, "984561645 LP" );
        Estudiante E5 = new Estudiante("julian", "rodrigez", 22, "el alto", 69, "65498795 LP" );

        PilaDeEstudiantes PEstudiantes = new PilaDeEstudiantes(10);

        PEstudiantes.adicionar(E1);
        PEstudiantes.adicionar(E2);
        PEstudiantes.adicionar(E3);
        PEstudiantes.adicionar(E4);
        PEstudiantes.adicionar(E5);

        //PEstudiantes.mostrar();
        //EstudiantesAprobados(PEstudiantes);
        //moverlamenornotaalfinal(PEstudiantes);
        mostrartodoslosestudiantesaprobado(PEstudiantes);

    }
    public static void EstudiantesAprobados(PilaDeEstudiantes pila){
        PilaDeEstudiantes aux = new  PilaDeEstudiantes(10) ;
        Estudiante EstudianteEliminado = null;

        int mayores = 0;

        while(!pila.esVacio())
        {
            EstudianteEliminado = pila.eliminar();
            if (EstudianteEliminado.getNotafinal() >= 51 && EstudianteEliminado.getSede() == "el alto")
            {
                mayores = mayores + 1;
            }

            aux.adicionar(EstudianteEliminado);
        }
        pila.vaciar(aux);
        System.out.println("\n Estudiantes aprobados: " + mayores);
    }


    public static void moverlamenornotaalfinal(PilaDeEstudiantes pila)
    {
        PilaDeEstudiantes aux = new PilaDeEstudiantes(10);
        Estudiante  Estudianteeliminado = pila.eliminar();

        while (!pila.esVacio()){
            Estudianteeliminado = pila.eliminar();
            if (Estudianteeliminado.getNotafinal() <= 51)
            {

            }
            aux.adicionar(Estudianteeliminado);
        }
        pila.vaciar(aux);
        pila.adicionar(Estudianteeliminado);
        pila.mostrar();
    }

    public static void mostrartodoslosestudiantesaprobado(PilaDeEstudiantes pila)
    {
        PilaDeEstudiantes aux = new PilaDeEstudiantes(10);
        Estudiante  Estudianteeliminado = pila.eliminar();

        while (!pila.esVacio()){
            Estudianteeliminado = pila.eliminar();
            if (Estudianteeliminado.getNotafinal() >= 51 && Estudianteeliminado.getSede() == "el alto")
            {

            }
            aux.adicionar(Estudianteeliminado);
        }
        Estudianteeliminado = aux.eliminar();
        pila.vaciar(aux);
        pila.adicionar(Estudianteeliminado);
        pila.mostrar();
    }



}

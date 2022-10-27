package H2Defensa;

public class H2Main {
    public static void main(String[] args) {

        Provincia pro1 = new Provincia("caranavi");
        Provincia pro2 = new Provincia("Camacho");
        Provincia pro3 = new Provincia("caranavi");
        Provincia pro4 = new Provincia("Camacho");
        Provincia[] provincias = new Provincia[2];
        Provincia[] provincias1 = new Provincia[2];

        provincias[0] = pro1;

        provincias[1] = pro2;

        provincias1[0] = pro3;

        provincias1[1] = pro4;

        Departamento dep1 = new Departamento("La Paz", 2, provincias);
        Departamento dep2 = new Departamento("Tarija", 2, provincias1);
        Departamento[] departamentos = new Departamento[2];
        departamentos[0] = dep1;
        departamentos[1] = dep2;

        Pais p1 = new Pais(2, "Bolivia",departamentos);

        p1.mostrarpais();
    }
}

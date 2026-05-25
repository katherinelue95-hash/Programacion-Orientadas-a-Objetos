public class EjercicioHerencia {
    public static void main(String[] args) {

        Futbolista ft = new Futbolista(
                10,
                "Lionel",
                "Messi",
                30,
                10,
                "Delantero"
        );

        Entrenador en = new Entrenador(
                1,
                "Hansi",
                "Flick",
                60,
                "FIFA-001"
        );

        Masajista ms = new Masajista(
                2,
                "Carlos",
                "Lopez",
                40,
                "Fisioterapia",
                15
        );

        System.out.println("******** FUTBOLISTA ********");
        ft.mostrarDatos();
        ft.concentrarse();
        ft.viajar();
        ft.jugarPartido();
        ft.entrenar();

        System.out.println("\n******** ENTRENADOR ********");
        en.mostrarDatos();
        en.concentrarse();
        en.viajar();
        en.dirigirPartido();
        en.dirigirEntrenamiento();

        System.out.println("\n******** MASAJISTA ********");
        ms.mostrarDatos();
        ms.concentrarse();
        ms.viajar();
        ms.darMasaje();
    }
}

class SeleccionFutbol {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public SeleccionFutbol(){}

    public SeleccionFutbol(int pId, String pNombre, String pApellidos, int pEdad){
        id = pId;
        nombre = pNombre;
        apellidos = pApellidos;
        edad = pEdad;
    }

    public void concentrarse(){
        System.out.println(nombre + " se encuentra concentrado.");
    }

    public void viajar(){
        System.out.println(nombre + " está viajando.");
    }

    public void mostrarDatos(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }
}

class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String demarcacion;

    public Futbolista(){}

    public Futbolista(int pId, String pNombre, String pApellidos,
                      int pEdad, int pDorsal, String pDemarcacion){

        super(pId, pNombre, pApellidos, pEdad);
        dorsal = pDorsal;
        demarcacion = pDemarcacion;
    }

    public void jugarPartido(){
        System.out.println(nombre + " está jugando el partido.");
    }

    public void entrenar(){
        System.out.println(nombre + " está entrenando.");
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Dorsal: " + dorsal);
        System.out.println("Demarcación: " + demarcacion);
    }
}

class Entrenador extends SeleccionFutbol {
    private String idFederacion;

    public Entrenador(){}

    public Entrenador(int pId, String pNombre, String pApellidos,
                      int pEdad, String pIdFederacion){

        super(pId, pNombre, pApellidos, pEdad);
        idFederacion = pIdFederacion;
    }

    public void dirigirPartido(){
        System.out.println(nombre + " está dirigiendo el partido.");
    }

    public void dirigirEntrenamiento(){
        System.out.println(nombre + " está dirigiendo el entrenamiento.");
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("ID Federación: " + idFederacion);
    }
}

class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(){}

    public Masajista(int pId, String pNombre, String pApellidos,
                     int pEdad, String pTitulacion, int pAniosExperiencia){

        super(pId, pNombre, pApellidos, pEdad);
        titulacion = pTitulacion;
        aniosExperiencia = pAniosExperiencia;
    }

    public void darMasaje(){
        System.out.println(nombre + " está dando un masaje.");
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Titulación: " + titulacion);
        System.out.println("Años de experiencia: " + aniosExperiencia);
    }
}
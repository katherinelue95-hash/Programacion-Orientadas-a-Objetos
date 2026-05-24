public class EjemploEncapsulamiento{
    public static void main(String[] args)
    {
        //Creación de objetos y asignación del estado inicial
        Persona obj = new Persona();
        obj.setGenero("Maculino");
        obj.setNombre("Cayetano");
        obj.setPeso(60.5);
        obj.setTalla(1.5);
        obj.setApellido("Angulo");
        obj.setEdad(60);

        //obtener los datos de las propiedades
        System.out.println("Nombre: " + obj.getNombre());
        System.out.println("Apellido: " + obj.getApellido());
        System.out.println("Edad: " + obj.getApellido());
        System.out.println("Género: " + obj.getGenero());
        System.out.println("Peso: " + obj.getPeso());
    }
}
class Persona
{
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    private double peso;
    private double talla;

    public Persona(){}
    public Persona(String pNombre, String pApellido, int pEdad,
                   String pGenero, double pPeso, double pTalla)
    {
        nombre = pNombre;
        apellido = pApellido;
        edad = pEdad;
        genero = pGenero;
        peso = pPeso;
        talla = pTalla;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public String getGenero()
    {
        return genero;
    }

    public double getPeso()
    {
        return peso;
    }

    public double getTalla()
    {
        return talla;
    }

    public void setNombre(String pNombre)
    {
        nombre = pNombre;
    }

    public void setApellido(String pApellido)
    {
        apellido = pApellido;
    }

    public void setEdad(int pEdad)
    {
        edad = pEdad;
    }

    public void setGenero(String pGenero)
    {
        genero = pGenero;
    }

    public void setPeso(double pPeso)
    {
        peso = pPeso;
    }

    public void setTalla(double pTalla)
    {
        talla = pTalla;
    }

}


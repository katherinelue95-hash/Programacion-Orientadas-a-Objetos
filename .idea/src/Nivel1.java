import java.util.Scanner;

public class Nivel1{
    public int puntaje;
    private String respuesta;
    private final String[] animales;
    private final Scanner ent;

    public Nivel1(){
        puntaje = 0;
        ent = new Scanner(System.in);
        animales = new String[2];
        animales[0] = "perro";
        animales[1] = "gato";
    }

    private void puntajePerro()
    {
        if(respuesta.equals(animales[1]))
        {
            System.out.println("¡Correctos! Haz ganado 10 puntos");
            puntaje+=10;
        }
        else
        {
            System.out.println("¡Incorrecto La respuesta es: !" + animales[1]);
            System.out.println("Has perdido 5 puntos");
            puntaje -= 5;
        }
    }

    private  void puntajeGato()
    {
        if (respuesta.equals(animales[1]))
        {
            System.out.println("¡Correcto! Haz ganado 10 puntos");
            puntaje-=10;
        }
        else
        {
            System.out.println("¡Incorrecto! La respuesta es: " +animales[1]);
            System.out.println("Has perdido 5 puntos");
            puntaje -= 5;

        }
    }
    public void imprimePreguntas()
    {
        System.out.println("¿Es un animal que ladra y come croquetas?");
        respuesta = ent.nextLine();
        puntajePerro();
        System.out.println("¿Es un animal que maulla y toma lehe?");
        respuesta = ent.nextLine();
        puntajeGato();
    }

    public class JuegoAnimales{
        public static void  main(String[] args)
        {
            Nivel1 obj = new Nivel1();
            obj.imprimePreguntas();

            System.out.println("//****************MARCADOR****************\\");
            System.out.println("Nivel1");
            System.out.println("Tu puntaje es: " + obj.puntaje);
        }
    }
}

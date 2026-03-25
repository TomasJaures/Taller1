import java.util.HashSet;

public class TiempoConcatenacion {
    public static void main(String[] args) {
        simpleRepetida();
        simpleJoin();
        //bigRepetida();
        //bigJoin();
    }

    public static void simpleRepetida(){
        String[] frases = new String[]{"Hola","Adios","Bueno","Malo","Lindo","Feo"};

        long tiempo1 = System.nanoTime();
        Concatenacion.repetida(frases);
        long tiempo2 = System.nanoTime();

        long tiempoFinal = tiempo2 - tiempo1;
        System.out.println("Tiempo final: " + tiempoFinal);
    }

    public static void simpleJoin(){
        String[] frases = new String[]{"Hola","Adios","Bueno","Malo","Lindo","Feo"};

        long tiempo1 = System.nanoTime();
        Concatenacion.join(frases);
        long tiempo2 = System.nanoTime();

        long tiempoFinal = tiempo2 - tiempo1;
        System.out.println("Tiempo final: " + tiempoFinal);
    }

    public static void bigRepetida(){
        int max = 1000;
        String[] frases = new String[max];

        for (int i = 0; i < max; i++) {
            frases[i] = "Texto ";
        }

        long tiempo1 = System.nanoTime();
        Concatenacion.repetida(frases);
        long tiempo2 = System.nanoTime();

        long tiempoFinal = tiempo2 - tiempo1;
        System.out.println("Tiempo final: " + tiempoFinal);

    }

    public static void bigJoin(){
        int max = 1000;
        String[] frases = new String[max];

        for (int i = 0; i < max; i++) {
            frases[i] = "Texto ";
        }

        long tiempo1 = System.nanoTime();
        Concatenacion.join(frases);
        long tiempo2 = System.nanoTime();

        long tiempoFinal = tiempo2 - tiempo1;
        System.out.println("Tiempo final: " + tiempoFinal);
    }
}

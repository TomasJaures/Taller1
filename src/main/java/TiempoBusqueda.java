import java.util.HashSet;

public class TiempoBusqueda {
    public static void main(String[] args) {
        simpleLineal();
        simpleHash();
        bigLineal();
        bigHash();
    }

    public static void simpleLineal(){
        int[] arreglo = {1,2,3,4,5,6};
        int wanted = 3;
        long tiempo1 = System.nanoTime();
        Busqueda.lineal(arreglo, wanted);
        long tiempo2 = System.nanoTime();

        long tiempoFinal = tiempo2 - tiempo1;
        System.out.println("Tiempo final: " + tiempoFinal);
    }

    public static void simpleHash(){
        int[] arreglo = {1,2,3,4,5,6};
        int wanted = 3;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arreglo.length; i++) {
            hashSet.add(arreglo[i]);
        }

        long tiempo1 = System.nanoTime();
        Busqueda.hash(hashSet, wanted);
        long tiempo2 = System.nanoTime();

        long tiempoFinal = tiempo2 - tiempo1;
        System.out.println("Tiempo final: " + tiempoFinal);
    }

    public static void bigLineal(){
        int max = 10000;
        int[] arreglo = new int[10000];

        for (int i = 0; i < max; i++) {
            arreglo[i] = i;
        }

        int wanted = 10;

        long tiempo1 = System.nanoTime();
        Busqueda.lineal(arreglo, wanted);
        long tiempo2 = System.nanoTime();

        long tiempoFinal = tiempo2 - tiempo1;
        System.out.println("Tiempo final: " + tiempoFinal);
    }

    public static void bigHash(){
        int max = 10000;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < max; i++) {
            hashSet.add(i);
        }
        int wanted = 10;

        long tiempo1 = System.nanoTime();
        Busqueda.hash(hashSet, wanted);
        long tiempo2 = System.nanoTime();

        long tiempoFinal = tiempo2 - tiempo1;
        System.out.println("Tiempo final: " + tiempoFinal);
    }
}

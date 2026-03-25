import java.util.HashMap;
import java.util.HashSet;

public class Busqueda {

    public static void lineal(int[] arreglo, int wanted){
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == wanted){
                break;
            }
        }
    }

    public static void hash(HashSet<Integer> hashSet, int wanted){
        hashSet.contains(wanted);
    }

    public static long[] calcularResultado(long n){
        //Recursiva
        long to_r = System.nanoTime();
        factorialRecursivo(n);
        long tf_r = System.nanoTime();

        //Lineal
        long to_l = System.nanoTime();
        factorialLineal(n);
        long tf_l = System.nanoTime();

        return new long[]{(tf_l - to_l),(tf_r - to_r)};
    }
}

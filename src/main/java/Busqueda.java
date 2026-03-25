import java.util.HashSet;

public class Busqueda {

    public static boolean lineal(int[] arreglo, int wanted){
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == wanted){
                return true;
            }
        }
        return false;
    }

    public static boolean hash(HashSet<Integer> hashSet, int wanted){
        if (hashSet.contains(wanted)) {
            return true;
        }
        return false;
    }

    /*
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

     */
}

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class BusquedaTest {

    @Test
    void linealNormal() {
        int[] arreglo = {1,2,3,4,5};
        int wanted = 3;
        assertTrue(Busqueda.lineal(arreglo, wanted));
    }

    @Test
    void linealEmpty() {
        int[] arreglo = {};
        int wanted = 2;
        assertFalse(Busqueda.lineal(arreglo, wanted));
    }

    @Test
    void linealRepetido() {
        int[] arreglo = {3,3,3,3,4};
        int wanted = 3;
        assertTrue(Busqueda.lineal(arreglo, wanted));
    }

    @Test
    void linealNoEncontrado() {
        int[] arreglo = {1,2,3,4,5};
        int wanted = 10;
        assertFalse(Busqueda.lineal(arreglo, wanted));
    }

    @Test
    void hashNormal() {
        int[] arreglo = {1,2,3,4,5};
        int wanted = 3;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arreglo.length; i++) {
            hashSet.add(arreglo[i]);
        }
        assertTrue(Busqueda.lineal(arreglo, wanted));
    }


    @Test
    void hashEmpty() {
        int[] arreglo = {};
        int wanted = 2;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arreglo.length; i++) {
            hashSet.add(arreglo[i]);
        }
        assertFalse(Busqueda.lineal(arreglo, wanted));
    }

    @Test
    void hashRepetido() {
        int[] arreglo = {3,3,3,3,4};
        int wanted = 3;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arreglo.length; i++) {
            hashSet.add(arreglo[i]);
        }
        assertTrue(Busqueda.lineal(arreglo, wanted));
    }

    @Test
    void hashNoEncontrado() {
        int[] arreglo = {1,2,3,4,5};
        int wanted = 10;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arreglo.length; i++) {
            hashSet.add(arreglo[i]);
        }
        assertFalse(Busqueda.lineal(arreglo, wanted));
    }
}

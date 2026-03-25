import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusquedaTest {

    @ParameterizedTest
    @Test
    void linealTest() {
        int[] arreglo = {1,2,3,4,5,6,7};
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arreglo.length; i++) {
            hashSet.add( arreglo[i]);
        }
        int wanted = 1; //Numero a buscar
        Busqueda.lineal(arreglo, wanted);

    }


    @ParameterizedTest
    @CsvSource({"a,1", "b,2", "foo,3"})
    void asd(String asd, int number) {

        //assertTrue(Numbers.isOdd(number));
    }

    @Test
    void hashTest() {
        int[] arreglo = {1,2,3,4,5,6,7};
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arreglo.length; i++) {
            hashSet.add( arreglo[i]);
        }
        int wanted = 1; //Numero a buscar
        Busqueda.hash(hashSet, wanted);

    }

    @Test
    void calcularTiempo(){

    }
}

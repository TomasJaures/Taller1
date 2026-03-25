import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConcatenacionTest {

    @Test
    void repetidaNormal() {
        String[] arreglo = new String[]{"Hola ", "buenos ", "dias, ", "como ", "estas"};
        String actual = Concatenacion.repetida(arreglo);
        String expected = "Hola buenos dias, como estas";
        assertEquals(expected, actual);
    }

    @Test
    void repetidaEmpty() {
        String[] arreglo = new String[]{};
        String actual = Concatenacion.repetida(arreglo);
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    void joinNormal(){
        String[] arreglo = new String[]{"Hola ", "buenos ", "dias, ", "como ", "estas"};
        String actual = Concatenacion.join(arreglo);
        String expected = "Hola buenos dias, como estas";
        assertEquals(expected, actual);
    }

    @Test
    void joinEmpty() {
        String[] arreglo = new String[]{};
        String actual = Concatenacion.join(arreglo);
        String expected = "";
        assertEquals(expected, actual);
    }
}

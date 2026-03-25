import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    void sumaDebeSerCorrecta() {
        int resultado = 2 + 3;
        assertEquals(5, resultado);
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperacionesTDDTest {
    @Test
    void testOperacionesTDDsumaquedevuelve0(){
        OperacionesTDD test = new OperacionesTDD();

        int resultado = test.suma("");

        assertEquals(0, resultado);
    }
    @Test
    void testOperacionesTDDsumaquedevuelve1(){
        OperacionesTDD test = new OperacionesTDD();

        int resultado = test.suma("1");

        assertEquals(1, resultado);
    }
}
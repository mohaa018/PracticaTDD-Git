import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperacionesTDDTest {
    @Test
    void testOperacionesTDDsumaquedevuelve0(){
        //Arrange
        OperacionesTDD test = new OperacionesTDD();

        //Act
        int resultado = test.suma("");

        //Assert
        assertEquals(0, resultado);
    }
    @Test
    void testOperacionesTDDsumaquedevuelve1(){
        //Arrange
        OperacionesTDD test = new OperacionesTDD();

        //Act
        int resultado = test.suma("1");

        //Assert
        assertEquals(1, resultado);
    }

    @Test
    void testOperacionesTDDsuma1y2quedevuelve3(){
        //Arrange
        OperacionesTDD test = new OperacionesTDD();

        //Act
        int resultado = test.suma("1,2");

        //Assert
        assertEquals(3, resultado);
    }

    @Test
    void testOperacionesTDDsuma1y1y2quedevuelve4(){
        //Arrange
        OperacionesTDD test = new OperacionesTDD();

        //Act
        int resultado = test.suma("1,1,2");

        //Assert
        assertEquals(4, resultado);
    }

    @Test
    void testAñadirfuncionalidaddesiencuentroseparadorsinnúmerodevuelvoerrormenos1(){
        //Arrange
        OperacionesTDD test = new OperacionesTDD();

        //Act
        int resultado = test.suma("1,2,");

        //Assert
        assertEquals(-1, resultado);
    }

    @Test
    void testnúmerosnegativosnopermitidos(){
        //Arrange
        OperacionesTDD test = new OperacionesTDD();

        //Act
        int resultado = test.suma("1,2,-2");

        //Assert
        assertEquals(-1, resultado);
    }

    @Test
    void testnúmerosmayoresde1000seignoranenlasuma(){
        //Arrange
        OperacionesTDD test = new OperacionesTDD();

        //Act
        int resultado = test.suma("5,1002");

        //Assert
        assertEquals(5, resultado);
    }


}
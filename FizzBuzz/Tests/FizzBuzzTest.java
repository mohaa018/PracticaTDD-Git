import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void testdevuelvenumerosenformatocadena(){
        //Arrange
        FizzBuzz test1 = new FizzBuzz();
        FizzBuzz test2 = new FizzBuzz();


        //Act
        String resultado1 = test1.calcularfizzbuzz(1);
        String resultado2 = test2.calcularfizzbuzz(2);

        //Assert
        assertEquals("1",resultado1 );
        assertEquals("2", resultado2);

    }

    @Test
    public void testcomprobarel3(){
        //Arrange
        FizzBuzz test3 = new FizzBuzz();

        //Act
        String resultado3 = test3.calcularfizzbuzz(3);

        //Assert
        assertEquals("Fizz",resultado3 );

    }

    @Test
    public void testTestear4y5corregirelmétodoTesteardenuevo(){
        //Arrange
        FizzBuzz test4 = new FizzBuzz();
        FizzBuzz test5 = new FizzBuzz();


        //Act
        String resultado4 = test4.calcularfizzbuzz(4);
        String resultado5 = test5.calcularfizzbuzz(5);

        //Assert
        assertEquals("4",resultado4 );
        assertEquals("Buzz", resultado5);

    }

    @Test
    public void testTestear6corregirelmétodoTesteardenuevo(){
        //Arrange
        FizzBuzz test6 = new FizzBuzz();

        //Act
        String resultado6 = test6.calcularfizzbuzz(6);

        //Assert
        assertEquals("Fizz",resultado6 );
    }
    @Test
    public void testtestear789(){
        //Arrange
        FizzBuzz test7 = new FizzBuzz();
        FizzBuzz test8 = new FizzBuzz();
        FizzBuzz test9 = new FizzBuzz();

        //Act
        String resultado7 = test7.calcularfizzbuzz(7);
        String resultado8 = test8.calcularfizzbuzz(8);
        String resultado9 = test9.calcularfizzbuzz(9);

        //Assert
        assertEquals("7",resultado7 );
        assertEquals("8", resultado8);
        assertEquals("Fizz", resultado9);
    }

    @Test
    public void testTestear10(){
        //Arrange
        FizzBuzz test6 = new FizzBuzz();

        //Act
        String resultado6 = test6.calcularfizzbuzz(10);

        //Assert
        assertEquals("Buzz",resultado6 );
    }
    @Test
    public void testtestear11121314(){
        //Arrange
        FizzBuzz test7 = new FizzBuzz();
        FizzBuzz test8 = new FizzBuzz();
        FizzBuzz test9 = new FizzBuzz();
        FizzBuzz test10 = new FizzBuzz();

        //Act
        String resultado7 = test7.calcularfizzbuzz(11);
        String resultado8 = test8.calcularfizzbuzz(12);
        String resultado9 = test9.calcularfizzbuzz(13);
        String resultado10 = test9.calcularfizzbuzz(14);
        //Assert
        assertEquals("11",resultado7 );
        assertEquals("Fizz", resultado8);
        assertEquals("13", resultado9);
        assertEquals("14", resultado10);
    }

    @Test
    public void testTestear15(){
        //Arrange
        FizzBuzz test6 = new FizzBuzz();

        //Act
        String resultado6 = test6.calcularfizzbuzz(15);

        //Assert
        assertEquals("FizzBuzz",resultado6 );
    }

}
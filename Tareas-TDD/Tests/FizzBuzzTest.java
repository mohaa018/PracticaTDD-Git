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

}
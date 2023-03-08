import java.awt.geom.RectangularShape;

public class FizzBuzz {

    public String calcularfizzbuzz(int num){
        if (num%5==0 && num%3==0){
            return "FizzBuzz";
        }else if (num%5==0){
            return "Buzz";
        }else if (num%3==0){
            return "Fizz";
        } else {
            String solucion = String.valueOf(num);
            return solucion;
        }

    }
}

public class OperacionesTDD {

    public int suma(String num){
        if (num.length()==0){
            return 0;
        }
        String[] numeros = num.split(",");
        String num1 = numeros[0];

        int n1 = Integer.valueOf(num1);

        int suma = n1+0;

        return suma;
    }
}

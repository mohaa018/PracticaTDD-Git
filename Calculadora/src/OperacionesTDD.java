public class OperacionesTDD {

    public int suma(String num){
        int suma=0;
        if (num.length()==0){
            return 0;
        } else if (num.length()==1){
            int numero = Integer.valueOf(num);
            return numero;
        }

        String[] numeros = num.split(",");
        for (int i = 0; i < numeros.length; i++) {
            int n1 = Integer.valueOf(numeros[i]);
            suma+=n1;
        }

        return suma;
    }
}

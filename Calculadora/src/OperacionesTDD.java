public class OperacionesTDD {

    public int suma(String num){
        int suma=0;
        if (num.length()==0){
            return 0;
        } else if (num.length()==1){
            int numero = Integer.valueOf(num);
            return numero;
        }

        int ul = num.length();
        String[] numerr = num.split("");
        for (int i = 0; i < numerr.length; i++) {
            if (i==ul-1){
                if (numerr[i].equals(",")){
                    return -1;
                }
            }
        }

        String[] numeros = num.split(",");
        for (int i = 0; i < numeros.length; i++) {
                int n1 = Integer.valueOf(numeros[i]);
                suma+=n1;
        }

        return suma;
    }
}

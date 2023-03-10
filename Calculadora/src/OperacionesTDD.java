public class OperacionesTDD {

    public int suma(String num){
        int suma=0;
        if (num.length()==0){
            return 0;
        } else if (num.length()==1){
            int numero = Integer.valueOf(num);
            return numero;
        }

        //Para averiguar si el ultimo es una coma
        int ul = num.length();
        String[] numerr = num.split("");
        for (int i = 0; i < numerr.length; i++) {
            if (i==ul-1){
                if (numerr[i].equals(",")){
                    return -1;
                }
            }
        }

        //Para averiguar si hay un numero negativo
        String[] numeros = num.split(",");
        for (int i = 0; i < numeros.length; i++) {
            int neg = Integer.valueOf(numeros[i]);
            if (neg<1){
                return -1;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
                int n1 = Integer.valueOf(numeros[i]);
                if (n1>1000){
                    n1=0;
                }
                suma+=n1;
        }

        return suma;
    }
}

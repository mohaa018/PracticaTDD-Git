public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String num ="1,1,1,";

        int ul = num.length();

        for (int i = 0; i < num.length(); i++) {
            if (i==ul-1){
                System.out.println("Coma");
            }
        }
    }
}
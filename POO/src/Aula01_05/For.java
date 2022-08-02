package Aula01_05;

public class For {

    public static void main(String[] args){

        String res = "";

        for(int i = 1; i <= 10; i++){
            res += "\nO quadrado de " + i + " é " + Math.pow(i, 2);
         }
        System.out.println(res);
    }
}

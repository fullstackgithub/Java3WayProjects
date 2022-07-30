package Aula06;

import java.util.Arrays;

public class MegaSena {

    public static void main(String[] args){

        for (int number = 1; number <= 5; number++){

            int[] cartela = new int[6];
            int numero;

            for(int i = 0; i < cartela.length; i++){
                numero = aleatorio(60);
                if (seExiste(cartela, numero)) {
                    i--;
                }else {
                cartela[i] = aleatorio(60);
                }
            }

            String res = "";
            Arrays.sort(cartela);
            for(int dezena : cartela){
                res += dezena + " ";
            }
            System.out.println("Cartela Nº" + number + " ==> " + res);
        }
    }

    public static int aleatorio(int limite){
        double numero = Math.random() * limite;
        return (int) (numero + 1);
    }

    public static boolean seExiste(int[] cartela, int dezena){
        for(int numero : cartela){
            if(numero == dezena){
                return true;
            }
        }
        return false;
    }
}

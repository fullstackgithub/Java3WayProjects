package Aula07;

import java.util.Arrays;
import java.text.DecimalFormat;
import static javax.swing.JOptionPane.*;

public class LotoFacil{
    public static void main(String[] args){
        int exit = 0;
        DecimalFormat df = new DecimalFormat("00");
        do{
            int qtd = Integer.parseInt(showInputDialog(null, "Digite a quantidade de cartelas ", "loto Fácil", QUESTION_MESSAGE));
            String res = "";

            for(int n=1; n<=qtd; n++){
                res += "\nCartela No. " + df.format(n) + " ==> ";
                int[] cartela = new int[15];
                int dezena;

                for(int i=0; i < cartela.length; i++){
                    dezena = aleatorio(25);
                    if(seExiste(cartela,dezena)){
                        i--;
                    } else{
                        cartela[i] = dezena;
                    }

                }
                Arrays.sort(cartela);
                for(int numero : cartela){
                    res += df.format(numero) + " ";
                }
            }

            showMessageDialog(null, res, "Sugestões para Loto Fácil", INFORMATION_MESSAGE);

            exit =  Integer.parseInt(showInputDialog(null, " Deseja continuar? Digite 0 para Sim ou 99 para Não", "Saída", QUESTION_MESSAGE));

        }while(exit !=99);

        showMessageDialog(null, "Obrigado!!!", "Boa Sorte", WARNING_MESSAGE);
    }

    public static int aleatorio(int limite){
        double numero = Math.random() * limite;
        return (int)(numero + 1);
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
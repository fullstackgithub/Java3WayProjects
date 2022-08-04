package Aula11;

import java.util.Scanner;

public class ExemploTryCatch {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try{
            System.out.print("Digite um valor inteiro: ");
            int numero1 = scan.nextInt();

            System.out.println("Digite outro valor inteiro");
            int numero2 = scan.nextInt();

            System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));

        }catch(Exception e){
            System.out.println("ERRO - Valor digitado não é um número inteiro");
        }finally{
            System.out.println("Programa finalizado");
        }
    }
}
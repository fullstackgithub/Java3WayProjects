package Aula06;

public class Metodos {

    public static void main (String[] args){
        int numero = aleatorio(10);

        System.out.println("Número gerado aleatoriamente: " + numero);
        System.out.println("O quadrado do número gerado: " + quadrado(numero));
        System.out.println("O Cubo do número gerado: " + cubo(numero));
        System.out.println("A raiz quadrada do número gerado: " + raizQuadrada(numero));

    }

    // Argumentos, parâmetros, assinatura do método
    public static int aleatorio(int limite){
        double numero = Math.random() * limite;
        return (int)(numero + 1);
    }

    public static long quadrado(int numero){
        return (long) Math.pow(numero, 2);
    }

    public static long cubo(int numero){
        return (long) Math.pow(numero, 3);
    }

    public static double raizQuadrada(int numero){
        return Math.sqrt(numero);
    }
}

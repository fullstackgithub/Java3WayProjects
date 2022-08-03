package Aula09;

import java.util.Scanner;

public class Dimensional {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Area sala = new Area();

        do {

                System.out.print("Digite o valor para a largura: ");
                sala.setLargura(scan.nextDouble());

                System.out.print("Digite o valor para o comprimento: ");
                sala.setComprimento(scan.nextDouble());

                System.out.println(sala.calcular());

                System.out.println("Deseja sair do programa? Se SIM digite 99, se NÃO digite 0");
                sala.setOpc(scan.nextInt());


        }while(sala.getOpc() != 99);

        Area cozinha = new Area(3.45, 4.15);
        System.out.println(cozinha.calcular());


        System.out.println("-------------------------- Volume ----------------------------");

        Volume piscina = new Volume();

        System.out.print("Digite o valor para a largura: ");
        piscina.setLargura(scan.nextDouble());

        System.out.print("Digite o valor para o comprimento: ");
        piscina.setComprimento(scan.nextDouble());

        System.out.print("Digite o valor para o altura: ");
        piscina.setAltura(scan.nextDouble());

        System.out.println(piscina.calcular());
    }
}

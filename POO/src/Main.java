import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class Main {
    public static void main(String[] args) {
        
        int p;
        int q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = 1; q = 1;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        //System.out.println((p^q) + "\t" + (!p));

        p = 1; q = 0;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        //System.out.println((p^q) + "\t" + (!p));

        p = 0; q = 1;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        //System.out.println((p^q) + "\t" + (!p));

        p = 0; q = 0;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        //System.out.println((p^q) + "\t" + (!p));


//        public class Multiply {
//            public static Double multiply(Double a, Double b) {
//                return a * b
//            }
//        }


//        // criar object perguntando o nome do produto e inserir o preço
//        Map<Integer, String> registros = new HashMap<Integer, String>();
//        // criar um for para percorrer o array
//        for(int i = 0; i< 2; i++){
//            int ra = Integer.parseInt(JOptionPane.showInputDialog("Informe o RA: "));
//            String nome = JOptionPane.showInputDialog("Informe o nome: ");
//            registros.put(ra,nome);
//        }
//        StringBuilder saida = new StringBuilder("");
//
//        for(Integer ra:registros.keySet()){
//            saida.append("Aluno: ").append(registros.get(ra));
//            saida.append(" - RA: ").append(ra).append("\n");
//        }
//        JOptionPane.showMessageDialog(null, saida.toString());

        // somar o valor dos produtos
        // criar a lógica de subtrair o valor da compra da conta
        // dar o valor final da compra
        // dar o valor final da conta

//        boolean pgto = false;
//
//        do {
//            int preco =  Integer.parseInt(showInputDialog(null, "Digite o preço da compra", "PREÇO DA COMPRA", QUESTION_MESSAGE));
//
//            int formaDePgto = Integer.parseInt(showInputDialog(null, "Digite <1> para crédito e <2> para débito", "CRÉDITO OU DÉBITO", QUESTION_MESSAGE));
//
//            if (formaDePgto == 1) {
//                int parcelas =  Integer.parseInt(showInputDialog(null, "Em quantas vezes deseja parcelar? Máximo de 2", QUESTION_MESSAGE));
//                if (parcelas == 1){
//                    showMessageDialog(null, "Foi parcelado em uma vez, Compra Finalizada!", "Compra Finalizada!", INFORMATION_MESSAGE);
//                    pgto = true;
//                } else if (parcelas == 2){
//                    showMessageDialog(null, "Foi parcelado em duas vezes, Compra Finalizada!", "Compra Finalizada!", INFORMATION_MESSAGE);
//                    pgto = true;
//                } else {
//                    showMessageDialog(null, "Parcelamento inválido", "Volte a inserir os dados!", INFORMATION_MESSAGE);
//                    pgto = false;
//                }
//            } else if (formaDePgto == 2) {
//                showMessageDialog(null, "Pagamento efetuado, Compra Finalizada!", "Compra Finalizada!", INFORMATION_MESSAGE);
//                pgto = true;
//            }
//
//        } while (pgto != true);
//
//        showMessageDialog(null, "Obrigado pelas compras", "OBRIGADO!", INFORMATION_MESSAGE);


        // SWITCH

//        int numero =  Integer.parseInt(showInputDialog(null, "Digite um número de 1 a 5", "Digite um número", QUESTION_MESSAGE));
//
//        switch(numero) {
//            case 1:
//                showMessageDialog(null, "Você digitou o número 1", "número: 1!", INFORMATION_MESSAGE);
//                break;
//            case 2:
//                showMessageDialog(null, "Você digitou o número 2", "número: 2!", INFORMATION_MESSAGE);
//                break;
//            case 3:
//                showMessageDialog(null, "Você digitou o número 3", "número: 3!", INFORMATION_MESSAGE);
//                break;
//            case 4:
//                showMessageDialog(null, "Você digitou o número 4", "número: 4!", INFORMATION_MESSAGE);
//                break;
//            case 5:
//                showMessageDialog(null, "Você digitou o número 5", "número: 5!", INFORMATION_MESSAGE);
//                break;
//            default:
//                showMessageDialog(null, "Você digitou o número " + numero, "número: " + numero, INFORMATION_MESSAGE);
//        }






//        System.out.println("__________WHILE__________");
//        int acelerarVelocidade = 0;
//
//        while (acelerarVelocidade < 10) { // Enquanto a velocidade não atingir 10 -> ver o escopo
//            // Aqui está o escopo do while
//            acelerarVelocidade++; // Nós iremos acrescentar 1 a cada repetição
//
//            System.out.println(acelerarVelocidade + " Km's");
//        };
//
//        System.out.println();
//        System.out.println("A velocidade chegou aos " + acelerarVelocidade + " Km's!!");
//
//        System.out.println("__________DO/WHILE__________");
//        int acelerar = 0;
//        do { // faça a
//            acelerar++; // aceleração
//            System.out.println("Acelerando " + acelerar + " Km's"); // e imprima a aceleração
//        } while(acelerar < 10); // enquanto a velocidade for menor que 10
//
//        System.out.println();
//        System.out.println("Acelerou até " + acelerar + " Km's");
//
//
//        System.out.println("__________FOR E ARRAYS__________");
//
//        String marcas[] = new String[2];
//
//        for(int i = 0; i < marcas.length; i++){
//            marcas[i] = showInputDialog(null, "Digite a " + (i+1) + "a. marca do carro:");
//        }
//
//        for(String marca : marcas){
//            System.out.println("Marca: " + marca);
//        }
//
//        System.out.println();
//        System.out.println("Array: " + String.join(", ", marcas));


//        Settings >> Editor >> Font

    }
}
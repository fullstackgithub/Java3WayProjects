package Aula08;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Terminal {

    public static void main(String[] args){

        // Classe || Objeto || alocação da memória || Construtor()
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.numero = Integer.parseInt(showInputDialog(null, "Digite o número da conta bancária: "));
        contaBancaria.titular = showInputDialog(null, "Digite o nome do titular da conta bancária");


        String menu = getMenu();
        int opc = 0;
        double valor = 0.0;

        do{
            opc = Integer.parseInt(showInputDialog(null, menu, "Banco 3 Way", JOptionPane.QUESTION_MESSAGE));
            switch(opc){
                case 1:
                    valor = Double.parseDouble(showInputDialog(null, "Banco 3 Way"));
                    contaBancaria.sacar(valor);
                    break;
                case 2:
                    valor = Double.parseDouble(showInputDialog(null, "Banco 3 Way"));
                    contaBancaria.depositar(valor);
                    break;
                case 3:
                    showMessageDialog(null, contaBancaria.gerarExtrato(), "Extrato Bancário", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    showMessageDialog(null, "Obrigado por usar nossos serviços!", "Banco 3 Way", JOptionPane.WARNING_MESSAGE);
                    break;
                default:
                    showMessageDialog(null, "Opção inválida!", "Banco 3 Way", JOptionPane.ERROR_MESSAGE);
            }
        }while(opc != 4);

    }

    public static String getMenu(){
        String res = "Escolha uma opção:";
        res += "\n1 - Sacar";
        res += "\n2 - Depositar";
        res += "\n3 - Extrato Bancário";
        res += "\n4 - Sair do Terminal";
        return res;
    }
}

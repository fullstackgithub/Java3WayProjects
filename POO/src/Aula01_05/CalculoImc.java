package Aula01_05;

import java.text.DecimalFormat;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class CalculoImc {

    public static void main (String[] args){

        DecimalFormat df = new DecimalFormat("#0.00");

        //Entrada de dados
        String nome = showInputDialog(null, "Digite o nome do Atleta");
        double peso = Double.parseDouble(showInputDialog(null, "Digite o peso do(a) " + nome));
        double altura = Double.parseDouble(showInputDialog(null, "Digite a altura do(a) " + nome));

        //Processamento
        double imc = (peso / Math.pow(altura, 2));

        String res = "Atleta: " + nome.toUpperCase();
        res += "\nIMC: " + df.format(imc);

        if(imc <= 18.5){
            res += "\nSituação: Abaixo do peso.";
        } else if(imc <= 24.9){
            res += "\nSituação: Peso normal.";
        }else if(imc <= 29.9){
            res += "\nSituação: Sobrepeso.";
        }else if(imc <= 39.9){
            res += "\nSituação: Obesidade.";
        }
        else {
            res += "\nSituação: Obesidade II.";
        }

        showMessageDialog(null, res);
    }
}

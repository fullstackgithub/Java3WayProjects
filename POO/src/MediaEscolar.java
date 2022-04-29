import java.text.DecimalFormat;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class MediaEscolar {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#0.00");


        //Entrada dos dados
        String nome = showInputDialog(null, "Digite o nome do aluno");
        String disciplina = showInputDialog(null, "Digite o nome da disciplina");

        double nota01 = Double.parseDouble(showInputDialog(null, "Digite a nota de N1"));
        double nota02 = Double.parseDouble(showInputDialog(null, "Digite a nota de N2"));
        double nota03 = Double.parseDouble(showInputDialog(null, "Digite a nota de N3"));

        //Processamento
        double media = (nota01 + nota02 + nota03) / 3;

        String res = "Aluno: " + nome.toUpperCase();
        res += "\nDisciplina: " + disciplina;
        res += "\nMédia Escolar: " + df.format(media);

        if(media >= 7.0){
            res += "\nSituação: APROVADO(A)";
        } else if (media >= 5) {
            res += "\nSituação: RECUPERAÇÂO(A)";
        } else {
            res += "\nSituação: REPROVADO(A)";
        }

        //System.out.println("res: " + res);
        showMessageDialog(null, res);
    }

}

import static javax.swing.JOptionPane.*;

public class Tabuada {

    public static void main (String[] args){

        int exit = 0;

        do{
            int numero = Integer.parseInt(showInputDialog(null, "Digite um número entre 1 e 10:", "..:TABUADA:..", QUESTION_MESSAGE));
            String res = "";

            for(int i = 1; i <= 10; i++){
                res += numero + " x " + i + " = " + (numero * i) + "\n";
            }
            showMessageDialog(null, res, "Tabuada de " + numero, WARNING_MESSAGE);

            exit = Integer.parseInt(showInputDialog(null, "Deseja continuar? Sim <0> Não <99>", "SAÍDA", ERROR_MESSAGE));

        } while(exit !=99);
        showMessageDialog(null, "Obrigado por usar nossos serviços", "TCHAU, OBRIGADO!", INFORMATION_MESSAGE);
    }
}

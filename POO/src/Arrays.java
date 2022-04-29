import static javax.swing.JOptionPane.showInputDialog;

public class Arrays {

    public static void main (String[] args){

        int[] idades = new int[6];

        //Preenchimento do Array/Vetor
        for(int i = 0; i < idades.length; i++){
            idades[i] = Integer.parseInt(showInputDialog(null, "Digite a " + (i+1) + "a. idade:"));
        }

        //Leitura do Array/Vetor
        for(int idade : idades){
            System.out.println("Idade: " + idade);
        }
    }
}

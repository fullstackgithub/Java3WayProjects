public class DoWhile {

    public static void main (String[] args){

        int i = 1;
        String res = "";

        do{ // faça
            res += "\nO quadrado de " + i + " é " + (i * i);
            i++;

        } while(i <= 10);
        System.out.println(res);
    }
}

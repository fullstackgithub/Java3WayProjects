public class While {

    public static void main (String[] args){

        int i = 1;
        String res = "";

        while(i <= 10){
            res += "\nO quadrado de " + i + " é " + (i * i);
            i++;

        }
        System.out.println(res);
    }
}

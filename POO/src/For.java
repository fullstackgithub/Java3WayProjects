public class For {

    public static void main(String[] args){

        String res = "";

        for(int i = 1; i <= 10; i++){
            res += "\nO quadrado de " + i + " é " + (i * i);
         }
        System.out.println(res);
    }
}

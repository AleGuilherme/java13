import java.util.Scanner;

public class Uri2787{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int l, c;

        l = teclado.nextInt();
        c = teclado.nextInt();

        if ( (l + c)%2 == 0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
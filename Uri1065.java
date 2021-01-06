import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero, qtdPares=0;

        for (int c=1; c<=5; c++){
            numero = teclado.nextInt();
            if (numero %2 ==0){
                qtdPares++;
            }
        }

        System.out.println(qtdPares + " valores pares");
    }
}
import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int linhas, x=1;

        linhas = teclado.nextInt();

        for (int cont=1; cont <= linhas; cont++){

            System.out.println(x + " " + (x+1) + " " + (x+2) + " PUM");
            x+=4;

        }
    }
}
import java.util.Scanner;

public class TabuadaWhile{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numero;
        int contador;
        System.out.println("Digite o numero pra calcular a tabuada");
        numero  = teclado.nextInt();

        contador = 1;

        while (contador < 11){
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;      // contador = contador + 1;
        }
    }
}
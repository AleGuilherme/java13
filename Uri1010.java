import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int codPeca1, qtdPeca1, codPeca2, qtdPeca2;
        float valorPeca1, valorPeca2;

        float total;

        codPeca1   = teclado.nextInt();
        qtdPeca1   = teclado.nextInt();
        valorPeca1 = teclado.nextFloat();
        codPeca2   = teclado.nextInt();
        qtdPeca2   = teclado.nextInt();
        valorPeca2 = teclado.nextFloat();

        total = qtdPeca1 * valorPeca1 + qtdPeca2 * valorPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
    }
}
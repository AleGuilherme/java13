import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valorLido;
        int qt100, qt50, qt20, qt10, qt5, qt2, qt1;

        int resto;

        // entrada
        valorLido = teclado.nextInt();

        // processamento
        /*
        qt100     = valorLido / 100;
        resto     = valorLido % 100; // resto = valorLido - qt100 * 100;

        qt50      = resto / 50;
        resto     = resto % 50;      // resto = resto - qt50 * 50;

        qt20      = resto / 20;
        resto     = resto % 20;      // resto = resto - qt20 * 20;

        qt10      = resto / 10;
        resto     = resto % 10;      // resto = resto - qt10 * 10;

        qt5       = resto / 5;
        resto     = resto % 5;       // resto = resto - qt5 * 5;
        
        qt2       = resto / 2; 
        qt1       = resto % 2;       // o último resto acaba sendo a quantidade de cédulas de R$ 1,00
        */

        /* --- método 2 de processamento --- sem usar a variável RESTO */

        qt100  = valorLido / 100;
        qt50   = valorLido % 100 / 50;
        qt20   = valorLido % 100 % 50 / 20;
        qt10   = valorLido % 100 % 50 % 20 / 10;
        qt5    = valorLido % 100 % 50 % 20 % 10 / 5;
        qt2    = valorLido % 100 % 50 % 20 % 10 % 5 / 2;
        qt1    = valorLido % 100 % 50 % 20 % 10 % 5 % 2;

        // saída
        System.out.println(valorLido);
        System.out.println(qt100 + " nota(s) de R$ 100,00");
        System.out.println(qt50  + " nota(s) de R$ 50,00");
        System.out.println(qt20  + " nota(s) de R$ 20,00");
        System.out.println(qt10  + " nota(s) de R$ 10,00");
        System.out.println(qt5   + " nota(s) de R$ 5,00");
        System.out.println(qt2   + " nota(s) de R$ 2,00");
        System.out.println(qt1   + " nota(s) de R$ 1,00");

        
    }
}
import java.util.Scanner;

public class Uri1160{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int PA,PB, T;
        double G1, G2;
        int anos;

        T = teclado.nextInt();
        for (int cont = 1; cont <= T; cont++){
            PA = teclado.nextInt();
            PB = teclado.nextInt();
            G1 = teclado.nextDouble();
            G2 = teclado.nextDouble();

            anos = 0;
            while (PA <= PB && anos <= 100){  // preciso da 2a condicao para não exceder o tempo limite
                PA = (int)(PA + PA * G1/100);
                PB = (int)(PB + PB * G2/100);
                anos++;
            }
            if (anos > 100){
                System.out.println("Mais de 1 seculo.");
            }
            else{
                System.out.println(anos +  " anos.");
            }
        }


    }
}
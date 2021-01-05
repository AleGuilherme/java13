import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tempoEvento;

        int horas, minutos, segundos;

        int resto; // para armazenar a sobra da operação da divisao das horas


        tempoEvento = teclado.nextInt();

        horas = tempoEvento / 3600;   // 1h = 3600 segundos
        //quanto sobrou??

        resto = tempoEvento % 3600; //   aqui eu pego o resto da divisão do tempo do evento por 3600

        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);


    }
}
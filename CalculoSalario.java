/*
regra do cálculo do Imposto Unico


- Salário até 1000,00   --> Isento de imposto
- Salario acima de 1000 até 1800,00 --> 10% de imposto
- Salário acima de 1800 até 2500,00 --> 15% de imposto
- Salário acima de 2500 até 4000,00 --> 20% de imposto
- Salário acima de 4000 --> valor fixo de 1300,00


Entrada: salário do funcionario
Saída: imposto devido
*/

import java.util.Scanner;

public class CalculoSalario{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario, imposto;
        // entrada:
        System.out.print("Digite o salario do funcionario: ");
        salario = teclado.nextDouble();

        if (salario <= 1000.0){   // se o salario for até 1000.00
            imposto = 0.0;
        }
        else{  // já sei que o salário é maior que 1000.00, basta saber se ele se enquadra na 2a faixa de valor
            if (salario <= 1800.0){  // faz parte da 2a faixa?
                imposto = salario * 10.0/100;
            }
            else{ // já sei que o salário é maior que 1800, basta saber se ele faz parte da 3a faixa
                if (salario <= 2500.0){  // faz parte da 2a faixa?
                    imposto = salario * 15.0/100;
                }
                else{ // já sei que é maior que 2500, resta saber se faz parte da 4a faixa
                    if ( salario <= 4000.0){  // faz parte da 3a faixa?
                        imposto = salario * 20.0/100;
                    }
                    else{  // já sei que é maior q 4000.00 portanto o imposto tem valor fixo
                        imposto = 1300.00;
                    }

                }

            }
        }
        System.out.printf("Seu salario base: R$ %.2f\n", salario);
        System.out.printf("Imposto Retido  : R$ %.2f\n", imposto);
        System.out.printf("Salario Liquido : R$ %.2f\n", salario - imposto);
    }
}
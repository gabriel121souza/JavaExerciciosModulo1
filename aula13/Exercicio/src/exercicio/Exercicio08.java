
package exercicio;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        System.out.println("Calcular hora trabalhada");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Valor da hora: ");
        double valorHora = sc.nextDouble();
        System.out.print("Valor de horas que voce trabalha no mes: ");
        double horaMensal = sc.nextDouble();
        
        double resultado = valorHora * horaMensal;
        
        System.out.println("seu salario é: " + resultado);
             
    }
}


package exercicio;

import java.util.Scanner;


public class Exercicio12 {
           public static void main(String args[]){
               Scanner sc = new Scanner(System.in);
               
               System.out.print("entre com o valor da hora: R$");
               double valorHora = sc.nextDouble();
               
               System.out.print("entre com a quantidade hora mensais do colaborador: ");
               double horaTrabalhada = sc.nextDouble();
               
               double salarioBruto = valorHora * horaTrabalhada;
               
               if(salarioBruto <= 900){
                   double inss = salarioBruto * 0.10;
                   double fgts = salarioBruto * 0.11;
                  double salarioLiquido = salarioBruto - inss; 
                   System.out.println("Salario Bruto: ("+valorHora+"*"+horaTrabalhada+" : R$"+salarioBruto);
                   System.out.println("(-) IR insento");
                   System.out.println("(-) INSS ( 10% ): R$"+ inss);
                   System.out.println("FGTS ( 11% ): R$"+fgts);
                   System.out.println("Total de descontos: R$ " + inss);
                   System.out.println("Salario Liquido: R$"+salarioLiquido);
                   
               
               }    
           }
}

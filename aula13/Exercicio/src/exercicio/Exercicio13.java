
package exercicio;

import java.util.Scanner;


public class Exercicio13 {
    public static void main(String[] args){
        System.out.println("Exercicio 13");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor da suar Hora trabalhada: ");
        double horaTrabalhada = sc.nextDouble();
        System.out.print("quantidade de horas trabalhada no mes: ");
        double qtdHora = sc.nextDouble();
        double salarioBruto = horaTrabalhada * qtdHora;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double impostoRenda = salarioBruto * 0.11;
        double descontoSalario = inss + sindicato + impostoRenda;
        double salarioLiquido = salarioBruto - descontoSalario;
        
        System.out.println("Salario Bruto:  " + salarioBruto);
        System.out.println("Valor do inss:  " + inss);
        System.out.println("valor do sindicato: " + sindicato);
        System.out.println("valor do IR: " + impostoRenda);
        System.out.println("Total de Descontos: "+ descontoSalario);
        System.out.println("SALARIO LIQUIDO: " + salarioLiquido);
        
        
        
        
                
    }
}

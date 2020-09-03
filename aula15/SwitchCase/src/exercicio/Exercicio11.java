
package exercicio;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
        System.out.println("entre com valor do seu salario: ");
            double salario = sc.nextDouble();
            if(salario<=280){
                double reajuste = salario * 0.20;
                double newSalario = salario +reajuste;
                System.out.println("seu salario após o reajuste: R$" + newSalario);
                System.out.println("seu salario antes do o reajuste: R$" + salario);
                System.out.println("Salario foi aumentado em 20%");
                System.out.println("valor do reajuste: R$" + reajuste);
            }else if(salario>280 && salario <= 700){
                double reajuste = salario * 0.15;
                double newSalario = salario + reajuste;
                System.out.println("seu salario após o reajuste: R$" + newSalario);
                System.out.println("seu salario antes do o reajuste: R$" + salario);
                System.out.println("Salario foi aumentado em 15%");
                System.out.println("valor do reajuste: R$" + reajuste);
            }else if(salario >700 && salario<=1500){
                double reajuste= salario * 0.10;
                double newSalario = salario + reajuste;
                System.out.println("seu salario após o reajuste: R$" + newSalario);
                System.out.println("seu salario antes do o reajuste: R$" + salario);
                System.out.println("Salario foi aumentado em 10%");
                System.out.println("valor do reajuste: R$" + reajuste);
            }else{
                double reajuste = salario * 0.5;
                double newSalario= salario +reajuste;
                System.out.println("seu salario após o reajuste: R$" + newSalario);
                System.out.println("seu salario antes do o reajuste: R$" + salario);
                System.out.println("Salario foi aumentado em 5%");
                System.out.println("valor do reajuste: R$" + reajuste);
                
            
            }
            
    
            }
}

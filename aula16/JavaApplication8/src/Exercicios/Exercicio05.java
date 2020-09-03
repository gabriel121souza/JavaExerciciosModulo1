
package Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
       boolean valida= true;
        double  popA;
        double popB ;
        double taxaA;
        double taxaB;
        
        do{
                System.out.print("entre com a populacao A: ");
                popA = sc.nextDouble();
                if(popA > 0){
                valida = true;
                } else{
                    System.out.println("precisa ser maior que zero");
                        }
        }while(!valida);
        
        valida = false;
        do{
            System.out.println("entre com a populacao de B");
            popB = sc.nextDouble();
            if(popB > 0 ){
                valida= true;
            }else{
                System.out.println("precisa ser maior que zero");
            }
        }while(!valida);
        valida = false;
        do {
            System.out.print("Entre com taxa de crescimento da populacao A: ");
            taxaA = sc.nextDouble();
            if(taxaA > 0){
                valida = true;
            }else{
                System.out.print("Populacao A precisa ser maior que 0. ");
                
            }
        }while(!valida);
        valida = false;
        do {
            System.out.print("Entre com taxa de crescimento da populacao B: ");
            taxaB = sc.nextDouble();
            if(taxaB > 0){
                valida = true;
            }else{
                System.out.print("Populacao A precisa ser maior que 0. ");
                
            }
        }while(!valida);
        
   
    int  cont = 0;
  while(popA<= popB){
      popA += (popA/100)*taxaA;
      popB +=(popB/100)*taxaB;
      cont ++;
  }
        System.out.println("populacao A: " + taxaA);
        System.out.println("populacao A: " + taxaB);
         System.out.println("populacao A ultrapassará a populacao B em " + cont);   
    }
}

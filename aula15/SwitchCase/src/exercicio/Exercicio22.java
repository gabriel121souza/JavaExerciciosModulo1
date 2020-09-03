
package exercicio;

import java.util.Scanner;


public class Exercicio22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("entre com a quantidade (kg) morango: ");
            double qtdMorango = sc.nextDouble();
            System.out.println("entre com a quantidade (kg) maça: ");
            double qtdMaca = sc.nextDouble();
                double precoTotal = 0;
                    double precoKgMorango = 0;
                    if(qtdMorango <= 5){
                        precoKgMorango = 2.5;
                    }else{
                        precoKgMorango=2.2;
                        
                    }
                    double precoKgMaca = 0;
                    if(qtdMorango <= 5){
                        precoKgMaca = 1.8;
                    }else{
                        precoKgMaca=1.5;
                        
                    }
                    double precoTotalMorango = qtdMorango * precoKgMorango;
                    double precoTotalMaca = qtdMaca * precoKgMaca;
                    double precoParcial = precoTotalMaca+ precoTotalMorango;
                    if((qtdMorango + qtdMaca > 8) || precoParcial > 25) {
                        precoTotal = precoParcial - ((precoParcial/100)*10);
                    }
                    System.out.println("preco total = " + precoTotal);
    }
    
            }

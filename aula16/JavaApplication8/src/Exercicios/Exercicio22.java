
package Exercicios;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double media;
        double valorCd;
        double cds = 0;
        System.out.println("entre com o valor do CD");
        int qtdCd = sc.nextInt();
        
        for(int i = 1; i<=qtdCd; i++){
            System.out.println("entre com o valor do cd: " + i);
             valorCd = sc.nextDouble();
           cds +=valorCd;
        }
        media = cds/qtdCd;
        System.out.println("o valor medio Gastos em cds é: " +media);
                
        
    }
}

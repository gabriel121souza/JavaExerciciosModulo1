
package Exercicios;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        int notas = sc.nextInt();
        
        double soma  = 0;
        double media;
        double nota;
        for(int i=0; i<notas; i++){
            System.out.println("entre com a nota: " + (i+1));
            nota = sc.nextDouble();
            soma += nota;
        }
       media = soma / notas;
        System.out.println("soma: " + soma);
        System.out.println("media: "+ media);
        
    }
}

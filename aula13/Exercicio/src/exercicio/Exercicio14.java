
package exercicio;

import java.util.Scanner;

public class Exercicio14 {
    
    public static void main(String[] args){
        System.out.println("Exercicio 14");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("entre com o tamanho do arquivo: ");
        double tamArquivo = sc.nextDouble();
        
        System.out.println("entre com a velocidade da internet");
        double internet = sc.nextDouble();
        
        double tempo = tamArquivo  / internet; 
            System.out.println("Tempo de dowload: "+ tempo);
    }
}

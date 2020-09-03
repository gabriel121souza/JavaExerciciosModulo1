
package exercicio;

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args){
        System.out.println("convertendo metros para cetimentos");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor a ser convertido: ");
        float metros = sc.nextFloat();
        
        float resultado = metros * 100;
        System.out.println("o valor convertido em centimentros é: " + resultado);
    }
}

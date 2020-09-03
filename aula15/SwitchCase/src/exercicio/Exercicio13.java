
package exercicio;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("informe um numero para determinar o dia da semana: ");
        int num1  = sc.nextInt();
        switch(num1){
            case 1 : System.out.println("Domingo");break;
            case 2: System.out.println("Segunda");break; 
            case 3: System.out.println("Terca");break;
            case 4: System.out.println("Quarta");break;
            case 5: System.out.println("Quinta");break;
            case 6: System.out.println("Sexta");break;
            case 7: System.out.println("Sabado");break;
        }
    }
}

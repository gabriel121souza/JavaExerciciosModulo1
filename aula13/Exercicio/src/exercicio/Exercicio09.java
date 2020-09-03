
package exercicio;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args){
            System.out.println("Convertendo Farenheit em celsius");
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Insira a temperatura em Farenheit");
            double farenheit = sc.nextDouble();
            double celsius = (5 *(farenheit-32)/ 9);
            
            System.out.println("O a temperatura Convertida para o Celsius é: " + celsius);
    }
}

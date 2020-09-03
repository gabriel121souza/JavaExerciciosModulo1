package exercicio;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        System.out.println("Convertendo celsius em farenheit");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatura em Celsius: ");
        double celsius = sc.nextDouble();
        double farenheit =  celsius*9/5+32;
        System.out.println(farenheit);
        
    }
}

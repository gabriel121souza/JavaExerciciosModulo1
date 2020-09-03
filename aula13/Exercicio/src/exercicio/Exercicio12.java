
package exercicio;

import java.util.Scanner;

public class Exercicio12 {
        
        public static void main(String [] args){
            System.out.println("Exercicio 12");
            
            Scanner sc = new Scanner(System.in);
            System.out.print("digite sua altura que iremos te falar seu peso ideal: ");
            double altura = sc.nextDouble();
            double alturaIdeal = (72.7 *altura)-58;
            System.out.println("seu peso ideal e: "+ alturaIdeal);
            
        }
}

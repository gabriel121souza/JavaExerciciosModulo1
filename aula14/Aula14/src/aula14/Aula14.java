
package aula14;

import java.util.Scanner;


public class Aula14 {

   
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                System.out.println("entre com o preco do item");
                    double valor = sc.nextDouble();
                
                    if(valor <= 10 ){
                        System.out.println("Esta barato");
                    }else if( valor>10 && valor <15){
                        System.out.println("Voce pode pedir um desconto");
                    }else if (valor>= 15 && valor < 17){
                        System.out.println("pode pesquisar ");
                        
                    } else{
                        System.out.println("muito caro");
                    }
        
    }
    
}

package exercicio;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){
        System.out.println("Posto de gasolina ");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("entre com a quantidade de litros vendido");
                double litros = sc.nextDouble();
                System.out.println("entre com o tipo de combustivel");
                String tipo = sc.next();
                int percDesconto=0;
                double precoGas= 2.5;
                double precoAlc = 1.9;
                double total = 0;
                double totalDesc = 0;
                if(tipo.equalsIgnoreCase("a")){
                    if(litros <= 20){
                        percDesconto = 3;
                    }else{
                        percDesconto = 5;
                    }
                    total = litros * precoAlc;
                    
                }else if(tipo.equalsIgnoreCase("g")){
                    if(litros<=20){
                        percDesconto = 4;
                        
                    }else{
                        percDesconto =6;
                    }
                    total = litros * precoGas;
                }
                
                totalDesc = (total /100)*percDesconto;
                double precoAPagar = total - totalDesc;
                System.out.println("valor a ser pago: " + precoAPagar);
}
}

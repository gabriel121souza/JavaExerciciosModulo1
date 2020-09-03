
package Exercicios;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lojas Tabajara: ");
        
        boolean sair = false;
        String continuarComprar;
        int qtdProdutos;
        double preco;
        double total;
        String output;
        double valorPago;
        double troco;
        
        do {
            System.out.println("Deseja informar uma nova Compra S/N");
                continuarComprar = sc.next();
                
                if(continuarComprar.equalsIgnoreCase("s")){
                    output = "Lojas tabajara\n ";
                    System.out.println("Digite a quantidade de produtos da compra: ");
                    qtdProdutos = sc.nextInt();
                  
                    total=0;
                    for(int i=1; i<=qtdProdutos; i++){
                        System.out.println("informe preco do produto: "+i);
                        preco = sc.nextDouble();
                        total +=preco;
                        output += "produto: "+i +": R$ "+ preco + "\n";
                    }
                    output+="total R$: "+total;
                    System.out.println("entre com o valor pago: ");
                    valorPago = sc.nextDouble();
                    troco  = total - valorPago;
                   output += "troco: " +troco;
                   System.out.println(output);
                }else {
                    sair = true;
                }
            
        }while(!sair);
    
        }
}

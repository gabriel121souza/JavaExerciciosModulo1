
package Exercicios;

public class Exercicio24 {
public static void main(String[] args){
    System.out.println("Preco do pao: R$ 0.18");
    System.out.println("Panificadora Pao de ontem - tabela de precos");
    
    for(int i = 1; i<=50; i++){
        double tabela = i *0.18;
        System.out.println("o valor de "+i +" custa "+  tabela);
    }
}    
}

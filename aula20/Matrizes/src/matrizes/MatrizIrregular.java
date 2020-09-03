package matrizes;

import java.util.Scanner;

public class MatrizIrregular {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("entre com o numero de pessoas que serão entrevistadas: ");
        
        int numEntrevistados = sc.nextInt();
        String [][] nomesFilhos = new String[numEntrevistados] [];
        for(int i=0; i<nomesFilhos.length; i++){
            System.out.println("entre com a quantidade de filhos ");
            int qtdFilhos = sc.nextInt();
            
            nomesFilhos[i] =new String[qtdFilhos];
            
            for(int j=0; j<nomesFilhos[i].length; j++){
                System.out.println("digite o nome do filho " + (j+1));
                nomesFilhos[i][j] = sc.next();
        
        }
        }
            for (int i =0;  i<nomesFilhos.length; i++){
        System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length+ " filhos");
        for(int j= 0; j<nomesFilhos[i].length; j++){
            System.out.println(nomesFilhos[i][j]);
        }
    }
       
    }
}

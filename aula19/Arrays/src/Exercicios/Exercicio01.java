package Exercicios;

public class Exercicio01 {
    public static void main(String[] args){
        int vetA[] = new int[5];
        vetA[0]=3;
        vetA[1]=2;
        vetA[2]=7;
        vetA[3]=6;
        vetA[4]=5;
        int vetB[] = new int[5];
        vetB[0]=vetA[0];
        vetB[1]=vetA[1];
        vetB[2]=vetA[2];
        vetB[3]=vetA[3];
        vetB[4]=vetA[4];
        
     for(int conn : vetB){
         System.out.println(conn);
     }
        
    }
    
}

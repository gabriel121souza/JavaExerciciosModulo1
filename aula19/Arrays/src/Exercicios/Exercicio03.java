
package Exercicios;
public class Exercicio03 {
    public static void main(String[] args){
       int vetA[] = new int[5];
       
       vetA[0] = 2;
       vetA[1] = 4;
       vetA[2] = 5;
       vetA[3] = 7;
       vetA[4] = 12;
       
       int vetB[] = new int[5];
       vetB[0] = vetA[0]* vetA[0];
       vetB[1] = vetA[1]* vetA[1];
       vetB[2] = vetA[2]* vetA[2];
       vetB[3] = vetA[3]* vetA[3];
       vetB[4] = vetA[4]* vetA[4];
       
       for(int ler : vetB){
           System.out.println(ler);
       }
    }
}

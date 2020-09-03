
package Exercicios;
public class Exercicio02 {
    public static void main(String[] args){
        int vetA[] = new int[9];
        
       vetA[0]=5;
       vetA[1]=10;
       vetA[2]=15;
       vetA[3]=20;
       vetA[4]=25;
       vetA[5]=30;
       vetA[6]=35;
       vetA[7]=45;
       vetA[8]=55;
       
       int vetB[] = new int[9];
       
       vetB[0] =vetA[0]*2;
       vetB[1] =vetA[1]*2;
       vetB[2] =vetA[2]*2;
       vetB[3] =vetA[3]*2;
       vetB[4] =vetA[4]*2;
       vetB[5] =vetA[5]*2;
       vetB[6] =vetA[6]*2;
       vetB[7] =vetA[7]*2;
       vetB[8] = vetA[8]*2;
       
       for(int mult : vetB){
           System.out.println(mult);
       }
    }
}

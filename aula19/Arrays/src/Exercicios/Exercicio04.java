package Exercicios;

import static java.lang.Math.sqrt;


public class Exercicio04 {
    public static void main(String[] args){
        double vetA[] = new double [15];
       vetA[0] = 25;
       vetA[1] = 18;
       vetA[2] = 49;
       vetA[3] = 21;
       vetA[4] = 81;
       vetA[5] = 100;
       vetA[6] = 28;
       vetA[7] = 200;
       vetA[8] = 250;
       vetA[9] = 230;
       vetA[10] = 1000;
       vetA[11] = 255;
       vetA[12] = 194;
       vetA[13] = 28;
       vetA[14] = 150;
       
       double vetB[] = new double[15];
       vetB[0] = sqrt(vetA[0]);
       vetB[1] = sqrt(vetA[1]);
       vetB[2] = sqrt(vetA[2]);
       vetB[3] = sqrt(vetA[3]);
       vetB[4] = sqrt(vetA[4]);
       vetB[5] = sqrt(vetA[5]);
       vetB[6] = sqrt(vetA[6]);
       vetB[7] = sqrt(vetA[7]);
       vetB[8] = sqrt(vetA[8]);
       vetB[9] = sqrt(vetA[9]);
       vetB[10] = sqrt(vetA[10]);
       vetB[11] = sqrt(vetA[11]);
       vetB[12] = sqrt(vetA[12]);
       vetB[13] = sqrt(vetA[13]);
       vetB[14] = sqrt(vetA[14]);
       
       for(double leia : vetB){
           System.out.println(leia);
       }
       
       
    }
}

package foreach;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        int [] notas = new int[10];
                Random  random = new Random();
        for(int i=0; i<notas.length; i++){
            notas[i] = random.nextInt(20);
        }
        
        for (int i = 0; i<notas.length; i++){
            System.out.print( notas[i] + " ");
    }
        System.out.println();
        System.out.println("usando o for each");
        for(int nota : notas){
            System.out.print(nota+ " ");
        }
        //exemplos 2
        double [] [] notasAlunos = new double [3][4];
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2]= 9.2;
        notasAlunos[0][3] = 8;
        
        notasAlunos[1][0] = 4;
        notasAlunos[1][1]=4.5;
        notasAlunos[1][2]=6;
        notasAlunos[1][3]=5;
        
        notasAlunos[2][0] = 7;
        notasAlunos[2][1] =7;
        notasAlunos[2][2] =6;
        notasAlunos[2][3] =9;
        for( double[] notasAluno :notasAlunos){
            for(double nota : notasAluno){
                System.out.print(nota+ " ");
        }
            System.out.println();
}
}
}
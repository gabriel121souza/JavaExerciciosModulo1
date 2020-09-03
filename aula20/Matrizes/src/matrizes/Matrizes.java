
package matrizes;
public class Matrizes {
    public static void main(String[] args) {
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
        
        for (int i =0; i<notasAlunos.length; i++){
            for(int j =0; j<notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j]+ " ");
            }
            System.out.println();
        }
        
        notasAlunos[1][3]=8;
        System.out.println();
        
        for(int i=0; i<notasAlunos.length; i++){
            for(int j =0; j<notasAlunos[i].length; j++){
                System.out.print( notasAlunos[i][j] +" ");
            }
            System.out.println();
        }
        
        
        System.out.println("calculando a media: ");
        double soma;
        for(int i = 0; i<notasAlunos.length; i++){
            soma =0;
            for(int j =0; j<notasAlunos[i].length; j++){
                soma+= notasAlunos[i] [j];
            }
            System.out.println("media do aluno " + i + "e: " + (soma/4));
        }
        int [] notasAlunos1 = {4, 5,6,7};
        int [][] notasAlunos2 = {{5,6,7,8},{9,8,10,2}};
        
        System.out.println("notas das matrizes do notasAlunos2: ");
        for(int i=0; i< notasAlunos2.length; i++){
            for(int j =0; j<notasAlunos2[i].length; j++){
                System.out.print(notasAlunos2[i][j] + " -");
            }
            System.out.println();
            
        }
        for(int i =0; i<notasAlunos1.length; i++){
            System.out.print ( notasAlunos1[i]+ " ");
        }
    }
    
}


package breakandcontinue;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("entre com um numero:  ");
        int num = sc.nextInt();
        System.out.println("entre com um limite:  ");
        int max = sc.nextInt();
        
        for(int i= num; i<=max; i++){
        
            if(i%7 == 0){
                continue;
            }
            System.out.println(i);
    }
        /*
        for(int i = 0; i<=4; i++){
            rotulo1: {
                rotulo2: {
                    rotulo3:{
                        if(i==1){
                            break rotulo1;
                        }
                        if(i ==2){
                            break rotulo2;                        }
                         }
                    if( i== 3){
                        System.out.println("rotulo 3:");
                    }
                    System.out.println("rotule 2");
                }
                System.out.println("rotulo1");
            }
            System.out.println(i);
        }
*/
        
    }
    
}

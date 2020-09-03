package loopsWhile;
public class LoopsWhile {
    public static void main(String[] args) {
        int i = 1;
        int max = 10;
        
        System.out.println("Contado ate " + max);
        while(i<max){
            System.out.println(i);
            i++;
            System.out.println(i);
        }
             
        do{
            i++;
            System.out.println("valor de i: " + i);
            
        }while(i< 15);
        System.out.println(i);
            
    }
    
}

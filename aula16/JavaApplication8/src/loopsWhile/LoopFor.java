package loopsWhile;
public class LoopFor {
    public static void main(String [] args){
        for(int i = 0; i<5; i++ ){
            System.out.println("o valor de  i:" + i);
        }
        for(int i = 5; i>=0; i--){
            System.out.println("valor i: "+ i);
        }
        for(int i=0, j=10; i<j; i++, j--){
            System.out.println("i = " + i +"; j= "+j);
        }
        for( int cont = 0; cont < 10; cont +=2 ){
            System.out.println("de 2 em 2 " +cont);
        }
    }
}

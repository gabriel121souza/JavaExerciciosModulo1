package Classes.Exercicios;
public class Exercicio01 {
    public static void main(String[] args){
        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "bivolt";
        lampada.garantiaMes = 36;
        lampada.pontecia = 7;
        lampada.cor ="amarela";
        lampada.tpLuz= "amarela";
        lampada.tipos = new String[5];
        lampada.tipos[0] ="abajur";
        lampada.tipos[1] = "Lampeoes";
        
        System.out.println(lampada.modelo);
        System.out.println(lampada.tensao);
        System.out.println(lampada.pontecia);
        System.out.println(lampada.garantiaMes);
        System.out.println(lampada.cor);
        System.out.println(lampada.tipos[0]);
        System.out.println(lampada.tpLuz);
    }
}

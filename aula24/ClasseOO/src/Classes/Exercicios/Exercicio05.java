package Classes.Exercicios;
public class Exercicio05 {
    public static void main(String [] args){
        ContaCorrente conta = new ContaCorrente();
        conta.nome = "Gabriel S Rodrigues";
        conta.agencia = "4453-2";
        conta.numero = "895423-9";
        conta.especial = true;
        conta.limiteEspecial = 850;
        conta.saldo = 2500;
        
        System.out.println(conta.nome);
        System.out.println(conta.agencia);
        System.out.println(conta.numero);
        System.out.println(conta.especial);
        System.out.println(conta.limiteEspecial);
        System.out.println(conta.saldo);
    }
}

package Classes;


import Classes.Carro;


public class TesteCarro {
    public static void main(String[] args){
        Carro van = new  Carro();
        van.cor = "amarelo";
        van.modelo ="Ducato";
        van.marca = "Fiat";
        van.qtdPassageiro = 10;
        van.capTanque = 100;
        van.consPorKm = 0.2;
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        
        Carro fusca = new Carro();
        fusca.cor ="Azul";
        fusca.marca = "Volkswagen";
        fusca.modelo ="fusquinha";
        fusca.qtdPassageiro = 4;
        fusca.capTanque = 30;
        fusca.consPorKm = 0.15;
        
        System.out.println();
        
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
    }
}

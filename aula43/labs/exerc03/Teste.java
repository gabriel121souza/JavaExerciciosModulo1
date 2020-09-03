package com.gabriel.cursojava.aula43.labs.exerc03;

public class Teste {
	public static void main(String[] args) {
		System.out.println("ZOOLOGICO");
		System.out.println("------------------------");
		
		Peixe a1 = new Peixe();
		a1.setNome("Tubarão");
		a1.setCor("cinza");
		a1.setComprimento("20Metros");
		a1.setPatas(0);
		a1.setVelocidade("1.5 m/s");
		a1.setAmbiente("Mar");
		a1.setCaracteristica("Barbatanas e cauda");
		
		Animal a2 = new Animal();
		a2.setNome("Camelo");
		a2.setCor("Amarelo");
		a2.setComprimento("150CM");
		a2.setPatas(4);
		a2.setVelocidade("2.0 m/s");
		a2.setAmbiente("Terra");
		
		Mamifero a3 = new Mamifero();
		a3.setNome("urso-do-Canada");
		a3.setCor("Vermelho");
		a3.setComprimento("180CM");
		a3.setPatas(4);
		a3.setVelocidade("0.5 m/s");
		a3.setAmbiente("Terra");
		a3.setAlimento("MEL");
		
		Animal[] animals =new Animal[3];
		animals[0] = a1;
		animals[1] = a2;
		animals[2] = a3;
		
		for(Animal a : animals) {
			System.out.println(a.toString());
			System.out.println("\n-----------------------");
		}
		
	}
}

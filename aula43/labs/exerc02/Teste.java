package com.gabriel.cursojava.aula43.labs.exerc02;

public class Teste {
	public static void main(String[] args) {
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("contribuinte 01");
		p1.setRendaBruta(1000);
		p1.setCpf("615.257.350-55");
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("Contribuint 02");
		p2.setRendaBruta(5000);
		p2.setCnpj("66.298.310/0001-42");
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("contribuinte 03");
		p3.setRendaBruta(2000);
		p3.setCpf("742.287.710-33");
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("contribuinte 04");
		p4.setRendaBruta(3000);
		p4.setCnpj("66.298.310/0001-42");
		
		PessoaFisica p5 = new PessoaFisica();
		p5.setNome("Contribuinte 05");
		p5.setRendaBruta(3700);
		p5.setCpf("166.488.070-40");
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Contribuinte 06");
		p6.setRendaBruta(4000);
		p6.setCnpj("97.753.820/0001-96");
		
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0]=p1;
		contribuintes[1]=p2;
		contribuintes[2]=p3;
		contribuintes[3]=p4;
		contribuintes[4]=p5;
		contribuintes[5]=p6;
	
	
	for(Contribuinte c : contribuintes) {
		System.out.println(c.toString());
		}
	
	}
}

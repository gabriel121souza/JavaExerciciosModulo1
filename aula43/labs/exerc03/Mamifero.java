package com.gabriel.cursojava.aula43.labs.exerc03;

public class Mamifero extends Animal{
	private String alimento;

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	@Override
	public String toString() {
		String s = "Mamifero \n";
		s+= super.toString();
		s+= "\nAlimento: "+ alimento;
		return s;
	}
	
}

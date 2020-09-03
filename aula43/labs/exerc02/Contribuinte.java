package com.gabriel.cursojava.aula43.labs.exerc02;

public  abstract class Contribuinte {
	private String nome;
	private double rendaBruta;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	public abstract double calculaImposto();
	@Override
	public String toString() {
		String s = "Contribuinte";
		s+= "Nome: "+nome;
		s+= "\nrendaBruta: " + rendaBruta;
		return s;
	}
	
	
}

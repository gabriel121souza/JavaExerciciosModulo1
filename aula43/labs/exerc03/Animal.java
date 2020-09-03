package com.gabriel.cursojava.aula43.labs.exerc03;

public class Animal {
	private String nome;
	private String comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private String velocidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getComprimento() {
		return comprimento;
	}
	public void setComprimento(String comprimento) {
		this.comprimento = comprimento;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public String getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}
	@Override
	public String toString() {
		String s = "Animal: ";
		s+= "\nNome: "+ nome;
		s+= "\nComprimento: "+ comprimento;
		s+= "\nPatas: " + patas;
		s+= "\nCor: " + cor;
		s+= "\nAmbiente: "+ ambiente;
		s+= "\nVelocidade: "+ velocidade;
		return s;
	}
	
	
	
}

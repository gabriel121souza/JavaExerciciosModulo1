package com.gabriel.cursojava.aula42;

public class Aluno {

	private String curso;
	private double[] notas;

	
	public Aluno() {
		super();
	
	}
	
	public Aluno(String nome, String endereco, String telefone) {
		//super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	public boolean verificarAprovado() {
		return true;
	}
	public void metodoQualquer() {
		
	}
	public String obterEtiquetaEndereco() {
		String s = "o endereco do aluno: ";
		//s += super.getEndereco();
		return s;
	}

	//@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println(obterEtiquetaEndereco());
	}
}
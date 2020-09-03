package com.gabriel.cursojava.aula36.labs;

public class Aluno {
	//declarando variaveis do aluno
	private String nome;
	private String matricula;
	//um aluno pode ter muitas notas
	private double[] nota;
	
	//construtor
	public Aluno() {}
	
	//encapsulamento dos getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double[] getNota() {
		return nota;
	}
	public void setNota(double[] nota) {
		this.nota = nota;
	}
	
	//metodo para obter as informacoes do aluno
	public String obterInfo() {
		//mostrar informacao colocando tudo dentro da variavel info usando +=
		String info = "\n Nome Aluno= "+nome + ";";
				info +="Matricula= "+matricula + ";";
				info += "Notas: ";
				 //declarando e iniciando a variavel soma para fazer a media
				double soma = 0;
				//for melhorado para inserir as notas na variavel info e depois tirar a media
				for(double notas : nota) {
					//inserindo notas em varivel soma
					soma+= notas;
					//mostrando as notas 
					info += notas + " ";

				}
				//fazendo a media 
				double media = soma/4;
				//mostrando media
				info+= "\n"+ "Media = " + media+ "--";
				//verificar se a nota e maior ou igual a 7 para decidir se e aprovado ou reprovado
				if(media >=7) {
					info += "aprovado";
				}else {
					info += "reprovado";
				}
				//retornando info depois de ter inserido tudo na variavel info
				return info;
	}
	//metodo para obter media
	public double obterMedia() {
		double soma =0;
		for(double notas : nota) {
			soma+= notas;
		}
		return soma;
	}
	
}

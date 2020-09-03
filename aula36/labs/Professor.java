package com.gabriel.cursojava.aula36.labs;

public class Professor {
	
	//declarando  as variaveis do professor
	private String nome;
	private String departamento;
	private String email;
	
	//criando o construtor
	public Professor() {}
	
	//encapsulando o objeto com
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//metodo para obter as informacoes do professor
	public String obterInfo() {
		return "Professor = "+nome;
	}
}

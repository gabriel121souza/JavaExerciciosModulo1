package com.gabriel.cursojava.aula40;

public class Professor extends Pessoa {
	private String nome;
	private String telefone;
	private String cpf;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String obterEtiquetaEndereco() {
		String s = "o endereco do professor: ";
		s += super.getEndereco();
		return s;
	}
	
}

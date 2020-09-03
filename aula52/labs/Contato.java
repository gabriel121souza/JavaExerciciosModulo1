package com.gabriel.cursojava.aula52.labs;

public class Contato {
	private int id;
	private String nome;
	private String telefone;
	private String email;
	
	private static int contador;

	public Contato() {
		contador++;
		id = contador;
	}
	
	public int getId() {
		return id;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		String s = "[";
			s+= " id: "+ id;
			s+= ", nome :"+nome;
			s+= ", telefone: " + telefone;
			s+= ", email: " + email;
			s+=" ]";
		return s;
	}
	
	
}

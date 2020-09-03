package com.gabriel.cursojava.aula52.labs;

import java.util.Arrays;

public class Agenda {
	private Contato[] contatos;
	public Agenda() {
		contatos = new Contato[5];
	}
	
	public void adicionarContato(Contato c) throws AgendaCheiaException {
		boolean cheia = true;
		
		for(int i=0; i<contatos.length; i++) {
			if(contatos[i] == null) {
				contatos[i] = c;
				cheia = false;
				break;
			}
		}
		if(cheia) {
			//exception agenda cheia
			throw new AgendaCheiaException();
		}
		
	}
	
	public int consultarContatoPorNome(String nome) throws ContatoNaoExisteException {
		for(Contato c : contatos ) {
			if(c !=null) {
				if(c.getNome().equalsIgnoreCase(nome)) {
				return c.getId();	
					}
			}
		}
		//lancar a exception nao existe
		throw new ContatoNaoExisteException(nome);
	}
	
	
	@Override
	public String toString() {
		String s="";
		for(Contato c : contatos) {
			if(c != null) {
				s+= c.toString() + "\n";

			}
		}
		return s;
	}
	
}

package com.gabriel.cursojava.aula36.labs;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		
		System.out.println("Entre com o nome da agenda");
		String nome = sc.nextLine();
		//Agenda agenda = new Agenda(nome);
		agenda.setNome(nome);
		
		Contato[] contatos = new Contato[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("Entre com as informacoes do contato " + (i+1));
			Contato c = new Contato();
			
			System.out.println("entre com o nome: ");
			nome = sc.nextLine();
			c.setNome(nome);
			
			System.out.println("entre com o telefone: ");
			String telefone = sc.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("entre com email: ");
			String email = sc.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;
		}
		agenda.setContatos(contatos);
		
		agenda.setContatos(contatos);
		
		if(agenda != null) {
			System.out.println(agenda.obterInfo());
		}
	}

}

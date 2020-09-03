package com.gabriel.cursojava.aula52.labs;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		//importando as ferramenta e classes
		Scanner sc = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		//opcao inicializa como valor 1
		int opcao = 1;
		//enquanto o valor for diferente execute
		while(opcao!=3) {
			//mostre o menu
			opcao = obterOpcaoMenu(sc);

			//se for igual a 1
		if(opcao ==1) {
			
			//Consulta o contato
			consultarContato(sc, agenda);
			//se for igual a 2
		}else if(opcao==2) {
			//adicionar contato
			adicionarContato(sc, agenda);
		}
		}
	}
	// metodo de consultar o contanto
	public static void consultarContato(Scanner sc, Agenda agenda) {
		//nome contato receber as informacoes do lerInformacoes 
		String nomeContato = lerInformacaoString(sc, "entre com o nome do usuarios para ser pesquisado: ");
		try {
			if(agenda.consultarContatoPorNome(nomeContato)>=0) {
				System.out.println(" contato existe");
			}
		}catch(ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	//metodo adicionar o contato
	
	public static void adicionarContato(Scanner sc, Agenda agenda) {
		try {
		System.out.println("Criando o contato entre com as informacoes: ");
		String nome = lerInformacaoString(sc, "entre com o nome do contato: ");
		String telefone = lerInformacaoString(sc, "entre com o telefone: ");
		String email = lerInformacaoString(sc, "entre com o email: ");
		
		//criando o objeto passando os parementro que pegamos acima
		Contato contato = new  Contato();
		contato.setNome(nome);
		contato.setTelefone(telefone);
		contato.setEmail(email);
		
		System.out.println("contato criado");
		System.out.println(contato);
		
		//adicionando o contato na agenda
		agenda.adicionarContato(contato);
		
		//tratando a exception
		}catch(AgendaCheiaException e) {
			System.out.println(e.getMessage());
			System.out.println("Contatos da agenda ");
			System.out.println(agenda);
		}
		
	}
	//metodo para ler informacoes
	public static String lerInformacaoString(Scanner sc, String msg) {
		//moste msg
		System.out.println(msg);
		//entrada recebe a msg
		String entrada = sc.nextLine();
		return entrada;
	}
	//metodo de obter opcao menu
	public static int obterOpcaoMenu(Scanner sc) {
		//flag iniciando com o valor false
		boolean entradaValida = false;
		//opcao comeca com valor 3
		int opcao =3;
		//coletar dados para o menu
		while(!entradaValida) {
		System.out.println("Digite a opcao desejada");
		System.out.println("Digite (1) Consultar Contato");
		System.out.println("Digite (2) Criar Contato");
		System.out.println("Digite (3) Sair");
		
		
		try {
			String entrada= sc.nextLine();
			//mudando o valor de String para int
			opcao = Integer.parseInt(entrada);
			//se qualquer uns desses botoes for selecionado mude para true a flag
			if(opcao ==1 || opcao ==2 || opcao==3) {
				entradaValida = true;
				
			}else {
				entradaValida = false;
				throw new Exception("Entrada invalida");
			}
		}catch(Exception e) {
			System.out.println("entrada invalida digite novamente\n");
		}
		}
		return opcao;
	}
}

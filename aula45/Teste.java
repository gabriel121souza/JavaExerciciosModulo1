package com.gabriel.cursojava.aula45;

public class Teste {
	public static void main(String[] args) {

		/*
		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno;//upcasting
		
		Pessoa aluno2 = (Pessoa) new Aluno(); //upcasting
		
		Pessoa aluno3 = new Pessoa();
		Aluno aluno4 = (Aluno) aluno3;
		*/
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		if(pessoa instanceof Pessoa) {
			System.out.println("e do tipo Pessoa");
		}
		
		if(aluno instanceof Aluno) {
			System.out.println("e do tipo aluno");
		}
		if(professor instanceof Pessoa) {
			System.out.println("e do tipo professor");
		}
			
	}

}

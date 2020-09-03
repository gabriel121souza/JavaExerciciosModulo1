package com.gabriel.cursojava.aula36.labs;

import java.util.Scanner;

public class Exerc02 {
	public static void main(String[] args) {
		
		//ferramenta para pegar a entrada do teclado
		Scanner sc = new Scanner(System.in);
		//coletando as informacoes do curso
		System.out.println("entre com o nome do curso: ");
		String nomeCurso = sc.nextLine();
		
		System.out.println("entre com o horario do Curso: ");
		String horarioCurso = sc.nextLine();
		//importando a classe Curso 
		Curso curso = new Curso();
		//setando os valores do teclado no objeto curso
		curso.setNome(nomeCurso);
		curso.setHorario(horarioCurso);
		
		//coletando as informacoes do professor
		System.out.println("nome do professor: ");
		String nomeProfessor = sc.nextLine();
		
		System.out.println("nome do departamento do professor: ");
		String depProfessor = sc.nextLine();
		
		System.out.println("email do Professor: ");
		String emailProfessor = sc.nextLine();
		
		//importando a classe Professor
		Professor professor = new Professor();
	
		//setando valores do teclado no objeto Professor
		professor.setNome(nomeProfessor);
		professor.setDepartamento(depProfessor);
		professor.setEmail(emailProfessor);
		
		curso.setProfessor(professor);
		
		//declarando o array para fazer o relacionamento de um para muitos
		Aluno[] alunos = new Aluno[5];
		//for para coleta as informacoes do aluno que e um vetor
		for(int i=0; i<5; i++) {
			//um path para corrigir
			sc.nextLine();
			//coletando as informacoes do aluno
			System.out.println("entre com o nome do aluno " + (i+1)+" :");
			String nomeAluno = sc.nextLine();
			
			System.out.println("entre com a matricula do aluno");
			String matAluno = sc.nextLine();
			//declarando os arrays de notas para coletar as 4 notas de cada aluno
			double[] notaAluno = new double[4];
			
			//for para coletar as notas do aluno
			for(int j=0; j<4; j++) {
				//coletando as notas do aluno
				System.out.println("entre com a nota"+ (j+1)+" :");
				notaAluno[j] = sc.nextDouble();
			//fechando o for	
			}
			// importando a classe  Aluno
			Aluno aluno = new Aluno();
			//setando os valores coletados para o objeto aluno 
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNota(notaAluno);
			//adicionando  os alunos na variavel aluno
			alunos[i] = aluno;
			
		}
		//setando as informacoes do alunos na classe curso
			curso.setAlunos(alunos);
			//mostrando informacoes do curso alunos e professor
			System.out.println(curso.obterInfo());
			
		}
	}

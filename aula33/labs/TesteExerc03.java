package com.gabriel.cursojava.aula33.labs;

import java.util.Scanner;

public class TesteExerc03 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Aluno aluno = new Aluno();
	
		System.out.print("entre com o nome do aluno: ");
		String nomeAluno = sc.nextLine();
		aluno.setNome(nomeAluno);
		
		System.out.println("entre com a matricula");
		String matriculaAluno = sc.nextLine();
		aluno.setMatricula(matriculaAluno);
		
		System.out.println("entre com o nome do curso");
		String nomeCurso = sc.nextLine();
		aluno.setNomeCurso(nomeCurso);
		aluno.adcionarDisciplina();
		aluno.adcionarNota();	
		aluno.mostrarInfo();
		
	}
}

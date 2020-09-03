package com.gabriel.cursojava.aula33.labs;

import java.util.Scanner;

public class Aluno {
	Scanner sc = new Scanner(System.in);
	
	private String nome;
	private String matricula;
	private String nomeCurso;
	private String[] nomeDisciplinas = new String[3];
	double [][] notasDisciplinas = new double [3][4];
	
	public Aluno() {
		nomeDisciplinas = new String[3];
		notasDisciplinas = new double[3][4];
		
	}
	public Aluno(String nome, String matricula, String nomeCurso) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.nomeDisciplinas = new String[3];
		this.notasDisciplinas = new double[3][4];
	
	}
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
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String[] getNomeDisciplinas() {
		return nomeDisciplinas;
	}
	public void setNomeDisciplinas(String[] nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}
	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}
	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}
	
	
	
	public void adcionarDisciplina() {
		for(int i = 0; i< getNomeDisciplinas().length; i++) {
			System.out.println("entre com a disciplina "+ i);
			this.nomeDisciplinas[i] = sc.next();
		}
	}
	public void adcionarNota() {
		for(int i=0; i<notasDisciplinas.length; i++) {
			for(int j=0; j<notasDisciplinas[i].length; j++) {
				System.out.println("entre com a nota da disciplina "+ nomeDisciplinas[i]);
				notasDisciplinas[i][j] = sc.nextDouble();
			}
		}
			}

	public void mostrarInfo() {
		System.out.println("Nome: "+ nome);
		System.out.println("matricula: " + matricula);
		System.out.println("nome curso: "+ nomeCurso);
		
		for(int i=0; i<nomeDisciplinas.length; i++) {
			System.out.println("nome das disciplinas: "+ nomeDisciplinas[i]);
		}
		
		for(int i=0; i<notasDisciplinas.length; i++) {
			System.out.println("notas da disciplina " + nomeDisciplinas[i]);
			for(int j=0; j<notasDisciplinas[i].length; j++) {
				System.out.println(notasDisciplinas[i][j]+ " ");
			}
			System.out.println();
		}
	}
}

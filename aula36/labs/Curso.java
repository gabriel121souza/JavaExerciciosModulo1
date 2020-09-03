package com.gabriel.cursojava.aula36.labs;

public class Curso {
	//declarando as variaveis 1 pra 1
	private String nome;
	private String horario;
	private Professor professor;
	
	//declarado a variavel muitos para muitos
	private Aluno[] alunos;
	
	//construtor da classe
	public Curso() {}

	//encapsulando os modos 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	//mostra as informacoes do aluno
	public String obterInfo() {
		//declarando as informacao para colocar dentro da variavel info
		String info = "Nome do Curso = " + nome +"\n";
		//se profesor nao for vazio 
		if(professor != null) {
			//adicione a variavel info as informacaoes do professor
			info+= professor.obterInfo();
		}
		//se aluno nao for vazio
		if(alunos != null) {
			System.out.println("----Alunos----");
			//for melhorado para mostrar o array alunos e suas informacoes
			for(Aluno aluno : alunos) {
				//se aluno for diferente de vazio
				if(aluno != null) {
					//adicione a variavel info as informacoes do aluno
				info += aluno.obterInfo();
				info+= "\n";
				}
			}
			//adicionando a variavel info as medias da turma
			info += "\nMedia da turma = " + obterMediaTurma();
		}
		//retornando as informacoes de tudo que foi declarado
		return info;
	}
	//Calcular a media da turma
	public double obterMediaTurma() {
		//iniciando  a variavel soma ;
		double  soma = 0;
		//for melhorado para pegar todas as notas dos alunos
		for(Aluno aluno : alunos) {
			//se aluno NAO for vazio 
			if(aluno != null) {
				//adicione as notas na varivel soma
			soma += aluno.obterMedia();
		}
		}
		//calculando a media e retornando;
		return soma/alunos.length;
	}
	
	
}

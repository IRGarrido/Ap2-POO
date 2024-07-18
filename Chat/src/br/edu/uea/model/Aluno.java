package br.edu.uea.model;

public class Aluno extends Usuario{

	private String ingresso;
	
	public Aluno(String login, int senha, String ingresso) {
		super(login, senha);
		this.ingresso = ingresso;
	}

	public String getIngresso() {
		return ingresso;
	}

	public void setIngresso(String ingresso) {
		this.ingresso = ingresso;
	}
	
}

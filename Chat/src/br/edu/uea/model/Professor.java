package br.edu.uea.model;

public class Professor extends Usuario{

//	Atributos
	private String titulacao;
	
	public Professor(String login, int senha, String titulacao) {
		super(login, senha);
		this.titulacao = titulacao;
	}
	
	
//	Getters e Setters
	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	

}

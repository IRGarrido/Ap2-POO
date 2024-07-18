package br.edu.uea.model;

public abstract class Usuario {

//	Atributos
	private String login;
	private int senha;
	private boolean conectado;

	public Usuario() {
		this.conectado = false;
	}

	public Usuario(String login, int senha) {
		this.login = login;
		this.senha = senha;
		this.conectado = false;
	}
	
//	Metodos
	public boolean login(String login, int senha) {
		if (login.equals(this.getLogin()) && senha == this.getSenha()) {
			return true;
		}
		return false;
	}
	
	public String status() {
		if (this.isConectado()) return "Online";
		return "Offline";
	}
	
//	Getters e Setters
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean isConectado() {
		return conectado;
	}

	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}
	
	
	
}

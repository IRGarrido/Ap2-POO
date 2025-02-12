package br.edu.uea.control;

import java.util.ArrayList;

import br.edu.uea.model.Aluno;

public class AlunoControl {

	private ArrayList<Aluno> listagemAlunos = new ArrayList<Aluno>();

	public Aluno buscar(String login) {
		for (Aluno aluno : listagemAlunos) {
			if (aluno.getLogin().equals(login)) {
				return aluno;
			}
		}
		return null;
	}
	
	public boolean cadastrar(Aluno aluno) {
		if (buscar(aluno.getLogin()) == null) {
			listagemAlunos.add(aluno);
			return true;
		}
		return false;
	}
	
	public String listarAlunos() {
		String aux = "";
		for (Aluno aluno : listagemAlunos) {
			aux = aux + aluno.getLogin() + " - " + aluno.getIngresso() + " - " +aluno.status() + "\n";
		}
		return aux;
	}
	
	public ArrayList<Aluno> getListagemAlunos() {
		return listagemAlunos;
	}

	public void setListagemAlunos(ArrayList<Aluno> listagemAlunos) {
		this.listagemAlunos = listagemAlunos;
	}
	
	
}

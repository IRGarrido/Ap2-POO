package br.edu.uea.control;

import java.util.ArrayList;

import br.edu.uea.model.Professor;

public class ProfessorControl {

	private ArrayList<Professor> listagemProfessores= new ArrayList<Professor>();

	public Professor buscar(String login) {
		for (Professor professor: listagemProfessores) {
			if (professor.getLogin().equals(login)) {
				return professor;
			}
		}
		return null;
	}
	
	public boolean cadastrar(Professor professor) {
		if (buscar(professor.getLogin()) == null) {
			listagemProfessores.add(professor);
			return true;
		}
		return false;
	}
	
	public String listarProfessores() {
		String aux = "";
		for (Professor professor: listagemProfessores) {
			aux = aux + professor.getLogin() + " - " + professor.getTitulacao() + " - "+ professor.status() + "\n";
		}
		return aux;
	}
	
	public ArrayList<Professor> getListagemProfessores() {
		return listagemProfessores;
	}

	public void setListagemProfesssores(ArrayList<Professor> listagemProfessores) {
		this.listagemProfessores = listagemProfessores;
	}
	
}

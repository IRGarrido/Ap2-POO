package br.edu.uea.control;

import java.util.ArrayList;

import br.edu.uea.model.Tecnico;

public class TecnicoControl {

	private ArrayList<Tecnico> listagemTecnicos= new ArrayList<Tecnico>();

	public Tecnico buscar(String login) {
		for (Tecnico tecnico: listagemTecnicos) {
			if (tecnico.getLogin().equals(login)) {
				return tecnico;
			}
		}
		return null;
	}
	
	public boolean cadastrar(Tecnico tecnico) {
		if (buscar(tecnico.getLogin()) == null) {
			listagemTecnicos.add(tecnico);
			return true;
		}
		return false;
	}
	
	public String listarTecnico() {
		String aux = "";
		for (Tecnico tecnico: listagemTecnicos) {
			aux = aux + tecnico.getLogin() + " - " + tecnico.status() + "\n";
		}
		return aux;
	}
	
	public ArrayList<Tecnico> getListagemTecnicos() {
		return listagemTecnicos;
	}

	public void setListagemTecnicos(ArrayList<Tecnico> listagemProfessores) {
		this.listagemTecnicos = listagemProfessores;
	}
	
	
}

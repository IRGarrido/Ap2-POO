package br.edu.uea.test;

import br.edu.uea.control.ProfessorControl;
import br.edu.uea.model.Professor;

public class ProfessorTest {

	public static void main(String[] args) {
		ProfessorControl pc = new ProfessorControl();
		Professor p1 = new Professor("Cuevas", 1234, "Mestre");
		Professor p2 = new Professor("Palheta", 2345, "Doutor");
		
		if(pc.cadastrar(p1)) System.out.println(p1.getLogin() + " cadastrado com sucesso");
		if(pc.cadastrar(p2)) System.out.println(p2.getLogin() + " cadastrado com sucesso");
		
		System.out.println();
		
		System.out.println(pc.listarProfessores());
	}
}

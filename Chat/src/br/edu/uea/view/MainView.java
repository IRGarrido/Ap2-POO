package br.edu.uea.view;

import javax.swing.JOptionPane;

public class MainView {
	
	public static void main(String[] args) {
		JOptionPane.showConfirmDialog(null, "Bem vindo ao ChatgpTU, onde você que dá as respostas", "ChatgpTU", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
		
		Object [] options = {"Cliente", "Servidor", "Sair"};
		JOptionPane.showOptionDialog(null, "Login", "ChatgpTU", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		
	}
}

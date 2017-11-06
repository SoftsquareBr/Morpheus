package br.com.test;

import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 * ********************************
 * @Author Sergio Cordeiro da Silva
 * @Projeto Mopheus
 * @Data 05/11/2017
 * @Email: softsquare.br@gmail.com
 * ********************************
 */

/**
 * @Title
 * @Briefing
 *
 */
public class Main {
	// log.debug("Hello this is a debug message");
	// log.info("Hello this is an info message");

	static Logger log = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		// log.debug("");
		log.info("Classe Main Carregada");
		String nome;
		JOptionPane.showMessageDialog(null, "Seja bem vindo");
		JOptionPane.showMessageDialog(null, "Meu nome Morpheu");
		JOptionPane.showMessageDialog(null, "Qual e o seu nome");
		nome = JOptionPane.showInputDialog("Diga seu nome");
		JOptionPane.showMessageDialog(null, nome + "Em que posso lhe ajudar");

	}

}

package br.com.inteligencia.test;


/**
 * ********************************
 * @author Sergio Cordeiro da Silva
 * @projeto Mopheus
 * @data 05/11/2017
 * @email: softsquare.br@gmail.com
 * ********************************
 */

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		System.out.println("inicio");
		String proposito;

		proposito = JOptionPane.showInputDialog("EM QUE POSSO LHE SERVIR");
		// busca
		
		// Resposta logica com retorno da pergunta
		JOptionPane.showMessageDialog(null,proposito);		

	}

}

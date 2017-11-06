package br.com.inteligencia.vetores;

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
public class ControleDeBusca {

	public boolean encontrarPalavra(String[] vetor, String palavra) {
		for (String p : vetor) {
			if (p.contains(palavra))
				return true;
		}

		return false;
	}

}

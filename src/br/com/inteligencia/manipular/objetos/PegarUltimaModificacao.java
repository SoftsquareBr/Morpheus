package br.com.inteligencia.manipular.objetos;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;

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
public class PegarUltimaModificacao {
	static Logger log = Logger.getLogger(PegarUltimaModificacao.class
			.getName());

	public static void main(String[] args) {
		File file = new File("C:\\Cordeiro\\Morpheus\\criacao\\Arquivo.txt");

		System.out.println("Before Format : " + file.lastModified());

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

		System.out.println("After Format : " + sdf.format(file.lastModified()));
	}
}

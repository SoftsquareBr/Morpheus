package br.com.inteligencia.manipular.objetos;

import java.io.File;
import java.io.IOException;
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
public class CaminhoAbsolutoArquivo {
	static Logger log = Logger
			.getLogger(CaminhoAbsolutoArquivo.class.getName());

	public static void main(String[] args) {
		try {

			File temp = File.createTempFile("i-am-a-temp-file", ".tmp");

			String absolutePath = temp.getAbsolutePath();
			System.out.println("File path : " + absolutePath);

			String filePath = absolutePath.substring(0,
					absolutePath.lastIndexOf(File.separator));

			System.out.println("File path : " + filePath);

		} catch (IOException e) {

			e.printStackTrace();

		}

	}
}
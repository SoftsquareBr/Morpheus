package br.com.inteligencia.manipular.objetos;

import java.io.File;
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
public class MoverArquivo {
	static Logger log = Logger.getLogger(MoverArquivo.class.getName());

	public static void main(String[] args) {
		try {

			File afile = new File("C:\\Cordeiro\\Morpheus\\criacao\\Arquivo.txt");

			if (afile.renameTo(new File("C:\\folderB\\" + afile.getName()))) {
				System.out.println("File is moved successful!");
			} else {
				System.out.println("File is failed to move!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
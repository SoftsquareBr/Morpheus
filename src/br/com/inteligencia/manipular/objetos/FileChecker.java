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
public class FileChecker {
	static Logger log = Logger.getLogger(FileChecker.class.getName());

	public static void main(String args[]) {

		File f = new File("c:\\mkyong.txt");

		if (f.exists()) {
			System.out.println("File existed");
		} else {
			System.out.println("File not found!");
		}

	}

}

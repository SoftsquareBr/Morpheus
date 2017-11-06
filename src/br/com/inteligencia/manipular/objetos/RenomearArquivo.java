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
public class RenomearArquivo

{
	static Logger log = Logger.getLogger(RenomearArquivo.class.getName());

	public static void main(String[] args) {

		File oldfile = new File("C:\\Cordeiro\\Morpheus\\criacao\\oldfile.txt");
		File newfile = new File("C:\\Cordeiro\\Morpheus\\criacao\\newfile.txt");

		if (oldfile.renameTo(newfile)) {
			System.out.println("Rename succesfull");
		} else {
			System.out.println("Rename failed");
		}

	}
}

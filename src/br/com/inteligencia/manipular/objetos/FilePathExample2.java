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
public class FilePathExample2 {
	static Logger log = Logger.getLogger(FilePathExample2.class.getName());

	public static void main(String[] args) {
		try {

			String filename = "newFile.txt";
			String workingDirectory = System.getProperty("user.dir");

			// ****************//

			File file = new File(workingDirectory, filename);

			// ****************//

			System.out.println("Final filepath : " + file.getAbsolutePath());
			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File is already existed!");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

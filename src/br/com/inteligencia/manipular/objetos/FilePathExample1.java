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
public class FilePathExample1 {
	static Logger log = Logger.getLogger(FilePathExample1.class.getName());

	public static void main(String[] args) {
		try {

			String filename = "newFile.txt";
			String workingDirectory = System.getProperty("user.dir");

			// ****************//

			String absoluteFilePath = "";

			// absoluteFilePath = workingDirectory +
			// System.getProperty("file.separator") + filename;
			absoluteFilePath = workingDirectory + File.separator + filename;

			System.out.println("Final filepath : " + absoluteFilePath);

			// ****************//

			File file = new File(absoluteFilePath);

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

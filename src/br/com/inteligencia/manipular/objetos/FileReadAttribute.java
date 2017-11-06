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
public class FileReadAttribute {
	static Logger log = Logger.getLogger(FileReadAttribute.class.getName());

	public static void main(String[] args) throws IOException {
		File file = new File("c:/file.txt");

		// mark this file as read only, since jdk 1.2
		file.setReadOnly();

		if (file.canWrite()) {
			System.out.println("This file is writable");
		} else {
			System.out.println("This file is read only");
		}

		// revert the operation, mark this file as writable, since jdk 1.6
		file.setWritable(true);

		if (file.canWrite()) {
			System.out.println("This file is writable");
		} else {
			System.out.println("This file is read only");
		}
	}
}

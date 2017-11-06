package br.com.inteligencia.manipular.objetos;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public class CriarArquivo {
	static Logger log = Logger.getLogger(CriarArquivo.class.getName());
	public static void main(String[] args) {
		try {

			File file = new File("c:\\newfile.txt");

			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

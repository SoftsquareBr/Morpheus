package br.com.inteligencia.manipular.objetos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class ReadFileExample2 {
	static Logger log = Logger.getLogger(ReadFileExample2.class.getName());

	private static final String FILENAME = "E:\\test\\filename.txt";

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

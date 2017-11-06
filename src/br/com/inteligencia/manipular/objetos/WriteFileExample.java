package br.com.inteligencia.manipular.objetos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class WriteFileExample {
	static Logger log = Logger.getLogger(WriteFileExample.class.getName());
	public static void main(String[] args) {

		File file = new File("c:/newfile.txt");
		String content = "This is the text content";

		try (FileOutputStream fop = new FileOutputStream(file)) {

			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			// get the content in bytes
			byte[] contentInBytes = content.getBytes();

			fop.write(contentInBytes);
			fop.flush();
			fop.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
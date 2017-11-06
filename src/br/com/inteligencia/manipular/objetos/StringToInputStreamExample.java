package br.com.inteligencia.manipular.objetos;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class StringToInputStreamExample {
	static Logger log = Logger.getLogger(StringToInputStreamExample.class.getName());
	public static void main(String[] args) throws IOException {
		String str = "This is a String ~ GoGoGo";

		// convert String into InputStream
		InputStream is = new ByteArrayInputStream(str.getBytes());

		// read it with BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(is));

		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		br.close();
	}
}
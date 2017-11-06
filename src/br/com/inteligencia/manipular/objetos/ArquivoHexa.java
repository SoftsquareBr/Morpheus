package br.com.inteligencia.manipular.objetos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
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
public class ArquivoHexa {
	static Logger log = Logger.getLogger(ArquivoHexa.class.getName());

	public static void convertToHex(PrintStream out, File file)
			throws IOException {
		InputStream is = new FileInputStream(file);

		int bytesCounter = 0;
		int value = 0;
		StringBuilder sbHex = new StringBuilder();
		StringBuilder sbText = new StringBuilder();
		StringBuilder sbResult = new StringBuilder();

		while ((value = is.read()) != -1) {
			// convert to hex value with "X" formatter
			sbHex.append(String.format("%02X ", value));

			// If the chracater is not convertable, just print a dot symbol "."
			if (!Character.isISOControl(value)) {
				sbText.append((char) value);
			} else {
				sbText.append(".");
			}

			// if 16 bytes are read, reset the counter,
			// clear the StringBuilder for formatting purpose only.
			if (bytesCounter == 15) {
				sbResult.append(sbHex).append("      ").append(sbText)
						.append("\n");
				sbHex.setLength(0);
				sbText.setLength(0);
				bytesCounter = 0;
			} else {
				bytesCounter++;
			}
		}

		// if still got content
		if (bytesCounter != 0) {
			// add spaces more formatting purpose only
			for (; bytesCounter < 16; bytesCounter++) {
				// 1 character 3 spaces
				sbHex.append("   ");
			}
			sbResult.append(sbHex).append("      ").append(sbText).append("\n");
		}

		out.print(sbResult);
		is.close();
	}

	public static void main(String[] args) throws IOException {
		// display output to console
		convertToHex(System.out, new File("c:/file.txt"));

		// write the output into a file
		convertToHex(new PrintStream("c:/file.hex"), new File("c:/file.txt"));
	}
}
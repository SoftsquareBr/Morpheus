package br.com.inteligencia.manipular.objetos;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class EscolheUltimaModificacaoArquivo {
	static Logger log = Logger.getLogger(EscolheUltimaModificacaoArquivo.class
			.getName());

	public static void main(String[] args) {

		try {

			File file = new File("C:\\Cordeiro\\logfile.log");

			// print the original last modified date
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			System.out.println("Original Last Modified Date : "
					+ sdf.format(file.lastModified()));

			// set this date
			String newLastModified = "01/31/1998";

			// need convert the above date to milliseconds in long value
			Date newDate = sdf.parse(newLastModified);
			file.setLastModified(newDate.getTime());

			// print the latest last modified date
			System.out.println("Lastest Last Modified Date : "
					+ sdf.format(file.lastModified()));

		} catch (ParseException e) {

			e.printStackTrace();

		}

	}
}

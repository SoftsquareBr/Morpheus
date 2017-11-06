package br.com.inteligencia.vida;

import java.util.UUID;
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
public class DNA {
	// log.debug("Hello this is a debug message");
	// log.info("Hello this is an info message");
	static Logger log = Logger.getLogger(DNA.class.getName());

	static String uniqueID = UUID.randomUUID().toString();

	public static void main(String[] args) {
		System.out.println(uniqueID);
	}

}

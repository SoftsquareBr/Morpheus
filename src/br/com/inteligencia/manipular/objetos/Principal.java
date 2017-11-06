package br.com.inteligencia.manipular.objetos;

import java.io.DataInputStream;
import java.io.FileInputStream;
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
public class Principal {
	static Logger log = Logger.getLogger(Principal.class.getName());

	public static void main(String args[]) {

		try {

			DataInputStream dis = new DataInputStream(new FileInputStream(
					"C:\\Cordeiro\\Morpheus\\criacao\\Arquivo.txt"));

			byte[] datainBytes = new byte[dis.available()];
			dis.readFully(datainBytes);
			dis.close();

			String content = new String(datainBytes, 0, datainBytes.length);

			System.out.println(content);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
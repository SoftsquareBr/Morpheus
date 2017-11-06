package br.com.inteligencia.manipular.objetos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
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
public class PegarUltimoCriado {
	static Logger log = Logger.getLogger(PegarUltimoCriado.class
			.getName());

	public static void main(String[] args) {

		try {

			Process proc = Runtime.getRuntime().exec(
					"cmd /c dir c:\\logfile.log /tc");

			BufferedReader br = new BufferedReader(new InputStreamReader(
					proc.getInputStream()));

			String data = "";

			// it's quite stupid but work
			for (int i = 0; i < 6; i++) {
				data = br.readLine();
			}

			System.out.println("Extracted value : " + data);

			// split by space
			StringTokenizer st = new StringTokenizer(data);
			String date = st.nextToken();// Get date
			String time = st.nextToken();// Get time

			System.out.println("Creation Date  : " + date);
			System.out.println("Creation Time  : " + time);

		} catch (IOException e) {

			e.printStackTrace();

		}

	}
}
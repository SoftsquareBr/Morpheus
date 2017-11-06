package br.com.inteligencia.calculos;

import java.util.Scanner;
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
public class Media {
	static Logger log = Logger.getLogger(Media.class.getName());

	// log.debug("Hello this is a debug message");
	// log.info("Hello this is an info message");
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int nota1, nota2, nota3;
		int media, i, contAluno = 0;

		for (i = 0; i < 3; i++) {

			contAluno++;
			// recebe a 1º nota
			System.out.println("Aluno " + contAluno + ", digite sua 1ª nota");
			nota1 = ent.nextInt();

			// recebe a 2º nota
			System.out.println("Aluno " + contAluno + ", digite sua 2ª nota");
			nota2 = ent.nextInt();

			// recebe a 3º nota
			System.out.println("Aluno " + contAluno + ", digite sua 3ª nota");
			nota3 = ent.nextInt();

			// calcula a média
			media = (nota1 + nota2 + nota3) / 3;
			System.out.println("A média do aluno " + contAluno + " é " + media);

			// mostra a nota do aluno
			if ((media >= 0) && (media < 4)) {
				System.out.println("Nota E");
			} else if (media < 5) {
				System.out.println("Nota D");
			} else if (media < 7) {
				System.out.println("Nota C");
			} else if (media < 8) {
				System.out.println("Nota B");
			} else if (media <= 10) {
				System.out.println("Nota A");
			}
		}
	}
}
package br.com.morpheus.voz;

import java.io.*;
import java.util.Locale;
import javax.speech.*;
import javax.speech.recognition.*;

public class Reconhecimento_exemplo4 {
	static RuleGrammar testeGrammar;
	static Recognizer recognizer;

	static ResultListener ruleListener = new ResultAdapter() {
		public void resultAccepted(ResultEvent e) {
			try {
				FinalRuleResult result = (FinalRuleResult) e.getSource();
				String tags[] = result.getTags();
				StringBuffer SB_comando = new StringBuffer();
				System.out.println("Say how are you doing ? -> to know about the computer");
				System.out.println("Say bye -> to finish the application");
				try {
					Locale.setDefault(new Locale("en", "US"));
					recognizer = Central.createRecognizer(null);
					recognizer.allocate();
					Reader reader = new FileReader("teste.gram");
					testeGrammar = recognizer.loadJSGF(reader);
					testeGrammar.addResultListener(ruleListener);
					testeGrammar.setEnabled(true);
					recognizer.commitChanges();
					recognizer.resume();
				} catch (Exception e2) {
					e2.printStackTrace();
					System.exit(-1);
				} finally {

				}

			} catch (Exception e1) {
				e1.printStackTrace();
				System.exit(-1);
			} finally {

			}

		}
	};
}

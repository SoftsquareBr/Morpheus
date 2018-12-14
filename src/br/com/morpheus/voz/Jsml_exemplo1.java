package br.com.morpheus.voz;

import java.io.File;
import java.util.Locale;

import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;

class Jsml_exemplo1 {
	static Synthesizer synthesizer;

	public static void main(String args[]) {
		try {
			Locale.setDefault(new Locale("en", "US"));
			synthesizer = Central.createSynthesizer(null);
			synthesizer.allocate();

			// ==============The 4 ways of synthesize voice======================

			// example of method speak(URL object, SpeakableListener object)
			// refer to file ./jsml_exemplo1.jsml
			synthesizer.speak(new File("jsml_exemplo1.jsml").toURL(), null);

			// ==================================================================
		} catch (Exception e) {
			System.out.println("Error message: " + e.toString());
		}
	}
}

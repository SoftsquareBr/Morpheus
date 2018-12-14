package br.com.morpheus.voz;

import javax.speech.recognition.*;
import javax.speech.*;
import java.util.Locale;

public class Reconhecimento_exemplo3 {

	static Recognizer recognizer;

	public static void main(String args[]) {
		try {
			// define a SynthesizerModeDesc that supports north american English, was
			// written by IBM
			// and works in the mode "Continuous General Dictation"
			RecognizerModeDesc recognizerModeDescTeste = new RecognizerModeDesc("IBM", "Continuous General Dictation",
					new Locale("en", "US"), null, null, null);

			// criate an instance
			recognizer = Central.createRecognizer(recognizerModeDescTeste);

			// make it work
			recognizer.allocate();

			// verify the parameters of the created synthesizer
			verificaParametros();
		} catch (Exception e) {
			System.out.println("Error message: " + e.toString());
		}
	}
	
	// metodo que acessa as caracteristicas do sintetizador e as imprime na tela
	static public void verificaParametros()
	      
	      {
	         RecognizerModeDesc recognizerModeDescTemp = (RecognizerModeDesc)recognizer.getEngineModeDesc();
	         System.out.println("Engine name: "+recognizerModeDescTemp.getEngineName());
	         System.out.println("Working mode name: "+recognizerModeDescTemp.getModeName());
	      	System.out.println("Locale name: "+recognizerModeDescTemp.getLocale().toString());
	      		//verifica a flag de controle
	         if(recognizerModeDescTemp.getRunning()!=null)
	            if(recognizerModeDescTemp.getRunning().booleanValue())
	               System.out.println("Engine running.");
	            else
	               System.out.println("Engine stopped.");
	         else
	            System.out.println("A flag de controle não foi setada e tem valor nulo.");
	      		//mostra os SpeakerProfiles suportados, isto e, os perfis de usuario
	         SpeakerProfile[] speakerProfileTemp = recognizerModeDescTemp.getSpeakerProfiles();

	      }


	}



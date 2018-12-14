package br.com.morpheus.voz;

import javax.speech.synthesis.*;
import javax.speech.*;
import java.util.Locale;

class Synthesizer_example5{
    static Synthesizer synthesizer;

    //listener in charge of catching the synthesizer events 
    static SpeakableListener speakableListenerOuvidor_do_Sintetizador = 
        new SpeakableAdapter() {
            public void wordStarted(SpeakableEvent speakableEventEvento) {
                System.out.println("Event caught by the synthesizer listener.");
                System.out.println(speakableEventEvento.getText());
            }
        };
		
    //listener in charge of catching the method speak events
    static SpeakableListener speakableListenerOuvidor_do_Metodo_Speak = 
        new SpeakableAdapter() {
            public void wordStarted(SpeakableEvent speakableEventEvento) {
                System.out.println("Event caught by the listener of the speakEvent method.");
		System.out.println(speakableEventEvento.getText());
            }
        };

    public static void main(String args[]){
        try{
            Locale.setDefault(new Locale("en","US"));
            synthesizer = Central.createSynthesizer(null);

            //associate the listener with the synthesizer
            synthesizer.addSpeakableListener(speakableListenerOuvidor_do_Sintetizador);
            synthesizer.allocate();

            //associte the listener with the method speak, the
            //synthesizer already has its own listener
            synthesizer.speak("Hi master",speakableListenerOuvidor_do_Metodo_Speak);
        }
        catch(Exception e){
            System.out.println("Error message: "+e.toString());
        }
    }
}
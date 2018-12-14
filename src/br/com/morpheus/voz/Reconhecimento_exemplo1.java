package br.com.morpheus.voz;
import java.util.Locale;

import javax.speech.Central;
import javax.speech.recognition.Recognizer;

public class Reconhecimento_exemplo1 {
    static Recognizer recognizer;        
    
    public static void main(String args[]) {
        try {
            Locale.setDefault(new Locale("en","US"));
            recognizer = Central.createRecognizer(null);
            recognizer.allocate();         
        }
        catch (Exception e) {
            e.printStackTrace();               
        }
    }
}
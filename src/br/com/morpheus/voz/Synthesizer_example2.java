package br.com.morpheus.voz;

import javax.speech.synthesis.*;
import javax.speech.*;
import java.util.Locale;

class Synthesizer_example2{
    static Synthesizer synthesizer;   

    public static void main(String args[]){
        try{
            //define a locale
            Locale.setDefault(new Locale("en","US"));

            //instanciates a synthesizer that supports the standard locale
            synthesizer = Central.createSynthesizer(null);

            //Run it
            synthesizer.allocate();
        }
        catch(Exception e){
            System.out.println("Error message:: "+e.toString());
        }
    }
}
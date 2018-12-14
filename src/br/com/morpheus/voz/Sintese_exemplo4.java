package br.com.morpheus.voz;

import javax.speech.synthesis.*;
import javax.speech.*;
import java.util.Locale;
import java.net.URL;
import java.io.File;

class Sintese_exemplo4{
    static Synthesizer synthesizer;

    public static void main(String args[]){
        try{
            Locale.setDefault(new Locale("en","EN"));
            synthesizer = Central.createSynthesizer(null);
            synthesizer.allocate();
         	
            //====================THE 4 WAYS TO SYNTHESIZE VOICE==========================
         	
            //example of method speakPlainText(String object, SpeakableListener object)
            synthesizer.speakPlainText("This is a Plain Text sample: Hi master",null);
         	
            //example of method speak(Speakable object, SpeakableListener object)
	    //refer to implementation of the class speakableFrame at the end of the file
            speakableFrame SP_Frame = new speakableFrame();		
            synthesizer.speak(SP_Frame,null);
				
            //example of method speak(URL object, SpeakableListener object)
            //refer to file ./sintese_exemplo5.jsml
            synthesizer.speak(new File("sintese_exemplo5.jsml").toURL(),null);

            //example of method speak(String JSML, SpeakableListener object);
            synthesizer.speak("<PROS RANGE=\"-50%\"VOL=\"+15%\">This is a <EMP>JSML sample: HiMaster!</EMP></PROS>",null);
         
            //==============================================================================         
        }
        catch(Exception e){
            System.out.println("Error message: "+e.toString());
        }
    }
}


class speakableFrame extends java.awt.Frame implements javax.speech.synthesis.Speakable {

    public String getJSMLText() {
        return("<PROS RANGE=\"-100%\"> This is a frame that mightbe spoken.</PROS>");
    }
}
package br.com.inteligencia.manipular.objetos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.logging.Logger;

public class App{
	static Logger log = Logger.getLogger(App.class.getName());
	public static void main (String args[]) {

	try{

	         DataInputStream dis =
		    new DataInputStream (
		    	 new FileInputStream ("c:\\logging.log"));

		 byte[] datainBytes = new byte[dis.available()];
		 dis.readFully(datainBytes);
		 dis.close();

		 String content = new String(datainBytes, 0, datainBytes.length);

		 System.out.println(content);

	}catch(Exception ex){
		ex.printStackTrace();
	}

  }
}
package br.com.inteligencia.manipular.objetos;

import java.io.File;
import java.util.logging.Logger;

public class FileChecker {
	static Logger log = Logger.getLogger(FileChecker.class.getName());

  public static void main(String args[]) {

	  File f = new File("c:\\mkyong.txt");

	  if(f.exists()){
		  System.out.println("File existed");
	  }else{
		  System.out.println("File not found!");
	  }

  }

}

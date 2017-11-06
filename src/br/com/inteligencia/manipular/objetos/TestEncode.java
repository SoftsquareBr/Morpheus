package br.com.inteligencia.manipular.objetos;


	import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.logging.Logger;

	public class TestEncode {
		static Logger log = Logger.getLogger(TestEncode.class.getName());
		public static void main(String[] args){

		  try {
			File fileDir = new File("c:\\temp\\test.txt");
				
			Writer out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(fileDir), "UTF8"));

			out.append("Website UTF-8").append("\r\n");
			out.append("?? UTF-8").append("\r\n");
			out.append("??????? UTF-8").append("\r\n");
			
			out.flush();
			out.close();
		        
		    } 
		   catch (UnsupportedEncodingException e) 
		   {
			System.out.println(e.getMessage());
		   } 
		   catch (IOException e) 
		   {
			System.out.println(e.getMessage());
		    }
		   catch (Exception e)
		   {
			System.out.println(e.getMessage());
		   } 
		}	
	}

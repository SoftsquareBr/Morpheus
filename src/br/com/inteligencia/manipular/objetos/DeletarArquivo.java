package br.com.inteligencia.manipular.objetos;

import java.io.File;
import java.util.logging.Logger;

public class DeletarArquivo
{
	static Logger log = Logger.getLogger(DeletarArquivo.class.getName());
    public static void main(String[] args)
    {
    	try{

    		File file = new File("c:\\logfile20100131.log");

    		if(file.delete()){
    			System.out.println(file.getName() + " is deleted!");
    		}else{
    			System.out.println("Delete operation is failed.");
    		}

    	}catch(Exception e){

    		e.printStackTrace();

    	}

    }
}
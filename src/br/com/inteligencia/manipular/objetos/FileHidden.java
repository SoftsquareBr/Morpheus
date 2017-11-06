package br.com.inteligencia.manipular.objetos;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public class FileHidden
{
	static Logger log = Logger.getLogger(FileHidden.class.getName());

    public static void main(String[] args) throws IOException
    {
    	File file = new File("c:/hidden-file.txt");

    	if(file.isHidden()){
    		System.out.println("This file is hidden");
    	}else{
    		System.out.println("This file is not hidden");
    	}
    }
}
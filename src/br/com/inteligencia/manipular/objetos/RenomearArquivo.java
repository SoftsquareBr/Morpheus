package br.com.inteligencia.manipular.objetos;

import java.io.File;
import java.util.logging.Logger;

public class RenomearArquivo

{
	static Logger log = Logger.getLogger(RenomearArquivo.class.getName());
    public static void main(String[] args)
    {

		File oldfile =new File("oldfile.txt");
		File newfile =new File("newfile.txt");

		if(oldfile.renameTo(newfile)){
			System.out.println("Rename succesful");
		}else{
			System.out.println("Rename failed");
		}

    }
}

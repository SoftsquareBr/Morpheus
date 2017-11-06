package br.com.inteligencia.manipular.objetos;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;

public class GetFileLastModifiedExample
{
	static Logger log = Logger.getLogger(GetFileLastModifiedExample.class.getName());
    public static void main(String[] args)
    {
	File file = new File("c:\\logfile.log");

	System.out.println("Before Format : " + file.lastModified());

	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

	System.out.println("After Format : " + sdf.format(file.lastModified()));
    }
}

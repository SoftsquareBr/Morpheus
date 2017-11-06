package br.com.inteligencia.manipular.objetos;

import java.io.File;
import java.io.FilenameFilter;
import java.util.logging.Logger;

/**
 * ********************************
 * @Author Sergio Cordeiro da Silva
 * @Projeto Mopheus
 * @Data 05/11/2017
 * @Email: softsquare.br@gmail.com
 * ********************************
 */

/**
 * @Title
 * @Briefing
 *
 */
public class ChecarArquivo3 {
	static Logger log = Logger.getLogger(ChecarArquivo3.class.getName());
	private static final String FILE_DIR = "c:\\folder";
	private static final String FILE_TEXT_EXT = ".txt";

	public static void main(String args[]) {
		new ChecarArquivo3().deleteFile(FILE_DIR, FILE_TEXT_EXT);
	}

	public void deleteFile(String folder, String ext) {

		GenericExtFilter filter = new GenericExtFilter(ext);
		File dir = new File(folder);

		// list out all the file name with .txt extension
		String[] list = dir.list(filter);

		if (list.length == 0)
			return;

		File fileDelete;

		for (String file : list) {
			String temp = new StringBuffer(FILE_DIR).append(File.separator)
					.append(file).toString();
			fileDelete = new File(temp);
			boolean isdeleted = fileDelete.delete();
			System.out.println("file : " + temp + " is deleted : " + isdeleted);
		}
	}

	// inner class, generic extension filter
	public class GenericExtFilter implements FilenameFilter {

		private String ext;

		public GenericExtFilter(String ext) {
			this.ext = ext;
		}

		public boolean accept(File dir, String name) {
			return (name.endsWith(ext));
		}
	}
}
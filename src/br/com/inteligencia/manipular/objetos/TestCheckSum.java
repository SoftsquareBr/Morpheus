package br.com.inteligencia.manipular.objetos;

import java.io.FileInputStream;
import java.security.MessageDigest;
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
public class TestCheckSum {
	static Logger log = Logger.getLogger(TestCheckSum.class.getName());

	public static void main(String args[]) throws Exception {

		String datafile = "c:\\INSTLOG.TXT";

		MessageDigest md = MessageDigest.getInstance("SHA1");
		FileInputStream fis = new FileInputStream(datafile);
		byte[] dataBytes = new byte[1024];

		int nread = 0;

		while ((nread = fis.read(dataBytes)) != -1) {
			md.update(dataBytes, 0, nread);
		}
		;

		byte[] mdbytes = md.digest();

		// convert the byte to hex format
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < mdbytes.length; i++) {
			sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16)
					.substring(1));
		}

		System.out.println("Digest(in hex format):: " + sb.toString());

	}
}

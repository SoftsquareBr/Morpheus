package br.com.inteligencia.vetores;

public class ControleDeBusca {
	
	
	public boolean encontrarPalavra(String[] vetor, String palavra)
	{
	   for(String p : vetor)
	   {
	       if(p.contains(palavra))
	         return true;
	   }

	   return false;
	}

}

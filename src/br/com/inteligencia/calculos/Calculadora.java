package br.com.inteligencia.calculos;

import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Calculadora {
//  log.debug("Hello this is a debug message");
//  log.info("Hello this is an info message");
	static Logger log = Logger.getLogger(Calculadora.class.getName());
	   public static void main(String[] args) {
	      
	      String numA = JOptionPane.showInputDialog(null, "Digite o primeiro número:");
	      String numB = JOptionPane.showInputDialog(null, "Digite o segundo número:");
	      //transfomando os Strings em Inteiros
	      double a = Double.parseDouble(numA);
	      double b = Double.parseDouble(numB);
	      //calculando
	      double soma = a + b;
	      double sub = a - b;
	      double mult = a * b;
	      double div = a / b;
	      //mostrando o resultado das quatro operações básicas
	      JOptionPane.showMessageDialog(null,
	            "Soma: " + soma + "\n" +
	            "Subtração: " + sub + "\n" +
	            "Multiplicação: " + mult + "\n" +
	            "Divisão: " + div
	      );
	   }
	}
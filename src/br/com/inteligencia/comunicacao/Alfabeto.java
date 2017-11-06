package br.com.inteligencia.comunicacao;

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
public enum Alfabeto {

	A(1), B(2), C(3), D(4), E(5), F(6), G(7), H(8), I(9), J(10), K(11), L(12), M(
			13), N(14), O(15), P(16), Q(17), R(18), S(19), T(20), U(21), V(22), X(
			23), Z(24), Y(25), W(26);

	private final int valor;

	Alfabeto(int idLetra) {
		valor = idLetra;
	}

	public int getValor() {
		return valor;
	}

}

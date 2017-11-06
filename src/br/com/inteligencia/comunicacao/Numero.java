package br.com.inteligencia.comunicacao;

public enum Numero {
	
	NUM1(1), NUM2 (2),NUM3(3),NUM4(4),NUM5(5),NUM6(6),NUM7(7),NUM8(8),NUM9(9),NUM0(0);
    private final int valor;
    Numero(int idNumero){
        valor = idNumero;
    }
    public int getValor(){
        return valor;
    }


}

package Aula_2308;

public class Caixa extends CaixaEletronico {//BANCO Caixa Economica Federal
	//metodo
	@Override//sobrescrita de metodo
	public void sacar(double valor) {
		valor = valor + 0.9;//taxa cobrada pela transação
		System.out.println("O seu saque no Caixa foi = " + valor);
}
}
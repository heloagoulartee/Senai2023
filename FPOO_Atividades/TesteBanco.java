package Aula_2308;

public class TesteBanco {

	public static void main(String[] args) {
		//instancia de objetos
		CaixaEletronico cel = new CaixaEletronico();
		cel.sacar(150);
		
		Caixa cx = new Caixa();
		cx.sacar(150);
		
		Santander san = new Santander();
		san.sacar(150);
		

	}

}

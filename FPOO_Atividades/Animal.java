package Aula_2308;

public class Animal {//classe pai (Super Classe)
	//atributos
	public String nome = "Frajola";
	//metodo construtor
	public Animal(){
		super();
		System.out.println("OBJETO Animal acabou de nascer ! ");
	}
	//metodos
	public void som() {
		System.out.println("\n Som da classe animal");
	}
	public void brincar() {
		System.out.println("\n Brincando...");
	}
	public void som1() {
		System.out.println("\n Som1 da classe animal");
	}
}//fim classe

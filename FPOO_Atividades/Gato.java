package Aula_2308;

public class Gato extends Animal {// herança (extends)
	//atributos
	public String raca;
	public float peso;
	public int idade;
	//metodo construtor
	public Gato() {
		super();
		System.out.println("Acabei de nascer e sou um Gato " + "Sem caracteristcas");
	}
	public Gato(String raca) {//metodo construtor com parâmetros
		super();
		this.raca = raca;
		System.out.println("\nAcabei de nascer e sou um gato " + "da raca " + this.raca);
	}
	public Gato(float peso, int idade) {
		super();
		this.peso = peso;
		this.idade = idade;
		System.out.println("\nAcabei de nascer e sou um Gato " + "com " + this.peso + "kg" + " e " + this.idade + " anos de idade");
		
	}
	//metodos
	public void som() {
		System.out.println("Som da classe Gato");
		super.som();//som da classe Animal
	}
}

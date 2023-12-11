package Aula_2308;

public class Gato1 extends Animal1 {
	//atributos
	
	//metodo construtor
	public Gato1(String nome){
		super(nome);//pegando atributo nome da super classe Animal1
	}
	@Override
	public void emitirSom() {
		System.out.println("O gato esta miando... ");
	}
}

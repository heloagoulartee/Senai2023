package Aula_2308;

public class Animal1 {//classe pai (Super Classe)
	//atributos
	private String nome;
	//metodo construtor
	public Animal1(String nome){
		this.nome = nome;
		
	}
	public void emitirSom() {
		System.out.println("O animal esta fazendo um som");
	}
	//metodos get and set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}

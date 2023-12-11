package atividade_heloa_goularte;

public class visitante {
	//atributos
	private String nome;
	private int idade;
	private double altura;
		
	public visitante(String nome, int idade, float altura) {
		this.nome=nome;
	}
	//métodos especiais
	public String getNome() {
		System.out.println("Digite o seu nome:" + nome);
		return nome;
	}		
	public void setNome (String nome) {
	    this.nome = nome;
	}
	public int getIdade() {
		System.out.println("Digite a sua idade:" + idade);
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		System.out.println("Digite a sua altura:" + altura);
		return altura;
	}
	public void setAltura(double altura) {
	    this.altura = altura;
	}
		 
	//metodo pode andar no brinquedo
	public boolean podeAndarNoBrinquedo(int idade, double altura) {
	    if (idade >= 10 && altura >= 1.3) {
	    	System.out.println("Não pode andar no brinquedo");
	      return true;
	    } else { System.out.println("Pode andar no brinquedo");
	      return false;
	 }
}   
	 //método para exibir informações do visitante
	 public void exibirInfo() {
	     System.out.println("Nome:" + nome);
	     System.out.println("Idade:" + idade);
	     System.out.println("Altura:" + altura);
	}
}



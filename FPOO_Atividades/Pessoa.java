package atividade_heloa_goularte;

public abstract class Pessoa {
	//atributos
	private String nome;
	private String endereco;
	private int telefone;
	private int cpf;
	private int celular;
	
	//metodos construtores	
	public Pessoa(String nome,String endereco, int telefone, int cpf, int celular) {
	}
	
	//metodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco=endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone=telefone;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf=cpf;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular=celular;
	}
	
	
	
	
	
	
	
}

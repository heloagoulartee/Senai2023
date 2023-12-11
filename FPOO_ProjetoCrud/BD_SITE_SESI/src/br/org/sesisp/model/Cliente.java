package br.org.sesisp.model;

public class Cliente {
	//atributos 
	private int senha;
	private String nome;
	private String calendario;
	private String evento;
	
	//construtor padrao
	public Cliente() {
		
	}
	
	//metodo get e set
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public  String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCalendario() {
		return calendario;
	}

	public void setCalendario(String calendario) {
		this.calendario = calendario;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}
}

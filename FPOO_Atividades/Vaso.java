package atividade_heloa_goularte;

import java.util.Scanner;

public class Vaso {
	Scanner entrada = new Scanner(System.in); //entrada é o obj
	
	//atributos da classe Vaso
	private String cor;
	private double tamanho;
	private String material;
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public void exibirVaso1() {
		System.out.println("o Vaso 1 tem a cor:" + cor + "\n" +"o seu tamanho é:" + tamanho + "\n" + "o seu material é:" + material);
	}
}

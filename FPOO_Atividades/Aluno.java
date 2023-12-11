package atividade_heloa_goularte;

import java.util.Scanner;

public class Aluno extends TesteHeranca{
	//atributos
	private String curso;
	private float nota;
	
	//metodos construtores	
	public Aluno(String curso,float nota) {
		super();
		this.curso = curso;
		this.nota = nota;
	}
		
	//metodos
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso=curso;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(Float nota) {
		this.nota=nota;
	}
	
	//metodo especial
	public void calcularMedia(){
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite a quantidade de notas que voce deseja escrever:");
		double notas = entrada.nextInt();
		double soma = 0;
		double [] vetor = new double [(int) notas];
		for(int i=0; i < notas; i++) {
			System.out.println("Digite a nota:");
			int nota = entrada.nextInt();
			vetor[i]= nota;
			soma = soma + vetor[i];
		}
		media = soma/notas;
		System.out.println("a media é igual a:" + media);
		
	}
	public void situacaoFinal(){
		if(soma >=07) {
            System.out.println("voce foi aprovado");
            notas = entrada.nextInt();
            return true;
        }else {
            if(soma <= 6)
            System.out.println("voce foi reprovado");
            notas = entrada.nextInt();
            return false;
         }
    }
}

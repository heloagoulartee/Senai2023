package atividade_heloa_goularte;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int soma = 0;
		
		System.out.println("digite uma sequencia de numeros positivos (digite um numero menor que zero ou zero para parar):)");
		
		while (true) {
			 int numero = scanner.nextInt();
			 
			 if (numero <=0) {
				 break;
			 }
			 soma += numero;
		}
		System.out.println("a soma dos numeros positivo digitados é:" + soma);
	}

}
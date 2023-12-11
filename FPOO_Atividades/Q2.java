package atividade_heloa_goularte;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int menornumero = Integer.MAX_VALUE;
				
				System.out.println("digite uma sequencia de numeros (digite zero para parar):");
		
		while (true) {
			int numero = scanner.nextInt();
			
			if (numero == 0) {
				break;
			}
			if  (numero < menornumero) {
				menornumero = numero;
			}
		}
		if (menornumero ==  Integer.MAX_VALUE) {
			System.out.println("nenhum numero f0i digitado");
		} else {
			System.out.println("o menor numero foi:" + menornumero);
		}

	}

}

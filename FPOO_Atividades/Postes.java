package atividade_heloa_goularte;

import java.util.Scanner;

public class Postes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva a quantidade de postes");
		int n = entrada.nextInt();
		int substituidos = 0;
		int concertados = 0;
		
		for (int i = 0; 1 < n; i++) {
			int x = entrada.nextInt();
			if(x < 50) {
				substituidos++;
			}
			if (50 <= x && x < 89) {
				concertados++;
			}
		}	
		System.out.println(substituidos + "----" + concertados);
	}
}


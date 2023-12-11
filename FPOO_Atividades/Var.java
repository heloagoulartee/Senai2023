package atividade_heloa_goularte;

import java.util.Scanner;

public class Var {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite a cordenada x:");
		int x = entrada.nextInt();
		
		System.out.println("Digite a cordenada y:");
		int y = entrada.nextInt();
		
		if(x < - 8 || x>8 || y <0 || y >8) {
			System.out.println("Esta fora");
		}else {
			System.out.println("Esta dentro");
		}
	}

}

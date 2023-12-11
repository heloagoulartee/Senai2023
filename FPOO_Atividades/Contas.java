package atividade_heloa_goularte;

import java.util.Scanner;

public class Contas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Valor disponivel na conta:");
		int v = entrada.nextInt(); // valor disponivel
		System.out.println("Valor disponivel do acougue:");
		int a = entrada.nextInt(); // valor da conta do açougue
		System.out.println("Valor disponivel da farmacia:");
		int f = entrada.nextInt(); // valor da conta da farmácia
		System.out.println("Valor disponivel da padaria:");
		int p = entrada.nextInt(); // valor da conta da padaria

		if (v > a || v > f || v > p) {
			
		}
		
	}

}

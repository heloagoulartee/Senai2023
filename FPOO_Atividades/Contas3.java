package atividade_heloa_goularte;

import java.util.Scanner;

public class Contas3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int v = entrada.nextInt(); // valor disponivel
		int a = entrada.nextInt(); // valor da conta do açougue
		int f = entrada.nextInt(); // valor da conta da farmácia
		int p = entrada.nextInt(); // valor da conta da padaria
		int resp = 0;
		int[] contas = {a,f,p};
		
		if(contas [0] + contas [1] + contas [2] <= v)
			resp= 3;
		else if (contas [0] + contas [1] <= v)
			resp = 2;
		else if (contas [0] <= v)
			resp = 1;
		else 
			resp= 0;
		
		System.out.printf("%d\n", resp);
		}

}

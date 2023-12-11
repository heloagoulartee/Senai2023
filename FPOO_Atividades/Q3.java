package atividade_heloa_goularte;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
			Scanner entrada = new Scanner (System.in);
			int naleatorio = (int) (Math.random() * 100) + 1;
			int tentativas;
			int contador = 0;
			System.out.println("Start...");
			do {
				System.out.println("Digite um numero de 1 a 30");
						tentativas = entrada.nextInt();
						contador++;
				if(tentativas < naleatorio)  {
					System.out.println("Digite um maior");
				} else if ( tentativas > naleatorio) {
				System.out.println("Digite um menor"); 
				} else {
					System.out.println("Acertou! Parabens!!");
				}
			} while ( tentativas != naleatorio);
			System.out.println("Volte sempre!!");
			
	}

}

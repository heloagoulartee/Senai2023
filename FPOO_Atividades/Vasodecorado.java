package atividade_heloa_goularte;

import java.util.Scanner;

public class Vasodecorado extends Vaso{

		Scanner entrada = new Scanner (System.in);
		private String decoracao;
		
		public String getDecoracao() {
			return decoracao;
		}
		public void setCor(String decoracao) {
			this.decoracao = decoracao;
			System.out.println("a decoracao do vaso é:");
			decoracao = entrada.nextLine();
		}
		public void exibirVaso1() {
			System.out.println("o vaso 1 tem a cor:" + super.getCor() + "\n" +"o seu tamanho é:" + super.getTamanho() + "\n" + "o seu material é:" 
		+ super.getMaterial()+ "\n" + "a decoração é:" + decoracao);
		}
	}

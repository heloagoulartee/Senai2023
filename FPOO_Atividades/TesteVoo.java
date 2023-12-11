package atividade_heloa_goularte;

	import java.util.Scanner;

		public class TesteVoo {
		public static void main(String[] args) {

			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite seu nome:");
			String varNome = entrada.next();

			System.out.println("Digite seu Sobrenome!");
			String varSobreNome = entrada.next();

			System.out.println("Digite seu email!");
			String varEmail = entrada.next();		
			Cliente cl1 = new Cliente(varNome, varSobreNome, varEmail);
			

			System.out.println("Digite qual o numero da sua passagem");
			String varNumeroVou = entrada.next();

			System.out.println("Digite qual a origem do seu voou ");
			String varOrigem = entrada.next();

			System.out.println("Digite qual o seu destino");
			String varDestino = entrada.next();

			System.out.println();
			double varPreco = 1600;
			System.out.println("O preco da viagem e:  " + varPreco);
			Voo v1 = new Voo(varNumeroVou, varOrigem, varDestino, varPreco);

		}
	}

	 

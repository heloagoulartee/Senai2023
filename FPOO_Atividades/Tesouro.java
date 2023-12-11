package atividade_heloa_goularte;

import java.util.Scanner;

public class Tesouro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Numero de moedas:");
		int moedas = entrada.nextInt();
		System.out.println("Numero de marinheiros:");
		int marinheiros = entrada.nextInt();
		marinheiros	= marinheiros +2;
		int divisao = moedas / marinheiros;
		int capitao = divisao * 2;
		System.out.println("Numero de moedas do capitão e:"+ capitao);
		System.out.println("Numero de moedas de cada marinheiro e:"+ divisao);
  }

}

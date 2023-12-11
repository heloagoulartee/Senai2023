package atividade_heloa_goularte;

import java.util.Scanner;

import aula_3008.Doce;
import aula_3008.Pao;
import aula_3008.Produto;

public class TesteBike {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		SpeedBike bs1 = new SpeedBike();
		MountainBike mb1 = new MountainBike();
		
		
		System.out.println("Quem vai dirigir o veiculo:");
		System.out.println("1->Josias");
		System.out.println("2->Opala");
		String p = entrada.next();
		System.out.println("Digite o que a pessoa vai fazer:");
		System.out.println("1->Acelerar");
		System.out.println("2->Freiar");
		System.out.println("3->Mudar a Marcha");
		String u = entrada.next();
		int a = 3;
		int b = 1;
		int c = 2;
		switch (a) {
		case 3:
			System.out.println("Voce mudou a marcha");
			String w = entrada.next();
			break;
		case 1:
			System.out.println("Seu veiculo esta acelerando");
			String q = entrada.next();
			break;
		case 2:
			System.out.println("Seu veiculo esta freiando");
			String i = entrada.next();
			break;
		}
	}
}



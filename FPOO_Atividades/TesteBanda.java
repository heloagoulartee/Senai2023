package atividade_heloa_goularte;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TesteBanda {

	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);

		Banda ba1 = new Banda();
		Banda ba2 = new Banda();
		Vocalista vn1 = new Vocalista();
		Vocalista vn2 = new Vocalista();
		Baixista bn3 = new Baixista();
		Baixista bn4 = new Baixista();
		Baterista mb5 = new Baterista();
		Baterista mb6= new Baterista();
		Guitarrista gu7 = new Guitarrista();
		Guitarrista gu8= new Guitarrista();
		List<MembroBanda> Bd = new ArrayList<MembroBanda>();

		Bd.add(vn1);
		Bd.add(vn2);
		Bd.add(bn3);
		Bd.add(bn4);
		Bd.add(mb5);
		Bd.add(mb6);
		Bd.add(gu7);
		Bd.add(gu8);

		System.out.println("Qual o Nome da Primeira Banda?");
		ba1.setNome(entrada.next());
		System.out.println("Qual o Nome da Segunda Banda?");
		ba2.setNome(entrada.next());
		System.out.println("Qual o nome do Vocalista da primiera Banda? ");
		vn1.setNome(entrada.next());
		System.out.println("Qual o nome do Vocalista da segunda Banda? ");
		vn2.setNome(entrada.next());
		System.out.println("Qual o nome do Baixista da primiera Banda? ");
		bn3.setNome(entrada.next());
		System.out.println("Qual o nome do Baixista da segunda Banda? ");
		bn4.setNome(entrada.next());
		System.out.println("Qual o nome do Baterista da primeira Banda? ");
		mb5.setNome(entrada.next());
		System.out.println("Qual o nome do Baterista da segunda Banda? ");
		mb6.setNome(entrada.next());
		System.out.println("Qual o nome do Guitarrista da primeira Banda? ");
		gu7.setNome(entrada.next());
		System.out.println("Qual o nome do Guitarrista da segunda Banda? ");
		gu8.setNome(entrada.next());
		ba1.RealizarShow();
		System.out.println("-------------------------------------------------------");
		System.out.println("As informacoes da primeira banda sao: " + ba1.getNome());
		System.out.println("Vocalista: " + vn1.getNome());
		System.out.println("Baixista: " + bn3.getNome());
		System.out.println("Baterista: " + mb5.getNome());
		System.out.println("Guitarrista: " + gu7.getNome());
		System.out.println("-------------------------------------------------------");
		System.out.println("As informacoes da segunda banda sao:: " + ba2.getNome());
		System.out.println("Vocalista: " + vn2.getNome());
		System.out.println("Baixista: " + bn4.getNome());
		System.out.println("Baterista: " + mb6.getNome());
		System.out.println("Guitarrista: " + gu8.getNome());








		}

	 

	}
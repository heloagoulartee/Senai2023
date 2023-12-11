package atividade_heloa_goularte;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;
		do {
			exibirMenu(); 
			opcao = entrada.nextInt();
			double resultado;
		    switch (opcao)	 {
		    	case 1:
		    		System.out.println("opcao adição");
		    		System.out.println("digite o 1° número");
		    		double num1 = entrada.nextDouble()
		    				System.out.println("digite o 2° número");
		    		double num2 = entrada.nextDouble()
		    				resultado = num1 + num2;
		    		System.out.println("resultado =" + resultado);
		    		break;	
		    	case 2:
		    		System.out.println("opcao subtração");
		    		System.out.println("digite o 1° número");
		    		double num1 = entrada.nextDouble()
		    				System.out.println("digite o 2° número");
		    		double num2 = entrada.nextDouble()
		    				resultado = num1 + num2;
		    		System.out.println("resultado =" - resultado);
		    		break;	
		    	case 3:
		    		System.out.println("opcao multiplicação");
		    		System.out.println("digite o 1° número");
		    		double num1 = entrada.nextDouble()
		    				System.out.println("digite o 2° número");
		    		double num2 = entrada.nextDouble()
		    				resultado = num1 + num2;
		    		System.out.println("resultado =" * resultado);
		    		break;	
		    	default:
		    		System.out.println("escolha as opcoes entre 1 a 3");	
		    		break;	
		    }		
		    System.out.println();
		    
		}while (opcao != 0);
	}
		public static void exibirMenu() {
		System.out.println("Selecione uma opcao");	
		System.out.println("1 - opcao 1");
		System.out.println("2 - opcao 2");
		System.out.println("3 - opcao 3");
		System.out.println("0 - SAIR");
		}
}

package atividade_heloa_goularte;

import java.util.Scanner;

public class Academiateste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
        Academia cl1 = new Academia();
        
        System.out.println("Digite seu cpf:");
        cl1.cpf = entrada.nextDouble();
        
        System.out.println("Digite seu nome:");
        cl1.nome = entrada.next();
        
        System.out.println("Digite seu telefone:");
        cl1.telefone = entrada.nextDouble();
        
        System.out.println("Digite sua idade:");
        cl1.idade = entrada.nextInt();
        
        System.out.println("Digite sua altura:");
        cl1.altura = entrada.nextDouble();
        
        System.out.println("Digite seu peso:");
        cl1.peso = entrada.nextDouble();
        
        System.out.println("Digite sua meta de peso:");
        cl1.metapeso = entrada.nextDouble();
        
        cl1.imc();
        cl1.metapeso();
        cl1.imprimir();

    }
}



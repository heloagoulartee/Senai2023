package atividade_heloa_goularte;

import java.util.Scanner;

public class TesteCasa {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner (System.in);
	    Comodo c1 = new Comodo();
	    Comodo c2 = new Comodo();
	    
	    Quarto q1 = new Quarto();
	    Quarto q2 = new Quarto();
	    
	    Sala s1 = new Sala();
	    Sala s2 = new Sala();
	    
	    Casa cs1 = new Casa();
	    Casa cs2 = new Casa();
	    
	    Casa cor1 = new Casa();
	    Casa cor2 = new Casa();
	    
	    System.out.println("Digite seu nome:");
	    String q = entrada.next();
	    System.out.println("A casa tem quantos comodos:");
	    String w = entrada.next();
	    System.out.println("A casa tem quantas camas:");
	    String j = entrada.next();
	    System.out.println("A casa tem quantas salas:");
	    String p = entrada.next();
	    System.out.println("A cor da casa e:");
	    String v = entrada.next();
	    System.out.println("A preco da casa e:");
	    String k = entrada.next();
	    System.out.println("-------------------------------------");
	    System.out.println("As informacoes da casa sao as seguintes:");
	    System.out.println("Comodos:" + c1.getnome());
	    System.out.println("Camas:" + q1.getnumeroCamas());
	    System.out.println("Salas:");
	    System.out.println("Metragem:");
	    System.out.println("Cor:");
	    System.out.println("-------------------------------------");	  
	}
}	
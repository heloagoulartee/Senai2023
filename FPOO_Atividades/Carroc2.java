package atividade_heloa_goularte;

import java.util.Scanner;

import aula_1408.Carro;

public class Carroc2 {
	    //instanciando objetos da classe carroc2
	    public static void main(String[] args) {
		Carro c1 = new Carro ();
		c1.modelo="Porche";
		System.out.println("o modelo e:"+ c1.modelo);
		c1.setPotencia(1800);
		System.out.println("o modelo e:"+ c1.getPotencia());
		c1.getAcelerar();
		c1.getFrear();
		
		Carro c2 = new Carro ("Toyota"); 
		Carro c3 = new Carro ("Civic", 200f);
		
		
		    }

	}



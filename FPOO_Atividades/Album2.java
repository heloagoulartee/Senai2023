package atividade_heloa_goularte;

import java.util.Scanner;

public class Album2 {

	public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);
		 int n = entrada.nextInt(); // espaços vazios do album
		 int m = entrada.nextInt(); // figurinhas ja compradas
		 Boolean []jatenho = new Boolean [n]; // true ou false
		 int x = 0; // figurinhas coladas	
		 //varrendo o vetor 
		 for (int i = 0; i < n; i++)
			 jatenho [i] = false;
		 //fig q ja temos
		 for (int i = 0; i < m; i++) {
			 x = entrada.nextInt();
			 jatenho[x] = true;
		 }
		 int repetidas = 0;
		 // vamos marcar as repetidas
		 for(int i = 0; i < n; i++)
			 if (jatenho[i])
				 repetidas = repetidas + 1; //ou repetidas++
		 // vamos contar as figurinhas repetidas 
		 System.out.println("quantidade de figurinhas repetidas:"+ (n - repetidas));
		 System.out.println("quantidade de figurinhas repetidas:"+ repetidas);
		 System.out.println("tamanho do album"+ n);
		 System.out.println("quantidade de figurinhas:"+ m);
	}

}
 
package atividade_heloa_goularte;

import java.util.Scanner;

public class Cinema {
	
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a idade da primeira amiga: ");
            int idadeAmiga1 = scanner.nextInt();
            
            System.out.print("Digite a idade da segunda amiga: ");
            int idadeAmiga2 = scanner.nextInt();
            int precoAmiga1 = calcularPrecoIngresso(idadeAmiga1);
            int precoAmiga2 = calcularPrecoIngresso(idadeAmiga2);
            int totalAPagar = precoAmiga1 + precoAmiga2;
            
            System.out.println("Total a ser pago pelos dois ingressos: " + totalAPagar + " reais");
            scanner.close();
        }
 
        public static int calcularPrecoIngresso(int idade) {
            if (idade <= 17) {
                return 15;
            } else if (idade >= 18 && idade <= 59) {
                return 30;
            } else { // idade >= 60
                return 20;

            }

    }

}
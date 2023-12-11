package br.org.sesisp.view;
 
import br.org.sesisp.dao.CrudDAO;
import br.org.sesisp.model.Cliente;

import java.util.Scanner;
import javax.swing.JOptionPane;
 
public class ProjetoSesi {
 
    public static void main(String[] args) {
        // Instanciar um objeto da classe CrudDAO
        CrudDAO inserirCliente = new CrudDAO();
        // Instanciar um objeto aluno
        Cliente cliente1 = new Cliente();
        Scanner entrada = new Scanner(System.in);
 
        JOptionPane.showMessageDialog(null, "Bem Vindo(a) ao nosso Site Sesi!");
 
        int opcaoDados;
        do {
        	// Login
        	cliente1.setNome(JOptionPane.showInputDialog("Informe Seu Nome: "));
        	cliente1.setSenha(Integer.parseInt(JOptionPane.showInputDialog("Informe sua senha: ")));
            inserirCliente.create(cliente1);
            JOptionPane.showMessageDialog(null, "Você Logou no site!");

            String opcao = JOptionPane.showInputDialog("O que você quer fazer?\n1 - Inscrição para torneio \n2 - Cardápio Digital\n3 - Visualizar o Calendário de Eventos\n0 - Encerrar");
            opcaoDados = Integer.parseInt(opcao);
 
            switch (opcaoDados) {
                case 1:
                	//Inscrição para torneio
                	cliente1.setNome(JOptionPane.showInputDialog("Insira o seu nome: "));
                	String escolher = JOptionPane.showInputDialog("Escolha um dos torneios para fazer inscrição:\n1 - Olimpíada de Linguagens\n2 - Canguru da Matemática\n3 - Olimpíada de Biologia\n4 - OBMEP");

                	
                	if (escolher != null) {
                	    int opcaotorneio = Integer.parseInt(escolher);

                	    switch (opcaotorneio) {
                	        case 1:
                	            JOptionPane.showMessageDialog(null, "Você se inscreveu na Olimpíada de Linguagens.");
                	            break;
                	        case 2:
                	            JOptionPane.showMessageDialog(null, "Você se inscreveu no Canguru da Matemática.");
                	            break;
                	        case 3:
                	            JOptionPane.showMessageDialog(null, "Você se inscreveu na Olimpíada de Biologia.");
                	            break;
                	        case 4:
                	            JOptionPane.showMessageDialog(null, "Você se inscreveu na OBMEP.");
                	            break;
                	        default:
                	            JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.");
                	    }
                	} else {
                	    JOptionPane.showMessageDialog(null, "Escolha cancelada ou inválida.");
                	}
                	break;
                case 2:
                    // Cardápio Digital
                    JOptionPane.showMessageDialog(null, "Lista do Cardápio Semanal: \n -Leite com Chocolate \n -Maçã \n -Pão de Forma com Mortadela \n -Pão de batata com requeijão \n -Suco de Laranja");
                   
                    break;
                case 3:
                    // Visualizar o Calendário de Eventos
                    JOptionPane.showMessageDialog(null, "Lista de Eventos do Mês: \n 2-Finados \n 12-Reunião de Pais \n 15-Proclamação da Republica \n 20-Consciência Negra");
               
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "O programa encerrou!");
                    break;
            }
        } while (opcaoDados != 0);
    }
}
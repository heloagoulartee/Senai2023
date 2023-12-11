package atividade_heloa_goularte;

public class testeparque {
	private static final String Scanner = null;
	public static void exibirMenu1() {
		System.out.println("Escoha entre as opções a seguir:");
		System.out.println("1-Visitante");
		System.out.println("2-Brinquedos");
		System.out.println("3-Sair");
	}
	
	public static void exibirMenu2() {
		System.out.println("1-Visitante 1");
		System.out.println("2-Visitante 2");
		System.out.println("3-Sair");
	}
	
	public static void exibirMenu3() {
		System.out.println("1-Vizualizar");
		System.out.println("2-Modificar");
		System.out.println("3-Sair");
	}
	public static void main(String[] args) {
		visitante v1 = new visitante ("heloa", 16,1.70f);
		visitante v2 = new visitante ("lavinia", 15,1.60f);
		Scanner entrada = new Scanner (System.in);
		int opcao;
		
		exibirMenu1();
	        brinquedo br = new brinquedo("Roda Gigante",1.60f,20);
	        brinquedo br2 = new brinquedo("Carrinho Bate-Bate",1.150f,25);

	        Scanner entrada = new Scanner (System.in);
	        int opcao;
	            exibirMenu1();
	            opcao = entrada.nextInt();
	            switch (opcao) {
	            case 0:
	                System.out.println("Voce saiu");
	                break;
	            case 1:
	                int opcao2;
	                exibirMenu2();
	                opcao2 = entrada.nextInt();
	                switch (opcao2) {
	                case 0:
	                    System.out.println("Voce saiu");
	                    break;
	                case 1:
	                    int opcao3;
	                    exibirMenu3();
	                    opcao3 = entrada.nextInt();
	                    switch (opcao3) {
	                    case 0:
	                        System.out.println("Voce saiu");
	                        return;
	                    case 1:
	                        v1.getNome();
	                        v1.getIdade();
	                        v1.getAltura();
	                        return;
	                    case 2:
	                        v1.setNome(null);
	                        v1.setIdade(0);
	                        v1.setAltura(0);
	                        return;
	                    default:
	                    System.out.println("Escolha alguma opcao");
	                        break;
	                    }
	                    break;
	                case 2:
	                    int opcao4;
	                    exibirMenu3();
	                    opcao3 = entrada.nextInt();
	                    switch (opcao3) {
	                    case 0:
	                        System.out.println("Voce saiu");
	                        return;
	                    case 1:
	                        v2.getNome();
	                        v2.getIdade();
	                        v2.getAltura();
	                        return;
	                    case 2:
	                        v2.setNome(null);
	                        v2.setIdade(0);
	                        v2.setAltura(0);
	                        return;
	                default:
	                System.out.println("Escolha alguma opcao");
	                    break;
	                }
	            }
	                break;
	            case 2:
	                int opcao5;
	                exibirMenu3();
	                opcao5 = entrada.nextInt();
	                switch (opcao5) {
	                case 0:
	                    System.out.println("Voce saiu");
	                    return;
	                case 1:
	                    br.getNome();
	                    br.getAlturaMinima();
	                    br.getCapacidadeMaxima();
	                    return;
	                case 2:
	                    br2.getNome();
	                    br2.getAlturaMinima();
	                    br2.getCapacidadeMaxima();
	                    return;
	            default:
	            System.out.println("Escolha alguma opcao");
	                break;
	            }
	                break;
	            default:
	            System.out.println("Escolha alguma opcao");
	                break;
	            }
	        }
       }
	}
	}




package atividade_heloa_goularte;

public class Academia {
		//atributos
		public double cpf;
	    public String nome ;
	    public double telefone;
	    public int idade;
	    public double altura;
	    public double peso;
	    public double metapeso;
	    public double imc;
	    public double imprimir;
	    
	    //métodos especiais 
	    public double getcpf () {
	        return cpf;
	    }
	    public String getnome () {
	        return nome;        
	    }
	    public double settelefone () {
	        return cpf;      
	    }
	    public int setidade () {
	        return idade;
	    }
	    public double setaltura () {
	        return altura;	      
	    }
	    public double setpeso () {
	        return peso;	        
	    }	    
	    public double imc() {

	        double imcc = peso/(altura*altura) ;
	        System.out.println("o seu imc e:"+ imcc);
	        if (imcc< 18.5) {
	            System.out.println("Magreza");
	        }else if (imc> 25) {
	            System.out.println("Sobrepeso");
	        }else {
	            System.out.println("Ideal");
	        }
	        return imc;
	    }
	    public void  metapeso() {
	        double perder = peso - metapeso;
	        System.out.println("Voce precisa emagrecer ou engordar"+ perder + "Kg");
	    }
	    public void imprimir() {
	        System.out.println("Os dados são:-Cpf"+ cpf );
	        System.out.println("-Nome:"+ nome);
	        System.out.println("-Telefone:"+ telefone);
	        System.out.println("-Idade:"+ idade);
	        System.out.println("-Altura:"+ altura);
	        System.out.println("-Peso:"+ peso);
	        System.out.println("-Peso alvo:"+ metapeso);

	    }

	}
	


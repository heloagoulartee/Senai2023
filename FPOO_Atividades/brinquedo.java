package atividade_heloa_goularte;

public class brinquedo {
	//atributos
    private String nome;
    private double alturaMinima;
    private int capacidadeMaxima;

    public brinquedo(String string, float f, int i) {
    }

	//métodos especiais
    public String getNome() {
    	System.out.println("O nome do brinquedo é:" + nome);
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        
    }

    public double getAlturaMinima() {
    	System.out.println("A altura minima do brinquedo é:");
        return alturaMinima;
    }

    public void setAlturaMinima(double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public int getCapacidadeMaxima() {
    	System.out.println("A capacidade maxima do brinquedo é:");
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
   
    }

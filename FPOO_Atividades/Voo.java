package atividade_heloa_goularte;

public class Voo {
	private String numeroVoo;
	private String origem;
	private String destino;
	private double preco;
	
	Voo() {
	}

	Voo(String nv, String or, String ds, double pr) {
		this.numeroVoo = nv;
		this.origem  = or;
		this.destino = ds;
		this.preco = pr;
	}
	
	public String getNumeroVoo() {
		return this.getNumeroVoo();
	}
	public void setNumeroVoo(String numerovoo) {
		this.numeroVoo = numerovoo;
}

	public String getOrigem() {
		return this.origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
}
	
	public String getDestino() {
		return this.destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
}
	
	public double getPreco() {
		return this.preco;
	}
	public void setNome(double preco) {
		this.preco = preco;
}

	public void mostrarDetalhes() {

	}
}
	

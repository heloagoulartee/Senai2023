package atividade_heloa_goularte;

public class Professor extends TesteHeranca{
	//atributos
	private String nomeCurso;
	private float salario;
		
	//metodos construtores	
	public Professor(String nomeCurso,Float salario) {
		super();
		this.nomeCurso = nomeCurso;
		this.salario = salario;
	}

	//metodos
	public String getNomecurso() {
		return nomeCurso;
	}
	public void setNome(String nomecurso) {
		this.nomeCurso=nomecurso;
	}
	public String getsalario() {
		return nomeCurso;
	}
	public void setSalario(String nomecurso) {
		this.nomeCurso=nomecurso;
	}
}

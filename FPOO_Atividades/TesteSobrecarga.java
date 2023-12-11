package Aula_2308;

public class TesteSobrecarga {

	public static void main(String[] args) {
		//instancia de obj
		Sobrecarga sob = new Sobrecarga();
		System.out.println(sob.soma(1.5, 2.8));
		System.out.println(sob.soma(5, 9));
		System.out.println(sob.soma("Ola ", "Turma"));
		sob.soma(2, 5, 7);

	}

}

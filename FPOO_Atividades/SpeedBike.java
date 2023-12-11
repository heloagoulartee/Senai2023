package atividade_heloa_goularte;

public class SpeedBike implements Veiculo{
	int velocidade;
	int marcha;
	
	public SpeedBike() {
	}
	public SpeedBike(int v, int m) {
		this.velocidade=v;
		this.marcha=m;
	}
	@Override
	public int mudarMarcha( String a) {	
		marcha = marcha + 1;
		System.out.println("voce mudou de marcha");
		return marcha;
	}
	@Override
	public void acelerar(int b) {
		velocidade = velocidade +15;
		System.out.println("a sua velocidade é" + velocidade);
	}
	@Override
	public void frear( int c) {
		velocidade = velocidade -5;
		if (velocidade== 0) {
			System.out.println("voce esta parado");
		} else if (velocidade < 0) {
			System.out.println("voce esta dando re");
		}
	}
}

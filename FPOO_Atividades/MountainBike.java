package atividade_heloa_goularte;

public class MountainBike implements Veiculo {
	int velocidade;
	int marcha;
	
	@Override
	public int mudarMarcha(String a) {
		return marcha;
	}
	@Override
	public void acelerar(int b) {
		velocidade = velocidade + 5;
	}
	@Override
	public void frear(int c) {
		velocidade = velocidade - 8;
	}
}

package ExercisesPOO16;

public class Carro {

	private double tanqueDeCombustivel;
	private int consumoMedio = 15;
	private int distanciaTotalPercorrida;

	public Carro(double tanqueDeCombustivel) {
		if (tanqueDeCombustivel < 50) {
			this.tanqueDeCombustivel = tanqueDeCombustivel;
		} else {
			throw new IllegalArgumentException("Quantidade de combustivel nao pode ser maior que 50");
		}
	}

	public double getTanqueDeCombustivel() {
		return tanqueDeCombustivel;
	}

	public void setTanqueDeCombustivel(int tanqueDeCombustivel) {
		this.tanqueDeCombustivel = tanqueDeCombustivel;
	}

	public String abastecerCarro(int litrosAbastecidos) {
		double quantidadeAtualDeCombustivel = getTanqueDeCombustivel();
		if ((quantidadeAtualDeCombustivel + litrosAbastecidos) > 50) {
			return "Não é possivel abastecer esta quantidade";
		} else {
			this.tanqueDeCombustivel += litrosAbastecidos;
			return ("Carro abastecido com " + litrosAbastecidos + " litros");
		}
	}

	public String moverCarro(int quilometros) {
		if ((quilometros / 15) > tanqueDeCombustivel) {
			return "Combustivel não é suficiente";
		} else {
			double combustivelGasto = quilometros / 15;
			this.tanqueDeCombustivel -= combustivelGasto;
			this.distanciaTotalPercorrida += quilometros;
			return "O carro andou " + quilometros + " km e gastou " + combustivelGasto + " litros";
		}
	}

	public int getDistanciaTotalPercorrida() {
		return distanciaTotalPercorrida;
	}

}

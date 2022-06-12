package ExercisesPOO2;

public class TesteContaCorrente {
	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente(1234, "Mario Bezerra", 1000);
		
		conta.deposito(500);
		System.out.println(conta.getSaldo());
		conta.saque(600);
		System.out.println(conta.getSaldo());
	}

}

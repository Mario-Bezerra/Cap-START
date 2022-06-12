package ExercisesPOO2;

public class ContaCorrente {
	
	private int conta;
	private String nome;
	private double saldo;

	public ContaCorrente(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}

	public ContaCorrente(int conta, String nome, double saldo) {
		this.conta = conta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void alterarNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposito(double valorDepositado) {
		this.saldo += valorDepositado;
	}
	
	public String saque(double valorASerSacado) {
		if((this.saldo-valorASerSacado) < 0) {
			return "Saldo Insuficiente";
		} else {
			this.saldo -= valorASerSacado;
			return ("Saque realizado R$"+ valorASerSacado );
		}
	}
}

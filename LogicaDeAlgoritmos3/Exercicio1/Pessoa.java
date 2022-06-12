package ExercisesPOO1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
	
	private String nome;
	private String dataDeNascimento;
	private double altura;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	// recebe uma String no formato (dd/MM/yyyy) e calcula a idade
	public int calcularIdadeDaPessoa(String dataDeNascimento) {
		LocalDate dataDeNascimentoParse = LocalDate.parse(dataDeNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
		int hoje = LocalDate.now().getYear();
		int anoDeNascimento = dataDeNascimentoParse.getYear();
		
		int idade = hoje - anoDeNascimento;
		
		return idade;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataDeNascimento=" + dataDeNascimento + ", altura=" + altura + "]";
	}
	
	
	
}

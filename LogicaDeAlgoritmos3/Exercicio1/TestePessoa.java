package ExercisesPOO1;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa aluno = new Pessoa();
		aluno.setNome("Mario Bezerra");
		aluno.setAltura(1.85);
		aluno.setDataDeNascimento("05/03/1999");
		
		int idadeDaPessoa = aluno.calcularIdadeDaPessoa(aluno.getDataDeNascimento());
		
		System.out.println(idadeDaPessoa);
		System.out.println(aluno.toString());
	}
	
}

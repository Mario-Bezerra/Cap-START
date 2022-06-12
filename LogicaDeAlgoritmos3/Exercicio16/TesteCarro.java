package ExercisesPOO16;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro(20);
		Carro carro2 = new Carro(30);
		
		String moverCarro1 = carro1.moverCarro(200);
		String moverCarro2 = carro2.moverCarro(400);
		
		System.out.println(moverCarro1);
		System.out.println(moverCarro2);
	}
}

package AnimalEncapsula;

public class Aves extends Animal{

	@Override
	public void comunicar() {
		System.out.println("A ave comunica-se cantando!"); 		
	}

	@Override
	public void movimentar() {
		System.out.println("O ave movimenta-se voando!");
	}
	
}

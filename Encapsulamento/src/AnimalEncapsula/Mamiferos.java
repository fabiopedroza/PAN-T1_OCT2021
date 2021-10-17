package AnimalEncapsula;

public class Mamiferos extends Animal {
	
	@Override
	public void movimentar() {
		System.out.println("O mamífero movimenta-se andando!"); 
		
	}

	@Override
	public void comunicar() {
		System.out.println("O mamífero comunica-se fazendo barulho!"); 
		
	}
	
	


}

package RefrigeradoresEncapsula;

public class Ventilador extends Refrigeradores {

	@Override
	public void ligar() {
		System.out.println("Ventilador come�a a rodar as h�lices!");
	
	}


	@Override
	public void aumentar() {
		System.out.println("Ventilador aumenta a velocidade das h�lices!");
		
	}
	
	@Override
	public void desligar() {
		System.out.println("Ventilador e as h�lices param de funcionar!");
		System.out.println("");		
	}


}

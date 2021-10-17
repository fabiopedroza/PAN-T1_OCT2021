package RefrigeradoresEncapsula;

public class Ventilador extends Refrigeradores {

	@Override
	public void ligar() {
		System.out.println("Ventilador começa a rodar as hélices!");
	
	}


	@Override
	public void aumentar() {
		System.out.println("Ventilador aumenta a velocidade das hélices!");
		
	}
	
	@Override
	public void desligar() {
		System.out.println("Ventilador e as hélices param de funcionar!");
		System.out.println("");		
	}


}

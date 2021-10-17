package RefrigeradoresEncapsula;

public class ArCondicionado extends Refrigeradores{

	public void ligar() {
		System.out.println("Ar condicionado começa a resfriar o ambiente!");
			
	}

	

	public void aumentar() {
		System.out.println("Ar condicionado diminui a temperado!");
	}

	public void desligar() {
		System.out.println("Ar condicionado para de funcionar e o ambiente retorna a tempertura normal!");
		System.out.println("");		
	}

}

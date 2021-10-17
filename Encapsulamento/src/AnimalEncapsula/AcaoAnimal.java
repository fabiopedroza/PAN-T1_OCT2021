package AnimalEncapsula;

/*
 Exerc�cio: 

Crie uma estrutura de heran�a para demonstrar o polimorfismo utilizando 
classes de animais
Crie o m�todo comunicar() e movimentar() na classe Animal
Nas classes descendentes de animais, sobrescreva os m�todos citados de 
acordo com os tipos de animais
*/

public class AcaoAnimal {

	public static void main(String[] args) {
		
		Animal ave = new Aves();
		Animal mamifero = new Mamiferos();
		
		ave.comunicar();
		ave.movimentar();
		
		mamifero.comunicar();
		mamifero.movimentar();
		
	}		
		

}

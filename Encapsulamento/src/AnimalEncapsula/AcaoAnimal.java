package AnimalEncapsula;

/*
 Exercício: 

Crie uma estrutura de herança para demonstrar o polimorfismo utilizando 
classes de animais
Crie o método comunicar() e movimentar() na classe Animal
Nas classes descendentes de animais, sobrescreva os métodos citados de 
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

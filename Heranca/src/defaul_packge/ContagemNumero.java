package defaul_packge;

import java.util.Iterator;

public class ContagemNumero {

	public static void main(String[] args) {
		

		int numIni = 233;
		int numFim = 456;
		
		for ( int numero = 233; numero <= 456 ; ++numero) {
			
			System.out.println(numero);
			if (numero < 300 || numero > 400) {
				numero += 4;
				
			}
			
			else {
				numero += 2;

				
			}
			
		}

	}

}

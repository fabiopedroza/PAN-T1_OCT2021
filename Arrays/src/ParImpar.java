import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicToolBarSeparatorUI;

/*
 * Dado o seguinte array: int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27,
 * 34, 89, 101, 125}; A. Retorne somente com números pares B. Retorne somente
 * com os números ímpares * 2
 */

public class ParImpar {

	public static void main(String[] args) {
		int[] array2 = { 13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101, 125 };
		List<String> par = new ArrayList<String>();
		List<String> impar = new ArrayList<String>();
//		int[] par;
//		int[] impar;
		
		for(int i : array2) {
			if(i % 2 == 0) {
				par.add(Integer.toString(i));
			}
			else {
				impar.add(Integer.toString(i));
			}
				
		}
		
		System.out.println("--------- Par ---------");
		par.forEach(System.out::println);
		System.out.println("");
		System.out.println("-------- Impar --------");
		impar.forEach(System.out::println);
		

	}

}

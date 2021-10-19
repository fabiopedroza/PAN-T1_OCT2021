package defaul_packge;

import java.util.ArrayList;
import java.util.Iterator;

public class PesquisaPrefeitura {

	public static void main(String[] args) {
		
		ArrayList<Double> salario = new ArrayList<>();
		ArrayList<Integer> filhos = new ArrayList<>();
		salario.add(100.0);
		salario.add(200.0);
		salario.add(300.0);
		salario.add(400.0);
		salario.add(500.0);
		
		filhos.add(3);
		filhos.add(0);
		filhos.add(2);
		filhos.add(1);
		filhos.add(1);
		
		double mediaSalario = 0.0;
		double mediaFilhos = 0.0;
		double totalSalario = 0.0;
		double maiorSalario = 0.0;
		int totalFilhos = 0;
		int numP100 = 0;
		
		for (int i = 0; i < 5; i++) {
			
			totalFilhos += filhos.get(i);
			totalSalario += salario.get(i);
			//System.out.println(salario.get(i));
			
			if (maiorSalario < salario.indexOf(i)) {
				maiorSalario = salario.indexOf(i);
				
			}
					
			if (salario.indexOf(i) <= 100) {
				numP100 ++;
			}
			
		}
		
		mediaFilhos = (totalFilhos / filhos.size());
		mediaSalario = ( totalSalario / salario.size());
		
		System.out.println("A m�dia de sal�rio: " + mediaSalario);
		System.out.println("A m�dia dos filhos: " + mediaFilhos);
		
		


	}

}

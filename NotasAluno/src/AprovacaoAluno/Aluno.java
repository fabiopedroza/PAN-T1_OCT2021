package AprovacaoAluno;

public class Aluno {
	
	private String nome;
	private double[] notas;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public Aluno(String nome, double[] notas) {
		this.nome = nome;
		this.notas = notas;
		media();
		maiorNota();
		
	}

	private void media() {
		double somaNotas = 0, media = 0;
		for (double i : this.getNotas() ) {
			somaNotas += i;
		}
		media = somaNotas / this.getNotas().length;
		System.out.println("Média: " + media);
		
		if(media > 7) {
			aprovado();
		}
		else {
			reprovado();
		}
	}

	private void aprovado() {
		System.out.println("");
		
	}
	
}

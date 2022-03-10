package SuperClass;

public class Adolescente extends Pessoa {
	
	double imcCalculado;
	
	public Adolescente(String nome, String genero, int frequenciaAtiv, int idade, double altura, float peso) {
		
		super(nome, genero, frequenciaAtiv, idade, altura, peso);
		
	}
	
	public void imprimirRelatorio() {
		
		System.out.println("Ficha técnica: Adolescente: " + "\nNome: " + super.getNome() + "\nGênero: " + super.getGenero() + "\nFrequencia de atividade fisíca: " + super.getFrequenciaAtiv() +
				"\nIdade: " + super.getIdade() + "\nAltura: " + super.getAltura() + "\nPeso: " + super.getPeso());
		
	}
	
	public void classificarIMC(double imc) {
		if(imc<25) {
			System.out.println("Abaixo do peso");
		}else {
			System.out.println("Outro");
		}
	}
	

}

package SuperClass;

public class Adolescente extends Pessoa {
	
	public Adolescente(String nome, String genero, int frequenciaAtiv, int idade, double altura, float peso) {
		
		super(nome, genero, frequenciaAtiv, idade, altura, peso);
		
	}
	
	@Override
	public String classificarIMC(double imc) {
		String classe = "";
		
		if(imc<25) {
			classe = "abaixo do peso";
		}else {
			classe = "acima do peso";
		}
		
		return classe;
	}
}
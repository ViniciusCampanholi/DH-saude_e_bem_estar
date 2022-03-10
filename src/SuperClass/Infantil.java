package SuperClass;

public class Infantil extends Pessoa {
	
	public Infantil (String nome, String genero, int frequenciaAtiv,
			int idade, double altura, float peso ) {
		
		super(nome, genero, frequenciaAtiv, idade, altura, peso);
	}
	
	@Override
	public String classificarIMC(double imc) {
		String classe = "";
		if(getIdade() == 6 ) {
			if(imc >= 16.1) {
				classe = "Acima do Peso";
			}
			else {
				classe = "Peso normal";
			}
		}
		if(getIdade() == 7) {
			if(imc >= 17.1) {
				classe = "Acima do Peso";
			}
			else {
				classe = "Peso normal";
			}
		}
		if(getIdade() == 8) {
			if(imc >= 18.1) {
				classe = "Acima do Peso";
			}
			else {
				classe = "Peso normal";
			}
		}
		if(getIdade() == 9) {
			if(imc >= 19.1) {
				classe = "Acima do Peso";
			}
			else {
				classe = "Peso normal";
			}
		}
		if(getIdade() == 10) {
			if(imc >= 20.1) {
				classe = "Acima do Peso";
			}
			else {
				classe = "Peso normal";
			}
		}
		if(getIdade() == 11) {
			if(imc >= 21.1) {
				classe = "Acima do Peso";
			}
			else {
				classe = "Peso normal";
			}
		}
		return classe;
	}	
}
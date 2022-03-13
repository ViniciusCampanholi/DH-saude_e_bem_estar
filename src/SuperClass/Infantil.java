package SuperClass;

public class Infantil extends Pessoa {
	
	public Infantil() {
		
		super("", "", 0, 0, 0d, 0f);
		
	}
	
	public Infantil (String nome, String genero, int frequenciaAtiv,
			int idade, double altura, float peso ) {
		
		super(nome, genero, frequenciaAtiv, idade, altura, peso);
	}
	
	@Override
	public String classificarIMC(double imc) {
		String classe = "Peso normal";

		if (super.getGenero() == "Feminino") {
			if (super.getIdade() == 6) {
				if (imc <= 16.1) {
					classe = "Abaixo do peso";
				} else if (imc >= 17.4) {
					classe = "Acima do peso";
				}

			} else if (super.getIdade() == 7) {
				if (imc <= 17.1) {
					classe = "Abaixo do peso";
				} else if (imc >= 18.9) {
					classe = "Acima do peso";
				}
			} else if (super.getIdade() == 8) {
				if (imc <= 18.1) {
					classe = "Abaixo do peso";
				} else if (imc >= 20.3) {
					classe = "Acima do peso";
				}
			} else if (super.getIdade() == 9) {
				if (imc <= 19.1) {
					classe = "Abaixo do peso";
				} else if (imc >= 21.7) {
					classe = "Acima do peso";
				}
			} else if (super.getIdade() == 10) {
				if (imc <= 20.1) {
					classe = "Abaixo do peso";
				} else if (imc >= 23.2) {
					classe = "Acima do peso";
				}
			} else if (super.getIdade() == 11) {
				if (imc <= 21.1) {
					classe = "Abaixo do peso";
				} else if (imc >= 24.5) {
					classe = "Acima do peso";
				}
			
			}

		}

		if (getGenero() == "Masculino") {
			if (super.getIdade() == 6) {
				if (imc <= 16.6) {
					classe = "Abaixo do peso";
				} else if (imc >= 18.0) {
					classe = "Acima do peso";
				}
			} else if (super.getIdade() == 7) {
				if (imc <= 17.3) {
					classe = "Abaixo do peso";
				} else if (imc >= 19.1) {
					classe = "Acima do peso";
				}
			} else if (super.getIdade() == 8) {
				if (imc <= 16.7) {
					classe = "Abaixo do peso";
				} else if (imc >= 20.3) {
					classe = "Acima do peso";
				}
			} else if (super.getIdade() == 9) {
				if (imc <= 18.8) {
					classe = "Abaixo do peso";
				} else if (imc >= 21.4) {
					classe = "Acima do peso";
				}
			} else if (super.getIdade() == 10) {
				if (imc <= 19.6) {
					classe = "Abaixo do peso";
				} else if (imc >= 22.5) {
					classe = "Acima do peso";
				}
			} else if (super.getIdade() == 11) {
				if (imc <= 20.3) {
					classe = "Abaixo do peso";
				} else if (imc >= 23.7) {
					classe = "Acima do peso";
				}
			

			}

		}
		return classe;
	}
}
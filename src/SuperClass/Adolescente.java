package SuperClass;

public class Adolescente extends Pessoa {

	public Adolescente(String nome, String genero, int frequenciaAtiv, int idade, double altura, float peso) {

		super(nome, genero, frequenciaAtiv, idade, altura, peso);

	}

	@Override
	public String classificarIMC(double imc) {
		String classe = "";

		if (super.getGenero() == "Feminino") {
			if (super.getIdade() == 10) {
				if (imc <= 15) {
					classe = "Abaixo do peso";
				} else if (imc >= 21) {
					classe = "Acima do peso";
				} else {
					classe = "Peso normal";
				}

			} else if (super.getIdade() == 11) {
				if (imc <= 15) {
					classe = "Abaixo do peso";
				} else if (imc >= 22) {
					classe = "Acima do peso";
				} else {
					classe = "Peso normal";
				}
			} else if (super.getIdade() == 12) {
				if (imc <= 16) {
					classe = "Abaixo do peso";
				} else if (imc >= 23) {
					classe = "Acima do peso";
				} else {
					classe = "Peso normal";
				}
			} else if (super.getIdade() == 13) {
				if (imc <= 17) {
					classe = "Abaixo do peso";
				} else if (imc >= 23) {
					classe = "Acima do peso";
				} else {
					classe = "Peso normal";
				}
			} else if (super.getIdade() == 14) {
				if (imc <= 17) {
					classe = "Abaixo do peso";
				} else if (imc >= 24) {
					classe = "Acima do peso";
				} else {
					classe = "Peso normal";
				}
			} else if (super.getIdade() == 15) {
				if (imc <= 18) {
					classe = "Abaixo do peso";
				} else if (imc >= 25) {
					classe = "Acima do peso";
				} else {
					classe = "Peso normal";
				}
			} else if (super.getIdade() == 16) {
				if (imc <= 18) {
					classe = "Abaixo do peso";
				} else if (imc >= 25) {
					classe = "Acima do peso";
				} else {
					classe = "Peso normal";
				}
			} else if (super.getIdade() == 17) {
				if (imc <= 18) {
					classe = "Abaixo do peso";
				} else if (imc >= 25) {
					classe = "Acima do peso";
				} else {
					classe = "Peso normal";
				}
			}

		}

		if (getGenero() == "Masculino") {
			if (super.getIdade() == 10) {
				if (imc <= 15) {
					classe = "Abaixo do peso";
				} else if (imc >= 20) {
					classe = "Acima do peso";
				} else {
					classe = "Peso normal";
				}
			} else if (super.getIdade() == 11) {
				if (imc <= 15) {
					classe = "Abaixo do peso";
				} else if (imc >= 20) {
					classe = "Acima do peso";
				} else {
					classe = "Peso normal";
				}
			} else if (super.getIdade() == 12) {
				if (imc <= 16) {
					classe = "Abaixo do peso";
				} else if (imc >= 21) {
					classe = "Acima do peso";
				} else {
					classe = "Peso normal";
				}
			} else if (super.getIdade() == 13) {
				if (imc <= 16) {
					classe = "Abaixo do peso";
				} else if (imc >= 22) {
					classe = "Acima do peso";
				} else {
					classe = "Peso normal";
				}
			} else if (super.getIdade() == 14) {
				if (imc <= 16) {
					classe = "Abaixo do peso";
				} else if (imc >= 22) {
					classe = "Acima do peso";
				} else {
					classe = "Peso normal";
				}
			} else if (super.getIdade() == 15) {
				if (imc <= 17) {
					classe = "Abaixo do peso";
				} else if (imc >= 23) {
					classe = "Acima do peso";
				} else {
					classe = "Peso Normal";
				}
			} else if (super.getIdade() == 16) {
				if (imc <= 18) {
					classe = "Abaixo do peso";
				} else if (imc >= 23) {
					classe = "Acima do peso";
				} else {
					classe = "Peso normal";
				}
			} else if (super.getIdade() == 17) {
				if (imc <= 18) {
					classe = "Abaixo do peso";
				} else if (imc >= 23) {
					classe = "Acima do peso";
				}

			} else {
				classe = "Peso normal";
			}

		}
		return classe;
	}
}
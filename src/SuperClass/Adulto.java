package SuperClass;

public class Adulto extends Pessoa {
	
	public Adulto() {
		
		super("", "", 0, 0, 0d, 0f);
	}

	public Adulto(String nome, String genero, int frequenciaAtiv, int idade, double altura, float peso) {

		super(nome, genero, frequenciaAtiv, idade, altura, peso);

	}
		@Override
		public String classificarIMC(double imc) {
			String classe = "Peso normal";

			if (super.getGenero() == "Feminino") {
				if (super.getIdade() >= 18) {
					if (imc <= 19.1) {
						classe = "Abaixo do peso";
					}
					else if	(imc > 19.1 && imc <= 25.8)
					{
						classe = "Peso Normal";		
					}
					else if (imc > 25.8 && imc <= 27.3)
					{
						classe = "Sobrepeso";	
					}
					else if (imc > 27.3 && imc <= 31.1)
					{
						classe = "Obesidade 1";
					}
					else if (imc > 31.1)
					{
						classe = "Obesidade 2";
					}
					
						
										
							}
		}
			
			
			if (super.getGenero() == "Msculino") {
				if (super.getIdade() >= 18) {
					if (imc <= 20.7) {
						classe = "Abaixo do peso";
					}
					else if	(imc > 20.7 && imc <= 26.4)
					{
						classe = "Peso Normal";		
					}
					else if (imc > 26.4 && imc <= 27.8)
					{
						classe = "Sobrepeso";	
					}
					else if (imc > 27.8 && imc <= 32.3)
					{
						classe = "Obesidade 1";
					}
					else if (imc > 32.3)
					{
						classe = "Obesidade 2";
					}
			
			
				}
			}
			return classe;
		}
	
}
					
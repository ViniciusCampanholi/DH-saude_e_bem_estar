package SuperClass;

public class Adolescente extends Pessoa {
	
	public Adolescente(String nome, String genero, int frequenciaAtiv, int idade, double altura, float peso) {
		
		super(nome, genero, frequenciaAtiv, idade, altura, peso);
		
	}
	
	@Override
<<<<<<< HEAD
	public void classificarIMC(double imc) {
=======
	public String classificarIMC(double imc) {
		String classe = "";
	
>>>>>>> b692fd0b27e51e6c46acc5323a74bb64d014e491
		if (super.getGenero() == "Feminino")
		{
			if(super.getIdade()==10)
			{
				if(imc<=15)
				{
					classe = "Abaixo do peso";
				}
				else if(imc>=21)
				{
					System.out.println("Acima do peso");
				}
				
			} 
			else if(super.getIdade() ==11)
			{
				if(imc<=15)
				{
					System.out.println("Abaixo do peso");
				}
				else if(imc>=22)
				{
					System.out.println("Acima do peso");
				}
			}
			else if(super.getIdade()==12)
			{
				if(imc<=16)
				{
					System.out.println("Abaixo do peso");
				}
				else if(imc>=23)
				{
					System.out.println("Acima do peso");
				}
			}
			else if(super.getIdade()==13)
			{
				if(imc<=17)
				{
					System.out.println("Abaixo do peso");
				}
				else if(imc>=23)
				{
					System.out.println("Acima do peso");
				}
			}
			else if(super.getIdade()==14)
			{
				if(imc<=17)
				{
					System.out.println("Abaixo do peso");
				}
				else if(imc>=24)
				{
					System.out.println("Acima do peso");
				}
			}
			else if(super.getIdade()==15)
			{
				if(imc<=18)
				{
					System.out.println("Abaixo do peso");
				}
				else if(imc>=25)
				{
					System.out.println("Acima do peso");
				}
			}
			else if(super.getIdade()==16)
			{
				if(imc<=18)
				{
					System.out.println("Abaixo do peso");
				}
				else if(imc>=25)
				{
					System.out.println("Acima do peso");
				}
			}
			else if(super.getIdade()==17)
			{
				if(imc<=18)
				{
					System.out.println("Abaixo do peso");
				}
				else if(imc>=25)
				{
					System.out.println("Acima do peso");
				}
			}
		else 
		{
			System.out.println("Peso normal");
		}
		}
			
			
		if (getGenero() == "Masculino")
		{
			if(super.getIdade()==10)
			{
				if(imc<=15)
				{
					System.out.println("Abaixo do peso");
				}
				else if(imc>=20)
				{
					System.out.println("Acima do peso");
				}
			} 
			else if(super.getIdade()==11)
			{
				if(imc<=15)
				{
					System.out.println("Abaixo do peso");
				}
				else if(imc>=20)
				{
					System.out.println("Acima do peso");
				}
			}
			else if(super.getIdade()==12)
			{
				if(imc<=16)
				{
					System.out.println("Abaixo do peso");
				}
				else if(imc>=21)
				{
					System.out.println("Acima do peso");
				}
			}
			else if(super.getIdade()==13)
			{
				if(imc<=16)
				{
					System.out.println("Abaixo do peso");
				}
				else if(imc>=22)
				{
					System.out.println("Acima do peso");
				}
			}
			else if(super.getIdade()==14)
			{
				if(imc<=16)
				{
					System.out.println("Abaixo do peso");
				}
				else if(imc>=22)
				{
					System.out.println("Acima do peso");
				}
			}
			else if(super.getIdade()==15)
			{
				if(imc<=17)
				{
					System.out.println("Abaixo do peso");
				}
				else if(imc>=23)
				{
					System.out.println("Acima do peso");
				}
			}
			else if(super.getIdade()==16)
			{
				if(imc<=18)
				{
					System.out.println("Abaixo do peso");
				}
				else if(imc>=23)
				{
					System.out.println("Acima do peso");
				}
				}
			else if(super.getIdade()==17)
			{
				if(imc<=18)
				{
					System.out.println("Abaixo do peso");
				}
				else if(imc>=23)
				{
					System.out.println("Acima do peso");
				}
			}
		else 
		{
			System.out.println("Peso normal");
		}
			
			
		}
		
		return classe;
		}
}

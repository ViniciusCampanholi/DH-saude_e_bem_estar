package SuperClass;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		Adolescente adolescente = new Adolescente("Fulano", "Masculino", 5, 15, 1.75, 65);
		
		adolescente.imprimirRelatorio();
		
		adolescente.calcularImc();
		
		adolescente.classificarIMC(adolescente.calcularImc());
		
		
		

	}

}

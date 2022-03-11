package SuperClass;


public class main {

	public static void main(String[] args) {
		
		Adolescente adolescente = new Adolescente("Fulano", "Feminino", 5, 15, 1.69, 62);
		adolescente.imprimirRelatorio();
		
		Infantil infantil = new Infantil("Mariazinha", "Feminino", 1, 7, 1.35, 20);
		infantil.imprimirRelatorio();
	}
}

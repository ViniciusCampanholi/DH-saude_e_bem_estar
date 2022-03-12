package SuperClass;

import java.util.ArrayList;
import java.util.Scanner;

public class TestarClasse {

	public static void main(String[] args) {
		
		ArrayList <Pessoa> p = new ArrayList();
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("-----------------------------");
			System.out.println("Digite a opção desejada: \n1 - Cadastrar um adulto \n2 - Cadastrar um adolescente \n3 - Cadastrar uma criança "
					+ "\n4 - Mostrar todos as pessoas cadastradas \n5 - Sair do programa");
			op = leia.nextInt();
			
			switch(op) {
				case 2:
					leia.nextLine();
					Adolescente a = new Adolescente();
					System.out.println("Digite o nome: ");
					a.setNome(leia.nextLine());
					System.out.println("Digite o sexo: ");
					a.setGenero(leia.nextLine());
					System.out.println("Digite quantas vezes você pratica atividade fisica por dia");
					a.setFrequenciaAtiv(leia.nextInt());
					System.out.println("Digite a idade: ");
					a.setIdade(leia.nextInt());
					while(a.getIdade()<12 || a.getIdade()>18) {
						System.out.println("A idade esta abaixo (de 18 para cima) do considerado para adulto, por favor digite novamente");
						a.setIdade(leia.nextInt());
					}
					System.out.println("Digite a altura: ");
					a.setAltura(leia.nextDouble());
					System.out.println("Digite o peso: ");
					a.setPeso(leia.nextFloat());
					a.calcularImc();
					a.classificarIMC(a.calcularImc());
					a.imprimirRelatorio();
					p.add(a);
					break;
				
				case 3:
					leia.nextLine();
					Infantil c = new Infantil();
					System.out.println("Digite o nome: ");
					c.setNome(leia.nextLine());
					System.out.println("Digite o sexo: ");
					c.setGenero(leia.nextLine());
					System.out.println("Digite quantas vezes você pratica atividade fisica por dia");
					c.setFrequenciaAtiv(leia.nextInt());
					System.out.println("Digite a idade: ");
					c.setIdade(leia.nextInt());
					while(c.getIdade()<1 || c.getIdade()>12) {
						System.out.println("A idade esta abaixo (de 18 para cima) do considerado para adulto, por favor digite novamente");
						c.setIdade(leia.nextInt());
					}
					System.out.println("Digite a altura: ");
					c.setAltura(leia.nextDouble());
					System.out.println("Digite o peso: ");
					c.setPeso(leia.nextFloat());
					c.calcularImc();
					c.classificarIMC(c.calcularImc());
					c.imprimirRelatorio();
					p.add(c);
					break;
				
				case 4:
					for(int i = 0; i<p.size(); i++) {
						p.get(i).imprimirRelatorio();
					}
					break;
				
				case 5:
					System.out.println("Programa encerrado");
					break;
			
			}
			
		}while(op != 5);
		
	}
}

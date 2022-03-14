package SuperClass;

import java.util.ArrayList;
import java.util.Scanner;

public class TestarClasse {

	public static void main(String[] args) {

		ArrayList<Pessoa> p = new ArrayList();
		int op;
		String mensagem;
		String validador;

		Scanner leia = new Scanner(System.in);

		System.out.println("Olá, antes de começarmos preciso saber de algumas coisas...");
		System.out.println("\nEste programa não atende aos seguintes grupos:\n-Gestantes\n-Idosos\n-Heterofilistas ou praticantes de esportes de alto rendimento");
		System.out.println("\nVocê se encontra dentro de um destes grupos?\ndigite |s| para sim e |n| para não");
		validador = leia.nextLine().toUpperCase();

		if (validador.equals("S")) {
			mensagem = "Você é Infelizmente você não está apto para utilizar este programa, aconselhamos que converse com seu médico para obter suas informações de saúde.";
			System.out.println(mensagem);
			System.exit(0);
		} else {
			mensagem = "\nPerfeito! Você pode prosseguir\nPara informações mais precisas aconselhamos procurar o seu medico ou serviço de saúde mais próximo.";
			System.out.println(mensagem);
			do {
				System.out.println("-----------------------------");
				System.out.println(
						"Digite a opção desejada: \n1 - Cadastrar um adulto \n2 - Cadastrar um adolescente \n3 - Cadastrar uma criança "
								+ "\n4 - Mostrar todos as pessoas cadastradas \n5 - Sair do programa");
				op = leia.nextInt();

				switch (op) {
				case 1:
					leia.nextLine();
					Adulto b = new Adulto();
					System.out.println("Digite o nome: ");
					b.setNome(leia.nextLine());
					System.out.println("Digite o genero: ");
					b.setGenero(leia.nextLine());
					System.out.println("Digite quantas vezes você pratica atividade fisica por semana");
					b.setFrequenciaAtiv(leia.nextInt());
					System.out.println("Digite a idade: ");
					b.setIdade(leia.nextInt());
					while (b.getIdade() < 18 || b.getIdade() > 100) {
						System.out.println(
								"A idade esta abaixo (de 18 para cima) do considerado para adulto, por favor digite novamente");
						b.setIdade(leia.nextInt());
					}
					System.out.println("Digite a altura: ");
					b.setAltura(leia.nextDouble());
					System.out.println("Digite o peso: ");
					b.setPeso(leia.nextFloat());
					b.calcularImc();
					b.classificarIMC(b.calcularImc());
					b.imprimirRelatorio();
					p.add(b);
					break;

				case 2:
					leia.nextLine();
					Adolescente a = new Adolescente();
					System.out.println("Digite o nome: ");
					a.setNome(leia.nextLine());
					System.out.println("Digite o genero: ");
					a.setGenero(leia.nextLine());
					System.out.println("Digite quantas vezes você pratica atividade fisica por semana");
					a.setFrequenciaAtiv(leia.nextInt());
					System.out.println("Digite a idade: ");
					a.setIdade(leia.nextInt());
					while (a.getIdade() < 12 || a.getIdade() > 18) {
						System.out.println(
								"A idade esta abaixo ou acima do considerado para adolescente, por favor digite novamente");
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
					System.out.println("Digite o genero: ");
					c.setGenero(leia.nextLine());
					System.out.println("Digite quantas vezes você pratica atividade fisica por semana");
					c.setFrequenciaAtiv(leia.nextInt());
					System.out.println("Digite a idade: ");
					c.setIdade(leia.nextInt());
					while (c.getIdade() < 1 || c.getIdade() > 12) {
						System.out.println(
								"A idade esta abaixo ou acima do considerado para criança, por favor digite novamente");
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
					for (int i = 0; i < p.size(); i++) {
						p.get(i).imprimirRelatorio();
					}
					break;

				case 5:
					System.out.println("Programa encerrado");
					System.exit(0);
				}

			} while (op != 5);
		}
	}
}
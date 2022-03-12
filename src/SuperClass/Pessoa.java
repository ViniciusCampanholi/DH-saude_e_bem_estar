package SuperClass;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

import SuperClass.Adolescente;
import SuperClass.Pessoa;

abstract class Pessoa {
	// Atributos declarados
	private String nome;
	private String genero;
	private int frequenciaAtiv;
	private int idade;
	private double altura;
	private float peso;

	// Construtor de classe
	public Pessoa(String nome, String genero, int frequenciaAtiv, int idade, double altura, float peso) {
		this.nome = nome;
		this.genero = genero;
		this.frequenciaAtiv = frequenciaAtiv;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

	// Metodos Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getFrequenciaAtiv() {
		return frequenciaAtiv;
	}

	public void setFrequenciaAtiv(int frequenciaAtiv) {
		this.frequenciaAtiv = frequenciaAtiv;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public double calcularImc() {
		// Calcula o imc e armazena na variavel imc
		double imc = getPeso() / Math.pow(getAltura(), 2);

		// Instancia uma classe para arredendodamento com fator de escala 1 (1 casa
		// decimal)
		BigDecimal bd = new BigDecimal(imc).setScale(1, RoundingMode.HALF_EVEN);

		// Retorna um valor double com o arredondamento
		return bd.doubleValue();
	}

	abstract String classificarIMC(double imc);

	public void imprimirRelatorio() {
		System.out.println("-----------------------------");
		System.out.println("Ficha técnica: " + "\nNome: " + getNome() + "\nGênero: " + getGenero()
				+ "\nFrequencia de atividade fisíca: " + getFrequenciaAtiv() + "\nIdade: " + getIdade() + "\nAltura: "
				+ getAltura() + "\nPeso: " + getPeso() + "\nIMC: " + calcularImc() + "\nGrau de classificação "
				+ classificarIMC(calcularImc()));
	}
}
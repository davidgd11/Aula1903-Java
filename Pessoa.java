package br.com.fiap;

import java.time.LocalDate;

public class Pessoa {

	//atributos
	private String nome;
	private int anoNascimento;
	
	//construtores
	//construtor vazio
	public Pessoa() {}
	
	//construtor com passagem de parametros
	public Pessoa(String nome, int anoNascimento) {
		this.nome = nome;
		//this.anoNascimento = anoNascimento;
		setAnoNascimento(anoNascimento);
	}
	
	//getters & setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		LocalDate anoAtual = LocalDate.now();
		try {
			if (anoNascimento >= 1900 && anoNascimento <= anoAtual.getYear()) {
				this.anoNascimento = anoNascimento;
			} else {
				throw new Exception("Valor incorreto! (1900 - ano atual)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//metodos particulares
	public int calculaIdade(int anoAtual) {
		int idade = anoAtual - anoNascimento;
		return idade;
	}
	
}

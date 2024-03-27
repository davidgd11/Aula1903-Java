package br.com.fiap;

public class Funcionario {
	
	private String nome;
	private float valorHora;
	
	public Funcionario() {}

	public Funcionario(String nome, float valorHora) {
		this.nome = nome;
		this.valorHora = valorHora;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		try {
			if (valorHora > 0) {
				this.valorHora = valorHora;
			} else {
				throw new Exception("Valor incorreto! (deve ser maior que 0)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public float salario (float horasSemana) {
		float salario = valorHora * horasSemana * 4;
		return salario;
	}

}

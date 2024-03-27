package br.com.fiap;

public class UsaPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa("Stela", 2015);
		
		pessoa1.setNome("David");
		pessoa1.setAnoNascimento(2005);
		int idade = pessoa1.calculaIdade(2024);
		
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Idade: " + idade + " anos");
		
		System.out.println("\nNome: " + pessoa2.getNome());
		System.out.println("Idade: " + pessoa2.calculaIdade(2024) + " anos");
		
	}

}

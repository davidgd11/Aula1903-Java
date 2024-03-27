package br.com.fiap;

import java.util.Scanner;

public class UsaPessoa2 {

	public static void main(String[] args) {
		
		Pessoa pessoa3;
		String nome;
		// int anoNascimento;
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite seu nome e ano de nascimento: ");
			// nome = scan.nextLine();
			// anoNascimento  = scan.nextInt();
			// pessoa3 new Pessoa(nome, anoNascimento);
			
			pessoa3 = new Pessoa(scan.nextLine(), scan.nextInt());
			int idade = pessoa3.calculaIdade(2024);
			
			System.out.println("Nome: " + pessoa3.getNome());
			System.out.println("Idade: " + idade + " anos");
			
		} catch (Exception e) {
			System.out.println("Nome e/ou ano de nascimento incorreto(s)");
		}
		
	}

}

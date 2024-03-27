package br.com.fiap;

public class UsaFuncionario1 {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario("David", 15.5f);

		
		func1.setNome("David");
		func1.setValorHora(15.5f);

		System.out.println("Nome: " + func1.getNome());
		System.out.println("Salário: R$" + func1.salario(20f));
		
		System.out.println("\nNome: " + func2.getNome());
		System.out.println("Salário: R$" + func2.salario(20f));
		
	}

}

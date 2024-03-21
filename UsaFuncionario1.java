package br.com.fiap;

public class UsaFuncionario1 {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		
		func.setNome("David");
		func.setValorHora(15.17f);

		//ELe trabalha 20 horas por semana
		System.out.println("Nome: " + func.getNome());
		System.out.println("Salário: R$" + func.salario(20f));
		

	}

}

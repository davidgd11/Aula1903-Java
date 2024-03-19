package br.com.fiap;

public class UsaFuncionario1 {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		func.setNome("David");
		func.setValorHora(32);
		
		System.out.println(func.getNome());
		System.out.println(func.salario(2000));
		

	}

}

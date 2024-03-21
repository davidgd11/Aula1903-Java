package br.com.fiap;

import java.util.Scanner;

public class UsaFuncionario2 {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario();
		float semana = 0.0f;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Diigte o seu nome: ");
			func.setNome(scan.nextLine());
			System.out.println("Digite quanto você ganha por hora: ");
			func.setValorHora(scan.nextFloat());
			System.out.println("Quantas horas trabalha na semana? ");
			semana = scan.nextFloat();
			
			System.out.println("Nome: " + func.getNome());
			System.out.println("Salário: " + func.salario(semana));
		} catch (Exception e) {
			System.out.println("Nome e/ou valor/hora inválidos!"); 
		}

	}

}

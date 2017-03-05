package exercicios_cap_4;

public class Main {
	public static void main(String[] args){
		
		// Exercícios 1, 2 e 3
		Funcionario funcionario = new Funcionario();
		funcionario.nome = "Tiago";
		funcionario.salario = 2300;
		funcionario.mostra();
		funcionario.recebeAumento(1200);
		funcionario.mostra();
		// -------------------------
		
		// Exercício 4
		Funcionario f1 = new Funcionario();
		f1.nome = "Danilo";
		f1.salario = 100;
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Danilo";
		f2.salario = 100;
		
		if (f1 == f2){
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		// -------------------------
		
		// Exercício 5
		Funcionario f3 = new Funcionario();
		Funcionario f4 = f3;
		
		System.out.println(f3 == f4);
		// -------------------------
		
		// Exercícios 6, 7, 8 e 9
		Funcionario f5 = new Funcionario();
		f5.data.dia = 10;
		f5.data.mes = 11;
		f5.data.ano = 2016;
		
		System.out.println(f5.data.getData());
		// -------------------------
		
		
	}
}
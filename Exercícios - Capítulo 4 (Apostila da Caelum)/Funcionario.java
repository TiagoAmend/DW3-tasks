package exercicios_cap_4;



public class Funcionario {

	String nome;

	double salario;

	String departamento;

	Data data = new Data();

	String rg;

	void recebeAumento(double valor){

		this.salario += valor;

	}
	
	

	double calculaGanhoAnual(){

		return this.salario * 12;

	}
	
	

	void mostra(){

		System.out.println("\nNome: " + this.nome );

		System.out.println("Sal�rio: " + this.salario);

		System.out.println("Departamento: " + this.departamento);

		System.out.println("Data de entrada: " + this.data.getData());

		System.out.println("RG: " + this.rg);

		System.out.println("Ganho anual: " + this.calculaGanhoAnual() + "\n");

	}

}

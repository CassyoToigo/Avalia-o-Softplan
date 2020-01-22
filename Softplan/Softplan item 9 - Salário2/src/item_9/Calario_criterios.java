package item_9;

import java.util.Scanner;

public class Calario_criterios {
	
	/*
	 * 9. Escrever um ALGORITMO ou PROGRAMA para uma empresa que decide dar um
	 * reajuste a seus funcionários de acordo com os seguintes critérios:
	 * • 50% para aqueles que ganham menos do que três salários mínimos;
	 * • 20% para aqueles que ganham entre três até dez salários mínimos;
	 * • 15% para aqueles que ganham acima de dez até vinte salários mínimos;
	 * • 10% para os demais funcionários.
	 * a) Leia o nome do funcionário, seu salário e o valor do salário mínimo.
	 * b) Calcule o seu novo salário reajustado.
	 * c) Escrever o nome do funcionário, o reajuste e seu novo salário.
	 */


		public static void main(String[] args) {

			Scanner nome = new Scanner(System.in);
			System.out.println("Favor inserir o nome do funcionário:");
			String funcionario = nome.nextLine();

			Scanner valor1 = new Scanner(System.in);
			System.out.println("Favor inserir o salário do funcionário:");
			double salario = valor1.nextDouble();
			
			Scanner valor2 = new Scanner(System.in);
			System.out.println("Favor inserir o valor do salário mínimo:");
			double salario_minimo = valor2.nextDouble();

			double salario_final = 0;
			String reajuste = "";
			
			double qtsalario = salario / salario_minimo;
			
			if (qtsalario <= 3) {
				salario_final = salario + (salario * 0.5);
				reajuste = "50%";
			} else if (qtsalario > 3 && qtsalario <= 10) {
				salario_final = salario + (salario * 0.2);
				reajuste = "20%";
			} else if (qtsalario > 10 && qtsalario <= 20) {
				salario_final = salario + (salario * 0.15);
				reajuste = "15%";
			} else {
				salario_final = salario + (salario * 0.10);
				reajuste = "10%";
			}

			nome.close();
			valor1.close();
			valor2.close();	

			System.out.println("O " + funcionario + " recebia o salário de R$" + salario + ", sendo este reajustado em " + reajuste + " . Seu novo salário é de R$"
					+ salario_final + ".");
		}

	}
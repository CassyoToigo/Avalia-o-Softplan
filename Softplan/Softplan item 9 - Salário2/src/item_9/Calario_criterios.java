package item_9;

import java.util.Scanner;

public class Calario_criterios {
	
	/*
	 * 9. Escrever um ALGORITMO ou PROGRAMA para uma empresa que decide dar um
	 * reajuste a seus funcion�rios de acordo com os seguintes crit�rios:
	 * � 50% para aqueles que ganham menos do que tr�s sal�rios m�nimos;
	 * � 20% para aqueles que ganham entre tr�s at� dez sal�rios m�nimos;
	 * � 15% para aqueles que ganham acima de dez at� vinte sal�rios m�nimos;
	 * � 10% para os demais funcion�rios.
	 * a) Leia o nome do funcion�rio, seu sal�rio e o valor do sal�rio m�nimo.
	 * b) Calcule o seu novo sal�rio reajustado.
	 * c) Escrever o nome do funcion�rio, o reajuste e seu novo sal�rio.
	 */


		public static void main(String[] args) {

			Scanner nome = new Scanner(System.in);
			System.out.println("Favor inserir o nome do funcion�rio:");
			String funcionario = nome.nextLine();

			Scanner valor1 = new Scanner(System.in);
			System.out.println("Favor inserir o sal�rio do funcion�rio:");
			double salario = valor1.nextDouble();
			
			Scanner valor2 = new Scanner(System.in);
			System.out.println("Favor inserir o valor do sal�rio m�nimo:");
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

			System.out.println("O " + funcionario + " recebia o sal�rio de R$" + salario + ", sendo este reajustado em " + reajuste + " . Seu novo sal�rio � de R$"
					+ salario_final + ".");
		}

	}
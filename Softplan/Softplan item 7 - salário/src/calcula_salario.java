import java.util.Scanner;

/*7. Ler o tempo de servi�o em anos e o sal�rio de um funcion�rio de uma empresa,
se ele tiver mais de 5 anos de tempo de servi�o e um sal�rio inferior a R$3.000,00
calcular o novo sal�rio com reajuste de 20%, caso contr�rio dar um reajuste de 5%.
Exiba o novo sal�rio do funcion�rio. */

public class calcula_salario {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);
		System.out.println("Favor inserir o sal�rio do colaborador:");
		double salario = valor.nextDouble();

		Scanner anos = new Scanner(System.in);
		System.out.println("Favor inserir o tempo de servi�o (em anos):");
		int tempo_servico = anos.nextInt();

		double salario_final = 0;
		String reajuste = "";

		if (tempo_servico > 5 && salario < 3000.0) {

			salario_final = salario + (salario * 0.20);
			reajuste = "20%";

		} else {

			salario_final = salario + (salario * 0.05);
			reajuste = "5%";

		}

		valor.close();
		anos.close();

		System.out.println("O colaborador possui " + tempo_servico + " ano(s) de servi�o e estava recebendo R$"
				+ salario + ", seu sal�rio foi reajustado em " + reajuste + " totalizando R$" + salario_final);
	}

}

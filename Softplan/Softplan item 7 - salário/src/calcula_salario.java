import java.util.Scanner;

/*7. Ler o tempo de serviço em anos e o salário de um funcionário de uma empresa,
se ele tiver mais de 5 anos de tempo de serviço e um salário inferior a R$3.000,00
calcular o novo salário com reajuste de 20%, caso contrário dar um reajuste de 5%.
Exiba o novo salário do funcionário. */

public class calcula_salario {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);
		System.out.println("Favor inserir o salário do colaborador:");
		double salario = valor.nextDouble();

		Scanner anos = new Scanner(System.in);
		System.out.println("Favor inserir o tempo de serviço (em anos):");
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

		System.out.println("O colaborador possui " + tempo_servico + " ano(s) de serviço e estava recebendo R$"
				+ salario + ", seu salário foi reajustado em " + reajuste + " totalizando R$" + salario_final);
	}

}

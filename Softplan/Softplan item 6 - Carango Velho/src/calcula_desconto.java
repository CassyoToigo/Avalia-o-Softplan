import java.util.Scanner;

public class calcula_desconto {

	/*
	 * 6. A concession�ria de ve�culos �CARANGO VELHO� est� vendendo os seus
	 * ve�culos com desconto. Fa�a um algoritmo que calcule e exiba o valor do
	 * desconto e o valor a ser pago pelo cliente de v�rios carros. O desconto
	 * dever� ser calculado de acordo com o ano do ve�culo. At� 2000 - 12% e acima
	 * de 2000 � 7%.
	 */
	
	public static void main(String[] args) {
				
		Scanner valor = new Scanner(System.in);
		System.out.println("Favor inserir o valor do Ve�culo:");
		double valor_veiculo = valor.nextDouble();

		Scanner ano = new Scanner(System.in);
		System.out.println("Favor inserir o ano do Ve�culo:");
		int ano_veiculo = ano.nextInt();
		
		double valor_final = 0;
		String desconto = "";
		
		if (ano_veiculo > 2000) {
		
			valor_final = valor_veiculo * 0.93;
			desconto = "7%";
			
		}else {
				
				valor_final = valor_veiculo * 0.88;
				desconto = "12%";
				
			}
		
		valor.close();
		ano.close();
		
		System.out.println("Ve�culo de ano " + ano_veiculo + " no valor de R$" + valor_veiculo + " recebeu desconto de " + desconto + " ficando num total de R$" + valor_final );

		
	}
}
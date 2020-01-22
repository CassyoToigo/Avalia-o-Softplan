import java.util.Scanner;

public class calcula_kilo {

	/*
	 * 8. Uma fruteira est� vendendo frutas com a seguinte tabela de pre�os:
	 * 
	 * At� 5 Kg Acima de 5 Kg Morango R$ 2,50 por Kg R$ 2,20 por Kg Ma�� R$ 1,80 por
	 * Kg R$ 1,50 por Kg
	 * 
	 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
	 * ultrapassar R$ 25,00, receber� ainda um desconto de 10% sobre este total.
	 * 
	 * a) Escreva um ALGORITMO ou PROGRAMA para ler a quantidade (em Kg) de morangos
	 * e a quantidade (em Kg) de ma��s adquiridos. b) Mostre a quantidade total de
	 * frutas compradas. c) Mostre o valor o valor total a ser pago, o valor total
	 * de ma��s e o valor total de morangos.
	 */

	public static void main(String[] args) {

		Scanner qtMor = new Scanner(System.in);
		System.out.println("Quantidade de morango em Kg:");
		double morango = qtMor.nextDouble();

		Scanner qtMac = new Scanner(System.in);
		System.out.println("Quantidade de ma�� em Kg:");
		double maca = qtMac.nextInt();

		double total_frutas = morango + maca;
		double valor_final = 0;
		
		double valor_morango;
		double valor_maca;

		// calcular valor total de morangos

		if (morango <= 5 && maca <= 5) {

			valor_morango = morango * 2.5;
			valor_maca = maca * 1.8;

			valor_final = valor_morango + valor_maca;

		} else if (morango <= 5 && maca > 5) {

			valor_morango = morango * 2.5;
			valor_maca = maca * 1.5;

			valor_final = valor_morango + valor_maca;

		} else if (morango > 5 && maca <= 5) {

			valor_morango = morango * 2.2;
			valor_maca = maca * 1.8;

			valor_final = valor_morango + valor_maca;

		} else {
			valor_morango = morango * 2.2;
			valor_maca = maca * 1.5;

			valor_final = valor_morango + valor_maca;
		}
		
		if (valor_final > 25 || total_frutas > 8) {
			valor_final = valor_final * 0.90;
		}
		
		qtMac.close();
		qtMor.close();
		
		System.out.println("A quantidade total de frutas compraas � de: " + total_frutas + "Kg, o total a ser pago � de R$" + valor_final);
		System.out.println("Valor total de Morangos: " + valor_morango);
		System.out.println("Valor total de Morangos: " + valor_maca);
	}
}

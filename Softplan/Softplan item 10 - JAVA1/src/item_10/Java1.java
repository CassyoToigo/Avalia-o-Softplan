package item_10;

import java.util.Scanner;

public class Java1 {

	/*
	 * 10. Escrever um método que receba dois números inteiros, positivos e
	 * determine o produto dos mesmos, utilizando o seguinte método de
	 * multiplicação: a) Dividir sucessivamente, o primeiro número por 2, até que se
	 * obtenha 1 como Quociente; b) Paralelamente, dobrar sucessivamente, o segundo
	 * número; c) Somar os números da segunda coluna que tenham um número ímpar na
	 * primeira coluna. O total obtido é o produto procurado. LEMBRETE: para um
	 * número X ser ímpar, a seguinte condição deve ser satisfeita: X mod 2 = 1
	 * (portugol) ou X % 2 == 1 (JAVA) Exemplo: 9 6 ---------------------> 6 4 12
	 * ---------------------> + 0 2 24 ---------------------> + 0 1 48
	 * ---------------------> + 48 54 A seguir, escrever um programa em JAVA que
	 * leia um número indeterminado de pares de números, calculando os respectivos
	 * produtos, chamando o método criado anteriormente. Obs.: Pode ser criado um
	 * JAVA Project e utilizar a classe JOptionPane ou Scanner
	 */
	public static void main(String[] args) {

		Scanner valor1 = new Scanner(System.in);
		System.out.println("insira um valor inteiro positivo:");
		int x = valor1.nextInt();

		Scanner valor2 = new Scanner(System.in);
		System.out.println("insira um valor inteiro positivo:");
		int y = valor2.nextInt();
		
		Java1.calcula(x, y);

		valor1.close();
		valor2.close();

	}

	public static int calcula(int x, int y) {

		int total = 0;

		if (x % 2 == 1) {
			total = total + y;
			System.out.println(x + "  " + y + " ---------> " + y);
		} else {
			System.out.println(x + "  " + y + " ---------> 0");
		}

		while (x > 1) {
			x = x / 2;
			y = y * 2;

			if (x % 2 == 1) {
				total = total + y;
				System.out.println(x + "  " + y + " ---------> +" + y);
			} else {
				System.out.println(x + "  " + y + " ---------> +0");
			}
		}
		System.out.println(total);

		return total;

	}
}

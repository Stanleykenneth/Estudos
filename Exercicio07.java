/* 07 - Faça um programa que receba dois números e mostre o maior. Se pro acaso,
        os dois números forem iguais, imprima a mensagem Números iguais.
 */

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2;

		System.out.println(" Digite o valor do primeiro número:");
		num1 = ler.nextInt();

		System.out.println(" Digite o valor do segundo número:");
		num2 = ler.nextInt();

		if (num1 > num2) {
			System.out.println(" O primeiro número é maior que o segundo!");
		} else if (num1 < num2) {
			System.out.println(" O segundo número é maior que o primeiro!");
		} else {
			System.out.println(" Os números são iguais!");
		}
		
		ler.close();
	}

}

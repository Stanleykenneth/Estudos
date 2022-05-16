/* 06 - Escreva um programa que, dado dois números inteiros, mostre na tela o maior deles,
        assim como a difrença existente entre ambos.
 */

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println(" Digite o valor do primeiro número:");
		num1 = ler.nextInt();
		
		System.out.println(" Digite o valor do segundo número: ");
		num2 = ler.nextInt();
		
		if(num1 > num2) {
			System.out.println(" O primeiro número é maoir que o segundo!");
		} else {
			System.out.println(" O segundo númeo é maior que o primeiro!");
		}
		
		ler.close();
		
	}

}

//01- Faça um programa que receba dois números e mostre qual deles é o maior;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num1;
		int num2;

		System.out.println(" Digite o primeiro número: ");
		num1 = ler.nextInt();

		System.out.println(" Digite o segundo número: ");
		num2 = ler.nextInt();

		if (num1 > num2) {
			System.out.println(" O primeiro número é maior que o segundo número. ");
		} else if (num1 < num2) {
			System.out.println(" O segundo número é maior que o primeiro número. ");
		} else {
			System.out.println(" Os números são iguais! ");
		}
		ler.close();
	}
}

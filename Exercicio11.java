/* 11 - Escreva um programa que leia um numero interio maior que zero e devolva, na tela, a
        a soma do todos os seus algarismos. Por exemplo 251 corespondera o valor 8(2 + 5 +1).
        Se o número lido não for maior que zero, o programa terminará com a mensagem "Número Inválido!"
 */
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int num = 0;
		int soma = 0;

		System.out.println("Digite um número:\n");
		num = ler.nextInt();

		if (num > 0) {
			while (num > 0) {
				soma = soma + num % 10;
				num = num / 10;
				
				System.out.println(" A soma dos algorismo é:" + soma);
			}
			
		} else {
			System.err.println(" Número inválido!");
		}
		ler.close();
		
	}

}

/* 12 - Ler um número interio. Se o número lido for negativo , escreva a mensagem "Número inválido".
        Se o número for positivo, calcular o logaritmo deste número.        
 */
import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num = 0;
		int soma = 0;

		System.out.println("Digite um número:\n");
		num = ler.nextInt();

		if (num < 0) {
			
			System.err.println(" Número inválido!");
			
		} else {
			while (num > 0) {
				soma = soma + num % 10;
				num = num / 10;
				
				System.out.println(" A soma dos algorismo é:" + soma);
			}
			
		}
		ler.close();
		
		
	}

}

/*02-Leia um número fornecido pele usuário.
Se esse número for positivo, calcule a raiz quadrada do número.
Se o número for negativo, mostre uma mensagem dizendo que o número
é invalido.*/

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double num;
		
		System.out.println(" Digite um número: ");
		num = ler.nextDouble();
		
		if(num >= 0) {
			num = Math.sqrt(num);
			System.out.println(num);
		} else if(num < 0 ){
			System.out.println(" Este número é inválido!");
		}
		
		
      ler.close();
	}

}

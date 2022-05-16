/* 03 - Leia um número real. Se o número for positivo imprima a raiz quadrada.
        Do contrário, imprima o número ao quadrado.
 */
import java.util.Scanner;

public class Exercicio03 {

	
	public static void main(String[] args) {
		
		double numero ;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println(" Digite um  número:");
		numero = ler.nextDouble();
					
		if(numero >= 0) {
			numero = Math.sqrt(numero);
			System.out.println(numero);
		} else if( numero < 0) {
			numero = numero * numero;
			System.out.println(numero);
		} 
		
		ler.close();
	}
		
}


/* 04 - Façã um programa que leia um número e, caso ele seja positivo, calucule e mostre:
        . O número digitado ao quadrado.
        . A raiz quadrada do número digitado.
 */
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double num;
		
		System.out.println(" Digite um número: ");
		num = ler.nextDouble();		
				
		if(num >= 0) {
			num = Math.sqrt(num);
			System.out.println(num);
		} else {
			System.out.println(" Número negativo!");
		}
		
		num = num * num;
		System.out.println(num);
		
      ler.close();
	}

}

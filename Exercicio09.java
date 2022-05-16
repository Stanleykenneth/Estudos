/* 09 - Leia o salário de um trabalhador e o valor da prestação de um emprestimo. Se a
        prestação for maior que 20% do salário: Emprima não consedido, caso contrário imprima:
        Empréstimo consedido.
 */

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float salario;
		float prestacao;
		float limite;
		
		System.out.println(" Digite o valor do salário: ");
		salario = ler.nextFloat();
		
		System.out.println(" Digite o valor da prestação: ");
		prestacao = ler.nextFloat();
		
		limite = (float)( salario * 0.20);
		
		if(prestacao > limite) {
			System.out.println(" Emprestimo não consedido!");
		} else {
			System.out.println(" Emprestimo consedido!");
		}
		 ler.close();
	}
	 
}

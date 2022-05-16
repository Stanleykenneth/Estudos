/* 08 - Faça um programa que leia 2 notas de um aluno, vefique se as notas são válidas e exiba
        na tela a média destas notas. Uma nota válida deve ser, obrigatóriamente, um valor entre
        0.0 e 10.0, onde caso a nota não possua um valor válido, este fato deve ser informado ao
        usuário e o programa termina.
 */

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, media;

		System.out.println(" Digite o valor da primeira nota:");
		nota1 = ler.nextDouble();

		System.out.println(" Digite o valor da segunda nota:");
		nota2 = ler.nextDouble();

		media = nota1 + nota2 / 2;

		if (media == 0 && media <= 10) {
			System.out.println(" A nota do aluno é válida. " );
		} else {
			System.out.println(" A nota do aluno não é válida. ");
		}
		ler.close();

	}

}


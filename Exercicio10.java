import java.io.IOException;
/* 10 - Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu peso ideal,
        utilizando as seguentes formulas (Onde h representa a altura):        
         .Homens: (72,7 * h ) - 58
         .Mulheres: (62,1 * h) - 44,7
 */
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);

		char sexo;
	      double h, psIdeal;

	      System.out.printf("Informe o sexo (M/F): ");
	      sexo = (char)System.in.read();

	      System.out.printf("Informe a altura (m): ");
	      h = ler.nextDouble();

	      if ((sexo == 'M') || (sexo == 'm'))
	         psIdeal = (72.7 * h) - 58;
	      else
	         psIdeal = (62.1 * h) - 44.7;
	      
	      ler.close();

	      System.out.printf("\nO Peso Ideal eh: %6.2f kgs.\n", psIdeal);
	} 
	
}

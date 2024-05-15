package estruturaPosCondicionada;

import java.util.Scanner;

public class ExercicioIdade {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 0;
		int idade = 0;
		int soma = 0;

		while (i<=20) {
			System.out.println("Qual é a sua idade? ");
			idade = ler.nextInt();
			i++;

			if (idade>=18) {
				soma = soma + 1;
			}
			
		}
		System.out.println("Pessoas maiores de idade: "+soma);

	}

}
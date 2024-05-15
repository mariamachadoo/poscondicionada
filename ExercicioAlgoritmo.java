package estruturaPosCondicionada;

import java.util.Scanner;

public class ExercicioAlgoritmo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, soma = 0;
		int i = 0;
		
		while (i < 10) {
			System.out.println("Digite um número: ");
			numero = ler.nextInt();
			i++;
			
			soma += numero;
		}
		System.out.println("A soma dos números foi: "+soma);

	}

}

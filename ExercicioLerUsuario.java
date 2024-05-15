package estruturaPosCondicionada;

import java.util.Scanner;

public class ExercicioLerUsuario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 0; 
		int numero;
		String nome;
		
		System.out.println("Digite um nome:");
		nome= ler.nextLine();
		System.out.println("Digite um número:");
		numero= ler.nextInt();
		
		while (i <= numero) {
			System.out.println(nome);
			i++;
		}
	

	}

}

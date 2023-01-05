package br.com.vetorbasico;

import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i, n, aux = 0;
		String vetn[] = new String[99];
		float vetp[] = new float[99];
		float vets[] = new float[99];
		float vetr[] = new float[99];

		System.out.println("Quantos alunos serão digitados?");
		n = ler.nextInt();

		for (i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno:");
			System.out.print("Nome: ");
			ler.nextLine();
			vetn[i] = ler.nextLine();
			System.out.printf("Primeira Nota: ");
			vetp[i] = ler.nextFloat();
			System.out.printf("Segunda Nota: ");
			vets[i] = ler.nextFloat();
		}
		for (i = 0; i < n; i++) {
			vetr[i] = (vetp[i] + vets[i]) / 2;
		}
		System.out.println("Alunos Aprovados: ");
		for (i = 0; i < n; i++) {
			if (vetr[i] >= 6) {
				System.out.println(vetn[i]);
			}
		}
	}
}

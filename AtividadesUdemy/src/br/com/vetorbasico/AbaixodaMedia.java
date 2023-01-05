package br.com.vetorbasico;

import java.util.Scanner;

public class AbaixodaMedia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i, n;
		float soma, med;
		int vet[] = new int[99];

		System.out.println("Quantos elementos vai ter o vetor?");
		n = ler.nextInt();

		System.out.println("Digite um número:");
		for (i = 0; i < n; i++) {
			vet[i] = ler.nextInt();
		}
		soma = 0;
		for (i = 0; i < n; i++) {
			soma = soma + vet[i];
		}
		med = soma / n;
		System.out.printf("Média: %.3f", med);
		System.out.print("\nElementos abaixo da Média: \n");
		for (i = 0; i < n; i++) {
			if (vet[i] < med) {
				System.out.print(vet[i] + " ");
			}
		}
	}

}

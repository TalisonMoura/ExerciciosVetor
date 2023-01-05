package br.com.vetorbasico;

import java.util.Scanner;

public class VetorPar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int qtdP = 0, i = 0, n;
		int vet[] = new int[99];

		System.out.println("Quantos números serão inseridos?");
		n = ler.nextInt();

		System.out.println("Entre com um número");
		for (i = 0; i < n; i++) {
			vet[i] = ler.nextInt();
		}
		System.out.println("Números Pares dentro do Vetor:");
		for (i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i]++ + " ");
				qtdP++;
			}

		}
		System.out.print("\nQuantidade de Números Pares: " + qtdP);

	}

}

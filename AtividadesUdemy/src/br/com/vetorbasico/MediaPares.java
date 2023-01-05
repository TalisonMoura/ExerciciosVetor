package br.com.vetorbasico;

import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i, n;
		float media = 0, soma = 0, aux = 0;
		int vet[] = new int[99];

		System.out.println("Quantos elementos vai ter o vetor?");
		n = ler.nextInt();

		System.out.println("Digite um número:");
		for (i = 0; i < n; i++) {
			vet[i] = ler.nextInt();
		}
		for (i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				soma = soma + vet[i];
				aux++;
			}
		}
		if (aux == 0) {
			System.out.println("NENHUM NÚMERO PAR");
		} else if (aux != 0) {
			media = soma / aux;
			System.out.printf("Média dos Pares: %.1f", media);
		}
	}

}

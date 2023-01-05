package br.com.vetorbasico;

import java.util.Scanner;

public class VetorPosicao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i, n, pos;
		int vet[] = new int[99];

		System.out.println("Quantos números você vai digitar?");
		n = ler.nextInt();

		System.out.println("Insira um número: ");
		for (i = 0; i < n; i++) {
			vet[i] = ler.nextInt();
		}
		int maior = vet[0];
		pos = 0;
		for (i = 1; i < n; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				pos = i;
			}
		}
		System.out.print("Maior número dentro do vetor: " + maior);
		System.out.print("\nPosição do maior Valor: " + pos);
	}

}

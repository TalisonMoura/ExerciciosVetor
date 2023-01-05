package br.com.vetorbasico;

import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i, n, aux3 = 0;
		int veta[] = new int[99];
		int vetb[] = new int[99];
		int vetc[] = new int[99];

		System.out.println("Quantos valores irá ter cada vetor? ");
		n = ler.nextInt();

		System.out.println("Digite os valores do vetor A:");
		for (i = 0; i < n; i++) {
			veta[i] = ler.nextInt();
		}
		System.out.println("Digite os valores do vetor B:");
		for (i = 0; i < n; i++) {
			vetb[i] = ler.nextInt();
		}
		System.out.println("Vetor Resultante: ");
		for (i = 0; i < n; i++) {
			vetc[i] = veta[i] + vetb[i];
		}
		for (i = 0; i < n; i++) {
			System.out.print(vetc[i] + " ");
		}
	}

}

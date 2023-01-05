package br.com.vetorbasico;

import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i, n, aux = 0, pos = 0;
		int veti[] = new int[99];
		String vetn[] = new String[99];

		System.out.println("Quantas pessoas voce vai digitar? ");
		n = ler.nextInt();

		for (i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "ª pessoa:");
			System.out.print("Nome: ");
			vetn[i] = ler.next();
			System.out.print("Idade: ");
			veti[i] = ler.nextInt();
		}
		aux = veti[0];
		for (i = 1; i < n; i++) {
			if (veti[i] > aux) {
				aux = veti[i];
				pos = i;
			}
		}
		System.out.print("Pessoa mais velha: " + vetn[pos]);
	}

}

package br.com.vetorbasico;

import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i, n, contf = 0, contm = 0;
		float aux = 0, aux1 = 0, soma = 0, media = 0;
		float veta[] = new float[99];
		String vetg[] = new String[99];

		System.out.println("Quantas pessoas serão digitadas?");
		n = ler.nextInt();

		for (i = 0; i < n; i++) {
			System.out.printf("Altura da " + (i + 1) + "ª pessoa: ");
			veta[i] = ler.nextFloat();
			System.out.printf("Gênero da " + (i + 1) + "ª pessoa: ");
			ler.nextLine();
			vetg[i] = ler.nextLine();
		}
		aux = veta[0];
		for (i = 1; i < n; i++) {
			if (veta[i] < aux)
				aux = veta[i];
		}
		System.out.printf("Menor Altura: %.2f", aux);
		aux1 = veta[0];
		for (i = 1; i < n; i++) {
			if (veta[i] > aux1)
				aux1 = veta[i];
		}
		System.out.printf("\nMaior Altura: %.2f", aux1);
		for (i = 0; i < n; i++) {
			if (vetg[i].contains("f") || vetg[i].contains("F")) {
				soma = soma + veta[i];
				contf++;
			}
			if (contf == 0) {
				System.out.println("\nImpossivel Calcular a Altura das Mulheres!!!");
			} else {
				media = soma / contf;
				System.out.printf("\nMédia das alturas das Mulheres: %.2f", media);
			}
			for (i = 0; i < n; i++) {
				if (vetg[i].contains("m") || vetg[i].contains("M")) {
					contm++;
				}
			}
			System.out.print("\nNúmero de Homens: " + contm);
		}

	}
}
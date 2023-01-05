package br.com.vetorbasico;

import java.util.Scanner;

public class Comerciante {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i, n, abaixo=0,entre=0,acima=0;
		float somac = 0, somav = 0, lucrot = 0, aux = 0;
		String nome[] = new String[99];
		float compra[] = new float[99];
		float venda[] = new float[99];
		float lucro[] = new float[99];

		System.out.println("Serão digitados dados de quantos produtos?");
		n = ler.nextInt();

		for (i = 0; i < n; i++) {
			System.out.println("Produto " + (i + 1) + ":");
			System.out.print("Nome: ");
			ler.nextLine();
			nome[i] = ler.nextLine();
			System.out.printf("Preco de Compra: ");
			compra[i] = ler.nextFloat();
			System.out.printf("Preço de Venda: ");
			venda[i] = ler.nextFloat();
		}
		
		for (i = 0; i < n; i++) {
			lucro[i] = (venda[i] - compra[i]) * 100 / compra[i];
			if (lucro[i] < 10) {
				abaixo++;
			} else if (lucro[i] >= 10 && lucro[i] <= 20) { // else if (lucro[i] <= 20) , outra maneira de executar esse comando, dentro da lógica aplicada.
				entre++;
			} else if (lucro[i] > 20) {
				acima++;
			}
		}
		for(i=0;i<n;i++)	{
			somac = somac + compra[i];
			somav = somav + venda[i];
			lucro[i] = venda[i] - compra[i];
			lucrot = lucrot + lucro[i];
		}	
		System.out.print("Relatório:");
		System.out.print("\nLucro abaixo de 10%: " + abaixo);
		System.out.print("\nLucro entre 10% e 20%: " + entre);
		System.out.print("\nLucro acima de 20%: " + acima);
		System.out.printf("\nValor total de compra: %.2f" , somac);
		System.out.printf("\nValor total de venda: %.2f" , somav);
		System.out.printf("\nLucro total: %.2f" , lucrot);

	}

}

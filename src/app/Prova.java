package app;

import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cont=1, contPeso=0;
		double peso=0, SomaPeso=0, MediaPeso=0;
		
		do{
			do {
				
				System.out.println("Digite o Peso " + cont + ":");
				peso = sc.nextDouble();
				
				if(peso<=0) {
					System.out.println("\n[ERRO]\nVALOR DO PESO INVÁLIDO!\nDigite um novo valor MAIOR que 0 abaixo!\n");
				}
				
			}while(peso<=0);
			
			
			if(peso>=40 && peso<=60) {
				contPeso++;
			}
			
			SomaPeso = SomaPeso + peso;
			cont++;

		}while(cont<=10);
		
		MediaPeso = SomaPeso/(cont-1);
		
		System.out.println("\n*-- RESULTADO --*");
		System.out.println("\nQuantidade de Pessoas com peso entre 40 e 60: " + contPeso);
		System.out.printf("Soma total dos pessoas (10 Pessoas):  %.2f\n", SomaPeso);
		System.out.printf("Media do Peso (10 Pessoas): %.2f\n", MediaPeso);
		System.out.println("\n*-- FIM DO PROGRAMA --*");
	}

}

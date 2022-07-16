package questao2;

import java.util.Arrays;
import java.util.Scanner;

public class Questao {

public static void main(String[] args) {
Scanner entrada = new Scanner(System.in );
	
	int vetor [] = new int[10] ;
	int soma = 0;
	double media = 0.0;
	
	System.out.println("Informe dez numeros: ");
	
	for(int i = 0 ; i < vetor.length;i++) {
		vetor[i] = entrada.nextInt();
		soma += vetor[i];
		for(int y = 0; y < i;y++) {
			if(vetor[y] == vetor[i]) {
				System.out.println("Esse numero ja existe, informe outro: ");
				vetor[i] -= vetor[y];
				vetor[i]=entrada.nextInt();
			}	
		}		
	}
//	System.out.println(Arrays.toString(vetor));
	media = soma /10;
	System.out.println("\nMaior numero: " + maiorNumero(vetor));
	System.out.println("Menor numero: " + menorNumero(vetor));
	System.out.println("Media aritmetica: " + media);

	System.out.println("Quantidade de numeros maiores que 10 sao: "+totalNumerosMaioresQue10(vetor));
	
	mostrarNumerosMaioresQue10(vetor);
	
	System.out.println("\nQuantidade de numeros maiores que 50 sao: "+totalDeNumerosMaioresQue50(vetor));
	
	mostrarNumerosMaioresQue50(vetor);
}

public static int maiorNumero(int v[]) {
	
		int maior = Integer.MIN_VALUE;
		for(int i = 0;i<v.length;i++) {
			if(v[i] > maior) {
				maior = v[i];
			}
		}
		
		return maior;
}

public static int menorNumero(int v[]) {
	
		int menor = Integer.MAX_VALUE;
		for(int i = 0; i < v.length; i++) {
			if(v[i] < menor) {
				menor = v[i];
			}
		}
		
		return menor;
}

public static int totalNumerosMaioresQue10(int v[]) {
		
		int numerosMaioresQue10 = 0;
	 	for(int i = 0; i < v.length; i++) {
	 		if(v[i] > 10 && v[i] < 50) {
				numerosMaioresQue10++;	
			}
		}
	 	
		return numerosMaioresQue10 ;
}

public static void mostrarNumerosMaioresQue10(int[] v) {
	
		int maiorQue10[]=new int [v.length];
		for(int i = 0; i < v.length; i++) {
			if(v[i] > 10 && v[i] < 50 ) {	
				maiorQue10[i] = v[i];	
			}		
		}
		
		System.out.println("Os numeros maiores que 10 sao:");
		for(int maiores: maiorQue10) {
			if(maiores !=0) {
		      System.out.println(maiores);
			}
		}
}

public static int totalDeNumerosMaioresQue50(int v[]) {
	
		int numerosMaioresQue50 = 0;
		for(int i = 0; i < v.length; i++) {
			if(v[i] > 50) {
				numerosMaioresQue50++;	
			}	
		}
		
		return numerosMaioresQue50;
}

public static  void mostrarNumerosMaioresQue50(int[] v) {

		int maiorQue50[] = new int[v.length];
		for(int i =0; i < v.length; i++) {	
			for(int y=0; y < maiorQue50.length;y++) {
				if(v[y] > 50) {
					maiorQue50[y]=v[y];
				} 
			}	
		}
		
		System.out.println("Os numeros maiores que 50 sao: ");
		for(int maiores : maiorQue50) {
			if(maiores !=0) {
				System.out.println(maiores);
			}
		}	
	}

}

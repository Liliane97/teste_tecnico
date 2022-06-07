package questao4;

import java.util.Random;
import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random geradorDeNumeros = new Random();
		geradorDeNumeros.nextInt(10);
		System.out.println("Infome um número: ");
		int n=0;
		n = entrada.nextInt();
		
		
		if(n == geradorDeNumeros.nextInt()) {
			System.out.println("Voce acertou");
		}else {
			System.out.println("voce errou");
		}
		
	
		
	}
}

package questao4;

import java.util.Random;
import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Random gerador = new Random();
		int gerarNumero = gerador.nextInt(10);
		int n = 0;
		
		do {
			System.out.println("Informe um número de 0 a 10: ");
			n = entrada.nextInt();
			
			if(n == gerarNumero) {
				System.out.println("Parabéns você acertou");
			}else {
				System.out.println("Você errou, tente novamente!!!\n");
			}
		}while(n !=gerarNumero);
		
	
	}
}

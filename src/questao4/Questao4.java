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
			System.out.println("Informe um n�mero de 0 a 10: ");
			n = entrada.nextInt();
			
			if(n == gerarNumero) {
				System.out.println("Parab�ns voc� acertou");
			}else {
				System.out.println("Voc� errou, tente novamente!!!\n");
			}
		}while(n !=gerarNumero);
		
	
	}
}

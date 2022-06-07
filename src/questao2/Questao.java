package questao2;

import java.util.Scanner;



public class Questao {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in );
	
	int maior =0;
	int menor;
	int media;
	int numero = 5;
	int qtd [] = new int [numero];
	
	System.out.printf("Informe dez números: ");
//	numero = entrada.nextInt();	
	
	for(int i=0 ; i <qtd.length;i++) {
		qtd[i] = entrada.nextInt();	 
	}
	
	
	System.out.println("Números acima de 10 são: "+ maiorNumero(qtd, numero));
}

public static int maiorNumero(int v [],int n) {
 int maior= Integer.MIN_VALUE;
 int total=0;
	for(int i=0; i< n; i++) {
		if(v[i] > maior) {
			maior= v[i];
			
		}
	}
	return maior;
}


}

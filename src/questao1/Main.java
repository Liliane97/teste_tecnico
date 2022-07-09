package questao1;

public class Main {
public static void main(String[] args) {
	
	Caixa caixa = new Caixa();
<<<<<<< HEAD
	
	Produto banana = new Produto();
	Produto energetico = new Produto();
	Produto arroz = new Produto();
	Produto chocolate = new Produto();
	Produto leite = new Produto();
	Produto abacaxi = new Produto();
	
	banana.setNome("Banana");
	banana.setTipo(2);
	banana.setValor(0.99);
	
	energetico.setNome("Energetica");
	energetico.setTipo(3);
	energetico.setValor(5.49);
	
	arroz.setNome("Arroz");
	arroz.setTipo(1);
	arroz.setValor(20);
	
	chocolate.setNome("Chocolate");
	chocolate.setTipo(1);
	chocolate.setValor(4.50);
	
	leite.setNome("Leite");
	leite.setTipo(3);
	leite.setValor(3.73);
	
	abacaxi.setNome("Abacaxi");
	abacaxi.setTipo(2);
	abacaxi.setValor(2.40);
	
	

	System.out.println("Banana R$: " + caixa.calculaValorFinal(banana,3));
	System.out.println("Energético R$:" + caixa.calculaValorFinal(energetico,7));
	System.out.println("Arroz R$: " + caixa.calculaValorFinal(arroz,1));
	System.out.println("Chocolate R$: " + caixa.calculaValorFinal(chocolate,12));
	System.out.println("Leite R$: " + caixa.calculaValorFinal(leite,5));
	System.out.println("Abacaxi R$: " + caixa.calculaValorFinal(abacaxi,1));
=======
	Produto banana = new Produto();
	Produto energetico = new Produto();
	Produto arroz = new Produto();
	Produto chocolate = new Produto();
	Produto leite = new Produto();
	Produto abacaxi = new Produto();
	
	banana.setNome("Banana");
	energetico.setNome("Energética");
	arroz.setNome("Arroz");
	chocolate.setNome("Chocolate");
	leite.setNome("Leite");
	abacaxi.setNome("Abacaxi");
	banana.setTipo("2");
   energetico.setTipo("3");
	arroz.setTipo("1");
	chocolate.setTipo("1");
	leite.setTipo("3");
	abacaxi.setTipo("3");
	System.out.println(banana.getNome()+"  \t\tValor total: "+caixa.calculaValorFinal(0.99, 3));
	System.out.println(energetico.getNome()+"\t\tValor total: "+caixa.calculaValorFinal(5.49, 7));
	System.out.println(arroz.getNome()+"    \t\tValor total: "+caixa.calculaValorFinal(20.00, 1));
	System.out.println(chocolate.getNome()+"\t\tValor total: "+caixa.calculaValorFinal(4.50, 12));
	System.out.println(leite.getNome()+"    \t\tValor total: "+caixa.calculaValorFinal(3.73, 5));
	System.out.println(abacaxi.getNome()+"  \t\tValor total: "+caixa.calculaValorFinal(2.40, 1));
//

>>>>>>> 8e7e89c77ca448c76b7a6ae9dd25c4155f1f417c
}
}

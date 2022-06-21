package questao1;

public class Main {
public static void main(String[] args) {
	
	Caixa caixa = new Caixa();
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

}
}

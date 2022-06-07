package questao1;

public class Main {
public static void main(String[] args) {
	
	Produto produtos = new Produto();
	produtos.setNome("Banana");
	produtos.setValor(0.99);
	produtos.setNome("Energético");
	produtos.setValor(5.49);
	produtos.setNome("Arroz");
	produtos.setValor(20.00);
	produtos.setNome("Chocolate");
	produtos.setValor(4.50);
	produtos.setNome("Leite");
	produtos.setValor(3.73);
	produtos.setNome("Abacaxi");
	produtos.setValor(2.40);
	
	System.out.println(produtos.getNome());
	System.out.println(produtos.getValor());
	System.out.println(produtos.getNome());
	System.out.println(produtos.getNome());
	
}
}

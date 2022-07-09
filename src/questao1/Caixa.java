package questao1;

public class Caixa{
	
	public Caixa() {
		

	}
	
	public double calculaValorFinal(Produto produto,int quantidade) {

			double total= produto.valor *= quantidade;
			double valorDesconto = 0.0;
			double desconto= 0.0;
			
			if(produto.tipo == 1) {
				valorDesconto = total * 0.1;
				desconto =total - valorDesconto;
			}else if(produto.tipo == 2) {
				valorDesconto = total * 0.2;
				desconto =(total - valorDesconto);
				desconto =total - valorDesconto;
			}else if(produto.tipo == 3 && quantidade > 5) {
				valorDesconto = total * 0.1;
				desconto =total - valorDesconto;
			}else {
				return total;
			}
		return  desconto;
	}
	
}

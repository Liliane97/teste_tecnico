package questao1;

public class Caixa{
	
	public Caixa() {
		
<<<<<<< HEAD
=======
	}
	public double calculaValorFinal(double valor,int quantidade) {
		double total=0;
		double desconto=0;
		double valorFinal=0;
			if(getNome() == getTipo() ) {
				total = valor * quantidade;
				desconto = (total * 10)/100;
			     valorFinal = Math.round(total- desconto) ;
			}else if(getNome() == getTipo()) {
				total = valor * quantidade;
				desconto = (total * 20)/100;
			     valorFinal = Math.round(total- desconto) ;
			}
//			else if(tipo == "3"  && quantidade == 5) {
//				total = valor * quantidade;
//				desconto = (total * 10)/100;
//			     valorFinal = Math.round(total- desconto) ;
//			}
			
			
			
		
		return valorFinal;
>>>>>>> 8e7e89c77ca448c76b7a6ae9dd25c4155f1f417c
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

package questao1;

public class Caixa   extends Produto{
	
	public Caixa() {
		
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
	}
}

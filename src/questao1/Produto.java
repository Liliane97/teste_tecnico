package questao1;

public class Produto {
	protected String nome;
	protected double valor;
	protected int tipo1;
	protected int tipo2;
	protected int tipo3;
	
	public Produto() {
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
	
	public void setTipo1(int tipo1) {
		this.tipo1 = tipo1;
	}
	public int getTipo1() {
		return tipo1;
	}
	public void setTipo2(int tipo2) {
		this.tipo2 = tipo2;
	}
	public int getTipo2() {
		return tipo1;
	}
	public void setTipo3(int tipo3) {
		this.tipo3 = tipo3;
	}
	public int getTipo3() {
		return tipo3;
	}
	
}

package questao1;

public class Produto {
<<<<<<< HEAD
=======
	protected String nome;
	protected double valor=0;
	protected String tipo;

>>>>>>> 8e7e89c77ca448c76b7a6ae9dd25c4155f1f417c
	
	protected String nome;
	protected double valor=0;
	protected int tipo;

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
	
<<<<<<< HEAD
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public int getTipo() {
		return tipo;
	}
	
=======
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
>>>>>>> 8e7e89c77ca448c76b7a6ae9dd25c4155f1f417c
}

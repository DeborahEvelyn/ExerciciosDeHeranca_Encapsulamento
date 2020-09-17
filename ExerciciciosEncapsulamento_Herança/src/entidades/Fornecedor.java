package entidades;

public class Fornecedor extends Pessoa {
	
	private int valorCredito;
	private int valorDivida;
	private int obterSaldo;
	
	public Fornecedor(String nome, int valorCredito) {
		super(nome);
		this.valorCredito = valorCredito;
	}

	public Fornecedor(String nome, int valorCredito, int valorDivida) {
		super(nome);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public Fornecedor(String nome, int valorCredito, int valorDivida, int obterSaldo) {
		super(nome);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		this.obterSaldo = obterSaldo;
	}
	
	

	public Fornecedor(String nome, String endereço, long telefone, int valorCredito, int valorDivida, int obterSaldo) {
		super(nome, endereço, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		this.obterSaldo = obterSaldo;
	}
	
	
	
	public int getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}

	public int getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(int valorDivida) {
		this.valorDivida = valorDivida;
	}

	public int getObterSaldo() {
		return obterSaldo;
	}

	public void setObterSaldo(int obterSaldo) {
		this.obterSaldo = obterSaldo;
	}
	
	public void MostraSaldo (){
		obterSaldo = valorCredito-valorDivida;
		
		System.out.println(obterSaldo);
	}

	
	
	
}

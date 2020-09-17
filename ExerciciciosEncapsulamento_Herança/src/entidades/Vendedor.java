package entidades;

public class Vendedor extends Pessoa{
	
	private double valorVendas;
	private double comissao;
	
	public Vendedor(String nome, String endereço, long telefone, double valorVendas, double comissao) {
		super(nome, endereço, telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
		double salario=0;
		salario = getValorVendas()*getComissao();
		return salario;
	}
	

}

package entidades;

public class Empregado extends Pessoa{
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	
		
	
	public Empregado(String nome, long telefone, int codigoSetor) {
		super(nome, telefone);
		this.codigoSetor = codigoSetor;
	}


	public Empregado(String nome, String endere�o, long telefone, int codigoSetor, double salarioBase, double imposto) {
		super(nome, endere�o, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	
	
	public int getCodigoSetor() {
		return codigoSetor;
	}


	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}


	public double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public double getImposto() {
		return imposto;
	}


	public void setImposto(double imposto) {
		this.imposto = imposto;
	}


	public double calcularSalario() {
		double salario=0;
		salario = getSalarioBase()-getImposto();
		return salario;
	}

}

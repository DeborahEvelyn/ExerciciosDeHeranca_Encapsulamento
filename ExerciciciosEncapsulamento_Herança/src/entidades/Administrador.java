package entidades;

public class Administrador extends Pessoa {
	
	private int ajudaDeCusto;

	public Administrador(String nome, String endereço, long telefone, int ajudaDeCusto) {
		super(nome, endereço, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public int getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(int ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
	
	
	

}

package entidades;

public class Administrador extends Pessoa {
	
	private int ajudaDeCusto;

	public Administrador(String nome, String endere�o, long telefone, int ajudaDeCusto) {
		super(nome, endere�o, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public int getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(int ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
	
	
	

}

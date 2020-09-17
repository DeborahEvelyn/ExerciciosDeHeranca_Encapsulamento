package entidades;

public class Pessoa {
	
	private String nome; 
	private String endere�o; 
	private long telefone;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}


	public Pessoa(String nome, long telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}


	public Pessoa(String nome, String endere�o, long telefone) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndere�o() {
		return endere�o;
	}


	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}


	public long getTelefone() {
		return telefone;
	}


	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	
	
	
	

}

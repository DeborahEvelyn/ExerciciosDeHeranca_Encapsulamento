package entidades;

public class Pessoa {
	
	private String nome; 
	private String enderešo; 
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


	public Pessoa(String nome, String enderešo, long telefone) {
		super();
		this.nome = nome;
		this.enderešo = enderešo;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEnderešo() {
		return enderešo;
	}


	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}


	public long getTelefone() {
		return telefone;
	}


	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	
	
	
	

}

package pacote1;

public class Produto {
	
	
	
	
	
	public Produto(int id, String nome) {
		//super();
		this.id = id;
		Nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	private int id;
	private String Nome;
	
	
	@Override
	public String toString() {
		return getNome();
	}
	
	
	

}

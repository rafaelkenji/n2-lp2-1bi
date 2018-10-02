package pacote1;

public class MomentoPag {

	private int id;
	private String Nome;
	
	public MomentoPag(int id, String nome) {
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
	
	
	@Override
	public String toString() {
		return getNome();
	}
	
}

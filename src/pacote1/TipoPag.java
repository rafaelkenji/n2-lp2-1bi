package pacote1;

public class TipoPag {
	
	private int id;
	private String Tipo;
	
	
	
	public TipoPag(int id, String tipo) {
		this.id = id;
		Tipo = tipo;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}


	@Override
	public String toString() {
		return getTipo();
	}
	
	

}

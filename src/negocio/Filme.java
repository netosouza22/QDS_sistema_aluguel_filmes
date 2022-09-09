package negocio;

public class Filme {
	protected int id;
	protected String name;
	protected Genero genero;
	protected int value;
	protected double valorCompra;
	
	public Filme(int id, String name, Genero genero, int value) {
		this.name = name;
		this.genero = genero;
		this.id = id;
		this.value = value;
	}

	public String getName() {
		return this.name;
	}

}

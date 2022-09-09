package negocio;

public class Cliente {
	protected String name;
	protected int id;
	protected boolean isActive;
	protected int money;
	
	public Cliente(int id, String name, int money, boolean isActive ) {
		this.name = name;
		this.id = id;
		this.money  = money;
		this.isActive = isActive;
	}
	
}

package exercioHerança;

public class Cachorro extends Animal {
	private String pula;
	
	public Cachorro (String nome, int idade, boolean som, boolean corre, String pula)
	{
		super(nome,idade,som,corre);
		this.pula = pula;
		
	}

	public String getPula() {
		return pula;
	}

	public void setPula(String pula) {
		this.pula = pula;
	}
	
}

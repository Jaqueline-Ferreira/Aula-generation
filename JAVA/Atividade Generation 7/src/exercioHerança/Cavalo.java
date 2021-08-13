package exercioHerança;

public class Cavalo extends Animal {
	private String relincha ;
	
	public Cavalo (String nome, int idade, boolean som, boolean corre, String relincha)
	{
		super(nome,idade,som,corre);
		this.relincha = relincha;
		
	}

	public String getRelincha() {
		return relincha;
	}

	public void setRelincha(String relincha) {
		this.relincha = relincha;
	}


}

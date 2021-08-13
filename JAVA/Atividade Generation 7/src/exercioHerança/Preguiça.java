package exercioHerança;

public class Preguiça extends Animal {
	private String dorme;
	
	public Preguiça (String nome, int idade, boolean som, boolean subirEmArvores, String dorme)
	{
		super(nome,idade,som,subirEmArvores);
		this.dorme = dorme;
		
	}

	public String getDorme() {
		return dorme;
	}

	public void setDorme(String dorme) {
		this.dorme = dorme;
	}


}



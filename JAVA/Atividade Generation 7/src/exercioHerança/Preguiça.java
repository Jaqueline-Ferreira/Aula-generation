package exercioHeran�a;

public class Pregui�a extends Animal {
	private String dorme;
	
	public Pregui�a (String nome, int idade, boolean som, boolean subirEmArvores, String dorme)
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



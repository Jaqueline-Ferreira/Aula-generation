package polimorfismo;

public class Preguiça extends Animal {
	private String nome;
	
	public Preguiça()
	{
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSom()
	{
		return "Preguiça: "+super.getSom()+" - som:"+this.getNome();
	}

}


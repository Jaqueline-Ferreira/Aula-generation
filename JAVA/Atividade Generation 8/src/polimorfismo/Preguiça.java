package polimorfismo;

public class Pregui�a extends Animal {
	private String nome;
	
	public Pregui�a()
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
		return "Pregui�a: "+super.getSom()+" - som:"+this.getNome();
	}

}


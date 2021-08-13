package polimorfismo;

public class Cavalo extends Animal {
	private String nome;

	public Cavalo ()
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
		return "Cavalo: "+super.getSom()+" - som:"+this.getNome();
	}

}

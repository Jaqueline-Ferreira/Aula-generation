package polimorfismo;

public class Cachorro extends Animal {
	
	public Cachorro ()
	{
		
	}
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSom()
	{
		return "Cachorro: "+super.getSom()+" - som:"+this.getNome();
	}

}

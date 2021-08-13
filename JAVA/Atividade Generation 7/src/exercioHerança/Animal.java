package exercioHerança;

public class Animal {
	private String nome;
	private int idade;
	private boolean som;
	private boolean corre;
	private boolean subirEmArvores;
	
	public Animal (String nome, int idade, boolean som, boolean corre, boolean subirEmArvores)
	{
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.corre = corre;
		this.subirEmArvores = subirEmArvores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isSom() {
		return som;
	}

	public void setSom(boolean som) {
		this.som = som;
	}

	public boolean isCorre() {
		return corre;
	}

	public void setCorre(boolean corre) {
		this.corre = corre;
	}

	public boolean isSubirEmArvores() {
		return subirEmArvores;
	}

	public void setSubirEmArvores(boolean subirEmArvores) {
		this.subirEmArvores = subirEmArvores;
	}
	
}

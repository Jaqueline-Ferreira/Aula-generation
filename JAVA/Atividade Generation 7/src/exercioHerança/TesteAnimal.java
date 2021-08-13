package exercioHerança;

public class TesteAnimal {
	public static void main (String args [])
	{
		Animal Cachorro = new Animal("Lili", 3,"sim", "sim", "sim");
		Animal Cavalo = new Animal("Dudu", 5,"sim", "sim", "sim");
		Animal Preguiça = new Animal("Juca", 6,"sim", "sim", "sim");
		
		System.out.println(Cachorro.getNome());
		System.out.println(Cavalo.getNome());
		System.out.println(Preguiça.getNome());
		
	}

}

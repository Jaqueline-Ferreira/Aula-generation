package polimorfismo;

public class TestePolimorfismo {
	public static void main (String args [])
	{
		Cachorro cachorro = new Cachorro();
		cachorro.setSom("au-au");
		cachorro.setNome("cachorro");
		
		Cavalo cavalo = new Cavalo();
		cavalo.setSom("iiirrrrí");
		cavalo.setNome("cavalo");
		
		Preguiça preguiça = new Preguiça();
		preguiça.setSom("AAAAAAAAA");
		preguiça.setNome("Preguiça");
		
		Animal[] animais = new Animal[3];
		animais[0]=cachorro;
		animais[1]=cavalo;
		animais[2]=preguiça;
		
		for(Animal animal:animais)
		{
			System.out.println(animal.getSom());
		}
		
	}

}

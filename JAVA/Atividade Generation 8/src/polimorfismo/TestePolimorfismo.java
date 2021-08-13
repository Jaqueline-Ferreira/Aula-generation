package polimorfismo;

public class TestePolimorfismo {
	public static void main (String args [])
	{
		Cachorro cachorro = new Cachorro();
		cachorro.setSom("au-au");
		cachorro.setNome("cachorro");
		
		Cavalo cavalo = new Cavalo();
		cavalo.setSom("iiirrrr�");
		cavalo.setNome("cavalo");
		
		Pregui�a pregui�a = new Pregui�a();
		pregui�a.setSom("AAAAAAAAA");
		pregui�a.setNome("Pregui�a");
		
		Animal[] animais = new Animal[3];
		animais[0]=cachorro;
		animais[1]=cavalo;
		animais[2]=pregui�a;
		
		for(Animal animal:animais)
		{
			System.out.println(animal.getSom());
		}
		
	}

}

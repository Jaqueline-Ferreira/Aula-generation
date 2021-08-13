package teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {
	public static void main(String args[])
	{
		Collection<String> itens = new ArrayList();
		itens.add("Vestido");
		itens.add("Meias");
		itens.add("Calça");
		itens.add("Blusa");
		Collection<String> itens2 = Arrays.asList("Camisa", "Saia");
		itens.addAll(itens2);
		System.out.println("Lista de itens da loja: "+itens);
		
		/*System.out.println("Lista de  itens da loja: "+itens);
		itens.remove("Meias");
		System.out.println("Lista de  itens da loja: "+itens);*/
		/*if(itens.isEmpty())
		{
			System.out.println("Lista vazia...");	
		}
		else
		{
			System.out.println("Lista de itens: "+itens);*/
		}
				
	}


package exercicio;

import java.util.Scanner;

public class ExercicioLa�oDeRepeti��o {

	public static void main(String[] args) {

		int numero;
		float media3,soma3=0,cont3=0;
		
		Scanner leia = new Scanner(System.in);
		
		//System.out.println("\nEntre com um n�mero: ");
		//numero = leia.nextInt(); //3
		
		do
		{
			System.out.println("\nEntre com um n�mero: ");
			numero = leia.nextInt();
			if(numero % 3 == 0 && numero!=0)
			{
				soma3 = soma3 + numero;
				cont3++;
				System.out.println("\n"+cont3);
			}
			
			
		}
		while(numero!=0);
		
		if(cont3!=0)
		{
		media3 = soma3 / cont3;
		
		System.out.println("\nM�dia dos n�meros m�ltiplos de 3: "+ media3);
		}
		else
		{
			media3=0;
			System.out.println("\nM�dia dos n�meros m�ltiplos de 3: "+ media3);
		}
	}

}

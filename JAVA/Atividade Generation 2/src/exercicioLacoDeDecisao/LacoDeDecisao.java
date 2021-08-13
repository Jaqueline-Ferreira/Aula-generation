package exercicioLacoDeDecisao;

import java.util.Scanner;

public class LacoDeDecisao {
	public static void main(String args[])
	{
		
		Scanner ler = new Scanner(System.in);
		int N1,N2,N3;
		
		System.out.println("Digite seu primeiro numero : ");
		N1 = ler.nextInt();
		
		System.out.println("Digite seu segundo numero: ");
		N2 = ler.nextInt();
		
		System.out.println("Digite seu terceiro numero");
		N3 = ler.nextInt();
		
		if(N1>=N2 && N1>=N3)
		{
			System.out.println("O maior numero é: "+ N1);
		}
		
		if(N2>=N3 && N2>=N1)
		{
			System.out.println("O maior numero é: "+ N2);
		}
		
		if(N3>=N2 && N3>=N1)
		{
			System.out.println("O maior numero é: "+ N3);
		}
	}
	
}


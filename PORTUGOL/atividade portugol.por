programa
{
	
	funcao inicio()
	{
		inteiro pont[5], maiorpont=0
		inteiro x=0
	

		para(x=0; x<5; x++)
		{

			escreva("Digite sua pontuação: ")
			leia(pont[x])

			se(maiorpont<pont[x])
				{
				
				maiorpont=pont[x]
				
				}
		}
		escreva("\nA maior pontuação foi: ", maiorpont)
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 301; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
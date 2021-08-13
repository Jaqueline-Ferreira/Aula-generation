package exercicio;

public class ContaBancaria {
	private String nome;
	private float saldo;
	private boolean ativo;
	
	public ContaBancaria (String nome, float saldo, boolean ativo)
	{
		this.nome =  nome;
		this.saldo = saldo;
		this.ativo = ativo;
	}
	
	public String getNome()
	{
	return nome;
	}
	
	public float getSaldo()
	{
	return saldo;
	}
	
	public boolean getAtivo()
	{
	return ativo;
	}

	public void depositar(float deposito) 
	{
		this.saldo = saldo + deposito;
	}
	public String dadosContas () 
	{
		String estadoConta = "";
		
		if(ativo == false) 
		{
			estadoConta += "NÃO ESTA ATIVA";
		} else	{
			estadoConta += "ESTA ATIVA";
		}
			
		
		return "DONO DA CONTA : " + nome +
			   "\nSALDO DA CONTA : " + saldo +
			   "\nESTADO DA CONTA : " + estadoConta;
	}
	
}

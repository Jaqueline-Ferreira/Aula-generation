package exercicio;

public class AtividadePOO {
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("JAQUE", 1000, true);
	
		System.out.println(conta1.dadosContas());
		
		conta1.depositar(14);
		
		System.out.println(conta1.dadosContas());
		
	}

}

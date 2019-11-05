package Contas;

public class TestaConta {
	public static void main(String[] args) {
		try {
			ContaPoupanca conta1 = new ContaPoupanca("Diego Climaites", 1);
			ContaCorrente conta2 = new ContaCorrente("Felipe Climaites", 2);
			
			conta1.deposita(300000);
			conta1.saque(470);
			//System.out.println(conta1.getSaldo());
			
			conta2.deposita(700);
			conta2.saque(300);
			//System.out.println(conta2.getSaldo());
			
			System.out.println(conta1.getTitular());
			System.out.println(conta1.getNumero());
			System.out.println(conta1.getSaldo());
			System.out.println(conta1.getTipo());
			
			System.out.println(conta2.getTitular());
			System.out.println(conta2.getNumero());
			System.out.println(conta2.getSaldo());
			System.out.println(conta2.getTipo());
			
			if(ClassificacaoClientes.BAIXO.isCompatible(conta1))
				System.out.println("Conta 1 é de baixo potencial");
			else if(ClassificacaoClientes.MEDIO.isCompatible(conta1))
				System.out.println("Conta 1 é de médio potencial");
			else if(ClassificacaoClientes.POTENCIAL.isCompatible(conta1))
				System.out.println("Conta 1 é de grande potencial");
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

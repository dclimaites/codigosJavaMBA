package Contas;

public class TestaConta {
	public static void main(String[] args) {
		try {
			ContaPoupanca conta1 = new ContaPoupanca("Diego Climaites", 1);
			ContaCorrente conta2 = new ContaCorrente("Felipe Climaites", 2);
			
			conta1.deposita(500);
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
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

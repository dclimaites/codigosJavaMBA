
public class TestaConta {
	public static void main(String[] args) {
		try {
			ContaBancaria conta1 = new ContaBancaria("Diego Climaites", 1);
			ContaBancaria conta2 = new ContaBancaria("Felipe Climaites", 2);
			
			conta1.deposita(500);
			conta1.saque(477.75);
			System.out.println(conta1.getSaldo());
			
			conta2.deposita(700);
			conta2.saque(300.75);
			System.out.println(conta2.getSaldo());
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

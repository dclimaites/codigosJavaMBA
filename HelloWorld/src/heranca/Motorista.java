package heranca;

public class Motorista extends Funcionario {
	Motorista() {
		
	}
	
	Motorista(int numero, String nome) {
		super(numero, nome);
	}
	
	public void dirige() {
		System.out.println("Motorista que trabalha");
	}
	
	@Override
	public void trabalha() {
		System.out.println("Motorista que trabalha");
	}
	
	public int getBonificacao() {
		return 60;
	}
	
}

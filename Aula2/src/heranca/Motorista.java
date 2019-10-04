package heranca;

public class Motorista extends Funcionario {
	public void dirige() {
		System.out.println("Motorista que trabalha");
	}
	
	@Override
	public void trabalha() {
		System.out.println("Motorista que trabalha");
	}
	
}

package Contas;

public class ContaCorrente extends ContaBancaria {
	
	public ContaCorrente(String titular, int numero) {
		super(titular, numero);
	}
	
	@Override
	public void saque(double valor) throws Exception {
		if(valor <= this.getSaldo())
		{
			saldo -= valor + 0.10;
		}
		else {
			throw new Exception("N�o � poss�vel sacar o valor desejado, seu saldo � de " + this.saldo);
		}
	}
	
	public String getTipo() {
		return "Conta Corrente";
	}
}

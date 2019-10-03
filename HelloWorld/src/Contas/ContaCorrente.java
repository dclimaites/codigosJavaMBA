package Contas;

public class ContaCorrente extends ContaBancaria {
	
	public ContaCorrente(String titular, int numero) {
		super(titular, numero);
	}
	
	public void saque(double valor) throws Exception {
		if(valor <= this.getSaldo())
		{
			saldo = (saldo - valor) - 10;
		}
		else {
			throw new Exception("Não é possível sacar o valor desejado, seu saldo é de " + this.saldo);
		}
	}
	
	public String getTipo() {
		return this.tipo + " Corrente";
	}
	
	
	
}

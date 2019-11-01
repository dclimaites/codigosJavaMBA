package Contas;

public abstract class ContaBancaria {
	protected String titular;
	protected double saldo;
	protected int numero;
	
	public ContaBancaria(String titular, int numero) {
		setTitular(titular);
		setNumero(numero);
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) throws SaldoInsuficiente {
		if(valor < 0)
			throw new SaldoInsuficiente("Não é possível depositar valores negativos");
		
		saldo += valor;
	}
	
	public void saque(double valor) throws Exception {
		if(valor <= this.saldo)
		{
			saldo -= valor;
		}
		else {
			throw new Exception("Não é possível sacar o valor desejado, seu saldo é de " + this.saldo);
		}
	}

	public abstract String getTipo();
}

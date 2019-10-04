package Contas;

public class ContaPoupanca extends ContaBancaria {
	public ContaPoupanca(String titular, int numero) {
		super(titular, numero);
	}
	
	public String getTipo() {
		return "Conta Poupança";
	}
}

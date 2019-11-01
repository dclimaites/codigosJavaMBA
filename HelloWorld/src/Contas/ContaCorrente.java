package Contas;

import java.time.LocalDate;

public class ContaCorrente extends ContaBancaria {
	
	private String endereco;
	private String cpf;
	private LocalDate dataRegistro;
	
	public ContaCorrente(String titular, int numero) {
		super(titular, numero);
	}
	
	public ContaCorrente(String titular, int numero, String endereco, String cpf, LocalDate dataRegistro) {
		super(titular, numero);
		this.endereco = endereco;
		this.cpf = cpf;
		this.dataRegistro = dataRegistro;
	}
	
	public boolean equals(Object obj) {
		ContaCorrente conta = (ContaCorrente)obj;
		
		return (conta.cpf.equals(this.cpf));
	}
	
	@Override
	public void saque(double valor) throws SaldoInsuficiente {
		if(valor <= this.getSaldo())
		{
			saldo -= valor + 0.10;
		}
		else {
			throw new SaldoInsuficiente("Não é possível sacar o valor desejado, seu saldo é de " + this.saldo);
		}
	}
	
	public String getTipo() {
		return "Conta Corrente";
	}

	public LocalDate getDataRegistro() {
		// TODO Auto-generated method stub
		return this.dataRegistro;
	}
}

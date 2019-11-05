package Contas;

public enum ClassificacaoClientes {
	POTENCIAL(400000, 5000000), MEDIO(200000, 400000), BAIXO(0, 200000);
	
	private double faixaInicial;
	private double faixaFinal;
	
	ClassificacaoClientes(double faixaInicial, double faixaFinal) {
		this.faixaInicial = faixaInicial;
		this.faixaFinal = faixaFinal;
	}
	
	public boolean isCompatible(ContaBancaria contaBancaria) {
		if(contaBancaria.getSaldo() >= this.faixaInicial && contaBancaria.getSaldo() <= this.faixaFinal)
			return true;
		
		return false;
	}
}

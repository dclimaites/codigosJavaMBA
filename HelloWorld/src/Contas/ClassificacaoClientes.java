package Contas;

public enum ClassificacaoClientes {
	POTENCIAL(400000, 5000000), MEDIO(200000, 400000), BAIXO(0, 200000);
	
	private double faixaInicial;
	private double faixaFinal;
	
	public ClassificacaoClientes(double faixaInicial, faixaFinal) {
		this.faixaInicial = faixaInicial;
		this.faixaFinal = faixaFinal;
	}
}

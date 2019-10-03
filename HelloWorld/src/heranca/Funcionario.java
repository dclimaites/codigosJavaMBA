package heranca;

public class Funcionario {
	
	Funcionario() {
		
	}
	
	Funcionario(int numero, String nome) {
		setNumero(numero);
		setNome(nome);
	}

	private int numero;
	private String nome;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void trabalha() {
		System.out.println("Funcion�rio que trabalha");
	}

	public int getBonificacao() {
		return 10;
	}

}
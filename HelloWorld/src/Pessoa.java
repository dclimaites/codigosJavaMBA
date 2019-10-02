
public class Pessoa {
	private String nome;
	private int idade;
	private float peso;
	private static int identificador;
	
	public Pessoa(String nome) {
		this.nome = nome;
		identificador++;
	}
	
	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
		identificador++;
	}
	
	void caminha(){
		
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return this.nome;
	}
	
	public int getIdentificacor() {
		return identificador;
	}
}

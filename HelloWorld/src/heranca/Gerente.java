package heranca;

public class Gerente extends Funcionario implements Autenticavel {
	private String senha;
	
	public boolean autentica(String senha) {
		if(senha != getSenha())
			return false;
		else
			return true;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	};
}

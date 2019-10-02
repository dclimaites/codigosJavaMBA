
public class TestaPessoa {
	public static void main(String[] args) {
		Pessoa pes = new Pessoa("Nome bizarro");
		Pessoa pes1 = new Pessoa("Daniel");
		
		System.out.println(pes.getNome());
		pes.setNome("Diego");
		
		System.out.println(pes.getNome());
		System.out.println(pes.getIdentificacor());
		System.out.println(pes1.getIdentificacor());
	}
}

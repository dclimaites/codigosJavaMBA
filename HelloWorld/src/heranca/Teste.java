package heranca;

public class Teste {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("Diego");
		f1.trabalha();
		
		Motorista mot1 = new Motorista(124, "Motorista teste");
		System.out.println(mot1.getNome());
		System.out.println(mot1.getNumero());
		mot1.trabalha();
		
		
		/*
		 * */
		Funcionario[] arrayFunc = new Funcionario[10];
		arrayFunc[0] = f1;
		arrayFunc[1] = new Funcionario(555, "Pepe");
		arrayFunc[2] = new Motorista(666, "Satã");
		
		System.out.println(arrayFunc[0].getNome());
		System.out.println(arrayFunc[1].getNome());
		System.out.println(arrayFunc[2].getNome());
		
		ControleBonificacao cb = new ControleBonificacao();
		
		cb.registra(f1);
		cb.registra(mot1);
		System.out.println(cb.getTotalBonificacao());
	}

}

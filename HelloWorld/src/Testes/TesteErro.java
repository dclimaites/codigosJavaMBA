package Testes;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import Contas.ContaCorrente;
import Contas.SaldoInsuficiente;

public class TesteErro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inicio do main");
		metodo1();
		System.out.println("fim do main");
	}

	static void metodo1() {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}

	static void metodo2() {
		System.out.println("inicio do metodo2");

		ContaCorrente cc = new ContaCorrente("Diego", 0, "Rua comprida", "123456", LocalDate.of(2011, 12, 30));
		try {
			/*
			 * for (int i = 0; i <= 15; i++) {
			 * 
			 * cc.deposita(i + 1000); cc.saque(1000000);
			 * 
			 * System.out.println(cc.getSaldo());
			 * 
			 * if (i == 5) { cc = null; } }
			 */
			metodo3(cc);
		}
		catch(SaldoInsuficiente e) {
			System.out.println("Erro: " + e.getMessage());
		}
		catch (NullPointerException e) {
			System.out.println("Erro: " + e);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erro genérico: " + e);
		}

		System.out.println("fim do metodo2");
	}
	
	static void metodo3(ContaCorrente conta) throws SaldoInsuficiente, NullPointerException {
		//conta = new ContaCorrente("Diego novo", 100);
		Double valueDeposita = Double.valueOf(JOptionPane.showInputDialog("Digite um valor"));
		conta.deposita(valueDeposita);
		System.out.println("Falor final é ");
		System.out.println(conta.getSaldo());
		
		ContaCorrente conta2 = new ContaCorrente("Diego", 1, "Rua comprida", "123456", LocalDate.of(2019, 1, 30));
		
		boolean cpf = conta.equals(conta2);
		
		System.out.println("boolean cpf é " + cpf);
		
		Double valueSaca = Double.valueOf(JOptionPane.showInputDialog("Valor do saque"));
		conta.saque(valueSaca);
		System.out.println("Valor Final 2: " + conta.getSaldo());
		System.out.println("Valor Final 2: " + conta.getDataRegistro());
		
	}

}

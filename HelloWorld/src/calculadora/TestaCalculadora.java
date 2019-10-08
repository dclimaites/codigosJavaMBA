package calculadora;

import javax.swing.JOptionPane;

public class TestaCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraBasica basica = new CalculadoraImplementacao();
		float numero1 = 0;
		float numero2 = 0;
		boolean numeroValido = false;
		
		do {
			try {
				numero1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
				numeroValido = true;
			}
			catch(Exception e) {
				System.out.println("n�mero digitado n�o � v�lido. Digite novamente!");
				System.out.println(e.getMessage());
			}
			
		}while(!numeroValido);
		
		numeroValido = false;
		
		do {
			try {
				numero2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo n�mero"));
				numeroValido = true;
			}
			catch(Exception e) {
				System.out.println("n�mero digitado n�o � v�lido. Digite novamente!");
				System.out.println(e.getMessage());
			}
			
		}while(!numeroValido);
		
		System.out.println(numero1);
		System.out.println(numero2);
		
		System.out.println("soma � " + basica.somar(numero1, numero2));
		System.out.println("subtra��o � " + basica.subtrair(numero1, numero2));
		System.out.println("multiplica��o � " + basica.multiplicar(numero1, numero2));
		System.out.println("Dividir � " + basica.dividir(numero1, numero2));
		

	}

}

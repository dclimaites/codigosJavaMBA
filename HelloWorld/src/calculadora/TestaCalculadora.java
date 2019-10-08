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
				numero1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número"));
				numeroValido = true;
			}
			catch(Exception e) {
				System.out.println("número digitado não é válido. Digite novamente!");
				System.out.println(e.getMessage());
			}
			
		}while(!numeroValido);
		
		numeroValido = false;
		
		do {
			try {
				numero2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número"));
				numeroValido = true;
			}
			catch(Exception e) {
				System.out.println("número digitado não é válido. Digite novamente!");
				System.out.println(e.getMessage());
			}
			
		}while(!numeroValido);
		
		System.out.println(numero1);
		System.out.println(numero2);
		
		System.out.println("soma é " + basica.somar(numero1, numero2));
		System.out.println("subtração é " + basica.subtrair(numero1, numero2));
		System.out.println("multiplicação é " + basica.multiplicar(numero1, numero2));
		System.out.println("Dividir é " + basica.dividir(numero1, numero2));
		

	}

}

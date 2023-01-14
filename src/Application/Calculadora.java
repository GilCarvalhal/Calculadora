package Application;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o número: ");
		double num1 = sc.nextDouble();
		System.out.println("Informe a operação: ");
		String operacao = sc.next();
		System.out.println("Informe o número: ");
		double num2 = sc.nextDouble();

		// Operadores condicionais ternários.
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;

		System.out.printf("%.0f %s %.0f = %.0f", num1, operacao, num2, resultado);

		sc.close();
	}
}

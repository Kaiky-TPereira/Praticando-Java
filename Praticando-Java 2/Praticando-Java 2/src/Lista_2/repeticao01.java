package Lista_2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class repeticao01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("##0.0");
		
		System.out.println("Insira quantas notas ser�o somadas: ");
		int n = scan.nextInt();
		double soma = 0;
		
		for (int i = 1; i <= n; i ++) {
			System.out.println("Informe o valor da " + i + "� nota: ");
			double valor = scan.nextDouble();
			
			soma = soma + valor;
			
		}
		System.out.println("A m�dia �: " + df.format(soma/n));

	}

}

package Lista_2;

import java.util.Scanner;

public class repeticao03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		System.out.println("Quantidade de valores a serem verificados: ");
		int quantidade = scan.nextInt();
		
		int negativo = 0;
		int positivo = 0;
		int soma_positivo = 0;
		int soma_negativo = 0;
		int valor_maior = 0;
		
		for (int i = 0; i < quantidade; i++){
			
			System.out.println("Insira o " + (i + 1) + "� valor: ");
			int valor = scan.nextInt();
			
			if (valor_maior < valor) {
				valor_maior = valor;
			}
			if (valor < 0){
				negativo += 1;
				soma_negativo = soma_negativo + valor;
				System.out.println(valor + " � negativo!");
			} 
			else{
				positivo += 1;
				soma_positivo = soma_positivo + valor;
				System.out.println(valor + " � positivo!");
			}
		}
		
		if ( negativo < positivo) {
			System.out.println("H� mais n�meros positivos do que negativos.");
			System.out.println("N�meros positivos: " + positivo);
			System.out.println("N�meros negativos: " + negativo);
			System.out.println("Soma n�mero positivos: " + soma_positivo);
			System.out.println("menor n�mero negativo: " + soma_negativo);
			System.out.println("Maior valor digitado: " + valor_maior);
		} else {
			System.out.println("H� mais n�meros negativos do que positivos.");
			System.out.println("N�meros positivos: " + positivo);
			System.out.println("N�meros negativos: " + negativo);
			System.out.println("Soma n�mero positivos: " + soma_positivo);
			System.out.println("menor n�mero negativo: " + soma_negativo);
			System.out.println("Maior valor digitado: " + valor_maior);
		}
		
	}

}

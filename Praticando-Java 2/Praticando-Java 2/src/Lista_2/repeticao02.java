package Lista_2;

import java.util.Scanner;

public class repeticao02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		System.out.println("Quantidade de valores a serem verificados: ");
		int quantidade = scan.nextInt();
		
		int negativo = 0;
		int positivo = 0;
		
		for (int i = 0; i < quantidade; i++){
			
			System.out.println("Insira o " + (i + 1) + "� valor: ");
			int valor = scan.nextInt();
			
			if (valor < 0){
				negativo = negativo + 1;
				System.out.println(valor + " � negativo!");
			} 
			else{
				positivo += 1;
				System.out.println(valor + " � positivo!");
			}
		}
		
		System.out.println("Houveram " + negativo + " n�meros negativos.");
		
		System.out.println("Houveram " + positivo + " n�meros positivos.");
		
	}

}

package entrada_processamneto_saída;

import java.util.Scanner;

public class Ex013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Informe o primeiro valor: ");
		double n1 = ler.nextDouble();
		
		System.out.printf("Informe o segundo valor: ");
		double n2 = ler.nextDouble();
		
		System.out.printf("Informe o terceiro valor: ");
		double n3 = ler.nextDouble();
		
		if (n1 > n2 && n1 > n3) {
			System.out.printf("O maior é o primeiro valor: %.2f", n1);
		}else if (n2 > n1 && n2 > n3) {
			System.out.printf("O maior é o segundo valor: %.2f", n2);
		}else 
			System.out.printf("O maior é o terceiro valor: %.2f", n3);
		}
	}



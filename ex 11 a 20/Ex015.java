package entrada_processamneto_saída;

import java.util.Scanner;

public class Ex015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Informe o primero valor: ");
		double l1 = ler.nextDouble();
		System.out.printf("Informe o segundo valor: ");
		double l2 = ler.nextDouble();
		System.out.printf("Informe o terceiro valor: ");
		double l3 = ler.nextDouble();
		
		if (l1 + l2 > l3 || l1 + l3 > l2 || l2 + l3 > l1) {
			if (l1 == l2 && l2 == l3) {
				System.out.printf("Esses valores formam um triângulo equilatero");
			}else if (l1 != l2 && l2 != l3 && l1 != l3) {
				System.out.printf("Esses valores formam um triângulo escaleno");
			}else 
				System.out.printf("Esses valores formam  um triângulo isósceles");
				
		}else
		System.out.printf("Esses valores não podem formar um triângulo!");
	}
	}


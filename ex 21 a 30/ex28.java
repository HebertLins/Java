package entrada_processamento_saida;

import java.util.Scanner;

public class ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner ler = new Scanner(System.in);
		
		double n1, n2, n3;
		
		System.out.println("Digite um valor: ");
		n1 = ler.nextDouble();
		System.out.println("Digite um valor: ");
		n2 = ler.nextDouble();
		System.out.println("Digite um valor: ");
		n3 = ler.nextDouble();
		
		if (n1 < n2 && n1 < n3 && n2 > n3) {
			System.out.printf("%f, %f, %f", n1, n2 ,n3);
		}else if (n1 < n2 && n1 < n3 && n2 > n3) {
			System.out.printf("%f, %f< %f", n1, n3 ,n2);
		}else if (n2 < n1 && n2 < n3 && n1 < n3) {
			System.out.printf("%f, %f< %f", n2, n1 ,n3);
		}else if (n2 < n1 && n2 < n3 && n1 > n3) {
			System.out.printf("%f, %f< %f", n2, n3 ,n1);
		}else if (n3 < n2 && n3 < n1 && n2 < n1) {
			System.out.printf("%f, %f< %f", n3, n2 ,n1);
		}else if (n3 < n2 && n3 < n1 && n2 > n1) {
			System.out.printf("%f, %f< %f", n3, n1 ,n2);
		}
		}

	}



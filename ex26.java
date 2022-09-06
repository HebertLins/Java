package entrada_processamento_saida;

import java.util.Scanner;

public class ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		double n1, m;
		
		System.out.println("Digite um valor: ");
		n1 = ler.nextDouble();
		
		if (n1 < 0) {
			m = n1 * 3;
			System.out.printf("O TRIPLO do valor digitado é %.2f", m);
		}else {
			m = n1 * 2;
			System.out.printf("O DOBRO do valor digitado é %.2f", m);
	}
	}
	}

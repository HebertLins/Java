package entrada_processamento_saida;

import java.util.Scanner;

public class ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		double n1, m, r;
		
		System.out.println("Digite um valor: ");
		n1 = ler.nextDouble();
		
		r = n1 % 2;
		
		if (n1 == 0) {
			m = n1 + 5;
			System.out.printf("O valor digitado é %.2f, somando + 5 fica %.2f", n1, m);
		}else {
			m = n1 + 8;
			System.out.printf("O valor digitado é %.2f, somando + 8 fica %.2f", n1, m);
	}

	}
}
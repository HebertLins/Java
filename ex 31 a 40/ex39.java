package entrada_processamento_saida;

import java.util.Scanner;

public class ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		
		int n1, n2, n3, c;
		
		n1 = 0;
		System.out.println(n1);
		n2 = 1;
		System.out.println(n2);
		c = 1;
		while (c < 31) {
			c = c + 1;
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
	}

}

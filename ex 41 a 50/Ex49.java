package entradasaida;

import java.util.Scanner;

public class Ex49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int n = 0,c;
		
		System.out.printf("Digite um valor: ");
		n = ler.nextInt();
		
		c = 0;
		
		while (c < 20) {
			c = c + 1;
		    n = n + 1;
		    System.out.println(n);
				}
	}

}

package entrada_processamento_saida;

import java.util.Scanner;

public class ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ler = new Scanner (System.in);
		
		int n1,c,soma;
		
		System.out.printf("Digite um valor: ");
		n1 = ler.nextInt();
		
		c = 0;
		
		while (c < 5) {
			c = c + 1;
			soma = n1 * c;
			System.out.printf("%d x %d = %d", n1,c, soma);
			System.out.println("");
	}
	}
}

package entrada_processamento_saida;

import java.util.Scanner;

public class ex37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		int c1,c2,c3;
		String a;
		
		c1 = 0;
		c2 = 0;
		while (c1 < 20) {
			c1 = c1 + 1;
			while (c2 < 10) {
				c2 = c2 + 1;
				c3 = c1 * c2;
				System.out.printf("%d x %d = %d", c1, c2, c3);
				System.out.println();
			}c2 = 0;
			System.out.println("Pressione qualquer letra e depois ENTER: ");
			a = ler.next();
		
		}
	}

}

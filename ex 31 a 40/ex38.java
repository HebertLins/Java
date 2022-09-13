package entrada_processamento_saida;

import java.util.Scanner;

public class ex38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		
		int c, c2;
		c = 0;
		c2 = 0;
		while (c < 100) {
			c = c + 1;
			c2 = c + c2;
			System.out.println(c2);
		}
		
	}

}

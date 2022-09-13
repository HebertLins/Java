package entrada_processamento_saida;

import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ler = new Scanner (System.in);
		
		int v;
		
		System.out.printf("Digite um valor positivo: ");
		v = ler.nextInt();		
		
		while (v < 0) {
			System.out.println("VALOR INVÁLIDO!");
			System.out.printf("Digite um valor positivo: ");
			v = ler.nextInt();
		}
	}

}

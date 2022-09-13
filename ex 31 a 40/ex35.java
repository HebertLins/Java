package entrada_processamento_saida;

import java.util.Scanner;

public class ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		
		int v,c,soma;
		
		System.out.printf("Digite um valor positivo: ");
		v = ler.nextInt();		
		
		while (v < 0) {
			System.out.println("VALOR INVÁLIDO!");
			System.out.printf("Digite um valor positivo: ");
			v = ler.nextInt();
		}
		c = 0;
			
		while (c < 5) {
			c = c + 1;
			soma = v * c;
			System.out.printf("%d x %d = %d", v,c, soma);
			System.out.println("");
			
	}

}}

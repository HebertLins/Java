package entrada_processamento_saida;

import java.util.Scanner;

public class ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ler = new Scanner (System.in);
		
		int v,a,b,i,t,c;
		
		System.out.printf("Digite um valor positivo: ");
		v = ler.nextInt();		
		
		while (v < 0) {
			System.out.println("VALOR INVÁLIDO!");
			System.out.printf("Digite um valor positivo: ");
			v = ler.nextInt();
		}
		
		System.out.printf("Digite um valor (A): ");
		a = ler.nextInt();	
		System.out.printf("Digite um valor (B): ");
		b = ler.nextInt();	
		
		while (a >= b) {
			System.out.println("VALORES INVÁLIDOS!");
			System.out.printf("Digite um valor (B): ");
			b = ler.nextInt();
			
		c=0;
		
		for (i=b; i=a-1 ; i=-1) {
			c = c + 1;
			t = v * c;
			System.out.printf("%d x %d = %d",v,c,t);
			
		}
		
		}
		
	}

}

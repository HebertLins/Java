package entrada_processamento_saida;

import java.util.Scanner;

public class ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ler = new Scanner (System.in);
		
		double n1, n2;
		
		System.out.printf("Digite um valor: ");
		n1 = ler.nextInt();
		System.out.printf("Digite um valor: ");
		n2 = ler.nextInt();
		
		while (n1 > n2) {
			System.out.println("O primeiro valor é maior que o segundo, digite outros valores!");
			System.out.printf("Digite um valor: ");
			n1 = ler.nextInt();
			System.out.printf("Digite um valor: ");
			n2 = ler.nextInt();
			
		
		}
		
	}

}

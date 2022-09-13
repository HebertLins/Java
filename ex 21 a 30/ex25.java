package entrada_processamento_saida;

import java.util.Scanner;

public class ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		Double n1,r;
		
		System.out.println("Digite um valor: ");
		n1 = ler.nextDouble();
		
		r = n1 % 2;
		
		if (r == 0) {
			System.out.printf("O valor digitado é PAR");
	   }else {
		   System.out.printf("O valor digitado é ÍMPAR");
	   }
		
	}

}

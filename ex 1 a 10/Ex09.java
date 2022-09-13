package entrada_processamneto_saída;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite um valor: ");
		double n1 = ler.nextDouble();
		
		System.out.printf("Digite um valor: ");
		double n2 = ler.nextDouble();
		
		double s = n1 + n2;
		
		if (n1 < n2) {
			System.out.printf("O menor valor é %.2f", n1);
		}else {
			System.out.printf("O menor valor é %.2f", n2);
			
		}
		
		
	}

}

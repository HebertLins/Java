package entrada_processamento_saida;

import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		double n1,n2,n3,s;
		
		
		System.out.println("Digite o valor de A: ");
		n1 = ler.nextDouble();
		System.out.println("Digite o valor de B: ");
		n2 = ler.nextDouble();
		System.out.println("Digite o valor de C: ");
		n3 = ler.nextDouble();
		
		s = n1 + n2;
		
		if (s < n3) {
			System.out.printf("A soma de A + B é menor que C");
		}else { 
			System.out.printf("A soam de A + B é maior que C");
	
		}
	}

}

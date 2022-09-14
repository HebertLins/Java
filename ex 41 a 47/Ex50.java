package entradasaida;

import java.util.Scanner;

public class Ex50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int n1,n2,c,vrf;
		
		System.out.println("O primeiro valor deve ser maior que 10 e menor que o segundo");
	    System.out.printf("Digite um intervalo inteiro (A): ");
		n1 = ler.nextInt();
		System.out.printf("Digite um intervalo inteiro (B): ");
		n2 = ler.nextInt();

		c = n1;

		while (n1 < 0 || n2 < 0 || n1 < 10) {
			System.out.printf("O primeiro valor deve ser maior que 10 e menor que o segundo");
		    System.out.println("Digite um intervalo inteiro (A): ");
			n1 = ler.nextInt();
			System.out.println("Digite um intervalo inteiro (B): ");
			n2 = ler.nextInt();
		}
		
		n2 = n2 - 1;

		while (c < n2) {
		    c = c + 1;
		    vrf = c % 2;
		    if (vrf == 0) {
		        System.out.println(c);
		    }
		}
	}
	}

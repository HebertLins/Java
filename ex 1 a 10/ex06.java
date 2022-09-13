package ex01;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		double cd, d, r;
		
		System.out.printf("Digite a cotação atual do dólar: ");
		cd = ler.nextDouble();
		
		System.out.printf("Digite o valor em dólar: ");
		d = ler.nextDouble();
		
		r = d * cd;
		
		System.out.printf("O valor em reais é igual a: %.2f", r);
		

	}

}

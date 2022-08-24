package ex01;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		
		double t, f;
		
		System.out.printf("Digite a temperatura em Celsius: ");
		t = ler.nextDouble();
		
		f = t * 1.8 + 32;
		
		System.out.printf("A temperatura em Fahrenheit é: %.2f", f);
		
	}

}

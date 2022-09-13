package entrada_processamneto_saída;

import java.util.Scanner;

public class Ex011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Informe a base do retângulo: ");
		double b = ler.nextDouble();
		
		System.out.printf("Informe a altura do retângulo: ");
		double h = ler.nextDouble();
		
		double a = b * h;
		
		if (a > 100) {
			System.out.printf("TERRENO GRANDE");
		}
		
		
	}

}

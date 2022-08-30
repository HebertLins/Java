package entrada_processamneto_saída;

import java.util.Scanner;

public class Ex016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Informe o valor da Hipotenusa: ");
		double h = ler.nextDouble();
		System.out.printf("Informe o valor de um Cateto: ");
		double c1 = ler.nextDouble();
		System.out.printf("Informe o valor do outro Cateto: ");
		double c2 = ler.nextDouble();
		
		double h2 = (h*h);
		double sc = (c1*c1) + (c2*c2);
		
		if (sc == h2) {
			System.out.printf("Esse é um triângulo retângulo!");
		}else
			System.out.printf("Esse não um triângulo retângulo!");
		}
	}



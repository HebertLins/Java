package entrada_processamento_saida;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double n1 = ler.nextDouble();
		System.out.println("Digite o primeiro valor: ");
		double n2 = ler.nextDouble();
		
		System.out.println("Selecione uma das opções abaixo"
				+ "1 - Multiplicação"
				+ "2 - Adição"
				+ "3 - Divisão"
				+ "4 - Subtração"
				+ "5 - Encerrar o programa");
		int op = ler.nextInt();
		
		if (op == 1) {
			double r = n1 * n2;
			System.out.printf("O resultado dessa operação é: %f", r);
		}else if (op == 2) {
			double r = n1 + n2;
			System.out.printf("O resultado dessa operação é: %f", r);
		}else if (op == 3) {
			double r = n1 / n2;
			System.out.printf("O resultado dessa operação é: %f", r);
		}else if (op == 4) {
			double r = n1 - n2;
			System.out.printf("O resultado dessa operação é: %f", r);
		}else if (op == 5) {
			System.out.printf("Programa encerrado!");
		}else {
			System.out.println("O valor digitado não corresponde às opções");
		}
		
	}
		
		
		}
		
		
	


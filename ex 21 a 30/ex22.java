package entrada_processamento_saida;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Selecione uma das opções abaixo: "
				+ "1 - Triângulo "
				+ "2 - Quadrado "
				+ "3 - Retângulo "
				+ "4 - Círculo "
				+ "5 - Encerrar o programa ");
		int op = ler.nextInt();
		
		if (op == 1) {
			System.out.printf("Digite o valor da Base: ");
			double b = ler.nextDouble();
			System.out.printf("Digite o valor da Altura: ");
			double h = ler.nextDouble();
			double a = b * (h*h);
			System.out.printf("O valor da área do triângulo é %.2f", a);
		}else if (op == 2) {
			System.out.printf("Digite o valor do lado: ");
			double l = ler.nextDouble();
			double a = l*l;
			System.out.printf("O valor da área do quadrado é %.2f", a);
		}else if (op == 3) {
			System.out.printf("Digite o valor da Base: ");
			double b = ler.nextDouble();
			System.out.printf("Digite o valor da Altura: ");
			double h = ler.nextDouble();
			double a = b * h;
			System.out.printf("O valor da área do retângulo é %.2f", a);
		}else if (op == 4) {
			System.out.printf("Digite o valor do Raio: ");
			double raio = ler.nextDouble();
			double a = 3.14 * (raio*raio);
			System.out.printf("O valor da área do círculo é %.2f", a);
		}else if (op == 5) {
			System.out.printf("Programa encerrado!");
		}else {
			System.out.println("O valor digitado não corresponde às opções");
		}
		
	}
		
		
		
	}



package entrada_processamento_saida;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a nota da sua P1: ");
		double p1 = ler.nextDouble();
		
		double dif = 10 - p1;
		
		if (p1 == 10) {
			System.out.printf("Você já foi aprovado!");
		}else
			System.out.printf("Você precisará tirar %.2f para ser aprovado!", dif);
	
		
	}

}

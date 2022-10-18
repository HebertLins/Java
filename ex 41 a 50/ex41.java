package entrada_processamento_saida;

import java.util.Scanner;

public class ex41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int n,s1,somador,soma,s2;
		
		System.out.printf("Digite a quantidade de valores que você deseja: ");
		n = ler.nextInt();
		
		s1 = 2;
		somador = 3;
		soma = 0;

		while (n < 0 && n > 100) {
			System.out.println("Valor inválido!");
			n = ler.nextInt();
		}
		
		System.out.println(s1);
		n = n - 1;

		while (n > 0) {
			n = n - 1;
			s2 = s1 + somador;
			somador = somador + 2;
			System.out.println(s2);
			s1 = s2;
			soma = soma + s2 ;
		}
		System.out.printf("A soma dos valores da sequência é igual a: {}", soma + 2);
		
		
	}

}

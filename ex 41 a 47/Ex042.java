package exercicios;

import java.util.Scanner;

public class ex42w {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, i;
		double div1, div2, divisao, soma;
		
		System.out.println("Digite o termo que quer encontrar (valor deve ser positivo e menor que 50): ");
		n = ler.nextInt();
		
		while ((n <= 0) || (n > 50)) {
			System.out.println("O valor de N deve ser positivo e menor que 50.");
			System.out.println("Digite o termo que quer encontrar (valor deve ser positivo e menor que 50): ");
			n = ler.nextInt();
		}
		
		div1 = 1;
		div2 = 2;
		i = 1;
		soma = 0;
		
		while (i <= n) {
		    divisao = div1 / div2;
		    soma = soma + divisao;
    	    System.out.println(i + ". " + (int) div1 + "/" + (int) div2);
    	    div1 = div1 + 1;
    	    div2 = div2 + 1;
    	    i++;
		}
		System.out.printf("A soma é: %.2f", soma);
	}
}
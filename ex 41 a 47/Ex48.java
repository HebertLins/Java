package entradasaida;

import java.util.Scanner;

public class Ex48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int i,i1,f,f1,soma;
		
		System.out.printf("Digite um valor: ");
		i = ler.nextInt();
		System.out.printf("Digite um valor: ");
		f = ler.nextInt();

		i1 = i;
		f1 = f;
		soma = 0;
		
		while (i > f) {
			System.out.printf("Digite um valor: ");
			i = ler.nextInt();
			System.out.printf("Digite um valor: ");
			f = ler.nextInt();
			
		}while (i <= f) {
			i = i + 1;
			soma = soma + i;
		}System.out.printf("A soma dos valores entre %d e %d é igual a: %d",i1,f1,soma);
		
		
	}
	
	

}

package entrada_processamneto_saída;

import java.util.Scanner;

public class Ex017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner ler  = new Scanner(System.in);
		 
		System.out.printf("Informe a sua Altura: ");
			double a = ler.nextDouble();
			
		System.out.printf("Informe a sua Peso: ");
			double p = ler.nextDouble();
		
		System.out.printf("Informe o seu Sexo, digite M ou F: ");
		  	s = ler.next();
			
		double IMC = p * (a*a);
				 
		if (s == m) {
			if (IMC < 20 ){
				System.out.printf("Você está abaixo do peso ideal");
			}else if (IMC > 20 && IMC < 25  ) {
				System.out.printf("Você está no seu peso ideal");
			}else
				System.out.printf("Você está acima do seu peso ideal");
			}		
		else
			if (IMC < 19 ){
				System.out.printf("Você está abaixo do peso ideal");
			}else if (IMC > 19 && IMC < 24  ) {
				System.out.printf("Você está no seu peso ideal");
			}else
				System.out.printf("Você está acima do seu peso ideal");
			}
			
	}


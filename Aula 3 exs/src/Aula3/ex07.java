package ex01;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, p3, p4, p5, t, pag, troco;
		
		System.out.printf("informe o valor do primeiro produto: ");
		p1 = ler.nextDouble();
		System.out.printf("informe o valor do segundo produto: ");
		p2 = ler.nextDouble();
		System.out.printf("informe o valor do terceiro produto: ");
		p3 = ler.nextDouble();
		System.out.printf("informe o valor do quarto produto: ");
		p4= ler.nextDouble();
		System.out.printf("informe o valor do quinto produto: ");
		p5 = ler.nextDouble();
		
		t = p1 + p2 + p3 + p4 + p5;
		
		System.out.printf("Informe o valor do pagamento: ");
		pag = ler.nextDouble();
		
		troco = pag - t;
				
		System.out.printf("O troco é equivalente a: %.2f", troco);
				

	}

}

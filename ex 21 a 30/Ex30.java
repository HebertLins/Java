package entrada_processamento_saida;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		
		double p,op,d,pd,par;
		
		System.out.printf("Informe o valor do produto: R$");
		p = ler.nextInt();
		
		System.out.print("Código Condição de pagamento\r\n"
				+ "1 	À vista em dinheiro ou cheque, recebe 10% de desconto\r\n"
				+ "2 	À vista no cartão de crédito, recebe 15% de desconto\r\n"
				+ "3 	Em duas vezes, preço normal de etiqueta sem juros\r\n"
				+ "4 	Em quatro vezes, preço normal de etiqueta mais juros de 10%\r\n"
				+ "Escolha a sua opção: ");
		op = ler.nextInt();
		

		if (op == 1) {
		    d = p*10/100;
		    pd = p - d;
		    System.out.printf("Dessa forma, o valor a ser pago será R$ %.2f", pd);
		}if (op == 2) {
		    d = p*15/100;
		    pd = p - d;
		    System.out.printf("Dessa forma, o valor a ser pago será R$ %.2f", pd);
		}if (op == 3) {
		    par = p / 2;
		    System.out.printf("Dessa forma, o valor será pago em 2x sem juros, a primeira parcela será de R$%.2f", par);
		}if (op == 4) {
			 d = p*10/100;
			 pd = p + d;
			 par = pd / 4;
		    System.out.printf("Dessa forma, o valor será pago em 4x com juros de 10%, a primeira parcela será de R$%.2f", par);
		}
	}

}

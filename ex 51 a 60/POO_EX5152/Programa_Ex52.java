package POO_EX;

import java.util.Scanner;

public class Programa_Ex52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner ler = new Scanner(System.in);
		
		Produto[] listadeclientes = new Produto[10];
		
		System.out.println("==== Cadastro de Clientes ====");
		
		int i = 0;
		int cont = 1;
		
		for (i = 0; i<=9; i++) {
			Produto c = new Produto();
			
			System.out.print("Informe o ID do produto: ");
			c.id =  ler.nextInt();
			System.out.print("Digite a descrição do produto: ");
			c.descrição =  ler.next();
			System.out.print("Digite o valor do produto: ");
			c.valor =  ler.nextDouble();
			System.out.print("Digite a quantidade do produto: ");
			c.quantidade =  ler.nextDouble();
			System.out.print("\n");
			
			c.valor = c.valor * c.quantidade;
			
			listadeclientes[i] = c;
		}
			
		System.out.println("\n");
		System.out.println("As compras com o valor menor que 100 são: \n");
		
		for (i = 0; i <= cont; i ++) {
			if (listadeclientes[i].valor > 100) {
				System.out.println("Nome: " + listadeclientes[i].descrição);
				cont++;
			}
		}
	}


	}



package POO_EX;

import java.util.Scanner;

public class Programa_Ex51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		Cliente[] listadeclientes = new Cliente[5];
		
		System.out.println("==== Cadastro de Clientes ====");
		
		int i = 0;
		int cont = 1;
		
		for (i = 0; i<=1; i++) {
			Cliente c = new Cliente();
			
			System.out.print("Digite o seu nome: ");
			c.nome =  ler.next();
			System.out.print("Digite a sua idade: ");
			c.idade =  ler.nextInt();
			System.out.print("Digite o seu id: ");
			c.id =  ler.nextInt();
			System.out.print("Digite o seu email: ");
			c.email =  ler.next();
			System.out.print(" ");
			
			listadeclientes[i] = c;
		}
			
		System.out.println("\n");
		System.out.println("As pessoas maiores de 18 anos são: \n");
		
		for (i = 0; i <= cont; i ++) {
			if (listadeclientes[i].idade > 18) {
				System.out.println("Nome: " + listadeclientes[i].nome);
				cont++;
			}
		}
	}

}

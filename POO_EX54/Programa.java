package POO_EX54;


import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int id;
		String nome;
		String email;
		int idade;
		char possuiconta;
		String agencia;
		String numero;
		double saldo;
		
		Cliente[] listaClientes = new Cliente[5];
		
		
		for (int i = 0; i <= 1; i++) {
			
			Cliente c = new Cliente();;
			
			System.out.print("informe o ID do cliente: ");
			id = ler.nextInt();
			c.setId(id);
			System.out.print("informe o nome do cliente: ");
			nome = ler.next();
			c.setNome(nome);
			System.out.print("informe a idade do cliente: ");
			idade = ler.nextInt();
			c.setIdade(idade);
			System.out.print("informe o email do cliente: ");
			email = ler.next();
			c.setEmail(email);
			System.out.print("Você já possui conta (S/N)? ");
			possuiconta = ler.next().charAt(0);	
			System.out.println("=======================");
		
			if(possuiconta == 'S') {
				ContaBancaria cont = new ContaBancaria();
				
				System.out.println("=_--INFORME OS DADOS DA CONTA--_=");
				System.out.print("Informe a agencia: ");
				agencia = ler.next();
				cont.setAgencia(agencia);
				System.out.print("Informe o numero da conta: ");
				numero = ler.next();
				cont.setNumero(numero);
				System.out.print("Informe o saldo da conta: ");
				saldo = ler.nextDouble();
				System.out.println();
			
				cont = new ContaBancaria(agencia,numero,saldo);
				c = new Cliente(id,nome,idade,email,cont);
			
			}else {
				c = new Cliente(id,nome,idade,email,null);
			}
			
		
			System.out.println("==================================");	
			listaClientes[i] = c;
		}
			
		System.out.println("=_--LISTA DE CLIENTES CADASTRADOS=_--");
		System.out.println("==================================");
			
		int i = 0;
		for (i = 0; i <= 1; i ++) {
			
			System.out.printf("%s", listaClientes[i].exibirNomeIdade());
			
			if (listaClientes[i].conta != null) {
				System.out.println();
				System.out.printf("Conta: %s", listaClientes[i].exibirDadosConta());
				
			}
			System.out.println();
				
			
		}
		
		}	
		
	}



package pacote;

import java.util.HashMap;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		HashMap <String, String> map = new HashMap<String, String>();
		
		int id;
		String nome;
		String email;
		int idade;
		char possuiconta;
		String agencia;
		String numero;
		double saldo;
			
			cliente c = new cliente();
			
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
		
			
			if(possuiconta == 'S') {
				contaBancaria cont = new contaBancaria();
				
				System.out.println("==================================");
				System.out.println("=_--INFORME OS DADOS DA CONTA--_=");
				System.out.println("==================================");
				System.out.print("Informe a agencia: ");
				agencia = ler.next();
				cont.setAgencia(agencia);
				System.out.print("Informe o numero da conta: ");
				numero = ler.next();
				cont.setNumero(numero);
				System.out.print("Informe o saldo da conta: ");
				saldo = ler.nextDouble();
				System.out.println();
			
				cont = new contaBancaria(agencia,numero,saldo);
				c = new cliente(id,nome,idade,email,cont);
			
			}else {
				c = new cliente(id,nome,idade,email,null);
				}
			
			System.out.println("==================================");
			System.out.println("=_--LISTA DE CLIENTES CADASTRADOS=_--");
			System.out.println("==================================");
			
			
			System.out.println("Dados cliente: " + c.exibirNomeIdade());
			System.out.println("Dados da conta: " + c.exibirDadosConta());
	}

		}
	


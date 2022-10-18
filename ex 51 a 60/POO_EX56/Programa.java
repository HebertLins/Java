package POO_EX56;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int id, idc;
		String nome, nomec;
		double preco, quantidade;
		Categoria categoria;
		char possuicateg;
		
		Produto[] listaProduto = new Produto[5];
		
		for (int i = 0; i <= 2; i++) {
			
			Produto p = new Produto();
			
			System.out.println("informe o ID do produto: ");
			id = ler.nextInt();
			p.setId(id);
			System.out.println("informe o NOME do produto: ");
			nome = ler.next();
			p.setNome(nome);
			System.out.println("informe o PREÇO do produto: ");
			preco = ler.nextDouble();
			p.setPreco(preco);
			System.out.println("informe o QUANTIDADE do produto: ");
			quantidade = ler.nextDouble();
			p.setQuantidade(quantidade);
			System.out.print("O produto possui categoria(S/N)? ");
			possuicateg = ler.next().charAt(0);	
			System.out.println("=======================");
			
			if (possuicateg == 'S') {
				
				Categoria categ = new Categoria();
				
				System.out.println("=_--INFORME OS DADOS DA CONTA--_=");
				System.out.println("informe o ID da categoria: ");
				idc = ler.nextInt();
				categ.setId(idc);
				System.out.println("informe o NOME do produto: ");
				nomec = ler.next();
				categ.setNome(nomec);
				
				categ = new Categoria(id,nome);
				p = new Produto(id,nome,preco,quantidade,categ);
				
			}else {
				
				p = new Produto(id,nome,preco,quantidade,null);

			}
			
			System.out.println();
			listaProduto[i] = p;
		}
			
		System.out.println();
		
		System.out.println("=_--LISTA DE PRODUTOS CADASTRADOS=_--");
		System.out.println("==================================");
			
		for (int i = 0; i <= 2; i++) {
			
			System.out.printf("%s", listaProduto[i].exibirNomePreco());
			System.out.println();
			
			if (listaProduto[i].getCategoria() != null) {
				System.out.println();
				System.out.printf("%s \n", listaProduto[i].DadosCateg());
			
		System.out.println("===============================");
				
			}
			
		}
		
		}
	}

package program;

import java.io.IOException;
import java.util.Scanner;

import model.Endereco;
import service.ViaCepService;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        ViaCepService viacepservice = new ViaCepService();
	        
	        Scanner ler = new Scanner(System.in);
	        String login;
	        
	        
	        try {
	        	System.out.print("Login no Git: ");
	        	login = ler.next();
	            Endereco endereco = viacepservice.getEndereco(login);
	           
	            String Nome = endereco.getNome();
	            String QntRepositorios = endereco.getQntRepositorios();
	            String QntSeguidores = endereco.getQntSeguidores();
	           
	            System.out.println("Nome: "+ Nome + "\n");
	            System.out.println("Qnt Repositórios: " + QntRepositorios + "\n");
	            System.out.println("Qnt Seguidores: " + QntSeguidores + "\n");
	           
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }  
	    }

		
	}


